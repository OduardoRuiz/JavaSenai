package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex04a extends Programa {
	@Override
	public void inicio() {
		final int QUANTIDADE_DE_REGISTROS = 5;
		
		Funcionario[] cadastro = new Funcionario[QUANTIDADE_DE_REGISTROS];
		
		int ultimoRegistro = 0;
		
		String nome = leTexto("Informe o ", ultimoRegistro+1,"º nome");
		while(!nome.equalsIgnoreCase("fim")) {
			double salario = leReal("Informe o ", ultimoRegistro+1,"º salário");
			
			if(ultimoRegistro >= cadastro.length) {
				Funcionario[] novoCadastro = new Funcionario[cadastro.length + QUANTIDADE_DE_REGISTROS];
				
				for (int i = 0; i < cadastro.length; i++) {
					novoCadastro[i] = cadastro[i];
				}
				
				cadastro = novoCadastro;
			}
			
			Funcionario func = new Funcionario();   // <== Criando um Objeto Funcionário
			func.setNome(nome);
			func.setSalario(salario);
			
			cadastro[ultimoRegistro] = func;
			
			ultimoRegistro++;
			nome = leTexto("Informe o ", ultimoRegistro+1,"º nome");
		}
		
		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < ultimoRegistro -1; j++) {
				if(cadastro[j].getSalario() < cadastro[j + 1].getSalario()) {
					Funcionario aux = cadastro[j];
					cadastro[j] = cadastro[j + 1];
					cadastro[j + 1] = aux;
					
					hoveTroca = true;
				}
			}
		} while(hoveTroca);

		
		escrevaL("Funcionário\tSalário");
		escrevaL("-------------\t---------");
		for (int i = 0; i < ultimoRegistro; i++) {
			escrevaL(cadastro[i].toString());
		}
	}
}


class Funcionario {
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return String.format("%s\t\t%,.2f", nome, salario);
	}
}












