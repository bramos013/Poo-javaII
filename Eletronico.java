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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void mostrarNome() {
        System.out.println("Nome: " + nome + ", Codigo: " + codigo);
    } 

//Gera uma String em que cada atributo gera o par: ‘nome do atributo : valor’, se há mais de um atributo, cada par é separado por “;”
	public abstract String geraDescricao();

//Retorna o valor do preço do eletrônico que é o valor base com acréscimo dependendo do tipo do eletrônico			
	public abstract double calculaPreco();
	
	public String toString(){
		return 
		" Nome: " + nome +
		" ; Codigo: " + codigo +
		" ; Valor Base: " + valorBase;
	}
}
