package logica.ex02;

import br.senai.sp.info132.console.Programa;

/*
 *    int valor = 123;
 *    String num = String.valueOf(valor);  /// String num = valor +"";
 *    String  pos3 = num.substr(2,1);
 *    String  pos2 = num.substr(1,1);
 *    String  pos1 = num.substr(0,1);
 *    String resultado = pos3 + pos2 + pos1
 *    int invertido = Integer.parseInt(resulta);
 */
/*
   
   
  +---+    
  | 1 |      								12 => 1.2  /// 
  +---+ 
+---------------------+                     12 ==> 1   = 12 / 10
|                     |                     12 ==> 2   = 12 % 10 
 
  +---+ +---+
  | 3 | | 2 |								3 => 32  // 3 ==> 30
  +---+ +---+
 +---------------------+
|                     | 
 
 
 */
public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe um nº");
		
		int inv = num % 10;
		num = num / 10;
		escrevaL("O nº invertido é: ", inv, " e o num ficou assim: ", num);

		inv = inv * 10 + num % 10;
		num = num / 10;		
		escrevaL("O nº invertido é: ", inv, " e o num ficou assim: ", num);

		inv = inv * 10 + num % 10;
		num = num / 10;		
		escrevaL("O nº invertido é: ", inv, " e o num ficou assim: ", num);
	}
}
