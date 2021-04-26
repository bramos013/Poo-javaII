public class Armazenamento extends Eletronico {

	private int espaco;

//Construtor Armazenamento
	public Armazenamento(String nome, int codigo, double valorBase,int espaco){
		super(nome,codigo,valorBase);
		this.espaco = espaco;
	}

//Gera uma String em que cada atributo gera o par: ‘nome do atributo : valor’, se há mais de um atributo, cada par é separado por “;”	
	@Override
	public String geraDescricao(){
		String descricao = super.toString()+ " ; Espaço: " + espaco +"GB";
		System.out.println(descricao);		
		return descricao;
	}			

//Retorna o valor do preço do eletrônico que é o valor base com acréscimo dependendo do tipo do eletrônico			
	@Override
	public double calculaPreco() {
		int espaco = this.espaco;
		double preco = valorBase;
		double acrescimo = espaco * 0.01;
		
		System.out.println("Total = " + (valorBase+acrescimo));
			return preco;
	}

	@Override
	public String toString(){
		return super.toString() +
				"; Espaço: " + espaco + "GB";
	}
}
