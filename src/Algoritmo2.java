import java.util.Scanner;

import javax.swing.JOptionPane;

public class Algoritmo2 {

	public static void main(String[] args) {
		System.out.println("eae");
		/*
		int a = 10;
		String dado = JOptionPane.showInputDialog(null, "Informe um valor");
		a = Integer.parseInt(dado);
		
		
		
		switch (a) {
		case 0:
			System.out.println("eae");
			break;

		default:
			System.out.println("eae");
			break;
		}
		
		
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println("a"+i);
			i++;
		}
		
		
		String palavra = "abcde";
		char d = palavra.charAt(0);
		System.out.println(d);
		
		System.out.println(palavra.charAt(0));
		
		
		String palavra = "abcde" + 123;
		for (int i = 0; i < palavra.length(); i++) {
			char c = palavra.charAt(i);
			System.out.println(c);
		}
		
		
		
		String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
		if (nome.equalsIgnoreCase("sergio")) {
			String sobrenome = JOptionPane.showInputDialog(null, "Digite o seu sobrenome:");
			if (sobrenome.equalsIgnoreCase("malandro")) {
				System.out.println("iéié");
			}
		}
		
		
		int i = 0;		
		double notaf = 0, nota = 0;
		while (i < 10) {
			i++;
			nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota"));
			notaf = notaf + nota;
		}
		System.out.println(notaf);
		double media = notaf/10;
		System.out.println(media);
		
		
		
		int i = 0, i2 = 0;		
		double notaf = 0, nota = 0;
		i2 = Integer.parseInt(JOptionPane.showInputDialog(null, "N.R."));
		while (i < i2) {
			i++;
			nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota"));
			notaf = notaf + nota;
		}
		System.out.println(notaf);
		double media = notaf/i2;
		System.out.println(media);
		
		
		int numero = 0, contador = 0;
		double media = 0;
		boolean condit = true;
		
		do {
			
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero:"));
		
		
			if (numero >= 0 ) {
				contador++;
				media = media + numero;
			}else {
				condit = false;
			}
		
		} while (condit == true);
		System.out.println("Notas somadas:"+media);
		media = media / contador;
		System.out.println("Media Final:"+media);
		
		
		int[] v = new int[4];
		
		for (int i = 0; i < 4; i++) {
			v[i] = i+1;
			System.out.println(v[i]);
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		*/
		
		/*
		String[] nome = new String[10];
		String[] sobn = new String[10];
		
		for (int i = 0; i < 9 ; i++) {
			nome[i] = JOptionPane.showInputDialog(null, "Nome:");
			sobn[i] = JOptionPane.showInputDialog(null, "Sobrenome:");
		}
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
			System.out.println(sobn[i]);
		}
		
		
		String[] nome = new String[10];
		String[] sobn = new String[10];
		Double[] nota = new Double[10];
		double media = 0, notamaior = 0;
		
		for (int i = 0; i < nome.length ; i++) {
			nome[i] = JOptionPane.showInputDialog(null, "Nome:");
			
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota:"));
		}
		
		notamaior = nota[0];
		
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] > notamaior) {
				notamaior = nota[i];
			}
		}
		
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] > 7) {
				System.out.println(nome[i]);
				
				System.out.println(nota[i]);
			}
		}
		
		for (int i = 0; i < nome.length; i++) {
			
			media = media + nota[i];

		}
		media = media / 10;
		
		
		//System.out.println(notamaior);
		System.out.println("----------------");
		System.out.println("Média das notas:"+media);
		
		boolean condi = false;
		int a = 0;
		
		String[] nome = {"nome0","nome1","nome2","nome2","nome2","nome2","nome2","nome2","nome3"}; 
		String[] busca = {"nome2"};
		
		
		
		while (condi == false) {
			
			if (nome[a] == busca[0]) {
				
				condi = true;
				System.out.println("Encontrado no indice: "+a);
			}
			a++;
			
		} 
			
			
		for (int i = 0; i < nome.length; i++) {
			if (nome[i] == busca[0]) {
				System.out.println("Encontrado no indice: "+i);
			}
		}
		
		*/	

		/*
		String[] nome = new String[3];
		int[] idade = new int[3];
		double[] nota = new double[3];
		double notas = 0, maior = 0, menor = 0;
		boolean condi = false;
		
		for (int i = 0; i < nota.length; i++) {
			nome[i] = JOptionPane.showInputDialog(null, "Nome:");
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:"));
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota:"));						
		}
		
		for (int i = 0; i < nota.length; i++) {
			notas = notas + nota[i]; 
		}
		
		JOptionPane.showMessageDialog(null,"Media:"+notas/3);
		
		maior = nota[0];
		
		menor = nota[0];
		
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] > maior) {
				maior = nota[i];
			} else if (nota[i] < menor) {
				menor = nota[i];
			}
		}
		
		System.out.println("Maior:"+maior);
		System.out.println("Menor:"+menor);
		
		for (int i = 0; i < nome.length; i++) {
			if (nome[i].equalsIgnoreCase("fausto silva")) {
				condi = true;
			}
		}
		System.out.println("--------------------");
		if (condi == true) {
			System.out.println("olocomeu!");
		} else {
			System.out.println("brincadeira!");
		}
		
		*/	
		
		/*
		
		int[] primos = {11,2,13,14,15,3,17,18,5,7};
		
		boolean ep = false;
		
		int j;
		for (int i = 0; i < primos.length; i++) {
			j = 2;
			do {
				
				if (primos[i]%j==0) {
					
						if (primos[i]==j) {
							ep=true;
							System.out.println(primos[i]);
								
						} else{
							ep = true;
						}
					
				}
				
				j++;
				
			} while (ep == false);
			
			ep=false;
		}
		
		 */
		
		/*
		int[] primos = {11,12,13,14,15,16,17,18,19,20};
		
		for (int i = 0; i < primos.length; i++) {
			if (i%2==0) {
				System.out.println(primos[i]);
			}
		}
		
		*/
		
		/*
		int[] primos = {11,12,13,14,15,16,17,18,19,20};
		int meio, mirror = 9;
		for (int i = 0; i < 5; i++) {
			
			meio = primos[i];
			
			primos[i] = primos[mirror];
			
			primos[mirror] = meio;
			
			mirror--;
			
		}
		System.out.println("------------------");
		for (int i = 0; i < primos.length; i++) {
			System.out.println(primos[i]);
		}
		*/
		
		/*
		String[] aluno = new String[200];
		*/
	}
}
	

