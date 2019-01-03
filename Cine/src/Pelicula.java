import java.util.Random;

public class Pelicula {
	
	
	private static final int[] EDADMINIMA = {0, 7, 12 ,18};
	private static final int[] DURACION = {75 , 80, 90 , 120};
	
			
	private String titulo;
	private int duracionMinutos;
	private int edadMinima;
	private String director;
	
	//	GETTERS AND SETTERS
	
	public String getTitulo() {
		return titulo;
	}
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public String getDirector() {
		return director;
	}
	
	
	
	public Pelicula (String titulo, String director) {
		Random random = new Random();
		duracionMinutos = DURACION[random.nextInt(4)];
		edadMinima = EDADMINIMA[random.nextInt(4)];
		this.titulo = titulo;
		this.director = director;
		
	}
	
	
//	TO STRING
	@Override
	public String toString() {
		return "Pelicula: " + titulo + ", duracion: " + duracionMinutos + "min, edad min: " + edadMinima
				+ ", director: " + director;
	}
	
	
	

}
