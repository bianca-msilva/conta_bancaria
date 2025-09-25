package conta_bancaria.model;

public abstract class Conta {

	     /*Atributos da Classe Conta*/
		private int numero;
		private int agencia;
		private int tipo;
		private String titular;
		private float saldo;
	  
	    /*Método Construtor da Classe Conta - com todos os parâmetros*/
		public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
			this.numero = numero;
			this.agencia = agencia;
			this.tipo = tipo;
			this.titular = titular;
			this.saldo = saldo;
		}
		
		// Sobrecarga de método - mesmo nome, com funcionalidades diferentes
		public Conta() {}  // Objeto vazio, construtor vazio, mesmo nome de outro e com atributos diferentes
		
		// Métodos get e set
		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		public boolean sacar(float valor) {
			if (this.saldo < valor) {
				System.out.println("Saldo insuficiente!");
				return false;
			}
			
			this.saldo = this.saldo - valor;
			return true;
		}
		
		public void depositar(float valor) {
			this.saldo = this.saldo + valor;
			
		}
	    
		public void visualizar() {
			String tipo = "";
			switch(this.tipo) {
			case 1:
				tipo = "Conta Corrente";
				break;
			case 2:
				tipo = "Conta Poupança";
				break;
			}
			
			System.out.println("\n********************************************");
			System.out.println("Dados da conta: ");
			System.out.println("Número da conta: " + this.numero);
			System.out.println("Agência: " + this.agencia);
			System.out.println("Tipo da conta: " + tipo);
			System.out.println("Titular: " + this.titular);
			System.out.println("Saldo: " + this.saldo);
			
		}
	}	

