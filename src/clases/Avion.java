package clases;
import java.util.Random;
public class Avion {

	
private	String marca,
		modelo,
		velocidadMaxima,
		altitudMaxima,
		id,
		tipoCombustible;
private	boolean estadoMotor = false;

private int altitud,capacidadPasajeros;
		

public Avion() {
	
}

public Avion(String id,String marca, String modelo, int capacidadPasajeros, String velocidadMaxima, String tipoCombstible,String altitudMaxima) {
	
		this.marca=marca;
		this.modelo=modelo;
		this.capacidadPasajeros=capacidadPasajeros;
		this.velocidadMaxima=velocidadMaxima;
		this.tipoCombustible=tipoCombstible;
		this.altitudMaxima=altitudMaxima;
		this.id=id;
		
		
}


	public void setMarca(String marca) {
		this.marca = marca;
		}

		
	public String getMarca() {
		return marca;
		}
		
	public void setModelo(String modelo) {
		this.modelo = modelo;
		}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	
	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}
	
	public void setVelocidadMaxima(String velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setAltitudMaxima(String altitudMaxima) {
		this.altitudMaxima = altitudMaxima;
	}
	
	public String getAltitudMaxima() {
		return altitudMaxima;
	}
	
	
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	
	public void setEstadoMotor(boolean estadoMotor) {
		  this.estadoMotor=estadoMotor;
	}
	
	public boolean	getEstadoMotor (){
		return estadoMotor;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	/*
	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}
	
	public int getAltitud() {
		return altitud;
	}
	*/
	
	
	public void acelerar() {
		if (estadoMotor) {
			
			System.out.println("Acelerando Motor.¡Vrrrooooom!");
		}
		else {
			System.out.println("Debe Encender El Motor ");
		}
	}
	
	
	public void despegar () {
		
		System.out.println("----------------------------------------------");
		if (estadoMotor) {
			
			for (int i = 3; i > 1; i--) {
					
				if (i==3) {
					System.out.println("DESPEGANDO EN " + (i) );
				}
				System.out.println(".............." + (i-1));
				
				
			}
			System.out.println(":::: BUEN VIAJE :::::");
			
			  Random random = new Random();
		         altitud = random.nextInt(15000);
		        System.out.println("Número aleatorio: " + altitud);
		    
		}
		
		else {
			System.out.println("Debe Encender el motor y acelerar");
		}
	}
	
	
	public void aterrizar() {
			
			
		if (estadoMotor && altitud > 0) {
			
			
		for (int i = altitud; i >= 0; i-=1000) {
			System.out.println("Se Empieza a descender " + (i) + " Pies");
			
		}
		
		System.out.println("::::Aterrizaje Exitoso!!::::");
			
		}
		
		else {
			System.out.println("ERROR ");
		}
	}
		
		
		  public void encenderMotor() {
		        estadoMotor = true;
		        System.out.println("Motor encendido. ¡Vrrrooooom!");
		    }

		    public void apagarMotor() {
		        estadoMotor = false;
		        System.out.println("Motor apagado.");
		    }


		    
		    public void activarModoAuto() {
				System.err.println("Piloto Automatico Activado");
		    
			}
	

	
	
	
	


		
		
	
}
