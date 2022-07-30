package cl.fsj.infoclub.modelo;

public class Utilidad {

	public void espera () throws InterruptedException {
		System.out.println("Usted esta saliendo del sistema...");
		Thread.sleep(2000);
		System.out.println("Acaba de salir del sistema.");
	}
	
	public void limpiar() throws InterruptedException {
       Thread.sleep(2000);
       System.out.println(System.lineSeparator().repeat(100));
	}
}
