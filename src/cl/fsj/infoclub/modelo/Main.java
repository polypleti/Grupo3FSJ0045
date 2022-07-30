package cl.fsj.infoclub.modelo;

public class Main {

	public static void main(String[] args) {

		ProductoServicio productoServicio = new ProductoServicio();
		Menu menu = new Menu();
		int opcion;
		
		do {
			opcion = menu.mostrarMenu();
			menu.ejecutarOpcion(opcion, productoServicio);
		}while(opcion!=4);
	}

}
