package logica.ex06;

public class Util {
	public static final int CRESCENTE = 0;
	public static final int DECRESCENTE = 1;
	
	public static void ordena(int[] vetor, int ordem) {
		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < vetor.length -1; j++) {
				if( teste(vetor[j], vetor[j + 1], ordem) ) {
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					hoveTroca = true;
				}
			}
		} while(hoveTroca);
	}
	
	private static boolean teste(int num1, int num2, int ordem) {
		if(ordem == CRESCENTE) {
			return num1 > num2;
		} else {
			return num1 < num2;
		}
	}
}
