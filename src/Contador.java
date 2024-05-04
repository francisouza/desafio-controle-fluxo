import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int paramUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int paramDois = terminal.nextInt();
		
		try {
			contar(paramUm, paramDois);
		} catch (ParametrosInvalidosException exception){
			
		}
	}
	
	static void contar(int paramUm, int paramDois ) throws ParametrosInvalidosException {
		if (paramUm > paramDois) {
			System.out.println("O primeiro número deve ser menor que o segundo!");
		}
		int contagem = paramDois - paramUm;
		for (int i = 1; i < (contagem + 1); i++) {
			System.out.println(i);
		}
	}
}
