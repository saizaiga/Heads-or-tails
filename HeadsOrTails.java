import java.util.Random;
import java.util.Scanner;
public class HeadsOrTails {

	public static void main(String[] args) {
		System.out.print("Who are you?\n>");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hello, "+name+"!");
		System.out.println("Tossing a coin...");
		Random rand = new Random();
		int H=0,T=0;

		for(int i=0; i<3;i++) {
			int coin = rand.nextInt(2);
			System.out.print("Round "+(i+1)+" : ");
			if(coin==0) {
				System.out.print("Heads\n"); H++;
			}else {System.out.print("Tails\n");T++;}
		}
		
		System.out.println("Heads: "+H+", Tails: "+T);
		
	}

}