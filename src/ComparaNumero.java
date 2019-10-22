import java.util.Scanner;

public class ComparaNumero {
	
	public static void main(String[] args) {
		int a;
		int b;
		Scanner inputData = new Scanner(System.in);
		System.out.println("Insira um número: ");
		a = inputData.nextInt();
		System.out.println("Insira outro número: ");
		b = inputData.nextInt();
		if(a == b){
			System.out.println("Os numeros inseridos são iguais!");
		}else if(a > b){
			System.out.println("O número "+a+" é maior que "+b+"!!");
		}else{
			System.out.println("O número "+a+" é menor que "+b+"!!");
		}
		

	}

}
