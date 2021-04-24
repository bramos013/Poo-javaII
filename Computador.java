public class Computador extends Eletronico {

	private String tipo;

//Construtor Computador
	public Computador(String nome, int codigo, double valorBase, String tipo) {			
		super(nome,codigo,valorBase);
		this.tipo = tipo;		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

//Gera uma String em que cada atributo gera o par: ‘nome do atributo : valor’, se há mais de um atributo, cada par é separado por “;”
	@Override
	public String geraDescricao(){
		String descricao = super.toString()+ " ; Tipo " + tipo;
		return descricao;
	}			

//Retorna o valor do preço do eletrônico que é o valor base com acréscimo dependendo do tipo do eletrônico		
	@Override
	public double calculaPreco(){
	String tipo = this.tipo;
	double preco = valorBase;
	double acrescimo = 0;
		if(tipo.equals("Desktop")){
			 acrescimo = this.valorBase * 0.1;
		}
		if(tipo.equals("Notebook")){
			 acrescimo = this.valorBase * 0.15;
		}
		if(tipo.equals("Servidor")){
			 acrescimo = this.valorBase * 0.2;
		}
		System.out.println("Total = " + (valorBase+acrescimo));
		return preco;
	}
}
