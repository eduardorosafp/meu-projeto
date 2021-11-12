
public class Administrador extends Funcionario implements Autenticavel {

	private Autentica�aoUtil autenticador;

	public Administrador() {
		this.autenticador = new Autentica�aoUtil();
		
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
	return this.autenticador.autentica(senha);

	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
}
