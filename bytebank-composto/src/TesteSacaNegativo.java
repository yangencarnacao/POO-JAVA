
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));		
		
//		//proibido acessar atributo saldo,
//		foi transformado saldo em private e criado
////		o método pegaSaldo para acessar o saldo
//		conta.saldo = conta.saldo;
//		System.out.println(conta.saldo);
		
		conta.saca(101);
		System.out.println(conta.getSaldo());
//		o método getSaldo tem a funcao de pegaSaldo

	}

}
