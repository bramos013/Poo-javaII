import java.util.List;
import java.util.ArrayList;

public class Estoque {

	private List<Eletronico> estoqueDeEletronicos = new ArrayList<>();

	//Classe Responsável pelo cadastro de Eletronicos no Estoque    OK//
	public boolean cadastra(Eletronico novoEletro){
		for(Eletronico eletro : estoqueDeEletronicos){			
			if(eletro.getCodigo() == novoEletro.getCodigo()){
				return false;
			}
		}
		estoqueDeEletronicos.add(novoEletro);
			return true;					
	}

  //Classe Teste do Estoque    
	public void listarEstoque(){
		for(Eletronico eletro : estoqueDeEletronicos){
			System.out.println(eletro.toString());
		}
	}

//	Classe pesquisar Estoque por nome do Eletrônico   OK//
	public String busca(String nome) {
		String res = "X";
			for(Eletronico eletro : estoqueDeEletronicos){
				if(eletro.getNome().equals(nome))
					eletro.mostrarNome();
			}
		return res;
	}

/*
	public String buscaTudo() {
		return null;
	}
*/
	//Método de pesquisa de preço através do Código  OK//
	public double pesquisaPreco(int codigo) {
		double preco = -1.0;
			for(Eletronico eletro : estoqueDeEletronicos){
                if(eletro.getCodigo() == codigo)
					preco = eletro.getValorBase();                                            									
			}
		System.out.printf("Valor do Eletrônico R$ %.2f\n",preco);
			return preco;
	}
	
}
