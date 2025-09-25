package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.List;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository{

	private List<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	
	@Override
	public void listarContas() {  // Todas da minha coleção listaContas
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta); // Pega o objeto e guarda na coleção
		System.out.println("Conta cadastrada com sucesso");
		
		
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void procurarPorNumero(int numeroConta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numeroConta) {
		// TODO Auto-generated method stub
		
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
	
	
}
