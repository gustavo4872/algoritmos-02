import javax.swing.JOptionPane;

public class Mega {

	public static void main(String[] args) {
		int[] numeros = new int[48];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 0;
		}
		int[] vezes = new int[48];
		for (int i = 0; i < vezes.length; i++) {
			vezes[i] = 0;
		}
		int numero = 1;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "numero"));
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] != numero) {
					if (numeros[i] == 0) {
						numeros[i] = numero;
						vezes[i]++;
						break;
					}
				}else {
					vezes[i]++;
					break;
				}
			}
		} while (numero != 0);
		for (int i = 0; i < vezes.length; i++) {
			if (numeros[i] != 0) {
				System.out.print(numeros[i] + ": "+vezes[i]);
				System.out.println("");
			}
		} 
	}

}
