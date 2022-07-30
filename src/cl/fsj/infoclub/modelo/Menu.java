package cl.fsj.infoclub.modelo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Menu {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public int mostrarMenu() throws NumberFormatException, IOException {
		int op;
		

		do {

			System.out.println("\nMenu\n");
			System.out.println("1. Listar Producto ");
			System.out.println("2. Editar Datos ");
			System.out.println("3. Importar Datos ");
			System.out.println("4. Salir\n");
			System.out.println("Ingresar una Opcion: ");

			op = Integer.parseInt(bufferedReader.readLine());

			if (op > 4 || op < 1)
				System.out.println("Ingrese una opcion valida.");

		} while (op > 4 || op < 1);
		
		return op;

	}

	public void ejecutarOpcion(int op, ProductoServicio ps) throws InterruptedException, IOException {
	

		if (op == 1) {

			ps.listarProductos();

		} else if (op == 2) {
			System.out.println("Ingrese el codigo del producto a editar: ");
			String codigo = bufferedReader.readLine();
			ps.editarProducto(codigo);
		} else if (op == 3) {
			ArchivoServicio archServ = new ArchivoServicio();
			archServ.cargarDatos(ps.getListaProductos());
		} else if (op == 4) {
			Utilidad ut = new Utilidad();
			ut.espera();
			ut.limpiar();
		}

	}
	
}

