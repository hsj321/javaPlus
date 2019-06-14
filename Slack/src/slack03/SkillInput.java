package slack03;

import java.util.Scanner;

public class SkillInput {
	void input() {
		
		Scanner scan = new Scanner(System.in);
		String[] sarray = new String[27];
		String[] skilltree = new String[21];
		String skill;
		
		System.out.println(skilltree.length);
		
		System.out.println("선행스킬 : ");
		skill = scan.next();
		System.out.println("스킬드리  : ");
		for(int i = 0; i < skilltree.length; i++) {
			skilltree[i] = scan.next();
		}
		
		
		
	}
}
