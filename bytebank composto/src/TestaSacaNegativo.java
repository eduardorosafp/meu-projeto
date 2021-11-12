
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta51 = new Conta();
		conta51.deposita(100);
		System.out.println(conta51.saca(200));
		
		System.out.println(conta51.getSaldo());
		
		
		
	}
}
