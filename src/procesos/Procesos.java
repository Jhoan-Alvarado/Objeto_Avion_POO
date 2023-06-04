package procesos;
import clases.Avion;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

	
	HashMap<String,Avion> mapAviones;
	Avion avion;

	String marca,
	modelo,
	velocidadMaxima,
	altitudMaxima,
	id,
	tipoCombustible;
	
	int capacidadPasajeros, opt;
	
	public Procesos() {
		mapAviones = new HashMap<>();
		
		
	}
	
	public void iniciar() {
		do {
			
			
			opcion();
			
			switch (opt) {
			case 1: 
				
				ingresarAvion();
			break;
			case 2 : 
				if (!mapAviones.isEmpty()) {
					imprimirAviones();
				}
				else {
					JOptionPane.showMessageDialog(null, "NO HAY AVIONES REGISTRADOS");
				}
				
			break;
			
			case 3 :
				if (!mapAviones.isEmpty()) {
					imprimirAvion();
				}
				else {
					JOptionPane.showMessageDialog(null, "NO HAY AVION REGISTRADO");
				}
				
				break;
			case 4:
				
				JOptionPane.showMessageDialog(null, "ABRACE PARCERO");
			break;
			
			default: JOptionPane.showMessageDialog(null, "QUE ESTA HACIENDO BRUTO");
			 	
			break;
			
				
			}
			} while (opt != 4);
		
		
		
	}
	
	
	public void opcion() {
		String menu = "  ---------MENU-------\n";
				menu+="1.Ingresar Avion \n";
				menu+= "2. Consultar Todos Los Aviones \n";
				menu += "3. Consultar Avion Por Individual \n";
				menu += "4. !SALIR! \n";
				
		opt = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	}
	public void ingresarAvion() {
		String preg= ""; 
		do {
			id=pedirString("Ingrese El id del Avion");
			marca = pedirString("Ingrese la marca del Avion");
			modelo= pedirString("Ingrese el modelo del Avion");
			capacidadPasajeros=pedirInt("Ingrese la capacidad de pasajeros");
			velocidadMaxima = pedirString("Ingrese La velocidad maxima del Avion");
			tipoCombustible = pedirString("Ingrese el tipo de combustibsjke del avion");
			altitudMaxima = pedirString("Ingrese la altitud maxima del Acion");
			
			avion = new Avion(id, marca, modelo, capacidadPasajeros, velocidadMaxima,tipoCombustible,altitudMaxima);
			mapAviones.put(id, avion);
			preg=JOptionPane.showInputDialog("Desea Ingressar otro avion ?");
		} while (preg.equalsIgnoreCase("si"));
		
		System.out.println(avion);
	
		
	}
	private int pedirInt(String mensaje) {
	 int value  = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return value;
	}
	private String pedirString(String string) {
		String valor = JOptionPane.showInputDialog(string);
		return valor;
	}
	
	
	public void imprimirAviones() {
		
		String message = "";
		for (String id : mapAviones.keySet()) {
			
			message = "------AVION----- \n";
			avion = mapAviones.get(id);
			message += "ID AVION : " + avion.getId() + "\n";
			message += "MARCA AVION : " + avion.getMarca() + "\n";
			message += "MODELO AVION : " + avion.getModelo() + "\n";
			message += "CAPACIDAD PASAJEROS : " +avion.getCapacidadPasajeros() + "\n";
			message += "VELOCIDAD MAXIMA : " + avion.getVelocidadMaxima() + "KM/H \n";
			message += "TIPO DE COMBUSTIBLE : " + avion.getTipoCombustible() + "\n";
			message += "ALTITUD MAXIMA : " + avion.getAltitudMaxima() + "PIES \n";
			System.out.println(message);
					
		}
	}
	
	public void imprimirAvion() {
		
		
		String idB= JOptionPane.showInputDialog("Ingrese ID para buscar el avion");
		String message="";
		if (mapAviones.containsKey(idB)) {
			message+="-----INFORMACION AVION----- \n";
			avion = mapAviones.get(idB);
			message += "ID AVION : " + avion.getId() + "\n";
			message += "MARCA AVION : " + avion.getMarca() + "\n";
			message += "MODELO AVION : " + avion.getModelo() + "\n";
			message += "CAPACIDAD PASAJEROS : " +avion.getCapacidadPasajeros() + "\n";
			message += "VELOCIDAD MAXIMA : " + avion.getVelocidadMaxima() + "KM/H \n";
			message += "TIPO DE COMBUSTIBLE : " + avion.getTipoCombustible() + "\n";
			message += "ALTITUD MAXIMA : " + avion.getAltitudMaxima() + " PIES \n";
					
			JOptionPane.showMessageDialog(null, message);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "NO HAY AVIONES REGISTRADO CON EL ID INGRESADO");
		}
	}
	
}
