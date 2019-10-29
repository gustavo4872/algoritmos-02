import javax.swing.JOptionPane;

public class ComprasSemana {

	public static void main(String[] args) {
		
		//Voce digita os nomes dos produtos
		//Cada produto é mostrado ao lado do seu id(numero) 
		//ex: Café - 1
		//Para cada dia voce digita o id do produto comprado
		//13 para mudar o dia
		//As linhas representam os dias
		//No final exibe a quantidade comprada na semana
		
		String[] dias = new String[]{"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"}; 
		String[] produtos = new String[11];
		
		int[][] compras = new int[7][11];
		int[] vezes = new int[11];
		int[] codigo = new int[12];
		
		int opcao;
		int x = 1;
		int y = 3;
		int z = 0;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Adicionar um Produto? (0 - Sim) (1 - Não)"));
		
		if (opcao == 0) {
			int indice = 0;
			while(x != 21){ 
			 	
				produtos[indice] = JOptionPane.showInputDialog(null, "Nome do Produto:");
			 	codigo[indice] = indice + 1;
			 	x++;
			 	indice++;
			 	
				y = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Produto? (0 - Sim) (1 - Não)"));
				
				if (y == 1) {
					x = 21;
				}
					
					
			
			}
		}
		
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] == null) {
				break;
			}
			System.out.println(produtos[i]+" -- "+codigo[i]);
			
		}
		
		for (int i = 0; i < dias.length; i++) {
			
			
			for (int j = 0; j < compras.length; j++) {
				
				z = Integer.parseInt(JOptionPane.showInputDialog(null, "Compras na(o) "+dias[i]+" (13 - Próximo Dia)"));
				if (z == 13) {
					break;
				}
				compras[i][j] = z; 
				vezes[z] = vezes[z] + 1;
				 
				
			}
			
			
		}
		
		System.out.println("-----------------------------");
		for (int i = 0; i < compras.length; i++) {
			for (int j = 0; j < compras.length; j++) {
				System.out.print(compras[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------");
		for (int i = 0; i < vezes.length; i++) {
			if (produtos[i] == null) {
				break;
			}
			System.out.println(produtos[i]+":"+vezes[i+1]);
			
		}
		
					
		
	}

}
