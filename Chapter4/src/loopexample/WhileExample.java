package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num =1;
		int sum =0;
		
		do{
			
			sum += num;
			num++;
		}while(num < 1);
		System.out.println("1부터 10까지의 합인 "+ sum +"입니다.");		
	}

}

