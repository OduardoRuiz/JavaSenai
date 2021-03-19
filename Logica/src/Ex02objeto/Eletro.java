package Ex02objeto;

public class Eletro extends Produto {
	private int codforn;
	private String nomeForn;
	public int getCodforn() {
		return codforn;
	}
	public void setCodforn(int codforn) {
		this.codforn = codforn;
	}
	public String getNomeForn() {
		return nomeForn;
	}
	public void setNomeForn(String nomeForn) {
		this.nomeForn = nomeForn;
	

}
	@Override
	public String toString() {
		return super.toString() + "Eletro [codforn=" + codforn + ", nomeForn=" + nomeForn + "]";
	}
	
	
}