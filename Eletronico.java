public abstract class Eletronico {

	protected String nome;

	protected int codigo;

	protected double valorBase;

	protected String tipo;

	//Contrutor  de Eletronico
	public Eletronico(String nome, int codigo, double valorBase) {
		this.nome = nome;
		this.codigo = codigo;
		this.valorBase = valorBase;
	}

	public String getNome(){
		return nome;
	}

	public int getCodigo(){
		return codigo;
	}

	public double getValorBase(){
		return valorBase;
	}
	
	public String getTipo(){
		return tipo;
	}

	public void mostrarNome() {
        System.out.println("Nome: " + nome + ", Codigo: " + codigo);
    } 
//	public abstract String geraDescricao();

//	public abstract double calculaPreco();
	
	public String toString(){
		return 
		" Nome: " + nome +
		" Codigo: " + codigo +
		" Valor Base: " + valorBase;
	}
}
