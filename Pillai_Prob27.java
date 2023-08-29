public class Pillai_Prob27{public static void main(String [] args){
	int bestNum = 0;
	int bestA = 0;
	int bestB = 0;
	for (int a = -1000; a <= 1000; a++) {
		for (int b = -1000; b <= 1000; b++) {
			int num = numberOfConsecutivePrimesGenerated(a, b);
			if (num > bestNum) {
				bestNum = num;
				bestA = a;
				bestB = b;
			}
		}
	}