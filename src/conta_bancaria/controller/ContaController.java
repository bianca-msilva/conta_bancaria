package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.List;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository{

	private List<Conta> listaContas = new ArrayList<Conta>();
	static int numero = 0;
	
	@Override
	public void listarContas() {  // Todas da minha coleção listaContas
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta); // Pega o objeto e guarda na coleção
		System.out.println("\n🎉 Conta cadastrada com sucesso!");
		
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if(buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.printf("\nA Conta número: %d foi atualizada com sucesso%n", conta.getNumero());
		}else {
			System.out.printf("\nA Conta número: %d não foi encontrada%n", conta.getNumero());
		}
		
	}

	@Override
	public void procurarPorNumero(int numeroConta) {
		var conta = buscarNaCollection(numeroConta);
		
		if(conta != null) {
			conta.visualizar();
		}else {
			System.out.printf("\nA Conta número: %d não foi encontrada%n", numeroConta);
		}
		
	}

	@Override
	public void deletar(int numeroConta) {
		var conta = buscarNaCollection(numeroConta);
		
		if(conta != null) {
			if(listaContas.remove(conta) == true) {
				System.out.printf("\nA Conta número: %d foi deletada com sucesso!%n", numeroConta);
			}
		}else {
			System.out.printf("\nA Conta número: %d não foi encontrada%n", numeroConta);
		}
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	// Para implementar os métodos da Interface criada
	
	
	// Automatização da criação do número da conta (int numero)
	// Métodos auxiliares
	
	public static int gerarNum() {
		return ++numero; // Primeiro incrementar e depois devolver esse valor
		
	}
	
	public Conta buscarNaCollection(int numero) {
		for(var conta : listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
	
	
}
