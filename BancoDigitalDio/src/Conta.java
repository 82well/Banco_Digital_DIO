
public abstract class Conta implements iConta{

	protected static final int AGENCIA_PADRAO = 0;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, Conta contaDestio) {
		// TODO Auto-generated method stub
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	
}
