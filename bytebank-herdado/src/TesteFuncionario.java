// nao pode intanciar dessa classe, pq é abstrata

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		// cliente.setSalario(3000);
		
		Gerente nico = new Gerente();
		nico.setNome("nico steppat");
		nico.setCpf("000000000");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
