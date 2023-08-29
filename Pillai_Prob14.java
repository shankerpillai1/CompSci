public class Pillai_Prob14{public static void main(String[] args){
	int length=0, lengthmax=0, xmax=0;


	for(int j = 10; j < 1000000; j++)
	{
		long i = j;

		while (i != 1)
		{
			if (i % 2 == 0)
			{
				i /= 2;
				length++;
			}
			else
			{
				i = (3 * i) + 1;
				length++;
			}
		}

		if(length>lengthmax){
			lengthmax=length;

			xmax=j;
		}

		length=0;
	}

	System.out.println(xmax+","+length);
}}
