package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
	/*	int rank = 2;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default: medalColor = 'A';
		}
		System.out.println(rank +"등 메달의 색깔은 "+ medalColor +"입니다.");
				} */
	}
		{
			String medal = "Gold";
			
			switch(medal) {
			case "Gold":
				System.out.println("금메달입니다.");
					break;
			case "Silver":
				System.out.println("은메달입니다.");
					break;
			case "Bronze":
				System.out.println("동메달입니다.");
					break;
					
			default:
				System.out.println("메달이 없습니다.");
					break;
			}
			System.out.println(medal);
		}
	}
			
	

	

