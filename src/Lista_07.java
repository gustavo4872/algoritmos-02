import java.util.concurrent.locks.Condition;

import javax.swing.JOptionPane;

public class Lista_07 {
	//Lista de Exercícios 7 - Funções e Procedimentos II

// 1-----------------------------------------------------
	/*
	public static void mostraValores(double[][] matriz){
	for (int i = 0; i < matriz.length; i++) {
		mostraLinha(i, matriz);
	}
}
public static void mostraLinha(int i, double[][] matriz){
	for (int j = 0; j < matriz.length; j++) {
		System.out.print(matriz[i][j]+"\t");
	}
	System.out.println("");
}
public static void mostraValores2(int linha, double[][] matriz){
	for (int i = linha; i < linha + 1; i++) {
		for (int j = 0; j < matriz.length; j++) {
		System.out.print(matriz[i][j]+"\t");	
		}
	}
}

	public static void main(String[] args) {
		
		double[][] numeros = new double[10][10];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[i][j]=1;
			}
		}
		
		mostraValores(numeros);
		System.out.println("=======================");
		int linha = Integer.parseInt(JOptionPane.showInputDialog(null, "valor"));
		mostraValores2(linha, numeros);
		
	}
*/
	
	// 2-----------------------------------------------------
	/*
	public static void soma(double numb1, double numb2){
		JOptionPane.showMessageDialog(null, "Resultado: "+(numb1+numb2));
	}
	public static void subtracao(double numb1, double numb2){
		JOptionPane.showMessageDialog(null, "Resultado: "+(numb1-numb2));
	}
	public static void multiplicacao(double numb1, double numb2){
		JOptionPane.showMessageDialog(null, "Resultado: "+(numb1*numb2));
	}
	public static void divisao(double numb1, double numb2){
		JOptionPane.showMessageDialog(null, "Resultado: "+(numb1/numb2));
	}
	public static void main(String[] args){
		int condicao = 0;
		double numero1 = 0, numero2=0;
		do {
			condicao = Integer.parseInt(JOptionPane.showInputDialog(null, " 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisao \n 0 - Sair \n "));
			switch (condicao) {
			case 1:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				soma(numero1, numero2);
				break;
			case 2:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				subtracao(numero1, numero2);
				break;
			case 3:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				multiplicacao(numero1, numero2);
				break;
			case 4:
				numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
				divisao(numero1, numero2);
				break;
			default:
				break;
			}
		} while (condicao != 0);
		
		
	}
	*/
	
	// 3-----------------------------------------------------
	/*
public static String[][] criarMatriz(int linha, int coluna){
		String[][] matrizes = new String[linha][coluna];
		return matrizes;
	}
public static void mostraMatriz(String[][] matriz){
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			System.out.print(matriz[i][j]+"\t");
		}
		System.out.println("");
	}
}

	public static void main(String[] args){
		int linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Linhas:"));
		int colunas = Integer.parseInt(JOptionPane.showInputDialog(null, "Colunas:"));
		String[][] matriz = criarMatriz(linhas, colunas);
		mostraMatriz(matriz);
		
	}*/
}
