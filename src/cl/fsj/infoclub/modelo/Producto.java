package cl.fsj.infoclub.modelo;

public class Producto {
	private String articulo, precio, descripcion, codigo, talla, marca, color;
	
	public Producto() {
		super();
	}

	public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
		super();
		this.articulo = articulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
		this.color = color;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void editarProducto(String nombre,String precio,String descripcion,String codigo,String talla,String marca, String color) {
		setArticulo(nombre);
		setPrecio(precio);
		setDescripcion(descripcion);
		setCodigo(codigo);
		setTalla(talla);
		setMarca(marca);
		setColor(color);
	}
	
	
	public String toString() {
		return "\nNombre de Producto: " + articulo + "\nPrecio: " + precio + "\nDescripcion: " + descripcion + "\nCodigo: "
				+ codigo + "\nTalla: " + talla + "\nMarca: " + marca + "\nColor: " + color +"\n";
	}
	
	public String toStringEnumerado() {

		return "\n1) Nombre de Producto: " + articulo + "\n2) Precio: " + precio + "\n3) Descripcion: " + descripcion + "\n4) Codigo: "
				+ codigo + "\n5) Talla: " + talla + "\n6) Marca: " + marca + "\n7) Color: " + color +"\n";
	}
}
