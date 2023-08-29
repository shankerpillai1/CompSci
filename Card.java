//this class will simulate an uno card. It may be a number card, a wild card, or an action card.
public class Card
{
	//instance variables
	private String color;
	private String value;

	//constructor, @param strings for color and value,
	public Card(String c, String v)
	{
		color=c;
		value=v;
	}

	//accessor methods
	public String getColor(){	return color;}
	public String getValue(){	return value;}

	//mutator method
	public void setColor(String c){color=c;}

	public String toString(){return color+" "+value;}

}
