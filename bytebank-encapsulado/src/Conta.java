class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	// static é um atributo da classe
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
		// construtor public Conta() cria uma rotina de inicialização 
	}
	
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
		if(numero <= 0) {
			System.out.println("nao pode valor <= 0");
			return;
			
		}
		this.numero = numero;
		
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
		System.out.println("nao pode valor menor ou igual a 0");
		return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	public static int getTotal() {
		return Conta.total;
	}
}



// método: descreve a maneira de fazer algo