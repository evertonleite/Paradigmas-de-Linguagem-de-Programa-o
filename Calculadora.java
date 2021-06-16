import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int escolha = 1;
		
		while(escolha != 0) {
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Bem-vindo a Calculadora!");
			System.out.println("Insira o primeiro número que deseja efetuar alguma das quatro operações:");
			float num1 = ler.nextFloat();
			System.out.println("Insira o segundo número que deseja efetuar alguma das quatro operações:");
			float num2 = ler.nextFloat();
			
			Scanner input = new Scanner(System.in);
			System.out.println("Você prefere qual operação matemática? ");
			System.out.println("1) Somar");
			System.out.println("2) Subtrair");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			System.out.println("0) Encerrar programa");
			
			escolha = input.nextInt();
			
			switch(escolha) {
			case 1 : 
				somar(num1, num2);
				break;
			case 2 :
				diminuir(num1, num2);
				break;
			case 3 : 
				multiplicar(num1, num2);
				break;
			case 4 : 
				dividir(num1, num2);
				break;
			case 0 :
				System.out.println("Programa finalizado.");
				escolha = 0;
				break;
			default :
				System.out.println("Opção não existente.");
				break;
			}
		}
	}

	public static void somar (float num1, float num2) {
		float somar = num1 + num2;
		System.out.println("Resultado: "+ somar);
	}
	
	public static void diminuir (float num1, float num2) {
		float diminuir = num1 - num2;
		System.out.println("Resultado: "+ diminuir);
	}
	
	public static void multiplicar (float num1, float num2) {
		float multiplica = num1 * num2;
		System.out.println("Resultado: "+ multiplica);
	}
	
	public static void dividir (float num1, float num2) {
		if(num1 == 0 || num2 == 0) {
			System.out.println("Não é possivel dividir por 0");
		}else {
			float dividir  = num1 / num2;
			System.out.println("Resultado: "+ dividir);
		}
	}
}