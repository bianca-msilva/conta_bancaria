package conta_bancaria.model;

public class ContaCorrente extends Conta {
	// Vai ser herança da classe conta
	
	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		// Acrescenta o atributo específico da ContaCorrente
		this.limite = limite;    //que é o constructor
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	
	@Override //Anotação que o método está sendo sobreescrito
	public void visualizar() {
		super.visualizar();  // trazer tudo do método 'visualizar' aqui
		System.out.printf("Limite da conta: %.2f%n", this.limite);
	}
	
}
