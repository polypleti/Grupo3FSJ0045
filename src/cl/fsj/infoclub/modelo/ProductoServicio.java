package cl.fsj.infoclub.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProductoServicio {
	
	private ArrayList <Producto> listaProductos = new ArrayList <>();

	public ProductoServicio() {
		super();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void listarProductos () {
		
		for(Producto productito:listaProductos) {
			
		
			System.out.println("Datos de producto");
			System.out.println("------------------------------------------");
			System.out.println(productito.toString());
			System.out.println("------------------------------------------");
		}
	}
	
	public void editarProducto(String codigo) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		for(Producto producto: listaProductos) {
			if(producto.getCodigo().equalsIgnoreCase(codigo) ) {
				System.out.println("\nSe ha encontrado el producto.\nEsta es la informacion del producto." + producto.toStringEnumerado() );
				System.out.println("\nSeleccione la opcion a editar.");
			
				String opcion = new String(bufferedReader.readLine());
				switch(opcion){
					case "1":
						System.out.println("Ingrese el nuevo nombre: ");
						producto.setArticulo(bufferedReader.readLine());
						break;
					case "2":
						System.out.println("Ingrese el nuevo precio: ");
						producto.setPrecio(bufferedReader.readLine());
						break;
					case "3":
						System.out.println("Ingrese el nuevo descripcion: ");
						producto.setDescripcion(bufferedReader.readLine());
						break;
					case "4":
						System.out.println("Ingrese el nuevo codigo: ");
						producto.setCodigo(bufferedReader.readLine());
						break;
					case "5":
						System.out.println("Ingrese el nuevo talla: ");
						producto.setTalla(bufferedReader.readLine());
						break;
					case "6":
						System.out.println("Ingrese el nuevo marca: ");
						producto.setMarca(bufferedReader.readLine());
						break;
					case "7":
						System.out.println("Ingrese el nuevo color: ");
						producto.setColor(bufferedReader.readLine());
						break;
				}
				System.out.println("La nueva version del producto es: "+ producto.toString());
			}
			else System.out.println("No se ha encontrado el producto.\n");
		}
	}
	
}
