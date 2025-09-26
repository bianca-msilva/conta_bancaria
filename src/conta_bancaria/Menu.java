package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
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
			
			if(opcao == 0) {
				System.out.println("\nBanco do Brazil com Z agradece sua preferência!");
				sobre();
				input.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Criar conta\n");
				cadastrarConta();
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Listar contas existentes\n");
				
				listarContas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Consultar conta\n");
				procurarContaPorNum();
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Atualizar dados da conta\n");
				atualizarConta();
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Apagar conta especificada\n");
				deletarConta();
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
		contaController.cadastrar(new ContaCorrente(ContaController.gerarNum(), 456, 1, "Bianca Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(ContaController.gerarNum(), 123, 2, "Sebastião Aparecido", 1000000.0f, 20));
	}
	
	private static void listarContas() {
		contaController.listarContas();
		
	}
	
	public static void cadastrarConta() {
		System.out.print("Digite o número da Agência: ");
		int agencia = input.nextInt();
		
		System.out.print("Digite o nome do Titular: ");
		input.skip("\\R");
		String titular = input.nextLine();
		
		System.out.print("Digite o tipo da Conta <1 - CC | 2 - CP>: ");
		int tipo = input.nextInt();
		
		System.out.print("Digite o saldo inicial: ");
		float saldo = input.nextFloat();
		
		switch(tipo) {
			case 1 -> {
				System.out.print("Digite o limite inicial da conta: ");
				float limite = input.nextFloat();
				input.nextLine();
				contaController.cadastrar(new ContaCorrente(ContaController.gerarNum(), agencia, tipo, titular, saldo, limite));
			}
			case 2 -> { 
				System.out.print("Digite o dia do aniversário da conta: ");
				int aniversario = input.nextInt();
				input.nextLine();
				contaController.cadastrar(new ContaPoupanca(ContaController.gerarNum(), agencia, tipo, titular, saldo, aniversario));
			}
			default -> System.out.print(Cores.TEXT_RED + "Opção inválida!" + Cores.TEXT_RESET);
		}
	
	}
		private static void procurarContaPorNum() {
			System.out.print("Digite o número da conta: ");
			int numero = input.nextInt();
			input.nextLine();
			
			contaController.procurarPorNumero(numero);
				
	}
		private static void deletarConta() {
			System.out.print("Digite o número da conta: ");
			int numero = input.nextInt();
			input.nextLine();
			
			Conta conta = contaController.buscarNaCollection(numero);
			
			if(conta != null) {
			
			System.out.print("\nTem certeza que deseja excluir esta conta? (S/N): ");
			String confirmacao = input.nextLine();
			
			if (confirmacao.equalsIgnoreCase("S")) {
				contaController.deletar(numero);
			}else {
				System.out.print("\nOperação cancelada!");
			}
			}else {
				System.out.printf("\nA conta número %d não foi encontrada!", numero);
			}
	}
		private static void atualizarConta() {
			System.out.print("Digite o número da conta: ");
			int numero = input.nextInt();
			input.nextLine();
			
			Conta conta = contaController.buscarNaCollection(numero);
			
			if(conta != null) {
				
				int agencia = conta.getAgencia();
				String titular = conta.getTitular();
				int tipo = conta.getTipo();
				float saldo = conta.getSaldo();
				
				System.out.printf("A Agência atual: %d\nNova Agência (Pressione ENTER para manter o valor atual): ", agencia);
				String entrada = input.nextLine();
				agencia = entrada.isEmpty() ? agencia : Integer.parseInt(entrada);
				
				System.out.printf("O nome do Titular atual: %s\nNovo Titular (Pressione ENTER para manter o valor atual): ", titular);
				entrada = input.nextLine();
				titular = entrada.isEmpty() ? titular : entrada;
							
				System.out.printf("O Saldo atual: %.2f\nNovo Saldo (Pressione ENTER para manter o valor atual): ", saldo);
				entrada = input.nextLine();
				saldo = entrada.isEmpty() ? saldo : Float.parseFloat(entrada);
				
				switch(tipo) {
				case 1 ->{
					float limite = ((ContaCorrente) conta).getLimite();
					
					System.out.printf("O Limite atual é: %.2f\nNovo Limite (Pressione ENTER para manter o valor atual): ", limite);
					entrada = input.nextLine();
					limite = entrada.isEmpty() ? limite : Float.parseFloat(entrada);
					contaController.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					
					int aniversario = ((ContaPoupanca) conta).getAniversario();
					
					System.out.printf("O Aniversário atual é: %d\nNovo Aniversário (Pressione ENTER para manter o valor atual): ", aniversario);
					entrada = input.nextLine();
					aniversario = entrada.isEmpty() ? aniversario : Integer.parseInt(entrada);
					contaController.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
				}
				default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválido!" + Cores.TEXT_RESET);
				}
				
			}else {
				System.out.printf("\nA conta número %d não foi encontrada!", numero);
			}
		}
}
