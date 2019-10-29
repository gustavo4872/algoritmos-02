import javax.swing.JOptionPane;

public class OrdenaValoresVetor {

	public static void main(String[] args) {
		
		int[] numeros = new int[4];
		int meio = 0;
		int pos = 0;
		int maior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 0"+i+":"));
		}
		
		for (int x = 0; x < numeros.length; x++) {
		
			for (int i = x; i < numeros.length; i++) {
				
				if (numeros[i] > maior ) {
					maior = numeros[i];
					pos = i;
					
				}
			}
			
			meio = numeros[x];
			numeros[x] = maior;
			numeros[pos] = meio;	
			
			maior = 0;
			pos = 0;
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}

}
