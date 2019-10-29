import javax.swing.JOptionPane;

public class matriz {

	public static void main(String[] args) {		
		/*
		int[][] x = new int[2][2];
		
		System.out.println("Valor:"+x[1][1]);
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				x[i][j] = 1;
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		int[][] a = new int[5][5];
		
		
		int nlinhas = a.length;
		int ncolunas = a.length;
		
		for (int i = 0; i < nlinhas; i++) {
			
			a[i][0] = 1;
			
		}
		
		for (int i = 0; i < 10/2; i++) {
			for (int j = 0; j < 10/2; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		double x = 1.1777;
		
		double xy = Math.round(x);
		System.out.println(xy);
		

		
		
		double[][] notas = new double[2][2];
		
		double somas = 0;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				notas[i][j] = 5.1;
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				somas = somas + notas[i][j];
			}
		}
		

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("media:"+(somas)/(4));
		
		*/
		
		/*
		double[][] notas = new double[2][2];
		
		double somas = 0;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				notas[i][j] = 5.1;
				
				if (i == j) {
					notas[i][j] = 5.2;
				}	
				
			}
		}
		
		for (int i = 0; i < 2; i++) {
			
				somas = somas + notas[i][i];
			
		}
		

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("media:"+(somas)/(4));
		*/
		
		
		/*
		int[][] x = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("["+i+","+j+"]"+"\t");
			}
			System.out.println();
		}
		*/
		/*
		String[] nome = new String[10];
		double[][] nota = new double[10][5];
		
		
		for (int i = 0; i < nome.length; i++) {
			  nome[i] = "a";
		}
		
		int x = 0;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				nota[i][j] = x++;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			
			 System.out.print("Nome:"+nome[i]+" ");
			 double media = 0;
			
			 for (int j = 0; j < 5; j++) {
				 System.out.print(nota[i][j]+" ");
				 media = media + nota[i][j];
				
				
			}
			 media = media/5;
			 System.out.print("= Media: "+media+"\t");
			 System.out.println();	
		} 
			*/
		
		
		
		
	}
		
}


