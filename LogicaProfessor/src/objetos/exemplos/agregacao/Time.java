package objetos.exemplos.agregacao;

import java.util.List;

import lombok.Data;

@Data
public class Time {
	private String nome;
	private String tecnico;
	private List<Atleta> atletas;
}
