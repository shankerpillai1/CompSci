public class Pillai_Prob6{public static void main(String[] args){int total=0, total2=0;
	for(int i=1; i<101;i++){total+=(Math.pow(i, 2));total2+=i;}
	System.out.println(Math.pow(total2, 2)-total);}}