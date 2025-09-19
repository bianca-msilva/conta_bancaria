package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao;
		
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
