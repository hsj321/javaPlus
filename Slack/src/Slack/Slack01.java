package Slack;

import java.util.Scanner;

public class Slack01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i;                               //for��  i
		int want;                            //���ϴ� ����?
		int result = 0;                      //�����
		int cal = 0;
		
		System.out.println("����� : ");        //���ϴ� ���� �Է½�Ű��
		want = scan.nextInt();               //���ϴ� ���� �Է�
		
		for(i = 0; i < want+1; i++)          //�Է��� �� ���� for�� 
		{      
			cal += i;
			result += cal;
			System.out.println("cal = " + cal);
			System.out.println("result = " + result);
		}
	}
}
