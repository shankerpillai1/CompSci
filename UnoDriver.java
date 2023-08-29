/*This program will demonstrate the card game uno. The program will allow the user to play against the computer.
The rules of Uno are as follows: Both players will recieve 7 cards to start. The first card left in the
draw pile (the cards not distributed) will be the opening card. In each turn, a player can only place a card that either is a wild card
or a card that has either the same face color or number. The colors are yellow, green, blue, and red, while numbers can range from
0-9. If no card fitting that criteria is present in your hand, you must draw cards until one is draw that can be played. Uno is declared when
either player has one card remaining, and a player wins when every card in their hand has been played and they are left with no cards.
The program will use methods and a Card class to run the game.*/

//import classes
import java.util.Scanner;
import java.util.ArrayList;

public class UnoDriver
{
	public static void main(String [] args)
	{
		//assign cards
		Card temp;
		String yesno;
		Scanner sc=new Scanner(System.in);
		ArrayList <Card> allCards=new ArrayList<Card>();
		for(int k=0; k<2; k++)
		{
			for(int i=0; i<10; i++)
			{
				for(int j=0; j<4; j++)
				{
					if(j==0)
						temp=new Card("red", (""+i+""));
					else if(j==1)
						temp=new Card("green", (""+i+""));
					else if(j==2)
						temp=new Card("blue", (""+i+""));
					else
						temp=new Card("yellow", (""+i+""));
					allCards.add(temp);
				}
			}
		}
		//add action and wild cards
		for(int i=0; i<4; i++)
		{
			temp=new Card("", "wild");
			allCards.add(temp);
		}
		for(int i=0; i<4; i++)
		{
			temp=new Card("", "wild+4");
			allCards.add(temp);
		}
		allCards.add(new Card("green", "skip"));
		allCards.add(new Card("yellow", "skip"));
		allCards.add(new Card("blue", "skip"));
		allCards.add(new Card("red", "skip"));

		shuffle(allCards);

		//assign opening hands to both players
		System.out.println("\t\tUNO\n\nWelcome to Uno! Please enter your name:");
		String name=sc.nextLine();
		HumanPlayer p1=new HumanPlayer(name);
		ComputerPlayer p2=new ComputerPlayer();
		Card current;
		boolean win=false;

		//do-while loop for reruns
		do{
			//reset hands, then assign opening cards and put starting card up
			win=false;
			p1.reset(allCards);
			p2.reset(allCards);
			shuffle(allCards);
			p1.assignOpeningCards(allCards);
			p2.assignOpeningCards(allCards);
			current=allCards.get(0);
			allCards.remove(0);

			//while loop to continue game
			while(!win)
			{
				current=p1.playTurn(current, allCards);
				win=checkWin(p1, p2);

				if(win)
					break;

				current=p2.playTurn(current, allCards);
				win=checkWin(p1, p2);
				shuffle(allCards);
			}
			yesno=endGame(p1, p2, sc);
		}
		while(yesno.equals("yes"));

	}






	//this method will shuffle the cards. @param an arraylist of cards
	public static void shuffle(ArrayList<Card> cards)
	{
		Card temp;
		int rand;
		for(int i=cards.size()-1; i>0; i--)
		{
			temp=cards.get(i);
			rand=(int)(Math.random()*cards.size());
			cards.set(i, cards.get(rand));
			cards.set(rand,temp);
		}
	}

	//this method will check if a player has won, if so it will return true
	public static boolean checkWin(UnoPlayer p1, UnoPlayer p2)
	{
		if(p1.getNumCards()==0||p2.getNumCards()==0)
			return true;
		else if(p1.getNumCards()==1||p2.getNumCards()==1)
			System.out.println("UNO has been called!!");
		return false;
	}

	//this method will tell who the winner is, and then ask the user if they would like to play again. @param two UnoPlayers, @return a string for play again
	public static String endGame(UnoPlayer p1, UnoPlayer p2, Scanner sc)
	{
		if(p1.getNumCards()==0)
			System.out.println("\nCongratulations, You have won the game!!");
		else
			System.out.println("\nUnfortunately, you have lost the game");

		//ask the user if they would like to play again
		System.out.println("\nWould you like to play again?");
		String yesno=sc.nextLine();

		//validate
		while(!yesno.equalsIgnoreCase("yes")&&!yesno.equalsIgnoreCase("no"))
		{
			System.out.println("\nInvalid Input. Please enter yes or no");
			yesno=sc.nextLine();
		}

		return yesno;
	}

}