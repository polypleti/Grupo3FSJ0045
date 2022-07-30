package cl.fsj.infoclub.modelo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

		ProductoServicio productoServicio = new ProductoServicio();
		Menu menu = new Menu();
		int opcion;
		
		do {
			opcion = menu.mostrarMenu();
			menu.ejecutarOpcion(opcion, productoServicio);
		}while(opcion!=4);
	}

}
