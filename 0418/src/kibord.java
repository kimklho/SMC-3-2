import java.util.Scanner;

public class kibord {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("첫번째 정수를 입력해 주세요: ");
	int s1 = scanner.nextInt();
	System.out.print("\n");
	System.out.print("두번째 정수를 입력해 주세요: ");
	int s2 = scanner.nextInt();
	
	int submity = 0;
	
	for(int i = s1; i <= s2; i++) {
		submity += i;
		s1++;
	}
	System.out.print("결과는 : " + submity);
	
	}
}
