import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		Eletronico eletroUm = new Computador("Computador 2", 1, 0.5, "Desktop");
		Eletronico eletroDois = new Computador("Computador 1", 2, 0.5, "Desktop");
		Eletronico eletroTres = new Computador("Computador 2", 3, 0.5, "Desktop");
		Eletronico eletroQuatro = new Armazenamento("HD Externo ", 500, 0.5, 1000);
		Eletronico eletroCinco = new Armazenamento("SSD", 600, 0.5, 240);

		estoque.cadastra(eletroUm);
		estoque.cadastra(eletroDois);
		estoque.cadastra(eletroTres);
		estoque.cadastra(eletroQuatro);
		estoque.cadastra(eletroCinco);
		//estoque.listarEstoque();

	 	estoque.busca("Computador 2");
		estoque.busca("Computador 1");
		estoque.busca("SSD");
		estoque.busca("HD Externo ");
		estoque.pesquisaPreco(2);
		estoque.pesquisaPreco(30);
		
		
		
	}

}
