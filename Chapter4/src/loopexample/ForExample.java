package loopexample;

public class ForExample {

	public static void main(String[] args) {

	/*	int num = 1;
		int sum = 0;
		
		while(num <=10) {
			
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num); */
		
	/*	int num;
		int sum;
		
		for(num=1, sum=0 ; num <= 10; num++) {
			
			sum += num;
				
		}
		System.out.println(sum);
		System.out.println(num);
		*/
		
	/*	int dan;
		int times;
		
		for(dan = 2; dan<=9; dan++) {
			
			for(times = 1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		
			}
		*/
	/*	int dan =2;
		int times =1;
		
		while(dan <=9) {
			times = 1;
			while(times <=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}   */
	/*	{
		int dan =2;
		int times =1;
		
		while(dan <=9) {
			if( (dan % 2) !=0) {
				dan++;
				continue;
			}
			times = 1;
			while(times <=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
	}
} */
		{
			int dan =2;
			int times =1;
			
			while(dan <=9) {
				
				times = 1;
				while(times <=9) {
					if(times > dan) break;
					System.out.println(dan + "X" + times + "=" + dan*times);
					times++;
				}
				dan++;
				System.out.println();
			}
		}
	}
}