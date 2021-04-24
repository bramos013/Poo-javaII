import java.util.List;
import java.util.ArrayList;

public class Estoque {

	private List<Eletronico> estoqueDeEletronicos = new ArrayList<>();

//Classe Teste do Estoque    
 	public void listarEstoque(){
	for(Eletronico eletro : estoqueDeEletronicos){
		System.out.println(eletro.toString());
	}
}

//adiciona um novo eletrônico no estoque (não pode haver dois eletrônicos com mesmo código. 
//Retorna true se o eletrônico foi adicionado. Retorna false se o eletrônico não foi adicionado.    OK//
	public boolean cadastra(Eletronico novoEletro){
		for(Eletronico eletro : estoqueDeEletronicos){			
			if(eletro.getCodigo() == novoEletro.getCodigo()){
				return false;
			}
		}
		estoqueDeEletronicos.add(novoEletro);
			return true;					
	}

//Retorna todos os eletrônicos com o nome indicado, ou null se nenhum eletrônico foi encontrado.   OK//
	public String busca(String nome) {
		String res = "X";
			for(Eletronico eletro : estoqueDeEletronicos){
				if(eletro.getNome().equals(nome))
					eletro.mostrarNome();
			}
		return res;
	}

//Retorna a descrição de todos os eletrônicos cadastrados, com os respectivos preços. Falta Finalizar//
	public String buscaTudo() {
		String estoque = null;
		for(Eletronico eletro : estoqueDeEletronicos){
			System.out.println(eletro.toString());
		}
			return estoque;
	}

//Retorna o preço do eletrônico com o codigo indicado, ou -1.0 se nenhum eletrônico foi encontrado. OK//
	public double pesquisaPreco(int codigo) {
		double preco = -1.0;
			for(Eletronico eletro : estoqueDeEletronicos){
                if(eletro.getCodigo() == codigo)
					preco = eletro.getValorBase();                                            									
			}
		System.out.println("Valor do Eletrônico R$ " + preco);
			return preco;
	}
	
}
