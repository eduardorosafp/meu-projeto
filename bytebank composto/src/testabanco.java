
public class testabanco {
   
	public static void main(String[] args) {
	Cliente eduardo = new Cliente();
	eduardo.nome = "eduardo rosa";
	eduardo.cpf = "04474212045";
	eduardo.profissao = "programador";
	
	Conta contaDoEduardo = new Conta();
	contaDoEduardo.deposita(100);
	
	
	contaDoEduardo.titular = eduardo;
	System.out.println(contaDoEduardo.titular.nome);
	
	
	
	
	
	
}
	
}
