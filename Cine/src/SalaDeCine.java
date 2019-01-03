import java.util.Random;

public class SalaDeCine {
	
	private static final int numTotalAsientos=72;
	private static final char[] COLUMNAS = {'A','B','C','D','E','F','G','H','I'};
	
	private Asiento [][] sala = new Asiento[8][9];
	private int numOcupados;
	
	
	
//GETTERS AND SETTERS

	public int getNumOcupados() {
		return numOcupados;
	}

	// CONSTRUCTO
	public SalaDeCine () {
		for (int i=0; i<=7; i++) {
			for (int j=0; j<=8;j++) {
				sala[i][j] = new Asiento(i+1,(char) (COLUMNAS[j]));
			}
		}
	}
	
//OTROS MÉTODOS
	public void sentarEspectadorAsiento (Espectador espectador) {
		Random random = new Random();
		int fila;
		int columna;
		while  (numOcupados<numTotalAsientos) {
			if (sala[fila = random.nextInt(8)][columna = random.nextInt(9)].estaDisponible()) {
				sala[fila][columna].ocuparAsiento(espectador);
				numOcupados++;
				break;
			}	
		}
	}
	
//IMPRIMIR ESPECTADORES	
	public void ImprimirEspectadoresSala () {
		for (int i=0; i<=7; i++) {
			for (int j=0; j<=8;j++) {
				System.out.println(sala[i][j].toString());
			}
		}
	}

}
