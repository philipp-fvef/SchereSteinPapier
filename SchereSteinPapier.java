import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier{
    
    static int playeronepoints = 0;
    static int playertwopoints = 0;
    
	public static void main(String[] args) {
		Setup();
		Hallo();
	}
	
	public static void Setup(){
	    playeronepoints = 0;
        playertwopoints = 0;
	}

	public static void Hallo(){
		System.out.println("Schere Stein Papier in Java");
		System.out.println("von hohoho, inspiriert von Dalfinos \r");
		System.out.println("Du bist Spieler 1 - Dein Gegner ist Spieler 2");
		
		System.out.println("\rSchreibe 'start' um zu beginnen");

		Scanner Menu1 = new Scanner(System.in);
		String menuinput1 = Menu1.next();

		if(menuinput1.equals("start")){
				Spiel();
		}
	}

	public static void Menu(){
	    
        System.out.println("\rSchreibe 'start' um zu beginnen");
        System.out.println("Schreibe 'punkte' um den aktuellen Punktestand abzurufen");
        System.out.println("Schreibe 'neu' um ein neues Spiel zu starten");
        System.out.println("Schreibe 'exit' um das Spiel zu beenden");

		Scanner Menu2 = new Scanner(System.in);
		String menuinput2 = Menu2.next();

		if(menuinput2.equals("start")){
			Spiel();
		}
		
		else if(menuinput2.equals("punkte")){
		    
		    System.out.println("\rSpieler 1: " + playeronepoints);
		    System.out.println("Spieler 2: " + playertwopoints);
		    
		    Menu();
		}
		
		else if(menuinput2.equals("neu")){
		    System.out.println("\rSpiel beendet");
		    System.out.println("\rSpieler 1: " + playeronepoints);
		    System.out.println("Spieler 2: " + playertwopoints);
		    
		    if (playeronepoints>playertwopoints){
		        System.out.println("Gratuliere, Du hast das Spiel gewonnen");}
		    else{
		        System.out.println("Du hast leider verloren");}
		    
		    Setup();
		    
		    System.out.println("\r\rNeues Spiel");
		    Menu();
		}
		
		else if(menuinput2.equals("exit")){
		    
		    System.out.println("\rSpiel beendet");
		    System.out.println("\rSpieler 1: " + playeronepoints);
		    System.out.println("Spieler 2: " + playertwopoints);
		    
		    if (playeronepoints>playertwopoints){
		        System.out.println("Gratuliere, Du hast das Spiel gewonnen");}
		    else{
		        System.out.println("Du hast leider verloren");}
		    
		    Ende();
		}
		
		else{
		    System.out.println("Error --- Error --- Error");
		    Menu();
		}
	}


	public static void Spiel(){

		System.out.println(" \rBitte gib deine Wahl ein \rZur Auswahl stehen 'Stein', 'Schere' und 'Papier'");

		Scanner Input = new Scanner(System.in);
		String playerone = Input.next();
		
		System.out.println("");

		if(playerone.equals("Schere") || playerone.equals("Stein") || playerone.equals("Papier")) {
		    System.out.println("Spieler 1: " + playerone);}
		else{
		    System.out.println("Error --- Error --- Error");
		    Menu();
		}

	  Random ran = new Random();
	  int random = ran.nextInt(3);

		if(random == 0){
			System.out.println("Spieler 2: Schere \r");}
		if(random == 1){
			System.out.println("Spieler 2: Stein \r");}
		if(random == 2){
			System.out.println("Spieler 2: Papier \r");}


		if(playerone.equals("Stein") && random == 0 || playerone.equals("Schere") && random == 1 || playerone.equals("Papier") && random == 2){
				System.out.println("Unentschieden");
		        Menu();
		}

			else if(playerone.equals("Schere") && random == 1){
				System.out.println("Du gewinnst");
				playeronepoints++;
			    Menu();
			}
			else if(playerone.equals("Schere") && random == 2){
				System.out.println("Du verlierst");
				playertwopoints++;
			    Menu();
			}

			else if(playerone.equals("Stein") && random == 0){
				System.out.println("Du gewinnst");
				playeronepoints++;
			    Menu();
			}
			else if(playerone.equals("Stein") && random == 2){
				System.out.println("Du verlierst");
				playertwopoints++;
			    Menu();
			}

			else if(playerone.equals("Papier") && random == 1){
				System.out.println("Du gewinnst");
				playeronepoints++;
			    Menu();
			}
			else if(playerone.equals("Papier") && random == 0){
				System.out.println("Du verlierst");
				playertwopoints++;
			    Menu();
			}
	}
	
	public static void Ende(){
	    System.exit(0);}
}
