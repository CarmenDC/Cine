
public class Cine {
	
	int precioEntrada;	
	SalaDeCine salaDeCine;
	Pelicula pelicula;
	
	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}	

	public SalaDeCine getSalaDeCine() {
		return salaDeCine;
	}

	public Cine (int precioEntrada, String titulo, String director) {
		salaDeCine = new SalaDeCine();
		pelicula = new Pelicula(titulo, director);
		this.precioEntrada=precioEntrada;
	}
	
	

}
