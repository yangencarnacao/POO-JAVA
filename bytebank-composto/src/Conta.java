class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;	
	
	void deposita(double valor) {
		this.saldo += valor;
//		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor)	{
			this.saldo -= valor;
//			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
			
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
//		o m�todo getSaldo tem a funcao de pegaSaldo
//		nem sempre � necess�rio criar um m�todo setSaldo
//		nesse caso nao precisa criar um setter para esta regra de neg�cios
//		porque os m�todos criados *transfere*, *saca* e *deposita* j� fazem 
//		o papel de trabalhar com o atributo saldo


		
	}
	
	
	
}



// m�todo: descreve a maneira de fazer algo