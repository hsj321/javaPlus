package Slack;

import java.util.Scanner;

public class Slack01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i;                               //for문  i
		int want;                            //원하는 숫자?
		int result = 0;                      //결과값
		int cal = 0;
		
		System.out.println("몇까지 : ");        //원하는 숫자 입력시키기
		want = scan.nextInt();               //원하는 숫자 입력
		
		for(i = 0; i < want+1; i++)          //입력한 수 까지 for문 
		{      
			cal += i;
			result += cal;
			System.out.println("cal = " + cal);
			System.out.println("result = " + result);
		}
	}
}
