import javax.swing.JOptionPane;


class Aluno{
	 int    idade;
	 String nome;
	 double media;
	 
	 public String toString() {
		String str = "Nome " + nome + " | Idade " + idade + " | Media " + media;
		return str;
	}
}
 


public class TiposEterogenios {

 static String nome(){
	String nome = JOptionPane.showInputDialog(null, "Nome:");
	return nome;
 }
 
 static int idade(){
	 int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:"));
	 return idade;
 }
 
 static double media(){
	 double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Media:"));
	 return media;
 }
 
 
	
	public static void main(String[] args) {
		/*
		Aluno al = new Aluno();
		al.nome = "joao";
		al.idade = 17;
		al.media = 9.8;
		System.out.println(al.nome+" "+al.idade+" "+al.media);
		Aluno al2 = new Aluno();
		al2.nome = "Maria";
		al2.idade = 20;
		al2.media = 9.9;
		System.out.println(al2.nome+" "+al2.idade+" "+al2.media);
		Aluno[] alunos = new Aluno[10];
		alunos[0] = new Aluno();
		alunos[0].nome = "marcos";
		System.out.println(alunos[0].nome);
		*/
		
		Aluno[] alunos2 = new Aluno[10];
		
		for (int i = 0; i < 2; i++) {
			alunos2[i] = new Aluno();
			alunos2[i].nome = nome();
			alunos2[i].idade = idade();
			alunos2[i].media = media(); 
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println(alunos2[i]);
			
		} 
		
	}

}
