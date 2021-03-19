package objetos.exemplos;

abstract class ExecutorDaClasseDeTeste {
	public abstract int tamanho(Object oObjeto);
	
	public abstract String separar(Object oObjeto, int posicao);
	
	public String inverte(Object texto) {
		String txt = "";
		for (int i = 0; i < tamanho(texto); i++) {
			txt = separar(texto,i) + txt;
		}
		return txt;
	}
}


public class ExemploDeClasseAbstrata extends ExecutorDaClasseDeTeste {
	
	public static void main(String[] args) {
		ExemploDeClasseAbstrata obj = new ExemploDeClasseAbstrata();
		System.out.println(obj.inverte("Está na Hora do Café"));
	}

	@Override
	public int tamanho(Object oObjeto) {
		String meuTexto = (String)oObjeto;
		return meuTexto.length();
	}

	@Override
	public String separar(Object oObjeto, int posicao) {
		String meuTexto = (String)oObjeto;
		return meuTexto.charAt(posicao) + "";
	}	
}
