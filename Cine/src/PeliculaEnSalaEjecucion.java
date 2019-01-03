
public class PeliculaEnSalaEjecucion {

	public static void main(String[] args) {
		
		Cine cine = new Cine(10,"Los Vengadores", "John Smith");	
		
		System.out.println (cine.getPelicula().toString()+"\n");
		
		for (int i=0; i<100; i++) {
			Espectador espectador = new Espectador();
//			System.out.println (espectador.toString());
			if(espectador.getEdad()>=cine.getPelicula().getEdadMinima()&&espectador.getDinero()>=cine.getPrecioEntrada()) {
			cine.getSalaDeCine().sentarEspectadorAsiento(espectador);
			}
		}
		
		cine.getSalaDeCine().ImprimirEspectadoresSala();
	}
	

}
