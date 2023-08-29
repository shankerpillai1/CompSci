import java.util.ArrayList;
import java.util.Scanner;
public class UnoPlayer
{
	//instance variables for the hand and the scanner, protected so they can be used in subclasses
	protected ArrayList<Card> hand=new ArrayList<Card>();
	protected Scanner sc=new Scanner(System.in);

	//assigns the seven original cards at the start of the game
	public void assignOpeningCards(ArrayList<Card> allCards)
	{
		for(int i=0; i<7; i++)
			addCard(allCards);
	}

	//adds the top card in the deck to the hand and removes it from the deck
	public void addCard(ArrayList<Card> allCards)
	{
		hand.add(allCards.get(0));
		allCards.remove(0);
	}

	//accessor method to get number of cards
	public int getNumCards(){return hand.size();}

	/*This method will check if a certain card is playable, based on comparison to card c2.
	@param 2 cards to compare, an index and type for wild cards*/
	public boolean isPlayable(Card c1, Card c2, int index, String type)
	{
		String r;
		int x;
		//if the card is wild, helps the user set the color of the wild
		if(c1.getValue().contains("wild"))
		{
			//for checking if hand valid, we don't want to use it yet just return true
			if(type.equals("cc"))
				return true;

			//if the computer is selecting a wild, uses random to select a color
			if(type.equals("c"))
			{
				x=(int)(Math.random()*4);
				if(x==0)
					r="yellow";
				else if(x==1)
					r="red";
				else if(x==2)
					r="green";
				else
					r="blue";
				c1.setColor(r);
				hand.set(index, c1);
				return true;
			}
			sc.nextLine();
			System.out.println("What would you like the color to be?");
			r=sc.nextLine();

			//validate
			while(!r.equalsIgnoreCase("red")&&!r.equalsIgnoreCase("blue")&&!r.equalsIgnoreCase("green")&&!r.equalsIgnoreCase("yellow"))
			{
				System.out.println("Please enter a valid color");
				r=sc.nextLine();
			}

			c1.setColor(r);
			hand.set(index, c1);
			System.out.println("\n");
			return true;
		}

		//fairly simple procedure if the card is not wild
		else if(c1.getColor().equals(c2.getColor())||c1.getValue().equals(c2.getValue()))
			return true;
		else
			return false;
	}

	/*this method will check to see if the user had any valid cards they can play, or if they must begin drawing cards.
	@param a card c to compare to, @return a boolean for if valid or not*/
	public boolean handValid(Card c)
	{
		for(int i=0; i<hand.size(); i++)
		{
			if(isPlayable(hand.get(i), c, i, "cc"))
				return true;
		}
		return false;
	}

	//This program will reset the players hands and put the cards back into the deck, @param the deck
	public void reset(ArrayList <Card> allCards)
	{
		for(int i=0; i<hand.size(); i++)
		{
			allCards.add(hand.get(0));
			hand.remove(0);
		}
	}


}