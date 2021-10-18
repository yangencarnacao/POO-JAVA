
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente yang = new Cliente();
		yang.nome = "Yang Silva";
		yang.cpf = "111.111.111-11";
		yang.profissao = "Programador";

		Conta contaDoYang = new Conta();
		contaDoYang.deposita(100);
		
//		associa o cliente yang a conta contaDoYang 
		contaDoYang.titular = yang;
		System.out.println(contaDoYang.titular.nome);
		System.out.println(contaDoYang.titular.cpf);
		System.out.println(contaDoYang.titular.profissao);
	}

}
