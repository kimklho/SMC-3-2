import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner itn = new Scanner(System.in); 
		System.out.print("1~50������ ���� �Է��Ͽ� ������ �����ϼ���: ");
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
			System.out.print("\n" + arr[j] + "�� ���� �ֽ��ϴ�. ���ϵ帳�ϴ�!");
		}else{System.out.print("\n���� �����ϴ�. �ٽ� �õ��� ������.");}
	}
}


