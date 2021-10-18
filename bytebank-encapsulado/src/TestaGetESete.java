
public class TestaGetESete {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente yang = new Cliente();
		yang.setNome("yang silva");
		
		conta.setTitular(yang);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		// os três sysouts retornam a mesma coisa, pois *titularDaConta*,
//		*yang* e *conta.getTitular* sao a mesma pessoa, 
//		até porque até então só se tem um único cliente no bytebank
		System.out.println(titularDaConta);
		System.out.println(yang);
		System.out.println(conta.getTitular());
		

	}

}
