package bytebank1;

public class TestedeReferencias {
	public static void main(String[] args) {
		// referencia 
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;	
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma conta");
			
			
				
			}
		}
		
		
		
	}


