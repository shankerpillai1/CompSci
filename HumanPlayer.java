import java.util.ArrayList;
public class HumanPlayer extends UnoPlayer
{
	private String name;

	//constructor to set the players name
	public HumanPlayer(String n){
		name=n;}

	//playturn method, plays out the entire turn of the human player. @param the card last played and the deck, @return the card the user plays
	public Card playTurn(Card c, ArrayList<Card> allCards)
	{

		System.out.println("\n\nThe current card placed is "+c);

		//if previous card was a wild +4, the user must pick up 4 cards
		if(c.getValue().contains("+4"))
		{
			System.out.println("You must add 4 cards");
			for(int i=0; i<4; i++)
			{
				addCard(allCards);
				System.out.println("You have picked up a "+hand.get(hand.size()-1));
			}
			System.out.println("\n");
		}
		System.out.println("It is "+name+"'s turn");
		printHand();
		int choice;
		Card c2=new Card("","");
		boolean done=false;

		//call hand valid method to see if player has a playable card
		if(handValid(c))
		{
			System.out.println("Enter the number of the card you would like to place:");
			choice=sc.nextInt()-1;

			//validate
			while(choice<0||choice>hand.size()-1)
			{
				System.out.println("Please enter a valid choice");
				choice=sc.nextInt()-1;
			}

			//check if user has played a valid card
			while(!isPlayable(hand.get(choice), c, choice,""))
			{
				System.out.println("That card is not playable this turn. Please pick another.");
				choice=sc.nextInt()-1;

				//validate
				while(choice<0||choice>hand.size()-1)
				{
					System.out.println("Please enter a valid choice");
					choice=sc.nextInt()-1;
				}
			}

			//add cards and set current
			c2=hand.get(choice);
			allCards.add(c);
			hand.remove(choice);

			//if the card played was a skip, then it is once again the user who played its turn
			if(c2.getValue().equals("skip"))
				return playTurn(c2, allCards);
			else
				return c2;
		}
		else
		{
			//have the user draw cards until they draw one that can be played
			while(!done)
			{
				addCard(allCards);
				System.out.println("You drew a "+hand.get(hand.size()-1));

				if(isPlayable(hand.get(hand.size()-1),c, hand.size()-1,""))
				{
					System.out.println("You have played that card.");
					allCards.add(c);
					c2=hand.get(hand.size()-1);
					hand.remove(hand.size()-1);
					done=true;
				}
			}
			if(c2.getValue().equals("skip"))
				return playTurn(c2, allCards);
			return c2;
		}
	}



	//this method will print the users hand so the user can select a card to play from it.
	public void printHand()
	{
		System.out.println("This is your current hand");

		//for-loop to print each card
		for(int i=0; i<hand.size(); i++)
			System.out.println((i+1)+" "+hand.get(i));
		System.out.println("\n");
	}
}