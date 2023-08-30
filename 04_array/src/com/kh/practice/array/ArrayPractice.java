package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10-i;
			System.out.println(arr[i]);
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력해주세요. : ");
		int num = sc.nextInt();
		
		int[] input = new int[num];
	
		for(int i = 0; i < input.length; i++) {
			input[i] = i+1;				//값을 배열에 넣어주는 기능
			System.out.println(input[i]);
		}
	}
	
	public void practice4() {
		String[] str = new String[5];
		str[0] = "사과";
		str[1] = "귤";
		str[2] = "포도";
		str[3] = "복숭아";
		str[4] = "참외";
		
		System.out.print(str[1]);
		
	}
	
	public void practice5() {	//문자열의 문자를 배열에다가 집어넣기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : " );
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		String index = "";
		for(int i = 0; i < str.length(); i++)	{
			if(chArr[i] == ch) {
				count++;
				index += i + " ";
			}
		}
		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch + "개수 : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] week = new String[7];
		week[0] = "월요일";
		week[1] = "화요일";
		week[2] = "수요일";
		week[3] = "목요일";
		week[4] = "금요일";
		week[5] = "토요일";
		week[6] = "일요일";
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		
		if(input <= 6) {
			System.out.print(week[input]);
		} else {
			System.out.print("잘못입력하셨습니다.");
		}
	}
	
	public void practice7() {	// 왜 초기화가 안되지?
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요 : ");
		int input = sc.nextInt();
		int[] size = new int[input];
		
		for(int i = 0; i < size.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			int index = sc.nextInt();
			size[i] = index;
		}
		
		System.out.println("배열 전체 값 : ");
		for(int num : size) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		int sum = 0;
		for (int num : size) {
			sum += num;
		}
		System.out.println("배열의 각 인덱스에 저장된 값들의 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		String[] chickenMenu = {"후라이드", "양념", "간장", "콘소메", "마늘", "반반", "파닭", "지코바"};
		
		System.out.print("치킨 메뉴를 입력하세요 : ");
		String input = sc.nextLine();
		
		for(String menu : chickenMenu) {
			if(menu.equals(input)) {
				System.out.println(input + "치킨 주문 가능");
				return;
			}
		}
		System.out.println(input + "치킨은 없는 메뉴입니다.");
	}
	
	public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 (ex. 123456-1234567): ");
        String ssn = sc.nextLine();
        
        String redactedSSN = redactSSN(ssn);
        
        System.out.println("가리기 전: " + ssn);
        System.out.println("가리기 후: " + redactedSSN);
    }
    
    public static String redactSSN(String ssn) {
        StringBuilder redacted = new StringBuilder(ssn);
        
        for (int i = 7; i < redacted.length(); i++) {
            redacted.setCharAt(i, '*');
        }
        return redacted.toString();
    }
    
    public void practice10() {
    	int[] num = new int[10];
    	int random = (int)(Math.random()*10 + 1);	//1개 발생 여러번이면 for문 안에 넣기
    	
    	for(int i = 0; i < num.length; i++) {
    		int randomNumber = (int)(Math.random()*10 + 1);		//랜덤변수 1개를 넘버에 넣고 그 넘버를 배열의 i번째에 넣고 i가 만족할때까지 돌려줘
    		num[i] = randomNumber;
    	}
    	
    	for(int i = 0; i < num.length; i++) {
    		System.out.print(num[i] + " ");
    	}
    }

	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = Integer.parseInt(sc.nextLine());
		String[] strArr = new String[size];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			String input = sc.nextLine();
			strArr[i] = input;
		}
		
		String user = null;

		do {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			user = sc.nextLine();	//문자열을 사용하면 변수.toLoweCase 변수.toUpperCase 가능
			
			if(user.equalsIgnoreCase("y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = Integer.parseInt(sc.nextLine());
				String[] newArr = new String[strArr.length + add];
				for(int i = 0; i < strArr.length; i++) {
					newArr[i] = strArr[i];
				}
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					String input = sc.nextLine();
					newArr[i] = input;
				}
				
				strArr = newArr;		//이전 배열에 새로운 배열을 덮어씌어야 유지됨.
			}
		} while(!user.toUpperCase().equals("N"));
		System.out.println(Arrays.toString(strArr));
	}
}
