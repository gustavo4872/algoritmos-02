import javax.swing.JOptionPane;

public class Argumentos {
	
	//Nem sem oq é isso
	
public static void mostramatrizInteira(float[][] mlocal){
	for (int i = 0; i < mlocal.length; i++) {
		for (int j = 0; j < mlocal.length; j++) {
			System.out.print(mlocal[i][j] + "\t");
		}
		System.out.println("");
	}
}
public static void mostramatriz(float[][] mlocal){
	for (int i = 0; i < mlocal.length; i++) {		
	}
}	

public static void mostralinha (float[][] matriz){
	for (int i = 0; i < matriz.length; i++) {
		
		mostracoluna(i, matriz);
	}
}

public static void mostracoluna(int linha, float[][] mlocal2){
	for (int j = 0; j < mlocal2.length; j++) {
		System.out.print(mlocal2[linha][j]+"\t");
	}
	System.out.println("");
}

	public static void main(String[] args) {
			float[][] mFloat = new float[2][2];
			
		for (int i = 0; i < mFloat.length; i++) {
			
			for (int j = 0; j < mFloat.length; j++) {
				String valor = JOptionPane.showInputDialog(null,"Valor");
				mFloat[i][j] = Float.parseFloat(valor);
			}
			
		}
		mostralinha(mFloat);
	}

}
