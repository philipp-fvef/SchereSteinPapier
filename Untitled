import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier{
	public static void main(String[] args) {

		System.out.println("Schere Stein Papier in Java \rvon hohoho, inspiriert von Dalfinos \r\rDu bist Spieler 1 - dein Gegner ist Spieler 2");
		System.out.println("Bitte gib deine Wahl ein \r");

		Scanner Input = new Scanner(System.in);
		String playerone = Input.next();

		if(playerone.equals("Schere") || playerone.equals("Stein") || playerone.equals("Papier")) {
		    System.out.println("Spieler 1: " + playerone);}
		else{
		    System.out.println("Error --- Error --- Error");
		    System.exit(0);
		}

	  Random ran = new Random();
	  int random = ran.nextInt(3);

		if(random == 0){
			System.out.println("Spieler 2: Schere");}
		if(random == 1){
			System.out.println("Spieler 2: Stein");}
		if(random == 2){
			System.out.println("Spieler 2: Papier");}


	if(playerone.equals("Schere") && random == 0 || playerone.equals("Stein") && random == 1 || playerone.equals("Papier") && random == 2){
			System.out.println("Unentschieden");}

		else if(playerone.equals("Schere") && random == 1){
			System.out.println("Du gewinnst");}
		else if(playerone.equals("Schere") && random == 2){
			System.out.println("Du verlierst");}

		else if(playerone.equals("Stein") && random == 0){
			System.out.println("Du gewinnst");}
		else if(playerone.equals("Stein") && random == 2){
			System.out.println("Du verlierst");}

		else if(playerone.equals("Papier") && random == 1){
			System.out.println("Du gewinnst");}
		else if(playerone.equals("Papier") && random == 0){
			System.out.println("Du verlierst");}
	}
}
