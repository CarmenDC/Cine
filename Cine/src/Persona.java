

import java.util.Random;

public abstract class Persona {
	
	
	private final static String[] NOMBRES= {"Carla","Candela", "Blanca", "Laura","Jorge", "Mario", "David", "Alejandro"};	
	
	private String nombre;
	private int edad;

	
	// GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	

	//CONSTRUCTORES
		public Persona() {
		Random random = new Random();
		nombre=NOMBRES[random.nextInt(8)];
		edad=random.nextInt(40);
		}		
	
}
