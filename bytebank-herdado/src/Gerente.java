
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticašaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticašaoUtil();
		
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
