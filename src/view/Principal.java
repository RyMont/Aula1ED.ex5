package view;

import util.Util;
import controller.RecursividadeController;

public class Principal {
	public static void main(String args[]) {
		Util metodos = new Util();
		RecursividadeController rc = new RecursividadeController();
		
		double resultadoSoma;
		int num = metodos.recebeNum();
		
		resultadoSoma = rc.CalculaSoma(num);
		
		metodos.mostraDouble(resultadoSoma);
	}
}
