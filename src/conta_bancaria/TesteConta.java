package conta_bancaria;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria novaConta = new ContaBancaria();
		novaConta.setNumero(32);
		
		System.out.println("Número da conta: " + novaConta.getNumero());

	}

}
