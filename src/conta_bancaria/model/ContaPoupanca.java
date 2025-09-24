package conta_bancaria.model;

public class ContaPoupanca extends Conta{

	private int aniversario;	

	// Criar construtor dessa nova Classe
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);  // Pegar todos atributos do construtor da superclasse para esta Classe
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário conta: " + this.aniversario);
	}
	
}
