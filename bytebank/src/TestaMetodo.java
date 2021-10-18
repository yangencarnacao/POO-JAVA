
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoYang = new Conta();
		contaDoYang.saldo = 100;
		contaDoYang.deposita(50);
		System.out.println(contaDoYang.saldo);
		
		boolean conseguiuSacar = contaDoYang.saca(20);
		System.out.println(contaDoYang.saldo);
		System.out.println(conseguiuSacar);
		
		Conta ContaDaMarcela = new Conta();
		ContaDaMarcela.deposita(1000);
		boolean sucessoTransferencia  = ContaDaMarcela.transfere(3000, contaDoYang);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência bem-sucedida");
		} else {
			System.out.println(
					"Sem dinheiro o suficiente para realizar a transferência");
		}
		System.out.println(ContaDaMarcela.saldo);
		System.out.println(contaDoYang.saldo);
		
		contaDoYang.titular = "yang silva";
		System.out.println(contaDoYang.titular);
		
		
	}

}
