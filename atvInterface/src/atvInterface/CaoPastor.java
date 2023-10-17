package atvInterface;

public abstract class CaoPastor implements CaoDeGuarda {
	
	public int nPatas() {
		int N_PATAS = 4;
		return N_PATAS;
	}
	
	
	@SuppressWarnings("unused")
	private void fecharBoca() {
		System.out.println("Boca Fechada");
	}
	@SuppressWarnings("unused")
	private boolean háPredadores() {
		boolean háPredadores = false;
		return háPredadores;	
	}
	
	
	public void morder() {
		System.out.println("INHAC! -Morde");
	}
	
	public abstract void ladrar();
	
	public boolean haIntrusos() {
		return false;
	}
	
	public void soarAlarme() {
		ladrar();
	}
}
