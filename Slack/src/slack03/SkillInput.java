package slack03;

import java.util.Scanner;

public class SkillInput {
	void input() {
		
		Scanner scan = new Scanner(System.in);
		String[] sarray = new String[27];
		String[] skilltree = new String[21];
		String skill;
		
		System.out.println(skilltree.length);
		
		System.out.println("���ེų : ");
		skill = scan.next();
		System.out.println("��ų�帮  : ");
		for(int i = 0; i < skilltree.length; i++) {
			skilltree[i] = scan.next();
		}
		
		
		
	}
}
