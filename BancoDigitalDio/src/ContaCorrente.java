
public class ContaCorrente extends Conta {

	private static int SEQUENCIAL =1;

	public ContaCorrente() {
		super.agencia = 1;
		super.numero = SEQUENCIAL++;
	}
	
}
