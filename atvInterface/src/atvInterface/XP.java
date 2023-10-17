package atvInterface;

public class XP {
	
	public void reboot() {
		System.out.println("Sistema reiniciando!");
	}
	
	public void shutdown() {
		System.out.println("Sistema desligando!");
	}
	
	public void crash() {
		System.out.println("ERRO!!! -TELA AZUL");
	}
	
	public boolean haIntrusos() {
		return false;	
	}
}
