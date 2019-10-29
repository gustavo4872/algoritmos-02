import javax.swing.JOptionPane;

public class Lista6 {
	
static double[][] matriz = new double[2][2];

	public static void mostraNumeros(float numeros){
		System.out.println("Numeros:"+numeros);
	}
	public static float lerNumero(){
		float numero = Float.parseFloat(JOptionPane.showInputDialog(null, "eae"));
		return numero;
	}
	public static void mostrarMatriz(){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " \t");
			}
			System.out.println("");
		}
	}
	public static void mostraLinhaMatriz(int linha){
		for (int i = linha; i < linha + 1; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " \t");
			}
			System.out.print("");
		}
	}
	public static void mediaMatriz(){
		double media = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				media = media + matriz[i][j];
			}
		}
		System.out.println(media/4);
	}
	public static void mediaDiagonal(){
		double media = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					media = media + matriz[i][j];
				}
			}
			System.out.println(media/2);
		} 
	}
	
	public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		/*
		float numero01, numero02;
		String reader = JOptionPane.showInputDialog(null, "eae");
		numero01 = Float.parseFloat(reader);
		mostraNumeros(numero01);
		reader = JOptionPane.showInputDialog(null, "eae2");
		numero02 = Float.parseFloat(reader);
		mostraNumeros(numero02);
		*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		/*
		for (int i = 0; i < 2; i++) {
			float numero = lerNumero();
			System.out.println(numero);
		}
		*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		mediaMatriz();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
