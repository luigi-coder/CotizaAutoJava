package cotizacion;
import javax.swing.*;
public class CotizaAuto {

	public static void main(String[] args) {
		
		Autos auto = new Autos();
		
		JOptionPane.showMessageDialog(null, 
				"Hola, Bienvenido a Grupo Automotriz Staluppi"
				+ ", porfavor te invitamos a cotizar tu 0km.");
		
		auto.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Año del auto: ")));
		auto.setMarca(JOptionPane.showInputDialog("Marca del auto" + "\n" +
				". Mercedez Benz" + "\n" +
				". BMW" + "\n" +
				". Honda" + "\n" +
				". Chevrolet" + "\n" +
				". Volkswagen"));
		auto.setColor(JOptionPane.showInputDialog("Color del Auto: "));
		auto.setAsientos_cuero(JOptionPane.showInputDialog("Asientos de cuero Si/No: "));
		auto.setClimatizador(JOptionPane.showInputDialog("Climatizador Si/No: "));
		
		JOptionPane.showMessageDialog(null, 
				
				"Año del auto: " + auto.getAnio() + "\n" +
				"Marca del auto: " + auto.getMarca() + "\n" +
				"Color del auto: " + auto.getColor() + "\n" +
				"Asientos de cuero: " + auto.getAsientos_cuero() + "\n" +
				"Climatizador: " + auto.getClimatizador() + "\n" +
				"PRECIO FINAL DE AUTO: " + auto.precioFinal() + "$"
				);
	}
}
