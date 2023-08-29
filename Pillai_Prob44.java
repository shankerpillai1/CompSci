public class Pillai_Prob44{public static void main(String[] args){
	int [] pnums=new int[1499];
	boolean equals1, equals2;

	int sum,difference;
	for(int i=1; i<1000; i++){
		pnums[i-1]=(i*((3*i)-1))/2;
	}

	for(int i=0; i<999; i++){
		for(int j=0; j<999; j++){
			sum=pnums[i]+pnums[j];
			difference=(int)Math.abs(pnums[i]-pnums[j]);
			equals1=false;equals2=false;

			for(int k=0; k<999; k++){
				if(sum==pnums[k])
					equals1=true;
				if(difference==pnums[k])
					equals2=true;
			}

			if(equals2){
				System.out.println(pnums[i]+","+pnums[j]+","+difference);
			}
		}
	}


}}