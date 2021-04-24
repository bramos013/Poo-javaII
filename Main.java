public class Main {

	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		Eletronico eletroUm = new Computador("Desktop Lenovo", 1, 1000, "Desktop");
		Eletronico eletroDois = new Computador("Notebook Samgung", 2, 1000, "Notebook");
		Eletronico eletroTres = new Computador("Servidor Dell", 3, 1000, "Servidor");
		Eletronico eletroQuatro = new Armazenamento("HD Externo ", 4, 0.5, 1000);
		Eletronico eletroCinco = new Armazenamento("SSD", 5, 0.5, 240);
		Eletronico eletroSeis = new Armazenamento("HD", 6, 0.5, 500);
		Eletronico eletroSete = new Impressora("Impressora HP", 7, 1000, "Jato de Tinta");
		Eletronico eletroOito = new Impressora("Impressora Epson", 8, 1000, "Termica");
		Eletronico eletroNove = new Impressora("Impressora Samsung", 9, 1000, "Laser");
		//Teste Cadastro
		estoque.cadastra(eletroUm);
		estoque.cadastra(eletroDois);
		estoque.cadastra(eletroTres);
		estoque.cadastra(eletroQuatro);
		estoque.cadastra(eletroCinco);
		estoque.cadastra(eletroSeis);
		estoque.cadastra(eletroSete);
		estoque.cadastra(eletroOito);
		estoque.cadastra(eletroNove);
/*
		//Teste Busca
	 	estoque.busca("Computador 2");
		estoque.busca("Computador 1");
		estoque.busca("SSD");
		estoque.busca("HD Externo ");
*/
/*		
		//Teste Pesquisa Preco
		estoque.pesquisaPreco(1);
		estoque.pesquisaPreco(2);
*/

		eletroUm.calculaPreco();	
		eletroDois.calculaPreco();
		eletroTres.calculaPreco();
		eletroQuatro.calculaPreco();
		eletroCinco.calculaPreco();
		eletroSeis.calculaPreco();
		eletroSete.calculaPreco();
		eletroOito.calculaPreco();
		eletroNove.calculaPreco();

		System.out.println(eletroUm.geraDescricao());
		System.out.println(eletroDois.geraDescricao());
		System.out.println(eletroTres.geraDescricao());
		System.out.println(eletroQuatro.geraDescricao());
		System.out.println(eletroCinco.geraDescricao());
		System.out.println(eletroSeis.geraDescricao());
		System.out.println(eletroSete.geraDescricao());
		System.out.println(eletroOito.geraDescricao());
		System.out.println(eletroNove.geraDescricao());

		
	}

}
