import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner itn = new Scanner(System.in); 
		System.out.print("1 = ����, 2 = ���� 3 = �� : ");
		int num1=itn.nextInt();
		int a=0;
		a = (int)(Math.random()*3)+1;
		if(a == 1) {
			System.out.println("System: ����");
			if(num1 == 1) {
				System.out.print("�����ϴ�.");
			}if(num1 == 2) {
				System.out.print("�̰���ϴ�.");
			}if(num1 == 3) {
				System.out.print("�����ϴ�.");
			}
		}
		if(a == 2) {
			System.out.println("System: ����");
			if(num1 == 1) {
				System.out.print("�����ϴ�.");
			}if(num1 == 2) {
				System.out.print("�����ϴ�.�̰���ϴ�.");
			}if(num1 == 3) {
				System.out.print("�̰���ϴ�.");
			}
		}
		if(a == 3) {
			System.out.println("System: ��");
			if(num1 == 1) {
				System.out.print("�̰���ϴ�.");
			}if(num1 == 2) {
				System.out.print("�����ϴ�.");
			}if(num1 == 3) {
				System.out.print("�����ϴ�.");
			}
		}
	}
}