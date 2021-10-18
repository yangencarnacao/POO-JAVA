class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;	
	
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
//		o método getSaldo tem a funcao de pegaSaldo
//		nem sempre é necessário criar um método setSaldo
//		nesse caso nao precisa criar um setter para esta regra de negócios
//		porque os métodos criados *transfere*, *saca* e *deposita* já fazem 
//		o papel de trabalhar com o atributo saldo
		
	}
	
	public int getNumero() {
		return this.numero;
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
	
}



// método: descreve a maneira de fazer algo