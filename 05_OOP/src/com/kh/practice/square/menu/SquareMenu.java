package com.kh.practice.square.menu;

import java.util.Scanner;

import com.kh.practice.square.controller.SquareController;

public class SquareMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController sqr = new SquareController();
	
	public void inputMenu() {
		
        while (true) {
        	System.out.println("=====사각형을 만들어요=====");
            System.out.println("1. 사각형 생성");
            System.out.println("2. 사각형 둘레 구하기");
            System.out.println("3. 사각형 면적 구하기");
            System.out.println("4. 사각형 색칠하기");
            System.out.println("5. 사각형 정보 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("번호를 입력 해주세요 : ");
           
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1 :
                    createSquare();
                    break;
                case 2 :
                    getPerimeter();
                    break;
                case 3 :
                    getArea();
                    break;
                case 4 :
                    paint();
                    break;
                case 5 :
                    printInformation();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료");
                    return;
                default:
                    System.out.println("잘못된 번호입니다 다시 입력해주세요\n\n");
            }
        }
	}
	
	public void createSquare() {
		System.out.println("생성할 사각형의 가로, 세로 길이를 정해주세요");
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		if( sqr.createSquare(height, width) != null) {
			System.out.println("사각형이 성공적으로 생성되었습니다");
		} else { 
			System.out.println("사각형이 생성되지 않았습니다");
		}
	}
	
	public void getPerimeter() {
		double sCP = sqr.calcPerimeter();
		
		if(sCP == 0) {
			System.out.println("사각형을 먼저 생성해주세요\n\n");
		} else {
			System.out.print(sCP);
		}
	}
	
	public void getArea() {
		double sCA = sqr.calcArea();
		
		if(sCA == 0) {
			System.out.println("사각형을 먼저 생성해주세요\n\n");
		} else {
			System.out.print(sCA);
		}
	}
	
	public void paint() {
		System.out.println("지정할 색깔을 입력해주세요.");
		System.out.print("색깔 : ");
		sc.nextLine();
		String color = sc.nextLine();
		
		boolean ptc = sqr.paintColor(color);
		if(ptc != true) {
			System.out.println("사각형을 먼저 생성해주세요\n\n");
		} else {
			System.out.println("색이 성공적으로 설정되었습니다");
		}
	}
	
	public void printInformation() {
		sqr.print();
		if(sqr.print() != null) {
			System.out.print(sqr.print());
		} else {
			System.out.println("사각형을 먼저 생성해주세요\n\n");
		}
	}
}
