package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		
		Conta c1 = new Conta(1, 123, 1, "Elisa Maria", 10000.0f);
		c1.visualizar();
		c1.setSaldo(15000.0f);
		c1.setTitular("Minatozaki Sana");
		c1.visualizar();
		
		c1.sacar(12000.0f);
		c1.visualizar();
		
		c1.sacar(120000.0f);
		c1.visualizar();
		
		c1.depositar(5000.0f);
		c1.visualizar();
		
		Conta c3 = new Conta(); // Depois poderia preencher outros parâmetros com c3.();
		c3.setAgencia(123);
		
		// Instanciar objetos da Classe ContaCorrente
		
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Bianca Silva", 1000000.00f, 100000.00f);
		
		cc1.visualizar();
		
		System.out.println(cc1.sacar(2000000.00f));
		cc1.visualizar();
		
		// Instanciar objetos da Classe ContaPoupanca
		ContaPoupanca conta1 = new ContaPoupanca(5, 123, 1, "Sebastião Aparecido", 1000000.0f, 20);
		conta1.visualizar();
		
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
			opcao = input.nextInt();
			
			switch(opcao) {
			case 0:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Programa finalizado!");
				break;
			case 1:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Criar conta\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Listar contas existentes\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Consultar conta\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Atualizar dados da conta\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Apagar conta especificada\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Saque\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Depositar na conta\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Transferir entre contas\n");
				break;
			default: 
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "Opção inválida!");
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
}
