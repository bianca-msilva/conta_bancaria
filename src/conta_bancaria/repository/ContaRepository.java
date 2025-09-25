package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {
	
	// Métodos do CRUD, opções do menu
	public void listarContas();
	public void cadastrar(Conta conta); // Para ter os tipos de contas existentes
	public void atualizar(Conta conta);
	public void procurarPorNumero(int numeroConta);
	public void deletar(int numeroConta);
	
	// Métodos do Banco
	// Pelo núemro da conta já saberá o limite e saldo da mesma
	public void depositar(int numero, float valor);
	public void sacar(int numero, float valor); // número para saber qual a conta pelo seu número
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
