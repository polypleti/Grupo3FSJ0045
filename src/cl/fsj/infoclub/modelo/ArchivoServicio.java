package cl.fsj.infoclub.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ArchivoServicio {
	
	public void cargarDatos() {
		try {
			File archivo = new File("src/ProductosImportados.csv");
			if (archivo.exists()) {
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				String data = br.readLine();
							
				while (data != null) {
					String[] variables = data.split("\\,");
					System.out.println(variables[3]);
					System.out.println(data);  	 
					data = br.readLine();
				}
				

				br.close(); 
			} else {
				System.out.println("El fichero ingresado no existe");
			}

		} catch (Exception e) {
			System.out.println("Excepcion leyendo fichero : " + e);
		}
	}
}
