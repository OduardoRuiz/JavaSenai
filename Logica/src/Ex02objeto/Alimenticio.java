package Ex02objeto;

public class Alimenticio extends Produto  {
	private int dtval;
	private int dtprod;
	public int getDtval() {
		return dtval;
	}
	public void setDtval(int dtval) {
		this.dtval = dtval;
	}
	public int getDtprod() {
		return dtprod;
	}
	public void setDtprod(int dtprod) {
		this.dtprod = dtprod;
	}
	@Override
	public String toString() {
		return super.toString() +"  [Data Validade : " + dtval + ", Data da Produção : " + dtprod + "]";
		}
	}
	

	
	



