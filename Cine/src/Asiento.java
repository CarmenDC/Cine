
public class Asiento implements Ocupable{
	
	private int numFila;
	private char numColumna;
	private Espectador personaOcupa;
	
//	GETTERS AND SETTERS
	public int getNumFila() {
		return numFila;
	}



	public char getNumColumna() {
		return numColumna;
	}


//CONSTRUCTOR
	public Asiento(int numFila, char numColumna) {
		this.numFila = numFila;
		this.numColumna = numColumna;
	}

//OTROSMETODOS
	public void ocuparAsiento (Espectador persona){
		personaOcupa = persona;		
	}
	
	@Override
	public Boolean estaDisponible() {
		return personaOcupa!=null? false:true;
	}


//IMPRIMIR
	@Override
	public String toString() {
		return "Asiento Fila: " + numFila + ", Columna:" + numColumna + ", " + (personaOcupa==null? "vacio":personaOcupa.toString());
	}
	

	
	
}
