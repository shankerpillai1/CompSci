import java.util.ArrayList;
public class ComputerPlayer extends UnoPlayer
{
	//This method will play out a turn for the computer
	public Card playTurn(Card c, ArrayList <Card> allCards)
	{
		if(c.getValue().contains("+4"))
		{
			System.out.println("The computer is adding 4 cards");
			for(int i=0; i<4; i++)
			{
				addCard(allCards);
			}
			System.out.println("\n");
		}

		Card c2=new Card("","");
		boolean done=false;
		if(handValid(c))
		{
			for(int i=0; i<hand.size(); i++)
			{
				if(isPlayable(hand.get(i), c, i, "c"))
				{
					c2=hand.get(i);
					allCards.add(c);
					hand.remove(i);
					System.out.println("\n\nThe computer has "+hand.size()+" cards");

					//if the user played a skip, it is their turn again
					if(c2.getValue().equals("skip"))
						return playTurn(c2, allCards);
					else
						return c2;
				}
			}
			return c2;
		}
		else
		{
			while(!done)
			{
				addCard(allCards);
				System.out.println("The computer has drawn a card.");

				if(isPlayable(hand.get(hand.size()-1),c, hand.size()-1,"c"))
				{
					allCards.add(c);
					c2=hand.get(hand.size()-1);
					System.out.println("The computer has played: "+c2);
					hand.remove(hand.size()-1);
					done=true;
					System.out.println("\n\nThe computer has "+hand.size()+" cards");
				}
			}
			if(c2.getValue().equals("skip"))
				return playTurn(c2, allCards);
			return c2;
		}
	}

}