import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner itn = new Scanner(System.in); 
		System.out.print("1 = 가위, 2 = 바위 3 = 보 : ");
		int num1=itn.nextInt();
		int a=0;
		a = (int)(Math.random()*3)+1;
		if(a == 1) {
			System.out.println("System: 가위");
			if(num1 == 1) {
				System.out.print("비겼습니다.");
			}if(num1 == 2) {
				System.out.print("이겼습니다.");
			}if(num1 == 3) {
				System.out.print("졌습니다.");
			}
		}
		if(a == 2) {
			System.out.println("System: 바위");
			if(num1 == 1) {
				System.out.print("졌습니다.");
			}if(num1 == 2) {
				System.out.print("비겼습니다.이겼습니다.");
			}if(num1 == 3) {
				System.out.print("이겼습니다.");
			}
		}
		if(a == 3) {
			System.out.println("System: 보");
			if(num1 == 1) {
				System.out.print("이겼습니다.");
			}if(num1 == 2) {
				System.out.print("졌습니다.");
			}if(num1 == 3) {
				System.out.print("비겼습니다.");
			}
		}
	}
}