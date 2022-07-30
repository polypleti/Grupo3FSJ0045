package cl.fsj.infoclub.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ArchivoServicio {
	
	public ArchivoServicio() {
		super();
	}
	
	public void cargarDatos(ArrayList <Producto> listaProductos) {
		Producto productoNuevo;
		try {
			File archivo = new File("src/ProductosImportados.csv");
			if (archivo.exists()) {
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				String data = br.readLine();	
				while (data != null) {
					String[] variables = data.split("\\,");
					productoNuevo = new Producto(variables[0],variables[1],variables[2],variables[3],variables[4],variables[5],variables[6]);
					listaProductos.add(productoNuevo);
					productoNuevo = null;
					data = br.readLine();
				}
				System.out.println("Productos agregados exitosamente.");

				br.close(); 
			} else {
				System.out.println("El fichero ingresado no existe");
			}

		} catch (Exception e) {
			System.out.println("Excepcion leyendo fichero : " + e);
		}
	}
}
