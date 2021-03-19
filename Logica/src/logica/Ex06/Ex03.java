package logica.Ex06;


import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {

	@Override
	public void inicio() {

		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {

			num[i] = leInteiro("informe um numero");

		}
		escrevaL();

		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					int aux = num[j];
					num[j] = num[j + 1];
					num[j + 1] = aux;
					hoveTroca = true;

				}

			}
		} while (hoveTroca);
		{

			escrevaL();

			

			for (int i = 0; i < num.length; i++) {

				if (num[i] % 2 == 0) {
					escrevaL("numeros pares # ", num[i]);

				}
			}

			
			
			escrevaL();
			
			do {
				hoveTroca = false;
				for (int j = 0; j < num.length - 1; j++) {
					if (num[j] < num[j + 1]) {
						int aux = num[j];
						num[j] = num[j + 1];
						num[j + 1] = aux;
						hoveTroca = true;

					}

				}
			} while (hoveTroca);

			for (int i = 0; i < num.length; i++) {
				if (num[i] % 2 != 0) {
					escrevaL("numeros Impares # ", num[i]);

				}
			}

		}

	}
}
