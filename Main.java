
import java.util.*;

public class Main{
	public static int health = 100;
	public static int score = 0;
	public static void startGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("You Find Yourself In a Mysterious Place: ");
		System.out.println("1.Explore The Dark Cave");
		System.out.println("2.Walk Through the Enchanted Forest");
		System.out.print("Enter Your Choice: ");
		int n = sc.nextInt();
		System.out.println();
		clear();
		if(n==1) {
			exploreCave();
			
		}
		else if(n==2) {
			enterForest();
		}
		else {
			System.out.println("Invalid Choice. Game Over!");
		}
		clear();
		sc.close();
	}
	
	public static void exploreCave() {
		System.out.println("Enter The Dark Cave And Discover A Treasure Chest!");
		System.out.println("1.Open The Chest");
		System.out.println("2.Leave The Cave");
		System.out.print("Enter Your Choice: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		System.out.println();
		
		if(n==1) {
			int z = exploreRandom();
			if(z==0) {
				System.out.println();
				System.out.println("A Dragon Comes Out & It Eats You Alive");
				System.out.println("Sorry! You Died");
				System.out.println("Collected Score: "+score);
			}
			else {
				System.out.println("You Find Out Treasure!");
				score += 20;
				System.out.println("Your Score: "+score);
				System.out.println("You are now Good To Go Ahead");
				clear();
				confir();
			}
		}
		else if(n==2) {
			System.out.println("You Leave The Cave and Continue Your Adventure.");
			confir();
		}
		else {
			System.out.println("Invalid Choice. Game Over!");
		}
		sc.close();
	}
	
	
	public static void enterForest() {
		System.out.println("Walk Through The Enchanted Forest and Encounter A Dangerous Creature");
		System.out.println("1.Fight With The Creature");
		System.out.println("2.Continue Walking");
		System.out.print("Enter Your Choice: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		clear();
		if(n==1) {
			int z = exploreRandom();
			if(z==0) {
				System.out.println();
				System.out.println("The Creature Wins & Ate you Alive");
				System.out.println("Sorry! You Died");
				System.out.println("Collected Score: "+score);
			}
			else {
				System.out.println("You Win the Battle");
				score += 20;
				System.out.println("Your Score: "+score);
				System.out.println("You Are now Good to Go Ahead");
				clear();
				confir();
			}
		}
		else if(n==2) {
			System.out.println("Continue Walking Through The Forest");
			confir();
		}
		else {
			System.out.println("Invalid Choice. Game Over!");
		}
		sc.close();
	}
	
	
	public static void confir() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("1.Start The Game");
		System.out.println("2.End The Game");
		System.out.print("Enter Your Choice: ");
		
		int n = sc.nextInt();
		
		if(n==1) {
			startGame();
		}
		else {
			System.out.println();
			System.out.println("Game Over!");
			System.out.println("Health Score: "+health);
			System.out.println("Collected Score: "+score);
		}
		clear();
	}
	
	
	public static int exploreRandom() {
		Random ran = new Random();
		int r = ran.nextInt(2);
		return r;
	}
	
	public static void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To The Text Adventure Game!");
		System.out.println();
		System.out.println();
		startGame();
		clear();
		
	}
}
