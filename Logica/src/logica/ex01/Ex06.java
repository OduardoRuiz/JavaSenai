package logica.ex01;
import br.senai.sp.info132.console.Programa;

public class Ex06 extends Programa { 
 
	public void inicio() {
	String formacao = leTexto("informe sua formação");
   int idade = leInteiro("informe sua Idade");
   boolean estaApto = formacao.equals("tecnico") && idade > 18;
   if(estaApto) { 
	   escrevaL("voce esta apto");
   }
   else {
		escrevaL ("voce nao esta apto"); }


} 
}
