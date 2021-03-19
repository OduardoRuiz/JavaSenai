package objetos.exemplos;

public class ExemploBlocos {
	// Os encapsulamentos deste atributos são "Default"
	// o que os torna visíveis para qualquer outra classe
	// que estajam dentro do mesmo pacote desta classe
	// "objetos.exemplos"
	String nome = "Teste"; // Atributo que pretence aos Objetos criados desta classe
	static int numero = 10; // Atributo estático que pertence a Classe
	
	// Construtor da classe, utilizada para a inicialização de 
	// atributos dos objetos
	public ExemploBlocos() {  
		System.out.println("No Contrutor");
	}
	
	// Bloco anônimo que é executado na antes da chamada do construtor de objetos
	// desta classe
	{
		System.out.println("No Objeto");
	}
	
	
	// Bloco estático anônimo que é executado somente uma única vez após 
	// a carga da classe, pela JVM Java na memória
	static {
		System.out.println("Na Classe");
	}
	
	// Método acessível pelos objetos desta classe
	// têm seu encapsulamento privado, que o oculta de qualquer
	// outra classe no ambiente Java
	private void imprime() {
		System.out.println("No método");
	}
	
	// Método publico e estático acessível pela própria classe
	// e com seu encapsulamento permitindo ser visível por
	// qualquer outra classe no ambiente Java
	public static void imprime2() {
		System.out.println("No método estático");
	}

	public static void main(String[] args) {
		
		//System.out.println(ExemploBlocos.nome);
		
		ExemploBlocos.imprime2();
		ExemploBlocos bloco1 = new ExemploBlocos();
		bloco1.imprime();
		bloco1.nome = "b1";
		ExemploBlocos.numero = 11;
		
		ExemploBlocos bloco2 = new ExemploBlocos();
		
		System.out.println(bloco2.nome + " " + ExemploBlocos.numero);
		System.out.println(bloco1.nome + " " + ExemploBlocos.numero);
	}
}
