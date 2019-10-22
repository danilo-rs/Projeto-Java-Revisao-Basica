import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		Scanner inputData = new Scanner(System.in);
		System.out.println("Insira um número: ");
		x = inputData.nextInt();
		System.out.println("Insira outro número: ");
		y = inputData.nextInt();
		z = x - y;
		int resultado = Math.abs(z);
		System.out.println(resultado);
	}

}
