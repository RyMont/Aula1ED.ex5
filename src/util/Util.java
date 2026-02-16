package util;

import javax.swing.JOptionPane;

public class Util {
	public int recebeNum() {
		int num = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o número do somatório: "));
		return num;
	}
	
	public void mostraDouble(double n) {
		JOptionPane.showMessageDialog(null, "O resultado é: " +n);
	}
}
