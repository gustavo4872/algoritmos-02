import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		if (JOptionPaneGustavo.showQuestionDialog(null, "TESTE")) {
			System.out.println(numero);
		}
		

		for (int i = 0; i < 1; i++) {
			if (i == 0) {
			carros[i].modelo = "Focus";
			carros[i].marca = "Ford";
			}else{
				carros[i].modelo = "Fusion";
				carros[i].marca = "Ford";
			}
			carros[i].lataria = i;
			
			String cor = JOptionPane.showInputDialog(null, "Cor:");
			latarias[i].cor = cor;
			
			int sn = JOptionPane.showConfirmDialog(null, "Pintura");
			
			if (sn == 0) {
				latarias[i].pinturaP = true;
			}else if (sn == 1) {
				latarias[i].pinturaP = false;
			}
			
			motores[i].potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Potencia"));
			motores[i].tipoC = JOptionPane.showInputDialog(null, "Tipo de Combustível");
			
			cambios[i].tipo = JOptionPane.showInputDialog(null, "Automático ou Manual");
			cambios[i].quantidadeM = Integer.parseInt(JOptionPane.showInputDialog(null, "4 ou 5"));
			 
		}
		
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Carro"));
			
			int cambio = carros[opcao].cambio;
			System.out.println(cambios[cambio].quantidadeM);
			System.out.println(cambios[cambio].tipo);
			System.out.println(carros[opcao].marca);
			System.out.println(carros[opcao].modelo);
		

	}

}











clientes[0].id = 0;
clientes[0].nome = "Gustavo";
clientes[0].idade = 18;
clientes[0].profissao = "Atendente VASP";

clientes[1].id = 1;
clientes[1].nome = "Marcus";
clientes[1].idade = 21;
clientes[1].profissao = "Estagiario do Cafézinho";

clientes[2].id = 2;
clientes[2].nome = "Indefinido";
clientes[2].idade = 88;
clientes[2].profissao = "Aposentado(a)";

animais[0].id = 0;
animais[0].nome = "Scooby";
animais[0].raca = "Doberman";
animais[0].sexo = "Masculino";

animais[1].id = 1;
animais[1].nome = "Snoopy";
animais[1].raca = "Beagle";
animais[1].sexo = "Masculino";

animais[2].id = 2;
animais[2].nome = "Shilon";
animais[2].raca = "Beagle";
animais[2].sexo = "Masculino";










