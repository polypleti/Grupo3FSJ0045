package cl.fsj.infoclub.modelo;

import java.util.ArrayList;

import cl.fsj.infoclub.Producto;

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
	
}
