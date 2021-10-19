
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 23456);
		
		// conta está inconsistente porque já começa com valor 0
//		por padrão em Conta conta = new Conta();
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());		
		
		Conta conta1 = new Conta(1002, 11111);
		Conta conta2 = new Conta(3333, 02222);
		
		System.out.println(Conta.getTotal());
	}

}
