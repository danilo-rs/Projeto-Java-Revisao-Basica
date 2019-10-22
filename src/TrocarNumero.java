import java.util.Scanner;

public class TrocarNumero {
	public static void main(String[] args) {
		TrocaNumero tn = new TrocaNumero();
		Scanner inputData = new Scanner(System.in);
		System.out.println("Insira o valor do número a: ");
		tn.a = inputData.nextInt();
		System.out.println("Insira o valor do número b: ");
		tn.b = inputData.nextInt();
		tn.ChangeNumber(tn.a,tn.b);
		System.out.println("O valor de a é: "+tn.a);
		System.out.println("O valor de b é: "+tn.b);

	}

}
