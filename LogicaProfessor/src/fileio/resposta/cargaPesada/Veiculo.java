package fileio.resposta.cargaPesada;

import java.io.Serializable;

import lombok.Data;

@Data
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 540L;
	private String placa;
	private String hora;
	private String motorista;

	@Override
	public String toString() {
		return "placa: " + placa + " hora: " + hora + " motorista: " + motorista;
	}

	
}
