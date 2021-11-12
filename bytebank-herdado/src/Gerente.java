
public class Gerente extends Funcionario implements Autenticavel {

	private Autentica�aoUtil autenticador;

	public Gerente() {
		this.autenticador = new Autentica�aoUtil();
		
	}
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do gerente");
		return super.getSalario();

	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
	return this.autenticador.autentica(senha);

	}
}
