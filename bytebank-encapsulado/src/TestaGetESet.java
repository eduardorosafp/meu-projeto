
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());

		Cliente eduardo = new Cliente();
		// conta.titular = eduardo;
        eduardo.setNome("eduardo rosa");
        
		conta.setTitular(eduardo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		// agora em duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programdor");
		
		System.out.println(titularDaConta);
		System.out.println(eduardo);
		System.out.println(conta.getTitular());
		
		
		

	}
}
