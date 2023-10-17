package atvInterface;

public class XP2018 extends XP implements Robot{

	@Override
	public void soarAlarme() {
		System.out.println("UEON! UEON! UEON! UEON! ALARME ATIVO!");
		
	}

	@Override
	public void avisarIntrusos() {
		System.out.println("ATENÇÃO INTRUSOS, SE RENDAM OU SERAM DESTRUÍDOS!!!");
		
	}

	@Override
	public void destruirIntrusos() {
		System.out.println("PIU! PIU! PIU! -ARMA LASER");
		
	}

	@Override
	public boolean haIntrusos() {
		return false;	
	}
}
