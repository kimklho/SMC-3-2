import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.print("두개의 수를 입력하세요: ");
		Scanner in = new Scanner(System.in); 
		Scanner itn = new Scanner(System.in); 
		int num1=in.nextInt();
		int num2=itn.nextInt();
		int sum=0;
		
		if(num1 < num2){
			sum = num1;
			for(int i=num1; i < num2; i++){
				sum += i+1;
			}
		}
		if(num1 > num2){
			sum = num2;
			for(int i=num2; i < num1; i++){
				sum += i+1;
			}
		}
		System.out.print(sum);
	}

}
