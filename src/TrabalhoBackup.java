class Carro{
	String modelo;
	String marca;
	int lataria;
	int motor;
	int cambio;
	}
	
	class Lataria{
		String cor;
		boolean pinturaP;
	}
	
	class Motor{
		int potencia;
		String tipoC;
	}
	
	class Cambio{
		String tipo;
		int quantidadeM;
	}
	
	class AcabamentoInterno{
		String tipoEstofado;
		String corEstofado;
	}
	
	class AcabamentoExterno{
		Boolean frisoLateral;
		Boolean aerofolio;
	}
	
public class Trabalho {
	
	static Carro[] carros = new Carro[10];
	static Lataria[] latarias = new Lataria[10];
	static Motor[] motores = new Motor[10];
	static Cambio[] cambios = new Cambio[10];
	static AcabamentoInterno[] aI = new AcabamentoInterno[10];
	static AcabamentoExterno[] aE = new AcabamentoExterno[10];
	
	public static void PotenciaGasolina(){
		double mediaPotencia = 0.0;
		for (int i = 0; i < carros.length; i++) {
			if (motores[i].tipoC == "Gasolina") {
				mediaPotencia = mediaPotencia + motores[i].potencia;
			}			
		}
		System.out.println("Media da Potência dos carros com gasolina:"+(mediaPotencia/10));
	}
	
	public static void mais4ou5Marchas(){
		int quatro = 0;
		int cinco = 0;
		for (int i = 0; i < cambios.length; i++) {
			if (cambios[i].tipo == "Automático") {
				if (cambios[i].quantidadeM == 4) {
					quatro++;
				}else{
					cinco++;
				}
			}
		}
		
		if (quatro > cinco) {
			System.out.println("Existem mais carros com 4 marchas:"+quatro);
		}else if(cinco > quatro){
			System.out.println("Existem mais carros com 5 marchas:"+cinco);
		}else{
			System.out.println("Mesma quantidade de carros com 4 e 5 marchas");
		}
	}
	
	public static void carroAcabamentoE(){
		int carros = 0;
		for (int i = 0; i < aE.length; i++) {
			if (aE[i].aerofolio == false && aE[i].frisoLateral == false) {
				carros++;
			}
		}
		System.out.println("Carros sem acabamento externo:"+carros);
	}
	
	public static void carroCadastrados(String marca, String modelo, String cor, int potencia, int marcha, String Combustivel, String tipoEs, String corEs, boolean frisol, boolean aerofolio, String tipoCambio, Boolean ptp){
		boolean enc = false;
		for (int i = 0; i < carros.length; i++) {
			if (carros[i].marca == marca) {
				if (carros[i].modelo == modelo) {
					if (latarias[i].cor == cor) {
						if (motores[i].potencia == potencia) {
							if (cambios[i].quantidadeM == marcha) {
								if (motores[i].tipoC == Combustivel) {
									if (aI[i].tipoEstofado == tipoEs) {
										if (aI[i].corEstofado == corEs) {
											if (aE[i].frisoLateral == frisol) {
												if (aE[i].aerofolio == aerofolio) {
													if (cambios[i].tipo == tipoCambio) {
														if (latarias[i].pinturaP == ptp) {
															System.out.println("Cadastrado -- "+marca+" "+modelo);
															enc = true;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (enc == false) {
			System.out.println("Não Cadastrado -- "+marca+" "+modelo);
		}
	}
	
	public static void procurarCarro(String cor, int potencia, boolean aerofolio){
		
		for (int i = 0; i < carros.length; i++) {
			
			if (latarias[i].cor == cor && motores[i].potencia == potencia && aE[i].aerofolio == aerofolio) {
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Marca: "+carros[i].marca);
				System.out.println("Modelo: "+carros[i].modelo);
				System.out.println("Cor: "+latarias[i].cor);
				System.out.println("Possui Pintura Personalizada: "+latarias[i].pinturaP);
				System.out.println("Tipo: "+cambios[i].tipo);
				System.out.println("Potência: "+motores[i].potencia);
				System.out.println("Marchas: "+cambios[i].quantidadeM);
				System.out.println("Combustível: "+motores[i].tipoC);
				System.out.println("Tipo do Estofado: "+aI[i].tipoEstofado);
				System.out.println("Cor do Estofado: "+aI[i].corEstofado);
				System.out.println("Possui Friso Lateral: "+aE[i].frisoLateral);
				System.out.println("Possui Aerofólio: "+aE[i].aerofolio);				
			}
			
		}
		
	}
	
	public static void main(String[] agrs){
		
		
		
		for (int i = 0; i < carros.length; i++) {
			carros[i] = new Carro();
			latarias[i] = new Lataria();
			motores[i] = new Motor();
			cambios[i] = new Cambio();
			aI[i] = new AcabamentoInterno();
			aE[i] = new AcabamentoExterno();
		}
		
		
		
		carros[0].marca = "Ford";
		carros[0].modelo = "Fusion";
		carros[0].lataria = 0;
		carros[0].cambio = 0;
		carros[0].motor = 0;
		latarias[0].cor = "Branco";
		latarias[0].pinturaP = false;
		motores[0].potencia = 173;
		motores[0].tipoC = "Gasolina";
		cambios[0].tipo = "Automático";
		cambios[0].quantidadeM = 4;
		aI[0].tipoEstofado ="Couro";
		aI[0].corEstofado ="Bege";
		aE[0].frisoLateral = true;
		aE[0].aerofolio = true;
		
		
		carros[1].marca = "Chevrolet";
		carros[1].modelo = "Equinox";
		carros[1].lataria = 1;
		carros[1].cambio = 1;
		carros[1].motor = 1;
		latarias[1].cor = "Vermelho";
		latarias[1].pinturaP = false;
		motores[1].potencia = 262;
		motores[1].tipoC = "Gasolina";
		cambios[1].tipo = "Automático";
		cambios[1].quantidadeM = 4;
		aI[1].tipoEstofado = "Tecido";
		aI[1].corEstofado = "Branco";
		aE[1].frisoLateral = false;
		aE[1].aerofolio = false;
				
		carros[2].marca = "Reanult";
		carros[2].modelo = "Sandero";
		carros[2].lataria = 2;
		carros[2].cambio = 2;
		carros[2].motor = 2;
		latarias[2].cor = "Cinza";
		latarias[2].pinturaP = true;
		motores[2].potencia = 118;
		motores[2].tipoC = "Gasolina";
		cambios[2].tipo = "Manual";
		cambios[2].quantidadeM = 5;
		aI[2].tipoEstofado = "Tecido";
		aI[2].corEstofado = "Cinza";
		aE[2].frisoLateral = false;
		aE[2].aerofolio = false;
		
		carros[3].marca = "Jeep";
		carros[3].modelo = "Renegade";
		carros[3].lataria = 3;
		carros[3].cambio = 3;
		carros[3].motor = 3;
		latarias[3].cor = "Preto";
		latarias[3].pinturaP = true;
		motores[3].potencia = 139;
		motores[3].tipoC = "Gasolina";
		cambios[3].tipo = "Manual";
		cambios[3].quantidadeM = 5;
		aI[3].tipoEstofado = "Couro";
		aI[3].corEstofado = "Preto";
		aE[3].frisoLateral = false;
		aE[3].aerofolio = false;
		
		carros[4].marca ="Land Rover";
		carros[4].modelo = "Evoque";
		carros[4].lataria = 4;
		carros[4].cambio = 4;
		carros[4].motor = 4;
		latarias[4].cor = "Azul";
		latarias[4].pinturaP = false;
		motores[4].potencia = 240;
		motores[4].tipoC = "Gasolina";
		cambios[4].tipo = "Manual";
		cambios[4].quantidadeM = 5;
		aI[4].tipoEstofado ="Couro";
		aI[4].corEstofado ="Branco";
		aE[4].frisoLateral = true;
		aE[4].aerofolio = true;
		
		carros[5].marca = "Honda";
		carros[5].modelo = "Civic";
		carros[5].lataria = 5;
		carros[5].cambio = 5;
		carros[5].motor = 5;
		latarias[5].cor = "Preto";
		latarias[5].pinturaP = false;
		motores[5].potencia = 115;
		motores[5].tipoC = "Gasolina";
		cambios[5].tipo = "Manual";
		cambios[5].quantidadeM = 5;
		aI[5].tipoEstofado ="Tecido";
		aI[5].corEstofado ="Bege";
		aE[5].frisoLateral = true;
		aE[5].aerofolio = true;
		
		carros[6].marca = "Toyota";
		carros[6].modelo = "Etios";
		carros[6].lataria = 6;
		carros[6].cambio = 6;
		carros[6].motor = 6;
		latarias[6].cor = "Cinza";
		latarias[6].pinturaP = false;
		motores[6].potencia = 98;
		motores[6].tipoC = "Gasolina";
		cambios[6].tipo = "Automático";
		cambios[6].quantidadeM = 5;
		aI[6].tipoEstofado ="Tecido";
		aI[6].corEstofado ="Cinza";
		aE[6].frisoLateral = false;
		aE[6].aerofolio = false;
		
		carros[7].marca = "Volkswagen";
		carros[7].modelo = "Up";
		carros[7].lataria = 7;
		carros[7].cambio = 7;
		carros[7].motor = 7;
		latarias[7].cor = "Laranja";
		latarias[7].pinturaP = false;
		motores[7].potencia = 105;
		motores[7].tipoC = "Gasolina";
		cambios[7].tipo = "Manual";
		cambios[7].quantidadeM = 5;
		aI[7].tipoEstofado = "Tecido";
		aI[7].corEstofado = "Vermelho";
		aE[7].frisoLateral = false;
		aE[7].aerofolio = false;
		
		carros[8].marca = "Fiat";
		carros[8].modelo = "Uno";
		carros[8].lataria = 8;
		carros[8].cambio = 8;
		carros[8].motor = 8;
		latarias[8].cor = "Amarelo";
		latarias[8].pinturaP = true;
		motores[8].potencia = 109;
		motores[8].tipoC = "Gasolina";
		cambios[8].tipo = "Manual";
		cambios[8].quantidadeM = 4;
		aI[8].tipoEstofado = "Tecido";
		aI[8].corEstofado = "Cinza";
		aE[8].frisoLateral = false;
		aE[8].aerofolio = false;
		
		carros[9].marca = "Audi";
		carros[9].modelo = "R8";
		carros[9].lataria = 9;
		carros[9].cambio = 9;
		carros[9].motor =9;
		latarias[9].cor = "Branco";
		latarias[9].pinturaP = false;
		motores[9].potencia = 420;
		motores[9].tipoC = "Gasolina";
		cambios[9].tipo = "Automático";
		cambios[9].quantidadeM = 5;
		aI[9].tipoEstofado = "Couro";
		aI[9].corEstofado = "Bege";
		aE[9].frisoLateral = true;
		aE[9].aerofolio = true;
		
		PotenciaGasolina();
		mais4ou5Marchas();
		carroAcabamentoE();
		
		String marca = "Ferrari";
		String modelo = "Portofino";
		String cor = "Vermelho";
		Boolean ptp = false;
		int potencia = 155;
		String Combustivel = "Gasolina";
		String tipoCambio = "Manual";
		int marcha = 5;
		String tipoEs = "Couro";
		String corEs = "Bege";
		boolean frisol = true;
		boolean aerofolio = true;
		
		carroCadastrados(marca, modelo, cor, potencia, marcha, Combustivel, tipoEs, corEs, frisol, aerofolio, tipoCambio, ptp);
		
		marca = "Audi";
		modelo = "R8";
		cor = "Branco";
		ptp = false;
		potencia = 420;
		Combustivel = "Gasolina";
		tipoCambio = "Automático";
		marcha = 5;
		tipoEs = "Couro";
		corEs = "Bege";
		frisol = true;
		aerofolio = true;
		
		carroCadastrados(marca, modelo, cor, potencia, marcha, Combustivel, tipoEs, corEs, frisol, aerofolio, tipoCambio, ptp);
		
		cor = "Amarelo";
		potencia = 109;
		aerofolio = false;
		
		procurarCarro(cor, potencia, aerofolio);
	}
}