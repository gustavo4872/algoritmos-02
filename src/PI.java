
//Classes do Projeto
class Pais{ //Classe referente ao País
	String nome;
	public String toString() {
		String str ="País: " + nome;
		return str;
	}
}

class Estado{ //Classe referente ao estado
	String nomeestado;
	String siglaestado;
	Pais nomeestadopais;
	public String toString() {
		String str = "Estado: " + nomeestado + " | Sigla: " + siglaestado + " | " + nomeestadopais;
		return str;
	}
}

class Cidade{ //Classe referente a cidade 
	String nomecidade;
	Estado nomecidadeestado;
	 public String toString() {
		String str = "Cidade: " + nomecidade + " | "+nomecidadeestado;
		return str;
	}
}
//Fim classes

public class PI {

	public static void main(String[] args) {
		//Inicia os objetos
		Pais[] contry = new Pais[1];
		Estado[] district = new Estado[27];
		Cidade[] city = new Cidade[10];
		contry[0] = new Pais();
		for (int i = 0; i < district.length; i++) {
			district[i] = new Estado();
		}
		for (int j = 0; j < city.length; j++) {
			city[j] = new Cidade();
		} 
		//Fim inicia objetos 
		
		
		//Dados (PAIS)
		contry[0].nome ="BRASIL"; 
		//Dados (NOME DOS ESTADOS)
		district[0].nomeestado = "Acre";
		district[1].nomeestado = "Alagoas";
		district[2].nomeestado = "Amapá";
		district[3].nomeestado = "Amazonas";
		district[4].nomeestado = "Bahia";
		district[5].nomeestado = "Ceará";
		district[6].nomeestado = "Distrito Federal";
		district[7].nomeestado = "Espírito Santo";
		district[8].nomeestado = "Goiás";
		district[9].nomeestado = "Maranhão";
		district[10].nomeestado = "Mato Grosso";
		district[11].nomeestado = "Mato Grosso do Sul";
		district[12].nomeestado = "Minas Gerais";
		district[13].nomeestado = "Pará";
		district[14].nomeestado = "Paraíba";
		district[15].nomeestado = "Paraná";
		district[16].nomeestado = "Pernambuco";
		district[17].nomeestado = "Piauí";
		district[18].nomeestado = "Rio de Janeiro";
		district[19].nomeestado = "Rio Grande do Norte";
		district[20].nomeestado = "Rio Grande do Sul";
		district[21].nomeestado = "Rondônia";
		district[22].nomeestado = "Roraima";
		district[23].nomeestado = "Santa Catarina";
		district[24].nomeestado = "São Paulo";
		district[25].nomeestado = "Sergipe";
		district[26].nomeestado = "Tocantins";
		//Dados (SIGLAS DOS ESTADOS)
		district[0].siglaestado = "AC";
		district[1].siglaestado = "AL";
		district[2].siglaestado = "AP";
		district[3].siglaestado = "AM";
		district[4].siglaestado = "BA";
		district[5].siglaestado = "CE";
		district[6].siglaestado = "DF";
		district[7].siglaestado = "ES";
		district[8].siglaestado = "GO";
		district[9].siglaestado = "MA";
		district[10].siglaestado = "MT";
		district[11].siglaestado = "MS";
		district[12].siglaestado = "MG";
		district[13].siglaestado = "PA";
		district[14].siglaestado = "PB";
		district[15].siglaestado = "PR";
		district[16].siglaestado = "PE";
		district[17].siglaestado = "PI";
		district[18].siglaestado = "RJ";
		district[19].siglaestado = "RN";
		district[20].siglaestado = "RS";
		district[21].siglaestado = "RO";
		district[22].siglaestado = "RR";
		district[23].siglaestado = "SC";
		district[24].siglaestado = "SP";
		district[25].siglaestado = "SE";
		district[26].siglaestado = "TO";
		//Dados (PAIS DOS ESTADOS)
		for (int i = 0; i < district.length; i++) {
			district[i].nomeestadopais = contry[0];
		}
		//Dados (NOME DAS CIDADES)
		city[0].nomecidade = "Acrelândia";
		city[1].nomecidade = "Marechal Deodoro";
		city[2].nomecidade = "Tubarão";
		//Dados (ESTADOS DAS CIDADES);
		city[0].nomecidadeestado = district[0];
		city[1].nomecidadeestado = district[1];
		city[2].nomecidadeestado = district[23];
		//Fim Dados
		
		for (int i = 0; i < city.length; i++) {
			if (city[i].nomecidade != null) {
				System.out.println(city[i]);
			}			
		}
	}
}
