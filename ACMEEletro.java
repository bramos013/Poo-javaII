import java.util.Scanner;
public class ACMEEletro {
	Estoque estoque = new Estoque();
	
	public void inicializa() {
		
		Eletronico eletroUm = new Computador("Desktop Lenovo", 1, 1000, "Desktop");
		Eletronico eletroDois = new Computador("Notebook Samgung", 2, 1000, "Notebook");
		Eletronico eletroTres = new Computador("Servidor Dell", 3, 1000, "Servidor");
		Eletronico eletroQuatro = new Armazenamento("HD Externo ", 4, 0.5, 1000);
		Eletronico eletroCinco = new Armazenamento("SSD", 5, 0.5, 240);
		Eletronico eletroSeis = new Armazenamento("HD", 6, 0.5, 500);
		Eletronico eletroSete = new Impressora("Impressora HP", 7, 1000, "Jato de Tinta");
		Eletronico eletroOito = new Impressora("Impressora Epson", 8, 1000, "Termica");
		Eletronico eletroNove = new Impressora("Impressora Samsung", 9, 1000, "Laser");
	
		estoque.cadastra(eletroUm);	estoque.cadastra(eletroDois);	estoque.cadastra(eletroTres); 
		estoque.cadastra(eletroQuatro);	estoque.cadastra(eletroCinco); estoque.cadastra(eletroSeis); 
		estoque.cadastra(eletroSete); estoque.cadastra(eletroOito);	 estoque.cadastra(eletroNove);
		executa();
	}

	public void executa() {
		Scanner menu = new Scanner(System.in);
		Scanner subMenu = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
        boolean continua = true;
            while(continua){

            System.out.println("\t\nO que você deseja fazer?");
            System.out.println("\t1 - Cadastrar Eletronico");
            System.out.println("\t2 - Mostrar todas as informações do Estoque");
			System.out.println("\t3 - Pesquisar Eletrônico por Nome");
			System.out.println("\t4 - Calcular Preço");
            System.out.println("\t5 - Sair");

            int opt = menu.nextInt();
            switch (opt) {
				case 1: //Opção de Escolha Cadastrar
					System.out.println("Selecione o Tipo do Eletronico: ");
						System.out.println("\t1 - Armazenamento");
						System.out.println("\t2 - Computador");
						System.out.println("\t3 - Impressora");                      
						System.out.println("\t4 - Sair");   
					
					int opt2 = subMenu.nextInt();
					switch(opt2){
						case 1: //Opção de Cadastro Armazenamento
							System.out.println("Nome do Dispositivo de Armazenamento: ");
								String nomeArmazenamento = scan.nextLine();
							System.out.println("Código do Produto: ");
								int codigoArmazenamento = scan.nextInt();
							System.out.println("Valor Base do Produto: ");
								double valorBaseArmazenamento = scan.nextDouble();
							System.out.println("Espaco de Armazenamento: ");
								int espaco = scan.nextInt();								
							Eletronico novoArmazenamento = new Armazenamento(nomeArmazenamento, codigoArmazenamento, valorBaseArmazenamento, espaco);
								estoque.cadastra(novoArmazenamento);
					break;	
						case 2:	//Opção de Cadastro Computador
							System.out.println("Nome do Computador: ");
								String nomeComputador = scan.nextLine();
							System.out.println("Código do Produto: ");
								int codigoComputador = scan.nextInt();
							System.out.println("Valor Base do Produto: ");
								double valorBaseComputador = scan.nextDouble();
							System.out.println("Tipo de Computador: ");
								String tipo = scan.nextLine();								
							Eletronico novoComputador = new Computador(nomeComputador, codigoComputador, valorBaseComputador, tipo);
								estoque.cadastra(novoComputador);
					break;
						case 3: //Opção de Cadastro Impressora
						System.out.println("Nome da Impressora: ");
							String nomeImpressora = scan.nextLine();
						System.out.println("Código do Produto: ");
							int codigoImpressora = scan.nextInt();
						System.out.println("Valor Base do Produto: ");
							double valorBaseImpressora = scan.nextDouble();
						System.out.println("Tecnologia de impressão: ");
							String tecnologia = scan.nextLine();								
						Eletronico novaImpressora = new Impressora(nomeImpressora, codigoImpressora, valorBaseImpressora, tecnologia);
							estoque.cadastra(novaImpressora);
					break;		
						case 4: //Opção Sair
							continua = false;
					break;
					}    				
				case 2: //Opção Para Mostrar todas as informações do Estoque
							estoque.buscaTudo();
					break;
				case 3:	//Opção Para Pesquisa por nome
						
					break;

				case 4: //Opção Para Calculo de Preco
						System.out.println("Informe o Código do Produto");
							int codigoProduto = scan.nextInt();
							System.out.println("Valor do Eletrônico R$ " + codigoProduto);						
						//System.out.println("Valor Final = " + precoFinal);
					break;
				case 5:  //Sair
					System.out.println("Que a força esteja com você jovem Padawan, Até logo!\n ");
					continua = false;
				break;					
				}		
		}
	}
}