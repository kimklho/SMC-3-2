import java.util.Scanner;

public class kibord {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("ù��° ������ �Է��� �ּ���: ");
	int s1 = scanner.nextInt();
	System.out.print("\n");
	System.out.print("�ι�° ������ �Է��� �ּ���: ");
	int s2 = scanner.nextInt();
	
	int submity = 0;
	
	for(int i = s1; i <= s2; i++) {
		submity += i;
		s1++;
	}
	System.out.print("����� : " + submity);
	
	}
}
