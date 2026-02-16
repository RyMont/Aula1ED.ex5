package controller;

public class RecursividadeController {
	public double CalculaSoma(int num) {
		
		//Fiz começando do maior pro menor, mas a ordem da soma nao muda o resultado

		// Caso base, se o numero for 1, retorna o 1 fixo da formula, encerrando a recursão
		if (num == 1) {
			return 1;
		}
		
		// Se não for o caso base, ele entra na recursão e
		// Vai retidando 1 do denominador a cada ciclo, até cair no caso base
		return (1 / (double)num) + CalculaSoma(num - 1);
	}
}
