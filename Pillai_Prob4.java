public class Pillai_Prob4{public static void main(String [] args){
	int one=100, two=100, product, reverse=0, largest=0, remainder, product2;

	for(one=100; one<1000; one++){
		for(two=100; two<1000; two++){
			product=one*two;
			product2=product;
			while(product!= 0 )
			{
			   remainder = product%10;
			   reverse = (reverse*10)+ remainder;
			   product/= 10;
            }

            if((product2==reverse)&&(product2>largest)){
            	largest=product2;}

            reverse=0;
            }
		}
		System.out.println(largest);
	}
}

