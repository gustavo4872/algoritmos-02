import javax.swing.JOptionPane;

public class Lista_08 {
	// Quest�o - 01
	/*
	static void somaVetor(double[] v){
		double result = 0;
		for (int i = 0; i < v.length; i++) {
			result = result + v[i];
		}
		System.out.println("Resultado: "+result);
	}
	
	public static void main(String[] args){
		double[] vetor = new double[10];
		for (int i = 0; i < vetor.length; i++) {
			 vetor[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:")); 
		}  
		somaVetor(vetor);
	}
	*/
	
	// Quest�o - 02
	/*
	public static double[] leDados(double[] v){
		for (int i = 0; i < v.length; i++) {
			v[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor:"));
		}
		return v;
	}
	
	public static void main(String[] args){
	double[] vetor = new double[10];
	leDados(vetor);
	}
	*/
	
	//Quest�o - 03
	/*
	*/
	
	//Quest�o - 04
	/*
		public static void fibonacci(int vezes, int anterior, int resultado){
		
			vezes--;
		
			resultado = resultado + anterior;
			anterior = resultado - anterior;
		
			if (resultado == 0) {
				anterior = 1;
			}
		
			System.out.println(resultado);
		
			if (vezes != 0) {
				
				fibonacci(vezes, anterior, resultado);	
			}
		
		}
	
	public static void main(String[] args){
		
		int vezes = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor:"));
		
		if (vezes == 0 || vezes == 1) {
			System.out.println(0);
		}else if (vezes > 1) {
			fibonacci(vezes, 0, 0);
		} 
		
	}
	*/
}
