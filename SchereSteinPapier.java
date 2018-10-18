import java.util.Random; //Zufallszahl
import java.util.Scanner; //Benutzereingabe


public class SchereSteinPapier{

    private static int playeronepoints = 0;
    private static int playertwopoints = 0;


    public static void main(String[] args){
        Hallo();
    }

    private static void Setup(){ // Zurücksetzen der Punkte
        playeronepoints = 0;
        playertwopoints = 0;
    }


    private static void Hallo() { // Hallo und Informationen

        System.out.println("\nSchere Stein Papier in Java");
        System.out.println("von hohoho, inspiriert von Dalfinos\n");
        System.out.println("Du bist Spieler 1 - Dein Gegner ist Spieler 2");

        System.out.println("Schreibe 'start' um zu beginnen");

        Scanner hallo = new Scanner(System.in); //Eingabe
        String halloinput = hallo.next();

        if(halloinput.equals("start")){
            Modus();
        }
        else{
            System.out.println("Error --- Error --- Error");
        }
    }


    private static void Modus(){ // Moduswahl

        System.out.println("\nWelchen Modus möchtest du spielen?");
        System.out.println("Zur Auswahl stehen 'FreiesSpiel', '3Punkte' oder '5Punkte'");

        Scanner Menu1 = new Scanner(System.in); // Eingabe
        String menuinput1 = Menu1.next();

        if(menuinput1.equals("FreiesSpiel")){
            System.out.println("\nModus: Freies Spiel");
            FreiesMenu();
        }
        if(menuinput1.equals("3Punkte")){
            System.out.println("\nModus: 3 Punkte");
            DreiMenu();
        }
        if(menuinput1.equals("5Punkte")){
            System.out.println("\nModus: 5 Punkte");
            FünfMenu();
        }
        else{
            System.out.println("Error --- Error --- Error");
        }
    }


    private static void FreiesMenu(){ // Modus Freies Spiel - Menu

        System.out.println("\nSchreibe 'start' um zu beginnen");
        System.out.println("Schreibe 'punkte' um den aktuellen Punktestand abzurufen");
        System.out.println("Schreibe 'neu' um ein neues Spiel zu starten");
        System.out.println("Schreibe 'exit' um das Spiel zu beenden");

        Scanner Menu2 = new Scanner(System.in); // Eingabe
        String menuinput2 = Menu2.next();

        if(menuinput2.equals("start")){ // Spielstart
            FreiesSpiel();
        }

        else if(menuinput2.equals("punkte")){ // Punkteanzeige

            System.out.println("\nSpieler 1: " + playeronepoints);
            System.out.println("Spieler 2: " + playertwopoints);

            FreiesMenu();
        }

        else if(menuinput2.equals("neu")){ // neues Spiel
            Ergebnis();
        }

        else if(menuinput2.equals("exit")){ // Spiel beenden

            System.out.println("\nSpiel beendet");
            System.out.println("\nSpieler 1: " + playeronepoints);
            System.out.println("Spieler 2: " + playertwopoints);

            if (playeronepoints>playertwopoints){
                System.out.println("Gratuliere, Du hast das Spiel gewonnen");}
            else if (playeronepoints<playertwopoints){
                System.out.println("Du hast leider verloren");}
            else{
                System.out.println("Unentschieden");}

            Ende();
        }

        else{
            System.out.println("Error --- Error --- Error");
            FreiesMenu();
        }
    }


    private static void FreiesSpiel(){ // Modus Freies Spiel - das Spiel

        System.out.println("\nBitte gib deine Wahl ein");
        System.out.println("Zur Auswahl stehen 'Stein', 'Schere' und 'Papier'");

        Scanner Input = new Scanner(System.in);
        String playerone = Input.next();

        System.out.println(" ");

        // Erkennung ob eine zulässige Eingabe getätigt wurde
        if(playerone.equalsIgnoreCase("schere") || playerone.equalsIgnoreCase("stein") || playerone.equalsIgnoreCase("papier")) {
            System.out.println("Spieler 1: " + playerone);}
        else{
            System.out.println("Error --- Error --- Error");
            FreiesSpiel();
        }

        Random ran = new Random(); // Errmittlung der Eingabe des "gegners" durch Zufallszahl
        int random = ran.nextInt(3);

        if(random == 0){
            System.out.println("Spieler 2: Schere");}
        if(random == 1){
            System.out.println("Spieler 2: Stein");}
        if(random == 2){
            System.out.println("Spieler 2: Papier");}

        // Auswertung der Eingaben

        if(playerone.equalsIgnoreCase("schere") && random == 0 || playerone.equalsIgnoreCase("stein") && random == 1 || playerone.equalsIgnoreCase("papier") && random == 2){
            System.out.println("Unentschieden");
            FreiesMenu();
        }

        else if(playerone.equalsIgnoreCase("schere") && random == 2){
            System.out.println("Du gewinnst");
            playeronepoints++;
            FreiesMenu();
        }
        else if(playerone.equalsIgnoreCase("schere") && random == 1){
            System.out.println("Du verlierst");
            playertwopoints++;
            FreiesMenu();
        }

        else if(playerone.equalsIgnoreCase("stein") && random == 0){
            System.out.println("Du gewinnst");
            playeronepoints++;
            FreiesMenu();
        }
        else if(playerone.equalsIgnoreCase("stein") && random == 2){
            System.out.println("Du verlierst");
            playertwopoints++;
            FreiesMenu();
        }

        else if(playerone.equalsIgnoreCase("papier") && random == 1){
            System.out.println("Du gewinnst");
            playeronepoints++;
            FreiesMenu();
        }
        else if(playerone.equalsIgnoreCase("papier") && random == 0){
            System.out.println("Du verlierst");
            playertwopoints++;
            FreiesMenu();
        }
    }


    private static void DreiMenu(){ // Modus 3 Punkte - Menu


        // Erkennung wenn 3 Punkte erreicht sind
        if (playeronepoints == 3) {
            Ergebnis();
        }
        else if (playertwopoints == 3){
            Ergebnis();
        }

        else {
            System.out.println("\nSchreibe 'start' um zu beginnen");
            System.out.println("Schreibe 'punkte' um den aktuellen Punktestand abzurufen");
            System.out.println("Schreibe 'neu' um ein neues Spiel zu starten");
            System.out.println("Schreibe 'exit' um das Spiel zu beenden");

            Scanner Menu2 = new Scanner(System.in);
            String menuinput2 = Menu2.next();

            if (menuinput2.equals("start")) {
                DreiPunkte();
            }
            else if (menuinput2.equals("punkte")) {

                System.out.println("\nSpieler 1: " + playeronepoints);
                System.out.println("Spieler 2: " + playertwopoints);

                DreiMenu();
            }
            else if (menuinput2.equals("neu")) {
                Ergebnis();
            }
            else if (menuinput2.equals("exit")) {

                System.out.println("\nSpiel beendet");
                System.out.println("\nSpieler 1: " + playeronepoints);
                System.out.println("Spieler 2: " + playertwopoints);

                if (playeronepoints > playertwopoints) {
                    System.out.println("Gratuliere, Du hast das Spiel gewonnen");
                } else if (playeronepoints < playertwopoints) {
                    System.out.println("Du hast leider verloren");
                } else {
                    System.out.println("Unentschieden");
                }

                Ende();
            }
            else {
                System.out.println("Error --- Error --- Error");
                DreiMenu();
            }
        }
    }


    private static void DreiPunkte(){ // Modus 3 Punkte - das Spiel

        System.out.println("\nBitte gib deine Wahl ein");
        System.out.println("Zur Auswahl stehen 'Stein', 'Schere' und 'Papier'");

        Scanner Input = new Scanner(System.in);
        String playerone = Input.next();

        System.out.println(" ");

        if(playerone.equalsIgnoreCase("schere") || playerone.equalsIgnoreCase("stein") || playerone.equalsIgnoreCase("papier")) {
            System.out.println("Spieler 1: " + playerone);}
        else{
            System.out.println("Error --- Error --- Error");
            DreiMenu();
        }

        Random ran = new Random();
        int random = ran.nextInt(3);

        if(random == 0){
            System.out.println("Spieler 2: Schere");}
        if(random == 1){
            System.out.println("Spieler 2: Stein");}
        if(random == 2){
            System.out.println("Spieler 2: Papier");}


        if(playerone.equalsIgnoreCase("schere") && random == 0 || playerone.equalsIgnoreCase("stein") && random == 1 || playerone.equalsIgnoreCase("papier") && random == 2){
            System.out.println("Unentschieden");
            DreiMenu();
        }

        else if(playerone.equalsIgnoreCase("schere") && random == 2){
            System.out.println("Du gewinnst");
            playeronepoints++;
            DreiMenu();
        }
        else if(playerone.equalsIgnoreCase("schere") && random == 1){
            System.out.println("Du verlierst");
            playertwopoints++;
            DreiMenu();
        }

        else if(playerone.equalsIgnoreCase("stein") && random == 0){
            System.out.println("Du gewinnst");
            playeronepoints++;
            DreiMenu();
        }
        else if(playerone.equalsIgnoreCase("stein") && random == 2){
            System.out.println("Du verlierst");
            playertwopoints++;
            DreiMenu();
        }

        else if(playerone.equalsIgnoreCase("papier") && random == 1){
            System.out.println("Du gewinnst");
            playeronepoints++;
            DreiMenu();
        }
        else if(playerone.equalsIgnoreCase("papier") && random == 0){
            System.out.println("Du verlierst");
            playertwopoints++;
            DreiMenu();
        }
    }


    private static void FünfMenu(){ // Modus 5 Punkte - Menu


        //Erkennung wenn 5 Punkte erreicht sind
        if (playeronepoints == 5) {
            Ergebnis();
        }
        else if (playertwopoints == 5){
            Ergebnis();
        }
        else {

            System.out.println("\nSchreibe 'start' um zu beginnen");
            System.out.println("Schreibe 'punkte' um den aktuellen Punktestand abzurufen");
            System.out.println("Schreibe 'neu' um ein neues Spiel zu starten");
            System.out.println("Schreibe 'exit' um das Spiel zu beenden");

            Scanner Menu2 = new Scanner(System.in);
            String menuinput2 = Menu2.next();

            if (menuinput2.equals("start")) {
                FünfPunkte();
            }
            else if (menuinput2.equals("punkte")) {

                System.out.println("\nSpieler 1: " + playeronepoints);
                System.out.println("Spieler 2: " + playertwopoints);

                FünfMenu();
            }
            else if (menuinput2.equals("neu")) {
                Ergebnis();
            }
            else if (menuinput2.equals("exit")) {

                System.out.println("\nSpiel beendet");
                System.out.println("\nSpieler 1: " + playeronepoints);
                System.out.println("Spieler 2: " + playertwopoints);

                if (playeronepoints > playertwopoints) {
                    System.out.println("Gratuliere, Du hast das Spiel gewonnen");
                } else if (playeronepoints < playertwopoints) {
                    System.out.println("Du hast leider verloren");
                } else {
                    System.out.println("Unentschieden");
                }

                Ende();
            }
            else {
                System.out.println("Error --- Error --- Error");
                FünfMenu();
            }
        }
    }


    private static void FünfPunkte(){ // Modus 5 Punkte - das Spiel

        System.out.println("\nBitte gib deine Wahl ein");
        System.out.println("Zur Auswahl stehen 'Stein', 'Schere' und 'Papier'");

        Scanner Input = new Scanner(System.in);
        String playerone = Input.next();

        System.out.println(" ");

        if(playerone.equalsIgnoreCase("schere") || playerone.equalsIgnoreCase("stein") || playerone.equalsIgnoreCase("papier")) {
            System.out.println("Spieler 1: " + playerone);}
        else{
            System.out.println("Error --- Error --- Error");
            FünfMenu();
        }

        Random ran = new Random();
        int random = ran.nextInt(3);

        if(random == 0){
            System.out.println("Spieler 2: Schere");}
        if(random == 1){
            System.out.println("Spieler 2: Stein");}
        if(random == 2){
            System.out.println("Spieler 2: Papier");}


        if(playerone.equalsIgnoreCase("schere") && random == 0 || playerone.equalsIgnoreCase("stein") && random == 1 || playerone.equalsIgnoreCase("papier") && random == 2){
            System.out.println("Unentschieden");
            FünfMenu();
        }

        else if(playerone.equalsIgnoreCase("schere") && random == 2){
            System.out.println("Du gewinnst");
            playeronepoints++;
            FünfMenu();
        }
        else if(playerone.equalsIgnoreCase("schere") && random == 1){
            System.out.println("Du verlierst");
            playertwopoints++;
            FünfMenu();
        }

        else if(playerone.equalsIgnoreCase("stein") && random == 0){
            System.out.println("Du gewinnst");
            playeronepoints++;
            FünfMenu();
        }
        else if(playerone.equalsIgnoreCase("stein") && random == 2){
            System.out.println("Du verlierst");
            playertwopoints++;
            FünfMenu();
        }

        else if(playerone.equalsIgnoreCase("papier") && random == 1){
            System.out.println("Du gewinnst");
            playeronepoints++;
            FünfMenu();
        }
        else if(playerone.equalsIgnoreCase("papier") && random == 0){
            System.out.println("Du verlierst");
            playertwopoints++;
            FünfMenu();
        }
    }


    private static void Ergebnis(){
        System.out.println("\n\nSpiel beendet");
        System.out.println("\nSpieler 1: " + playeronepoints);
        System.out.println("Spieler 2: " + playertwopoints + "\n");

        // Ermittlung des Gewinners
        if (playeronepoints > playertwopoints) {
            System.out.println("Gratuliere, Du hast das Spiel gewonnen");
        }
        else {
            System.out.println("Du hast leider verloren");
        }

        Setup(); //Reset der Punkte

        System.out.println("\n\n--- Neues Spiel ---"); // neues Spiel
        Modus();

    }


    private static void Ende(){ // Ende
        System.exit(33);}
}
