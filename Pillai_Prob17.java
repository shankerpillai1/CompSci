public class Pillai_Prob17{public static void main(String[] args){
	int total=30;

	for(int i=1; i<=1000; i++){
		if(i==1000){
			total+=11;
			System.out.println(total);
			System.exit(0);
		}
		if((i%100)<10||(i%100)>20){
		if((i%10)==1||(i%10)==2||(i%10)==6||i==10)
			total+=3;
		else if((i%10)==3||(i%10)==7||(i%10)==8)
			total+=5;
		else if((i%10)==4||(i%10)==5||(i%10)==9)
			total+=4;
		}
		if((i%100)>10&&(i%100)<20){
			if((i%100)==11||(i%100)==12)
				total+=6;
			else if((i%100)==13||(i%100)==14||(i%100)==18||(i%100)==19)
				total+=8;
			else if((i%100)==15||(i%100)==16)
				total+=7;
			else if((i%100)==17)
				total+=9;
		}
		if((i%100)==0||i<100)
			total+=0;
		else
			total+=3;
		if(i>99)
			total+=7;
		if((i%100)>19&&(i%100)<40)
			total+=6;
		else if((i%100)>39&&(i%100)<70)
			total+=5;
		else if((i%100)>69&&(i%100)<80)
			total+=7;
		else if((i%100)>79&&(i%100)<100)
			total+=6;
		if((i>99&&i<300)||(i>599&&i<700))
			total+=3;
		else if(i>299&&i<400)
			total+=5;
		else if(i>399&&i<600)
			total+=4;
		else if(i>699&&i<900)
			total+=5;
		else if(i>899&&i<1000)
			total+=4;
	}
}}

