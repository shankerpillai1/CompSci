/*This class will contain useful methods.*/
import java.util.Scanner;
public class UsefulMethods{
	//validation method
	Scanner sc=new Scanner(System.in);
	public int validate(int i){
		while(i<0){
			System.out.println("Invalid Input");
			i=sc.nextInt();}
		return i;
	}


	public double validate(double i){
		while(i<0){
			System.out.println("Invalid Input");
			i=sc.nextDouble();}
		return i;
	}

	public String validate(String s){
		while(!s.equalsIgnoreCase("yes")&&!s.equalsIgnoreCase("no")){
			System.out.println("Invalid Input");
			s=sc.nextLine();}
		return s;
	}

	public static boolean isPrime(int x){
		boolean b=true;
		for(int i=x-1; i>1; i--){
			if((x%i)==0)
				b=false;
			}
		return b;}
}





