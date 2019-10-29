import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Recursividade {


	
	static void mostraVetor(double[] v, int i){
		System.out.println("Entrando"+i);
		if (i < v.length) {
			System.out.println(v[i]);
			mostraVetor(v, i+1);	
		}
		System.out.println("Saindo:"+i);
		
	} 
	
	
	public static void main(String[] args) {
		double[] vetor = {1,2,3,4,5,6,7,8,9,10};
		mostraVetor(vetor, 0);
		

	}

}
