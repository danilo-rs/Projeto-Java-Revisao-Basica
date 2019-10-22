import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		Scanner inputData = new Scanner(System.in);
		System.out.println("Insira um número: ");
		a = inputData.nextInt();
		b = a;
		System.out.println("O número inserido é: "+a);
		System.out.println("-----------------------------------------");
		for(int i = 0; i<b; i++){
			x=--a;
			System.out.println(x);
		}

	}

}
