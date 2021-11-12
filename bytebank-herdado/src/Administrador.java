
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticašaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticašaoUtil();
		
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
