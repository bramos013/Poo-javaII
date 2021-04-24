public class Impressora extends Eletronico {

	private String tecnologia;

//Construtor Impressora
	public Impressora(String nome, int codigo, double valorBase, String tecnologia){
		super(nome,codigo,valorBase);
		this.tecnologia = tecnologia;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

//Gera uma String em que cada atributo gera o par: ‘nome do atributo : valor’, se há mais de um atributo, cada par é separado por “;”
	@Override
	public String geraDescricao(){
		String descricao = super.toString()+ " ; Tecnologia " + tecnologia;
		return descricao;
	}			

//Retorna o valor do preço do eletrônico que é o valor base com acréscimo dependendo do tipo do eletrônico			
	@Override
	public double calculaPreco() {
		String tecnologia = getTecnologia();
		double preco = valorBase;
		double acrescimo = 0;
			if(tecnologia.equals("Jato de Tinta")){
				 acrescimo = this.valorBase * 0.05;
			}
			if(tecnologia.equals("Laser")){
				 acrescimo = this.valorBase * 0.1;
			}
			if(tecnologia.equals("Termica")){
				 acrescimo = this.valorBase * 0.15;
			}
			System.out.println("Total = " + (valorBase+acrescimo));
			return preco;
	}
}
