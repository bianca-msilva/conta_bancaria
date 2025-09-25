package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	// Tudo da classe Main deve ser 'static'
	private static final Scanner input = new Scanner(System.in);  // Deixá-lo global, para funcionar em qualquer método da classe menu
	private static final ContaController contaController = new ContaController();  // Para ter acesso à todos os métodos, sem exceção, da classe ContaCrontroller
	
	
	public static void main(String[] args) {
		
		int opcao;
		
		criarContasTeste(); // Primeira coia a ser feita ao subir a aplicação, as contas criadas lá no final do código
		
		
//		// Instanciar objetos da Classe ContaCorrente
//		
//		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Bianca Silva", 1000000.00f, 100000.00f);
//		
//		cc1.visualizar();
//		
//		System.out.println(cc1.sacar(2000000.00f));
//		cc1.visualizar();
//		
//		// Instanciar objetos da Classe ContaPoupanca
//		ContaPoupanca conta1 = new ContaPoupanca(5, 123, 2, "Sebastião Aparecido", 1000000.0f, 20); // o número do tipo de conta tem que ser alterado 1 ou 2
//		conta1.visualizar();
		
		// Polimorfismo - sobreescrever um método ('visualizar' nesse caso)
		
		
		
		do {
			System.out.println(Cores.TEXT_CYAN_BOLD + "**********************************************");
			System.out.print("\n");
			System.out.println("             BANCO DO BRAZIL COM Z            ");
			System.out.println("\n");
			System.out.print("**********************************************" + Cores.TEXT_RESET);
			System.out.print("\n");
			System.out.println(Cores.TEXT_CYAN + "1 - Criar conta");
			System.out.println("2 - Listar todas as contas");
			System.out.println("3 - Buscar conta por número");
			System.out.println("4 - Atualizar dados da conta");
			System.out.println("5 - Apagar conta");
			System.out.println("6 - Sacar");
			System.out.println("7 - Depositar");
			System.out.println("8 - Transferir valores entre contas");
			System.out.println("0 - Sair");
			System.out.println("**********************************************");
			System.out.println("Escolha a opção desejada: " + Cores.TEXT_RESET);
			
			try {
				opcao = input.nextInt();
				input.nextLine();
			}catch(InputMismatchException e) {
				opcao = -1; // Pois ele desconsidera outras opções e ele fixará como esse valor para ser executado
				System.out.println("\nDigite um número inteiro entre 0 e 8");
				input.nextLine();
			}
			
			switch(opcao) {
			case 0:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Programa finalizado!");
				break;
			case 1:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Criar conta\n");
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Listar contas existentes\n");
				
				listarContas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Consultar conta\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Atualizar dados da conta\n");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Apagar conta especificada\n");
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Saque\n");
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Depositar na conta\n");
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Transferir entre contas\n");
				keyPress();
				break;
			default: 
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Opção inválida!");
				keyPress();
				break;
			}
			
			
		}while(opcao != 0);
	
		sobre();
		input.close();
	}
	
	public static void sobre() {
		System.out.println(Cores.TEXT_CYAN_BOLD+ "\n______________________________________");
		System.out.println("\n");
		System.out.println("Sistema desenvolvido por: Bianca Maria\n"
				+ "Contatos:\n"
				+ "GitHub: https://github.com/bianca-msilva\n"
				+ "E-mail: BiancaSi@genstudents.org");
		System.out.println("\n");
		System.out.println("______________________________________" + Cores.TEXT_RESET);
	}
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET +"\nPressione Enter para continuar...");
		input.nextLine();
		
	}
	
	private static void criarContasTeste() {
		contaController.cadastrar(new ContaCorrente(1, 456, 1, "Bianca Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(5, 123, 2, "Sebastião Aparecido", 1000000.0f, 20));
	}
	
	private static void listarContas() {
		contaController.listarContas();
		
	}
}
