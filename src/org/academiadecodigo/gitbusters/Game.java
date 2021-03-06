package org.academiadecodigo.gitbusters;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class Game {
    private UsersHandler player;
    private Prompt prompt;
    private BufferedWriter out;
    private int finalScore;

    public Game(UsersHandler player) {

        this.player = player;
        this.prompt = this.player.getServer().getPrompt();
        this.out = this.player.getServer().getBufferedWriter();

    }

    public void showMenu() throws IOException, InterruptedException {

        String[] options = {"Play the Game", "Get Ready!", "Scores", "Shuffle", "View Instructions", "Change name", "Quit"};
        MenuInputScanner menu = new MenuInputScanner(options);
        menu.setMessage("Choose an Option" + "\n");
        int menuChoice = prompt.getUserInput(menu);

        switch (menuChoice) {

            case 1 -> {
                if (verifyPlayers()) {
                    UsersHandler.broadcastMessage(player.getUsername(), "has started the game!\n");
                    startGame();

                } else {
                    out.write("\n" + "Must wait all players ready" + "\n");
                    out.flush();
                }
            }
            case 2 -> {
                player.setReady(true);
                UsersHandler.broadcastMessage("\n" + player.getUsername(), "is ready" + "\n");
                out.write("\n" + "You are ready"+ "\n");
                out.flush();

                if (Game.verifyPlayers()) {
                    UsersHandler.broadcastMessage("", "\n" + "All Players are ready" + "\n");
                }
            }
            case 3 -> {
                out.write("\n" + showAllFinalScore());
                out.flush();
            }
            case 4 -> {
                Collections.shuffle(Server.getImages());
                UsersHandler.broadcastMessage("", "\n" + "Images have been shuffled" + "\n");
            }
            case 5 -> instructionsMenu();
            case 6 -> {
                StringInputScanner newName = new StringInputScanner();
                newName.setMessage("Choose name: ");
                player.changeUserName(prompt.getUserInput(newName));
            }
            case 7 -> player.quit();
            default -> showMenu();
        }

    }

    public void startGame() throws IOException, InterruptedException {

        finalScore = 0;
        int i = 0;

        for (UsersHandler player : Server.usersList) {

            while (i < 10) {

                if (i == 5){
                    player.setReady(false);
                }

                player.getGuess().setMessage(Server.getImages().get(i) + "\n" + "Guess The Image: ");
                String answer = prompt.getUserInput(player.getGuess());
                verifyAnswer(answer,i);

                i++;
            }

            showFinalScore();

            out.write(Image.imageGuess);
            out.flush();
            showMenu();
        }
    }

    private void verifyAnswer(String answer, int i) throws InterruptedException {

        if (answer.equals(ASCII.getList().get(Server.getImages().get(i)))) {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            finalScore++;

        } else {

            Thread.sleep(1000);
        }
    }

    public void instructionsMenu() throws IOException, InterruptedException {

        try {

            out.write("\n" + "Instructions: " + "\n" + "\n" + "The Game starts only after all players get ready."
                    + "The Game has 10 rounds." + "\n" + "Every round you have to guess the image."
                    + "\n" + "You only have one chance to guess." + "\n");
            out.flush();

        } catch (Exception e) {

            e.printStackTrace();

        }

        String[] options = {"Back to Menu"};
        MenuInputScanner menu = new MenuInputScanner(options);
        menu.setMessage("Press 1 to go back to MainMenu");
        int userInput = prompt.getUserInput(menu);

        if (userInput == 1) {
            showMenu();
        }
    }

    public void showFinalScore() {

        try {

            String finalScoreMessage = "Your final score is: " + finalScore;
            out.write(finalScoreMessage);
            out.flush();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public String showAllFinalScore() {

        StringBuilder scores = new StringBuilder();

        for (UsersHandler player : Server.usersList) {
            scores.append(player.getUsername() + ": " + player.getGame().finalScore + "\n");
        }
        return scores.toString();
    }

    public static boolean verifyPlayers() {

        for (UsersHandler player : Server.usersList) {

            if (!player.getReady()) {
                return false;
            }
        }
        return true;
    }

}