
public class SomaProduto {

	public static void main(String[] args) {
		int soma = 0;
		long produto = 1;
		for(int i = 1;i<=30;i++){
			if(i%2==0){
				produto *=i;
				}
			if(i%2!=0){
				soma +=i;
			}
		}
		System.out.println("O produto dos números pares entre 0 e 30 é: "+produto);
		System.out.println("A soma de números impares entre 0 e 30 é: "+soma);

	}

}
