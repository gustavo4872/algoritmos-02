import javax.swing.JOptionPane;

class Cliente{
	int id;
	String nome;
	int idade;
	String profissao;
}
class Animal{
	int id;
	String nome;
	String raca;
	String sexo;
}
class Atendimento{
	int id;
	int cliente_id;
	int animal_id;
}

public class Prova_23_11_17 {
	
	static Cliente[] clientes = new Cliente[10];
	static Animal[] animais = new Animal[10];
	static Atendimento[] notaFiscal = new Atendimento[10];
	
	public static void cadastroCliente(){
		int quantidade = 0;
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].id != -4) {
				quantidade++;
			}
		}
		clientes[quantidade].id = quantidade;
		String nome = JOptionPane.showInputDialog(null, "Nome:");
		clientes[quantidade].nome = nome;
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:"));
		clientes[quantidade].idade = idade;
		String profissao = JOptionPane.showInputDialog(null, "Profissão:");
		clientes[quantidade].profissao = profissao;
		
		
	}
	
	public static void cadastroAnimal(){
		int quantidade = 0;
		for (int i = 0; i < animais.length; i++) {
			if (animais[i].id != -5) {
				quantidade++;
			}
		}
		animais[quantidade].id = quantidade;
		String nome = JOptionPane.showInputDialog(null, "Nome:");
		animais[quantidade].nome = nome;
		String raca = JOptionPane.showInputDialog(null, "Raça:");
		animais[quantidade].raca = raca;
		String sexo = JOptionPane.showInputDialog(null, "Sexo:");
		animais[quantidade].sexo = sexo;
		
		
	}
	
	public static void cadastroPedido(){
		int quantidade = 0;
		for (int i = 0; i < notaFiscal.length; i++) {
			if (notaFiscal[i].id != -2) {
				quantidade++;
			}
		}
		
		notaFiscal[quantidade].id = quantidade;
		String nomeCliente = JOptionPane.showInputDialog(null, "Nome do Cliente");
		for (int i = 0; i < clientes.length; i++) {
			
			if (nomeCliente.equalsIgnoreCase(clientes[i].nome)) {
				notaFiscal[quantidade].cliente_id = clientes[i].id;
			
			} 
		}
		
		String nomeDog = JOptionPane.showInputDialog(null, "Nome do Cachorro");
		for (int i = 0; i < animais.length; i++) {
			if (nomeDog.equalsIgnoreCase(animais[i].nome)) {
				notaFiscal[quantidade].animal_id = animais[i].id;
				
			}
		}
		
	}
	
	public static void mostraAtendimentos(){
		for (int i = 0; i < notaFiscal.length; i++) {
			
			for (int j = 0; j < clientes.length; j++) {
				if (notaFiscal[i].cliente_id == clientes[j].id) {
					System.out.println("Cliente: "+clientes[j].nome);
					System.out.println("Idade: "+clientes[j].idade);
					System.out.println("Profissão: "+clientes[j].profissao);
				}
			}
			
			for (int j = 0; j < animais.length; j++) {				
				if (notaFiscal[i].animal_id == animais[j].id) {
					System.out.println("Animal :"+animais[j].nome);
					System.out.println("Raça: "+animais[j].raca);
					System.out.println("Sexo: "+animais[j].sexo);
					System.out.println("-------------------------------");
				}
			}
			
		}
		
	}
	
	public static void procurarAtendimento(){
		System.out.println("--------------------------------------------");
		int indice = -10;
		String nome = JOptionPane.showInputDialog(null,"Nome do Cliente:");
		for (int i = 0; i < clientes.length; i++) {
			if (nome.equals(clientes[i].nome)) {
				indice = clientes[i].id;
			}
		} 
		
		boolean mensagem = false;
		for (int i = 0; i < notaFiscal.length; i++) {
			
			if (indice == notaFiscal[i].cliente_id && mensagem == false) {
				mensagem = true;
				for (int j = 0; j < clientes.length; j++) {
					if (notaFiscal[i].cliente_id == clientes[j].id) {
						System.out.println("Cliente: "+clientes[j].nome);
						System.out.println("Idade: "+clientes[j].idade);
						System.out.println("Profissão: "+clientes[j].profissao);
					}
				}
				
				for (int j = 0; j < animais.length; j++) {
					if (notaFiscal[i].cliente_id == clientes[j].id) {
						System.out.println("Animal :"+animais[j].nome);
						System.out.println("Raça: "+animais[j].raca);
						System.out.println("Sexo: "+animais[j].sexo);
						System.out.println("-------------------------------");
					}
				}
			}
			
		}
		if (mensagem == false) {
			JOptionPane.showMessageDialog(null, "Não Encontrado");
		}
	}
	
	public static void main(String[] args){
		
		for (int i = 0; i < notaFiscal.length; i++) {
			notaFiscal[i] = new Atendimento();
			notaFiscal[i].id = -2;
			notaFiscal[i].animal_id = -3;
			notaFiscal[i].cliente_id = -1;
		}
		
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
			clientes[i].id = -4;
			animais[i] = new Animal();
			animais[i].id = -5;
		}
		
		
	boolean sair = false;
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Cadastrar Cliente - 1 \n Cadastrar Animal - 2 \n Cadastrar Pedido - 3 \n Mostrar Pedidos - 4 \n Procurar Pedido - 5 \n Sair - 0 \n Opção:"));
			
			switch (opcao) {
			case 0:
					sair = true;
				break;
			case 1:
					cadastroCliente(); 
				break;
			case 2:
					cadastroAnimal();
				break;
			case 3:
					cadastroPedido();
				break;
			case 4:
					mostraAtendimentos();
				break;
			case 5:
					procurarAtendimento();
				break;
			default:
					sair = true;
				break;
			}
			
		} while (sair != true);
	}
}
