import java.util.Scanner;

public class MaiorNumero {
	
	public static void main(String[] args) {
		int a;
		int b;
		Scanner inputData = new Scanner(System.in);
		System.out.println("Insira um número: ");
		a = inputData.nextInt();
		System.out.println("Insira outro número: ");
		b = inputData.nextInt();
		if(a > b){
			System.out.println("O maior número é: "+a+"!!");
		}else if(a == b){
			System.out.println("Os números são iguais!");			
		}else{
			System.out.println("O maior número é: "+b+"!!");
		}
		

	}

}
