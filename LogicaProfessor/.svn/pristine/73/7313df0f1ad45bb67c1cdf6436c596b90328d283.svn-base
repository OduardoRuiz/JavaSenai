package logica.ex05.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int analista = 0;
		int programador = 0;
		int usuario = 0;
		int gestor = 0;
		int outro = 0;
		
		String cargo = leTexto("Informe o seu Cargo");
		
		while(!cargo.isEmpty()) {
			/*
				Métodos (funções em String):
				
				toLowerCase() - Converte todos os caracteres da String em minúscula
				trim() - Remove todos os espaços em branco do início e do final da String
			
			*/
			switch (cargo.toLowerCase().trim()) {
			case "analista":
				analista++;
				break;
			case "programador":
				programador++;
				break;
			case "usuario":
				usuario++;
				break;
			case "gestor":
				gestor++;
				break;
			default:
				outro++;
				break;
			}
			
			cargo = leTexto("Informe o seu Cargo");
		}
		
		String msg = "\nCargo presente no Congresso\n\n";
		msg += "Analistas: " + analista + "\n";
		msg += "Programador: " + programador + "\n";
		msg += "Usuário: " + usuario + "\n";
		msg += "Gestor: " + gestor + "\n";
		msg += "Ourtos: " + outro;
		
		escrevaL(msg);
	}
}
