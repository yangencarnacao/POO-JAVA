
public class TestaGetESete {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 23456);
		
//		conta.setNumero(1337);
		// nao precisa mais do conta.setNumero(1337), 
//		porque o numero da conta j� foi setado 
		
		System.out.println(conta.getNumero());
		
		Cliente yang = new Cliente();
		yang.setNome("yang silva");
		
		conta.setTitular(yang);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		// os tr�s sysouts retornam a mesma coisa, pois *titularDaConta*,
//		*yang* e *conta.getTitular* sao a mesma pessoa, 
//		at� porque at� ent�o s� se tem um �nico cliente no bytebank
		System.out.println(titularDaConta);
		System.out.println(yang);
		System.out.println(conta.getTitular());
		

	}

}
