package objetos.exemplos;

public class Contrato {
	 private Integer numero;
	 private String titulo;
	 private String descricao;

	 public Contrato() {
	 }
	 
	 public Integer getNumero() {
		 return numero;
	 }
	 
	 public void setNumero(Integer numero) {
		 this.numero = numero;
	 }
	 
	 public String getTitulo() {
		 return titulo;
	 }
	 
	 public void setTitulo(String titulo) {
		 this.titulo = titulo;
	 }
	 
	 public String getDescricao() {
		 return descricao;
	 }
	 
	 public void setDescricao(String descricao) {
		 this.descricao = descricao;
	 }
	 
	 @Override
	 public String toString() {
		 return "Nº do Contrato: " + numero + " Título: " + titulo + " Descr.: " + descricao;
	 }
}
