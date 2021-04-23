public class Armazenamento extends Eletronico {

	private double espaco;

	//Construtor Armazenamento
	public Armazenamento(String nome, int codigo, double valorBase,double espaco){
		super(nome,codigo,valorBase);
		this.espaco = espaco;
	}

	@Override
	public String toString(){
			return super.toString();
	}
}
