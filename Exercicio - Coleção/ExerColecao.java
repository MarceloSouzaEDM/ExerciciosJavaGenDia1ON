package POOJava;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class ExerColecao {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner ler = new Scanner(System.in);
			char opcao;
			String tabela[][] = new String[3][2];
			int i,j;
			
			tabela[0][0] = "Nome";
			tabela[0][1] = "              Preço";
			
			tabela[1][0] = "Playstation 5";
			tabela[1][1] = "3000 reais";
			
			tabela[2][0] = "Xbox series x";
			tabela[2][1] = "3000 reais";
			
			System.out.println("Seja bem vinde a nossa loja!!! Temos os seguintes produtos...\n");
			
			
			for(i=0;i<3;i++)
			{
				
				for(j=0;j<2;j++)
				{
					System.out.printf("[%s]",tabela[i][j], "\t");
				}
			System.out.println("\n");
			}	
			
			ArrayList<String> estoque = new ArrayList();
			
			
			do {
				
				System.out.println("\n           Digite uma opção: "           );
				System.out.println("----------------------------------------");
				System.out.println("(a)Deseja adicionar produtos ao estoque\n(b)Deseja remover\n(c)Atualizar\n(d)Mostrar todos os produtos do estoque\n(e)Encerrar programa");
				System.out.println("----------------------------------------");
				opcao= ler.next().charAt(0);
				
				switch(opcao) {
				case 'a':
					ler.nextLine();
					System.out.print("Digite o produto para adicionar ao estoque:");
					String produto = ler.nextLine();
					estoque.add(produto);
					break;
				case 'b':
					ler.nextLine();
					System.out.println("Digite o produto para remover do estoque:");
					String produtor = ler.nextLine();
					if(estoque.contains(produtor))
					{
					estoque.remove(produtor);
					}
					else
					{
						System.out.println("Produto não existe");
					}
					break;
				case 'c':
					ler.nextLine();
					System.out.println("Digite o produto que quer atualizar: ");
					String verifica = ler.nextLine();
					System.out.println("Digite o nome do produto que entrará no lugar de "+verifica+":");
					String novo = ler.nextLine();
					
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("Produto não existe!!!");
					}
					System.out.println(estoque);
					break;
				case 'd':
					System.out.println(" Os produtos  do estoque:");
					System.out.println(estoque);
					break;
				default:
					System.out.println("Tecla inválida digite (e) para sair!!!");
				
				}
			
			}while(opcao!=5);

		}


}
