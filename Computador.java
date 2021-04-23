public class Computador extends Eletronico {

	private String tipo;

	//Construtor Computador
	public Computador(String nome, int codigo, double valorBase, String tipo) {			
		super(nome,codigo,valorBase);
		this.tipo = tipo;		
	}

	public int getCodigo(){
		return codigo;
	}
	
	public double getValorBase(){
		return valorBase;
	}

	//Calcula Preco		
	public double calculaPreco(){
		
		double preco = 0.1;
		return preco;
	}

	@Override
	public String toString(){
		return super.toString();
			
	}
}
