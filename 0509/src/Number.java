import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner itn = new Scanner(System.in); 
		System.out.print("1~50까지의 수를 입력하여 게임을 시작하세요: ");
		int num1=itn.nextInt();
		int []arr=new int [11];	
		int j;
		for(int i=0;i < 10; i++){
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i] + " ");
		}
		for(j=0;j < 10; j++) {
			if(arr[j] == num1){
				arr[10] = 1;
				break;
			} else{arr[10] = 0;}
		}
		if(arr[10] == 1) {
			System.out.print("\n" + arr[j] + "의 값이 있습니다. 축하드립니다!");
		}else{System.out.print("\n값이 없습니다. 다시 시도해 보세요.");}
	}
}


