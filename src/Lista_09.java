import javax.swing.JOptionPane;

class Pessoas{
			String nome;
			int idade;
			String sexo;	
	 }

class ESCOLA{
	int codigo;
	String nome;
	String dataF;
	int[] indice = new int[1000];
}

class ALUNO{
	String nome;
	int idade;
	char sexo;
}
public class Lista_09 {
	 
	 static void mostraPessoa(Pessoas pessoa1){
		 System.out.println("Nome: "+pessoa1.nome + "| Idade: "+ pessoa1.idade + "| Sexo: " + pessoa1.sexo);
	 }
	 
	 
	public static void main(String[] args){
		//Questão - 01
		/*
		Pessoas[] pessoa = new Pessoas[10];
		
		for (int i = 0; i < pessoa.length; i++) {
			pessoa[i] = new Pessoas();
			pessoa[i].nome = "João";
			pessoa[i].idade = 19;
			pessoa[i].sexo = "M";
		}
		
		for (int i = 0; i < pessoa.length; i++) {
			mostraPessoa(pessoa[i]);
		}
		
		double idade = 0;
		
		for (int i = 0; i < pessoa.length; i++) {
			idade = idade + pessoa[i].idade;
		}
		
		System.out.println("Media: "+idade/10);
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].idade > 30) {
				System.out.println("Nome: "+pessoa[i].nome + "| Idade: "+ pessoa[i].idade + "| Sexo: " + pessoa[i].sexo);
			}
		}
		*/
		
		//Questão - 02
		
		ESCOLA[] escola = new ESCOLA[3];
		ALUNO[] aluno = new ALUNO[5];
		
		for (int i = 0; i < escola.length; i++) {
			escola[i] = new ESCOLA();
		}
		
		for (int i = 0; i < aluno.length; i++) {
			aluno[i] = new ALUNO();
		}
		
		for (int i = 0; i < aluno.length; i++) {
			String nome = JOptionPane.showInputDialog(null, "Nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:"));
			char sexo = JOptionPane.showInputDialog(null, "Sexo").charAt(0);
			aluno[i].nome = nome;
			aluno[i].idade = idade;
			aluno[i].sexo = sexo;
		}
		
		for (int i = 0; i < escola.length; i++) {
			String nome = JOptionPane.showInputDialog(null, "Nome:");
			String dataf = JOptionPane.showInputDialog(null, "Data de Fundação:");
			escola[i].codigo = i;
			escola[i].nome = nome;
			escola[i].dataF = dataf;
		}
		
		
	}

}
