import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		int[] nota = new int[4];
		int soma = 0;
		Scanner inputData = new Scanner(System.in);

		System.out.println("Insira a primeira nota: ");
		nota[0] = inputData.nextInt();
		System.out.println("Insira a segunda nota: ");
		nota[1] = inputData.nextInt();
		System.out.println("Insira a terceira nota: ");
		nota[2] = inputData.nextInt();
		System.out.println("Insira a quarta nota: ");
		nota[3] = inputData.nextInt();
		
		for(int i = 0; i<nota.length;i++) {
			if(nota[i]>10) {
				System.out.println("Nota acima da nota máxima");
				break;
			}else {
				soma = soma + nota[i];	
				
			}
			}
		System.out.println("A média do aluno é: "+soma/nota.length);
		
		
	}
	

}
