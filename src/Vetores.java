import java.security.cert.PKIXRevocationChecker.Option;
import javax.swing.JOptionPane;

public class Vetores {

static String[] vetorNome = new String[10];
static int contador = 0;


public static void cadastrarNome(String nome){
	vetorNome[contador] = nome;
	contador++;
}
public static void mostraNomes(){
	for (int i = 0; i < vetorNome.length; i++) {
		if (vetorNome[i] != null) {
			System.out.println(vetorNome[i]);
		}else {
			break;
		}
	}
	System.out.println("");
}	
public static void mostraNomesIndice(int indice){
	System.out.println("Nome: "+vetorNome[indice]);
}
public static boolean procuraNome(String nomeBusca){
	
	for (int i = 0; i < vetorNome.length; i++) {
		if (vetorNome[i].equalsIgnoreCase(nomeBusca)) {
			return true;
		} 
	}
	return false;
}
public static void procuraIndice(String nome){
	for (int i = 0; i < vetorNome.length; i++) {
		if (vetorNome[i].equalsIgnoreCase(nome)) {
			System.out.println("Indice:"+i);
		}else {
			System.out.println("Indice não Encontrado");
		}
	} 
	System.out.println("");
}

	public static void main(String[] args) {
		
		int opcao = 0;
		boolean condi = false;
		
		
		do {
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Opções:\n \n 0 -- Nomes no Vetor; \n 1 -- Nome no Indice \n 2 -- Procurar um Nome \n 3 -- Mostrar o Indice \n 4 -- Cadastrar \n 5 -- Sair \n \n"));
			if (opcao == 0) {
				
				mostraNomes();
				
			}else if (opcao == 1) {
				
				int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Indice do nome:"));
				mostraNomesIndice(indice);
				
			}else if (opcao == 2) {
				
				String nome = JOptionPane.showInputDialog("Nome:"); 
				boolean vf = procuraNome(nome);
				System.out.println(vf);
				
			}else if (opcao == 3) {
				
				String procuraindice = JOptionPane.showInputDialog("Nome:");
				procuraIndice(procuraindice);
				
			}else if (opcao == 4) {
				
				String nome = JOptionPane.showInputDialog("Nome:"); 
				cadastrarNome(nome);
				
			}
		
		} while (condi != true);
		
	}
}

