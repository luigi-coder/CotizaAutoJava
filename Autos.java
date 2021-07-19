package cotizacion;

public class Autos {
	
	private int anio;
	private String marca;
	private String color;
	private boolean asientos_cuero;
	private boolean climatizador;
	private int precio_total;
	
	public Autos() {
		
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
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
	public String getAsientos_cuero() {
		
		if(this.asientos_cuero == true) {
			return "Si";
		}else {
			return "No";
		}
	}
	public void setAsientos_cuero(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("Si")) {
			this.asientos_cuero = true;
		}else {
			this.asientos_cuero = false;
		}
	}
	public String getClimatizador() {
		if(this.climatizador = true) {
			return "Si";
		}else {
			return "No";
		}
	}
	public void setClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("Si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	public int precioFinal() {
		
		precio_total = 600000;
		double porcentaje;
		
		if(anio > 2000) {
			porcentaje = precio_total * 0.20;
			precio_total += porcentaje;
		}
		if(marca.equalsIgnoreCase("Mercedez Benz")) {
			precio_total += 300000;
		}
		if(marca.equalsIgnoreCase("BMW")) {
			precio_total += 280000;
		}
		if(marca.equalsIgnoreCase("Honda")) {
			precio_total += 200000;
		}
		if(marca.equalsIgnoreCase("Chevrolet")) {
			precio_total += 185000;
		}
		if(marca.equalsIgnoreCase("Volkswagen")) {
			precio_total += 18000;
		}
		if(asientos_cuero == true) {
			precio_total += 80000;
		}
		if(climatizador == true) {
			precio_total += 40000;
		}
		
		return precio_total;
	}

}





