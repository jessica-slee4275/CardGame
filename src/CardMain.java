
import java.util.Hashtable;
import java.util.Scanner;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardArrayBox cBox = new CardArrayBox();
		Card[] cards = cBox.getAllCards();
		int i=0;
		//print card
//		for(int i=0; i<cards.length; i++) {
//			System.out.println(cards[i]);
//			if((i+1)%10==0) {
//				System.out.println();
//			}
//		}
		CardPoint p1 = new CardPoint(cards[0],cards[1]);
		CardPoint p2 = new CardPoint(cards[2],cards[3]);
		CardPoint p3 = new CardPoint(cards[4],cards[5]);
		CardPoint p4 = new CardPoint(cards[6],cards[7]);
		int t1 = p1.getPoint();
		int t2 = p2.getPoint();
		int t3 = p3.getPoint();
		int t4 = p4.getPoint();
		
		try{
			while(i<100) {
				System.out.print("Enter player number(2~4): ");
				Scanner myObj= new Scanner(System.in);  // Create a Scanner object
			    int playerNumber = Integer.parseInt(myObj.nextLine());  // Read user input
			    
			    switch(playerNumber) {
			    	case 2: 
			    		System.out.println(p1 + " => "+ t1);
						System.out.println(p2 + " => "+ t2);
						if(t1>t2) {
							System.out.println("Player1 Win!");
						}else if(t1<t2) {
							System.out.println("Player2 Win!");
						}else {
							System.out.println("Player1 value = Player2 value");
						}
						break;
			    	case 3:
			    		System.out.println(p1 + " => "+ t1);
						System.out.println(p2 + " => "+ t2);
						System.out.println(p3 + " => "+ t3);
						int large = t1<t2? (t2<t3?t3:t2):(t1<t3?t3:t1);
						if(large==t1) { System.out.println("Player1 Win!");}
						else if(large==t2) {System.out.println("Player2 Win!");}
						else if(large==t3) {System.out.println("Player3 Win!");}
						break;
					case 4:
			    		System.out.println(p1 + " => "+ t1);
						System.out.println(p2 + " => "+ t2);
						System.out.println(p3 + " => "+ t3);
						System.out.println(p4 + " => "+ t4);
						int large2 = t1<t2? (t2<t3?t3:t2):(t1<t3?t3:t1);
						large2 = large2<t4? t4:t4;
						if(large2==t1) {System.out.println("Player1 Win!");}
						else if(large2==t2) {System.out.println("Player2 Win!");}
						else if(large2==t3) {System.out.println("Player3 Win!");}
						else if(large2==t4) {System.out.println("Player4 Win!");}
						break;
			    	}
		
			    i++;
			}
		}
		
	    catch(Exception e) {
	    	System.out.println("Invalid value. Please try again.");
	    	System.out.print("Enter player number(2~4): ");
			Scanner myObj2= new Scanner(System.in);  // Create a Scanner object
		    int playerNumber2 = Integer.parseInt(myObj2.nextLine());  // Read user input
		}
	    	
	}

}
