import java.util.List;
import java.util.ArrayList;

public class Estoque {

	private List<Eletronico> listaDeEletronicos = new ArrayList<>();

//adiciona um novo eletrônico no estoque (não pode haver dois eletrônicos com mesmo código. 
//Retorna true se o eletrônico foi adicionado. Retorna false se o eletrônico não foi adicionado.    Pronta//
	public boolean cadastra(Eletronico novoEletro){
		for(Eletronico eletro : listaDeEletronicos){			
			if(eletro.getCodigo() == novoEletro.getCodigo()){
				return false;
			}
		}
		listaDeEletronicos.add(novoEletro);
			return true;					
	}

//Retorna todos os eletrônicos com o nome indicado, ou null se nenhum eletrônico foi encontrado.   Pronta//
		public String busca(String nome) {
			String res = null;
				for(Eletronico eletro : listaDeEletronicos){
					if(eletro.getNome().equals(nome)){
						res =eletro.geraDescricao();											
					}
				}
		return res;
		}

//Retorna a descrição de todos os eletrônicos cadastrados, com os respectivos preços. Pronta//
public String buscaTudo() {
	String estoque = null;
	for(Eletronico eletro : listaDeEletronicos){
		System.out.println(eletro.toString());
	}
		return estoque;
}

//Retorna o preço do eletrônico com o codigo indicado, ou -1.0 se nenhum eletrônico foi encontrado. Pronto//
	public double pesquisaPreco(int codigo) {
		double preco = -1.0;
			for(Eletronico eletro : listaDeEletronicos){
                if(eletro.getCodigo() == codigo)
					preco = eletro.getValorBase();                                            									
			}		
			return preco;
	}
}
