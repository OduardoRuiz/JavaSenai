package logica.ex04;

import java.math.BigDecimal;

import br.senai.sp.info132.console.Programa;
import logica.lib.NR;

public class TesteSqrt extends Programa {
	@Override
	public void inicio() {
		double x = 2;
		escrevaL(Math.sqrt(x));
		BigDecimal z = new BigDecimal("2");
		escreva(NR.bigSqrt(z).toString());
	}
}
