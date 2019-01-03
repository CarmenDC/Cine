import java.util.Random;

public class Espectador extends Persona{
	
	private int dinero;	
	
	//GETTERS AND SETTERS
	
	public int getDinero() {
		return dinero;
	}

	//CONSTRUCTOR
		public Espectador() {
		super();
		Random random = new Random();
		dinero = random.nextInt(50);
	}
		

	//TOSTRING

	@Override
	public String toString() {
		return "Espectador nombre: "+ getNombre() + " , edad: "+ getEdad() + ", dinero: " + dinero +"€";
	}


}
