public class Impressora extends Eletronico {

	private String tecnologia;

	//Construtor Impressora
	public Impressora(String nome, int codigo, double valorBase,double espaco, String tecnologia){
		super(nome,codigo,valorBase);
		this.tecnologia = tecnologia;
}
