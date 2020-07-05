package org.academiadecodigo.gitbusters;

public class Image {

    public static String imageGuess = "\n" +
            "\n" +
            "      .__                                                                            \n" +
            "      |__| _____ _____     ____   ____             ____  __ __   ____   ______ ______\n" +
            "      |  |/     \\\\__  \\   / ___\\_/ __ \\   ______  / ___\\|  |  \\_/ __ \\ /  ___//  ___/\n" +
            "      |  |  Y Y  \\/ __ \\_/ /_/  >  ___/  /_____/ / /_/  >  |  /\\  ___/ \\___ \\ \\___ \\ \n" +
            "      |__|__|_|  (____  /\\___  / \\___  >         \\___  /|____/  \\___  >____  >____  >\n" +
            "               \\/     \\//_____/      \\/         /_____/             \\/     \\/     \\/ \n" +
            "\n";


    public static String separator = "\n" +
            "\n" +
            " ____________________________________________________________________________________\n" +
            "/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/_____/\n" +
            "\n";

    public static String ghost = "XXXXXNNXXXXNXXXXXXXXXXXXXNXXXXXXXXXXXXXXXXXXNXXXXNXXNXXXXXXXXXXXXXNXXNNXXXXXXXXX\n" +
            "NXXNXXXXXXNXXNXXXXXXXXXXXXNNXXNXXXXXNXXXXNNXXXXNNXXXXXNXXXXXXXXXXXXXNXXNXXXXXXXX\n" +
            "XXXXXXXXNNXXXXXXXXNXXXNXXXXNNXXNXXXNXXXXXKKXXXNXXXXXXXXXXXXNXXXNXXXXXNXXXNXXXXXN\n" +
            "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX0xolccccllccldk0XXXXXXXXXXXNXXNXXXXXXXXXXXXXXX\n" +
            "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKxc:coxkO0000Okdoc:cxKXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
            "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXKd;:d0XXXNXXXXXXNNXX0o;;xXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
            "XXXXXXXXXXNXXNXXXNXNXXXXXXXX0c,dKXXK0KXXXXXXXXXXNXX0l,oKXXXXXNXXNXXXXXXXXXXXXXXX\n" +
            "XXXXXXXXXXXXXXXNXXXXXXXXXXX0:,kXXXXX00XXXXXXXXK0KXXXXd,dXXXNXXXXXXXXXXXXXXXXXXXN\n" +
            "XXXXXXXXXXKkdk0XNNXNNXXNXXXo,xXXXXN0oo0XNXXXXKO0XXXNXK:;ONXXXXXXXXXXXXXXXXXXXXNX\n" +
            "XXXXXXXX0d;,cc:llcokKXNXXNO,:KXXXXXx':0NXXXXKl.lKXXXXXo,xXXXXXNXXXXKkdoxKNXXXNXX\n" +
            "XNXXXXX0;'lkKXOlcoc,dXXXXXd,oXXXXXXX0KXXXXXXXkokXNXXNXo,xXXXXN0occ:::oc,;o0XXXXX\n" +
            "NXXXXXXo'oKXXNXXXX0c,dKXXKc,kXXXXXXXXNXXNXXXXXXXXXXXXXo,xNXXXKc;xxlxKXKOl'cKXXXX\n" +
            "XXXXXNXx,c0XXXXXXXXKl'ckKk,cKXXXXXXKXXXXXXXXXXXXXXXXNXo,xXXNO:;xXXXXXXXX0c,kXXXX\n" +
            "NXXXXXNKl;ldxOKXXNXXKkl::';kXXNXXNXkxOKXXNXX0O0XXXXNXXx,oKOo,;kXXXXXXXXXk;:0XXNX\n" +
            "XXXXXXNNKkdlc:cdOKXXXXXKkdkXXXXXXXXKkolllllookKXXXXXXXO,'c:cd0XXXXXXOxooc:xXNNXX\n" +
            "XXXXXXXXNNXXXKkoccclx0XXNXXXXXXXXXXXXXKOkkk0XXXXXXXXXNKxokKXXXXXKOdcclodkKXXXXXX\n" +
            "XXXNXXXXXXNXXNNXX0kdlccd0XXXXXNXXNXXNXXNNNXXNXXXXXXNXXXXXNXX0xlccccx0XXXXXXXXNXX\n" +
            "XXXXXNXXXXXXXXXNXXXNXd':0XNXXXXXNXXNXXNNXXXNXXXXXNNXXXXXXOoc:ldO0XXXXXXXXNXXXXXN\n" +
            "XXXXXXNNXXXXXXXXXNXKd;lKNXXNXXXXXXXXXNXXNXXXXXXXXXNNXXNXKl.:0XXXNXXXNXXXXXNXXXNX\n" +
            "XXXXXXXXXXXXXXXXXX0l,dKXXXXXXXXXXXXXXXXXXXNXXXXXXXXXXXXXX0c;OXXXXXXXXXXXXXXXXNXX\n" +
            "XXXXXXXXXXXXXXXNKd;:kXXXXXXXNXXXXXXXXXNXXXXNXXNXXXXXXXXXXXO::OXXXXXXXNXXXXXXXXXX\n" +
            "XXXNXXXXXXNNXXKd:;dKNXXXXXXXXXNXXNXXNXXXXNXXNXXXXXXXXXXXXXXk;;OXXXXXXXXNXXNXXXXX\n" +
            "XXXXXNXXXXXX0o;:d0NXXXXXXXXXXXXXXXXXXXXXXXXXXXNXXXXXXXXXXXXXk;:OXXNXXNXXXXXXNXXX\n" +
            "XXXXXXXXXX0l;:xKXXXXXXXNXXXXXXXXXXXXXXXXNXXXXXXXXXXXXXXXXXXXXO;:OXXXXXXNXXXXXXXX\n" +
            "XNXXXXXX0o;ckKNXXXXXXXXXXXXXNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXO;,kXXXXXXXXNNXXXX\n" +
            "XXXXXXKd;:xXNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX0c,dXNXXXXXXNNXXX\n" +
            "NXXXN0l,oKNXXXXXXXXXNXK0kk0XXXNXXXXXXXXXNXXXXXXXXXXNXXXXXXXXXXXXKo,oKXNXXXXXXNXX\n" +
            "XNXXKl,xXXXXXXXXXXXOoccclc:cOXXXXXXNXXXXXXXXXXXXXNNXXXXXNXXNNXXXXXx;l0XXXXXXNXXN\n" +
            "XXXNx,oXXXXXXXXKOoc:ld0XXX0:;kXXXXXXXXXXNXXXNXXXXK00KXXXXNXXXNXXXNXk;;kXXXNXXXXX\n" +
            "XXNXx,:0XXXX0xlccox0XXXXXXXO;;OXXXXXXXXNXXXNXXXOocccclxKXXXNXXXXXXXX0c,dKXXXXXXX\n" +
            "XXXXXkc:cllcccoOKXXXXNNXXNXXk;c0XXXXXXXXXXXXX0o;ckKKOd:;lkXXXXXXXXXXXKo,oKXXXXXX\n" +
            "XXXXXXX0kkO0KXXXXXXXXXXXXXXXXx,c0XXXXXXXXXX0o;:kXXXXXXXkl;:oOXNXXXXNXXXd,oKXXXXX\n" +
            "XXNXXNXXNNXXNXXXXXXXXXXXXNXXXXx;;xKNXXNK0kl:cxXXXXXXXNXXX0xc:cok0XXXXNXO,;0XNXXX\n" +
            "NXXNXXXXXXNXXXXXXXXXXXXXXXXXXXX0o::looc:::lkXXXNXXXXXXNXXXXXKkoccclllll:ckXXXXNX\n" +
            "XXXXXXXXXXXXXXXXXXXXNXXXXXXXNXXXXKOddddk0KXXXXXXXXXXXXXXXXXXXNXXKOkxxxk0XXXXXXXX\n" +
            "XXXXXNNXXXXNNXXXXXXXXXXXXNXXXXXXXXXNXXXXXXXXXXXXXXXNNXXXXXXXXXXXXXNXXNXXXXXXNXXX\n" +
            "NXXXXXXNXXNXXNXXXXXXXXXNXXXXXXXXXXXXXNXXNXXXXXXXXXXXXNNXXXXXXXXXXXXXXXXXXXNXXXXX\n";

    public static String moustache = "MWWWMWWMWWWMWWWWWWMWWWMWWMWWWMWWWMWWMWWWMMWWWMWWMWWWMWWWWWWMWWWMWWMWWWMWWWMWWMWW\n" +
            "WWWWWWWWWWNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNWWWWWWWWWW\n" +
            "WWWWWWWKd:'.';oKWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWKo;'',:dKWWWWWWW\n" +
            "WWWWWXo.       ;KWWWWWWWWWNKOddoodOXWWWWWWWWXOxdodxOKNWWWWWWWWWK;       .lXWWWWW\n" +
            "WWWWK;  'okOx, .kWWWWWWKxl,.       .:xXWMXx:.       .,lxKNWWWWWk. ,xOko,  ;KWWWW\n" +
            "WWWX:  ,KWWWWk.,KWWXOo;.              ,oo,              .;oOXWMK,.xWWWWK,  :XWWW\n" +
            "WWWd   ,0WWWW0lxOdc'                                        ':d0xlOWWWMK,   oWWW\n" +
            "WWX;    .lxxxo:'.                                              .':lxkxl'    ;XWW\n" +
            "WWNc                                  .;;.                                  cNWW\n" +
            "WWW0,                               .:ONW0c.                               'OWWW\n" +
            "WWWW0:                           'cxKWWWWWWKxc'                           :0WWWW\n" +
            "WWWWWNOl'.                 ..,cdOXWWWWWWWWWWWWNOdc,..                 .'cONWWWWW\n" +
            "WWWWWWWWN0kdolc::::::cclodk0XNWWWWWWWWWWWWWWWWWWWWWX0kxolcc::::::clodk0NWWWWWWWW\n" +
            "MWWWWWWMWWWMWWMMWWMWWMMWWMWWWMWWWWWWMWWWMMWWWWWWMWWWWWWMMWWMWWWMWWMMWWMWWWWWWMWW\n";

    public static String key = "MMMMMMMMMMWXkdoox0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMMWKl..';,'.,xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMMMM0, :ONWWXx..oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMMMMWNXo 'OMMMMMWo ,KMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MMW0l;'.. .oNMMMW0; :XMWNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
            "MNd..;dxo;;xOkkx:. .;ll;'ckKKKKKKKKKKKKKKKKKKKKKKKKKKKKK000000000000000K0KX00NMM\n" +
            "MK, cNMMMWWK,              ..................................................cXM\n" +
            "MX: 'kXWXkk0o,;'    ...  .;ccccccccccccc::::::::::::::::::::::;,.    .,;;:c;;xNM\n" +
            "MMKl...'. .oNWWNOl..c0KkdOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:;;'     .,;;c0WWMMM\n" +
            "MMMWXkdo, .OMMMMMNl ,KMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0;            :KMMMMM\n" +
            "MMMMMMMMx..xWMMMMX: ;XMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMk'   .    .   ,OMMMMM\n" +
            "MMMMMMMMNo..:dkxo,.,OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWo   ;k;  :k,  .xMMMMM\n" +
            "MMMMMMMMMW0o;,'',cxXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk;',xXd,,xXo'':0MMMMM\n" +
            "MMMMMMMMMMMMWXKXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNNWMWNNWMNNNNWMMMMM\n";

    public static String camera = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXNXXXXNXXXXNXXXXXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWOddxxxxxxxxxxxxxxxxokNWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWNklONWNxdxxxxxxxxdkNW0lxNWWWWWWXKKXWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWKdoKWWWKlo00KK0000loXWWKodNWWWWOodxokNWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWNK0000000000000klxXWWWWNkdxxxxxxxxokNWWWKlo000O:c0Oc:k00KNWWWWWWWWWWW\n" +
            "WWWWWWWWWNkoxxxxxxxxxxxxxxxONWWWWWWWWWWWWWWWWWWWWWWWKkxxxxddxxxdxkxxdkNWWWWWWWWW\n" +
            "WWWWWWWWW0lkWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWklOWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWWWWWWWNXOkxxxxxkxxxkOKWWWWWWMWWWWWWWWW0lkWWWWWWWWW\n" +
            "WWWWWWWWWO:lkxxxkkkkkkkxxxxkkxxxkkxoddxxddddxddddddddodxxxkxkkxxkkkko:kWWWWWWWWW\n" +
            "WWWWWWWWWOcd00000000000000000000Ol;lxxdxxxkkOOOkxxdxko;lk00000000000d:kWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWWXdokxox00kkxxkKWWWNKxoxOodXWWWWWWWWWW0lkWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWNdo0do00dodkKNNWWWWWWWKooOooXWWWWWWWWW0lOWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWOlOxlK0lxNWWWWWWWWWWWWWKldOlkWWWWWWWWW0lkWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWdl0ldNxoXWWWWWWWWWWWWWWWxl0odNWWWWWWWW0lkWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWdo0ldNXXWWWWWWWWWWWWWWWWxl0ooNWWWWWWWW0lkWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWOlOxlKWWWWWWWWWWWWWWWWWXldOlkWWWWWWWWW0lOWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWNdoOdoKWWWWWWWWWWWWWWWKooOooXWWWWWWWWW0lkWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWWXdlkkoxKNWWWWWWWWWNKxoxkodXWWWWWWWWWW0lkWWWWWWWWW\n" +
            "WWWWWWWWWOcd0OO0OOOOOOOO00OO0000kl;lkxddxxkOOOOkxxdxko;ckO0OO000O0O0d:kWWWWWWWWW\n" +
            "WWWWWWWWWO:lkxxkkkkkkkkkkxkkxkkkkxddddxdddddxxdddxxddddxxkkxxxxkkxxkl:kWWWWWWWWW\n" +
            "WWWWWWWWWOlOWWWWWWWWWWWWWWWWWWWWWWWWWX0kxxxxkxxxxkOXWWWWWWWWWWWWWWWW0lOWWWWWWWWW\n" +
            "WWWWWWWWWXdoO0KKKKKKKKKKKKKKKKKKKKKKKKKKKKK0000KKKKKKKKKKKKKKKKKK00OooKWWWWWWWWW\n" +
            "WWWWWWWWWWXOxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxkxxxxxxxxxxxxxxxxOXWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n";

    public static String car = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNXXXNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWNKOkxddddooo;':oddddddxk0XWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWNKkdodddxO0KXXNNK: ,OXXKK0kxddoodOXNWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWNKdc:lx0NWWWWWWWWWWNo .OWWWWWWWWWN0kdddx0NWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWNOc;:xKWWWWWWWWWWWWWWWx..dWWWWWWWWWWWWWNKxoldOXWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWXk:..;looooooooooooooooo:. ,odddddddddddddddo:..';coddkk0KKXNWWWWWWWWW\n" +
            "WWWWNX0kdc'.                                                      ...',:ldkKNWWW\n" +
            "0oc;,..                                                                    .;dXW\n" +
            "'             .''.....'..                                   .''.....'..       :0\n" +
            "            .,'...','...,'                                .,,...','...',.      ;\n" +
            "           ';. ;kKNNX0o. ';.                             .;. ,xKNNNKd' .;.      \n" +
            ":.        .;. :XWWWWWWWx. ,'                             ,' ,0WWWWWWWO' ,,      \n" +
            "X0kxol:;,.,:. lNWWWWWWWO. ,,                             ;' ;KWWWWWWWK; ':.....:\n" +
            "WWWWWWWNNXX0: .dXWWWWN0: .dOxdddddoooooooooooooooooooooodkl .lKWWWWWKc..o00000KN\n" +
            "WWWWWWWWWWWWKc..'cool;..,kNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXd...:loo:. .dXWWWWWWW\n" +
            "WWWWWWWWWWWWWN0o:,'',;ckXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKd:,...,cdKNWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXKXNWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n";

    public static String bottle = "NXNNNNNXNNXNNXXXNNNNNXNNNNNNNXXNNNNNNNNXXNNXXXXNNNNNNNNNNNNXNNNNXNNNNXNNXNNXNNNN\n" +
            "NXXNNXNNNNNXNNXNNNNNNNNNXXNNXNNNNNNNNNNNNNNNNXNNXNNNNNNNNNXNNNXNNXNNXXNXXNNNNNNN\n" +
            "XNNXNNNXNNNNNXXXNNNXXNNNNNXNNNNNNNX0xxxxxkxx0NNNNNNNNNNNNXNNXNNNNNNNNNXNXNNNNNNN\n" +
            "NXNNXNNNNNNNNNNXNNNNNNNNNNNNNNNNNNKc:ooddoo;cKNNNNNNNNNNNNNNNXNNNNNNNXNNXNNNNNNN\n" +
            "NNNNNNXNNXNNNNNNXXNNXNNXNNXNNXXNNN0clOkkOkOlc0NXNNNNNNNNNXXNNNNXNNNNNNXNNXXNNXNN\n" +
            "NNNXXNNXNNXNNXNXXNNNXNNNNNXNNXXNXNKlxNNXXXNxlKNXNNXNNNXNNNNNNNNXXNNXNNXNNNNNNNNN\n" +
            "NNXNNXNNNNNNNNXXNNNNNXNNXXNNXNNXNWKlxNXNNNNxl0NNNXNNNNNXNNNXNNXNNXNNXNNXXNNXNNNN\n" +
            "NNNXNNNNNNNNNXXNXXNNXNNNNNXNNNNNNN0lkNNNNXNOlONXNNXNNNXNNXNNXNNNNNNNNNXXNXNNNXNN\n" +
            "NNNNNNNNNNNNNNNXNNNNNNNNNNNNNNNNNWkl0NXNNNN0lxNNNNNNNNNNNNXNNNNNNNNNNNNNXNNNNNNN\n" +
            "NNNNXNNXNNNXNNNNNNNNNNNNNNNXNXXNXNxlKNNNNXNXldNNNNXNNNXNNNNXXNNXXNNNXNNNXXNNNNNN\n" +
            "NNNNNNXNNXNNNXNNNNNNNNNNNNXXNXXNNXooXNNNXNNXooXNNNNXNXNNNXXNXXNXXNXXNXXNNXNNNNNN\n" +
            "NXNNNXNNXNNXXNNXNNXNNXNNNNNNNNNNNXodNNNNNNNNdlKNNNNNXNNNNNXNNNXNNXXNXXNNXNNXNNXN\n" +
            "XNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN0lkNNNNXNNNxlKNNNXNNNXNNNNNNNNNNNNNNNXNNNNNNNNN\n" +
            "NNNNNXNNNNNNNNNXNNXNNXNNXXNNXNNXNOlkNNXNNNNNOlONNXNNNNNXNNNNNNNNNNNNNNNNXNNNNNXN\n" +
            "XNNXNNXXNXXNNXNNXXNNXNNXNNXNNXXNNdlKNXNXXXNN0lxNNNXNNNXNNXNNXNNXNNXXNXXNNNXNNXNN\n" +
            "XNNNNNXXNNXNNXNNXNNNXNXXNNXNNXXXOlkXNNNNXNNXXklONNNNNXNNNXNNXNNXXNNXNNXNNXNNNXNN\n" +
            "NNNNNNNNNNNNNNNNNNNNNXXNNXNNXNXxoOXXNNNNNNNNNXOlxXNNXNNXNNXNNNNNNNNNNNNNNNNNNNXX\n" +
            "XNNXNNNNNNNNNXNNNXNNXNNNXNNNNNxl0NNNXNNNXNNNNNNOlkNNNNNNNXNNXNNXNNNNNNNNNNNNNNNN\n" +
            "NXNNNXNNNNNNXNNNNNNNNXNNXXNNNXooNNXXNNXNNNXNNXNNdoXNNNNXNNXXNNNNNNNNXXNNXNNNNNNN\n" +
            "NNNNXNNXXXNXNNXNNNNNNXNNXNNNNKlxNXXNXNNXXXNNXXNNdlKNNNXXXNNXNNXXXXNNNXNNNNXXNNXN\n" +
            "NNNNNNNNNXXNNXNNXXNNXNNXNNXNNKlxNXNX0kxxxxk0XNXNxl0NNNXNNNNNXXNNXNNXNNNNNNXNNXNN\n" +
            "NNNNNXNNNNNNXNNXNNNNNNNNNNNNNKlxNXkodxxOOkxdokXNxlKNNNNNNNNNNNNNNNNNNXNNNNNNNNNN\n" +
            "NNNXNNNNNNXNXXNNNNNNNNNNNNNNNKlxXdo0XNNNNNNN0ldXxlKNNXXNNXXNXXNNXNNNNNNNXXNNNNNN\n" +
            "NXNNXNNNNNNXNNNXNNNNNXNNNXNNNKlxkl0NNNNNNNNNN0lkxlKNNNNNNNNXNNNNNNNNNNNNXNNNNNXN\n" +
            "NNXNNXNNNXXNXNNNNXNXXXXNNNNXNKlxxl0NNNNNXXNNNKlxxlKNNXNNNNNNNXNNNNNNNXNNXNNNNNNN\n" +
            "XNNNNNXXNNXNNNNNXNNXXNNXNNNNNKlxKodXNXXXXXNNKooKxlKNNXXNNNNNNNNNXNNXNNXNNXXNNXNN\n" +
            "NNNNNXNNNNNNNNNXNNXXNXXNNNNNNKldNKxoxkO00OkxodKWxlKNXNNXNNNNNNXNNNNNNNNNXNNXNNNN\n" +
            "XNNNNNXXNNNNNNNNNNNNNNXXNNXNNKlxNXNKkxxxxxxkKNXNxlKNNNNNNNNNNNNNNNNNNNXNNNNNNNNN\n" +
            "NNNNNNNNNNNXNNXXNNNNNXNNNXNNNKldNNNXNNNNNNNNNNXNxlKNXNNXNNXXNNNNXNNNNNNNXNNNNNXN\n" +
            "NNNNNXXXNNNXXNNXNNNNNNNNNNNNNKldNNXXNNXNNNNNXNXNdlKNNNNNNNXNNNNXNXNNXXNXNNNNNNNN\n" +
            "NNNNNNNNNNXNNXNNXXNNXNNNNNNNNKlxNXNNNNNNXXNNXNNNdlKNNXXNNNNNNNNNNNNNNNNNNXNNNXNN\n" +
            "NNXNNNNNXNNXNNNXNNXNNXNNNNNNNXodNNNNNXXNNNXNNXNNdlKNXXNNNNNXNNNNNXNNXNNNNNNXNNNN\n" +
            "NNNNNNNNNNNNNNNNNNNNNNNXNNNNNKldNXNNNNNNXNNNNNNNdoKNNNXNNNNNNNNNNNNNNNNNNNNNNNNN\n" +
            "NXXNNXNNNNNNNNXXNNNNNXNNXXNNNXodNNXXNNNNNNNNNNXNdoXNNNNNNNXXNNXNNNNNXNNNNNNNNNXX\n" +
            "NXXNNNNNNNNNXNNNNXNNNXNNXXNXNXdoKNNNNNNNXNNNNNNXodXNXNNNNNXXNNNNNNNNNXNNNNNNNNXN\n" +
            "XNNXNNNNNNNNNNNNXNNNXNNNNNXNNNKxdxxxxxxxxxxdxxxdxKNXNNXNNNNNNNNNNNNNNNNNNNNNNNNN\n" +
            "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNXKK0000000000000XXNNNXNNNNNXNNNNNNNNNNNNNNNNNNNNN\n" +
            "XNNNNNXNNNNNNNNNXXNNXNNXNNXNNNNNXXNNXNNXXNNNXNNXNNNNNNNNNNNNNNNNNNNNNNXNNNNNNXNN\n" +
            "NXNNNXNNNNNNNNNXNNXNNXXNXXNNXNNXXXXXXXXXXXXXXXXNNXNNXNNXNNXXNNNNNNNNXNNXXNNXNNXX\n";

    public static String shoe = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWN0OkO000KXWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXkdxOO0Okkk000KXNWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNkokK0XWXK00OkxkO00000KKXNWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW0ddO0XWWWWWWNXK000OO00KK0OKWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKk00kk0NWWWWWWWWWWNXK0000KOkNWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXOkXWWNK0kk0KNWWWWWWWWWWWNX0xxXWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKxoxXWWWWW0x0000KNWWWWWWWWWWWXk0WWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWN0xdx0XKXWWWWWOONWWX0O0XWWWWWWWWWW0ONWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOxkO0OkKWWXXXXK0OXWWWWWNKO0NWWWWWWWWKkKWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWNXXKOxxkOxkNMWNK0000000KNWWWWWWWWKkXWWWWWWWWNk0WWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWX0O0koddoloxKNNXKK0OKNWWWWWWWWWWWWWWW0ONWWWWWWWWWOOWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWXK00Ollxkdx0XXKxx0000KXWWWWWWWWWWWWWWWWWXk0WWWWWWWWWW0ONWWWW\n" +
            "WWWWWWWWWWNNNNNXK00000XXOxO0XXWWWWXxkXNWWWWWWWWWWWWWWWWWWWWW0ONWWWWWWWWWWKkXWWWW\n" +
            "WWWWWWN0kkO000000KXNWWWWKk0NWWWWWWKkKWWWWWWWWWWWWWWWWWWWWWWKkKWWWWWWWWWWWKkXWWWW\n" +
            "WWWWWKO0K0000000000000KNWOokXWWWWWXk0WWWWWWWWWWWWWWWWWWWWWKkKWWWWWWWWWWWWKkKWWWW\n" +
            "WWWWNkxXWWWWWNNNNNNNXK0O0kxkOXWWWWW0kXWWWWWWWWWWWWWWWWWWN0k0NNNNXXXXXXKKKOxKWWWW\n" +
            "WWWWKxk0000KKKXXXNNNNNNX0O0XOx0KKKKOddOOOOOOOOOOOOOOOOO0Oxk00000000000000OxKWWWW\n" +
            "WWWWXkKWNXKK00000000000000000OO00000OOO000000KKKXXXNNNNWWWWWWWWWWWWWWWWWWXk0WWWW\n" +
            "WWWWWKO0KXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXk0WWWW\n" +
            "WWWWWWWXK0000000KKKKKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKOONWWWW\n" +
            "WWWWWWWWWWWWNNXKKKK0000000000000000000000000000000000000000000000000000KKXWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n";

    public static String book = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNXXKKKKKKKXKKKKKKKXWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWNNNNNWWWWWWNXKKKKKKKKKKKKKKKKKKXXKKKKNWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWNXKKKKKKKKKKKKXNK0KXWWWWWWWWWWWWWWWWWWWWWNKK0KNWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWNXKKKKXNWWWWWWWWNXKOkXWWWWWWWWWWWWWWWWWWWWWWWWWWNK00KNWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWNXK0KXNWWWWWWWWWWWWWWWNK0KNWWWWWWWWWWWWWWWWWWWWWWWWWWWNK0KKNWWWWWWWWWWWWWW\n" +
            "WWWNK00KXWWWWWWWWWWWWWWWWWWWWWNK0KNWWWWWWWWWWWWWWWWWWWWWWWWWWWWNK0KXNWWWWWWWWWWW\n" +
            "WWN0kOXWWWWWWWWWWWWWWWWWWWWWWWWWNK0XWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNK00XWWWWWWWWW\n" +
            "WXkONK0XWWWWWWWWWWWWWWWWWWWWWWWWWWX00XWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXK0KXWWWWWW\n" +
            "W0dkXWXOKWWWWWWWWWWWWWWWWWWWWWWWWWWWX0KNWWWWWWWWWWWWWWWWWWWWWWWWWNNXXXK0kxOXWWWW\n" +
            "WN0kkKWN00NWWWWWWWWWWWWWWWWWWWWWWWWWWNK00KWWWWWWWWWWWWWNNXKKKKKKKKKKKKKXXKkOWWWW\n" +
            "MWNKkk0NW00NWWWWWWWWWWWWWWWWWWWWWWWWWWWNK00XWWWWWWWXKKKKKKXXNNWWWWMWWWWWWWOd0NWW\n" +
            "WWWWKOkOXWKOXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWX00XWWNK0KXNWWWNXKKKKKKKKKKKKKK0OkkOXW\n" +
            "WWWWWXOOOKWXOKWWWWWWWWWWWWWWWWWWXKKKKKKKKKKKOxkOO0NWNKKKK0OOOOO000000000000K0OKW\n" +
            "WWWWWWN0kOKNX00NWWWWWWWWWWWXXKKKKKKXNWWWWWWNKkddOKKK0OO0KKKKXXXNNNWWWWWWWWWWWWWW\n" +
            "WWWWWWWNKOk0NN00XWWWWWWNKKKKKXNWWWWNXKKKKKKK0KXNNXKKKKXNWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWKOOOXWKOXWNKKKKKXWWWWNXKKK0OkkOO00KKKKKKKKXWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWXOOOKWXkOKKXWWWWNXK00OkO0KKKXNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWX0OO0X00WWWNXK0OkO0KKXNWWMWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWN0OOOxOXK0Okk0KKNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWKOOxdkk0KXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWX00KXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWMWWWMWWMWWWMWWWMWWWMWWWMWWMMWWMMWWMWWWMMWWWMWWMMWWMMWWMWWWMWWWMWWMMWWMMWWMWWWM\n";

    public static String guitar = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWN0OXWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXOoc'.;oxKNWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKkd:'. .,lxkc:0WW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXc...,cx0X0kdclKWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWO;;d0NWWKocdxOXWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNO:cKWWWW0ccKWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOocxKK00kocdKWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOlcxK0ocoooxKNWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOlcxX0ocdKWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNkllkXKdcdKWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXkclkXKdcoKWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXxclONKdco0WWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXxclONXxco0NWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWXKKXWWWWWWWWWWWKdcoONXxclONWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWXkooolcOWWWWWWWWKdco0NXkclONWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWXxcoOXNd;kWWWWWKkoco0WNkllONWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWW0lcONWWk;dNWWN0occo0WNkllkNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWO:lKWWWWx;kWN0ocdKNWNOlckXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWNk:dXWWWWWXd:olcdKWNXOlcxXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWNx:xNWWWWWWWNOoxKWN0l:cxXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWKo:kNWWWWWWWWWWWWW0ocdOKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWNX0Odcl0WWWWWNWWWWWWW0ocdKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWNKkdooooox0NWWWWW0lo0NWWXd:oKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWN0dllox0XNWWWWWWWXXNX0dco0NXd:o0XX0kxdoxXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWW0ocd0NWWWWWWWWWWWXxco0NWKxxXWN0xooooodkl,kWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWNk:oKWWWWWWWWWWWKk0NNKdco0WWWWWWWWWNNXX0d:dXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WW0:lXWWWWWWWWWWWW0o:o0NWKk0NWWWWWWNKkdllld0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWk;xWWWWWWWWWKkONWWKdcdXWWWWWWWWKdllokKNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WW0:oNWWWWWWNx;:clkNWWK0NWWWWWWXd:oONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWNd:kNWWWWWNOlcdd:c0WWWWWWWWWNo:OWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWNd:xNWWWWWWNklc:c0WWWWWWWWWO:dNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWNk:l0WWWWWWWN00NWWWWWWWWWXlcKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWKdcdKWWWWWWWWWWWWWWWWWNd:kWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWW0ocd0NWWWWWWWWWWWWWXd:kNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWN0dclkXWWWWWWWWWNOlcONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWXkoloxO0KKKOdllxXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWXOxdooooodONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWNWWWWWWWWWWWNNNNNNNNNNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNXNNXNXXXXXNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n";

    public static String glasses = "MMMWWWWMMWWNWMMMWNNKOxl;'....;lkXMMMWNWWMMMMWNWMMMWWNWMMMWWWWMMMWWWWMMWWNWMMMWWN\n" +
            "MMWWWWWMMWWNNK0koc:,..';ccc:;'.':oOXWWWWMMMWWWWWMMWWWWMMMWWWWMMWWWWWMMWWWWWMMWWW\n" +
            "WWWWMWNKOxl:,'....;cokKNWMWNXKOo;..,lkXWWWWWMMMWWWWMMWWWWWMMWWWWMMMWWWWMMWWWWWMM\n" +
            "WX0kdc;'....,:ldkKNWWWWWWWWWWWWWXk:...:0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "c,....';ldk0XWMMWWWWMMWWWWWMMWWWWMNOc;oXMMMMWWWWMMWWWWMMMWWWWMMWWWWWMMWWWWMMMWWW\n" +
            ".....;o0NWMWWWWWWWWWWWWWWWWWWWWWWWWWWNWWWWWWWWWWWWWMMWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            ".......':oONWWWWWMMWWWWWMMWWWWMMWWWWWMMWWWWWWMWWWWWMMWWWWWMMWWWWMMMWWWWWNXKNWWMM\n" +
            ". .oxl;....,lONWWWWWMMWWWWWMMWWWWMMMWWWWMMMWWWWWMMWWWWMMMWWWWMMWWWWWWKkl;'';dKWW\n" +
            ";..xWWN0xc,...;d0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNKko:'..,;;..,xK\n" +
            "o..oWMWWWWXOo;..'l0NWWWWNNXXNWMMMWWWWMMWWWWWMMMWWWWMMWWWWWMMNKko:'..'cxKNNXk,..;\n" +
            "0;.:KWWWWWWWWXx'..':oddl;,,,;codxOKXNNWWMWWWWWWWMMWWWWWWNKko:'...,lkXWWWWWWW0lcx\n" +
            "Nd..xWWMMWWWWMNd........';;;,'.....';:lodxk00KXNNXXK0kdl;....;lx0XWWMMWWWWMMWWNW\n" +
            "WK:.:KWWWWMMWWWO,.......xNNXXXK0Oxdol:;,'....',,,,''.....:okKXNWMMMWWWWMMWWWWWMM\n" +
            "WW0;.:0WWWWWWWWO'.;xk:..dWWWWWWWWWWWWWNXXKOd;........'cxKNWWWWWWWWWWWWWWWWWWWWWW\n" +
            "MMW0c.,dKWWWWMWd..dNMK:.cKWMMWWWWMMMWWWWMMMWK:.....,oKWMMWWWWMMWWWWWMMWWWWMMMWWW\n" +
            "WWWWNOc',cxKNW0;.oXWWNx..xWWWWMMWWWWWMWWWWWWWk....oKWWWWWWMWWWWWMMWWWWWWMWWWWWMM\n" +
            "WWWWMWN0d:',:c;,dXMWWWXl.;0WWWMMWWWWWMMWWWWWWk' .dNMMWWWWWMMWWWWMMMWWWWMMWWWWWMM\n" +
            "MMWWWWWMMN0kddkKNWWWMMM0:.:0WWWWWMMMWWWWMMMWNo..lNWWWWMMMWWWWMMWWWWWMMWWWWMMMWWW\n" +
            "WWWWWWWWWWWWWWWWWWWWWWWW0:.,xXWWWWWWWWWWWWWWK:.:0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
            "WWWMMMWWWWMMWWWWWMMWWWWMMXd,.;okKXNWWMMWWWNXo.:0NWWMMWWWWWMMWWWWMMMWWWWMMMWWWWMM\n" +
            "MMWWWWWMWWWWWMMWWWWWMMWWWWWNOdc:;;:cloooool;;oKWMMWWWWWMWWWWWMMWWWWWMWWWWWWMWWWW\n" +
            "MMWWWWWMMWWWWMMMWWWWMMWWWWWMMWNXOxc,......'lONWWMMWWWWMMMWWWWMMWWWWMMMWWWWMMMWWN\n";
}
