package Turma15;

import java.util.Scanner;

public class Projetin1 {

	public static void main(String args[]) {

		String produto[][] = new String[5][3];
		int carrinho[] = new int[5];

		produto[0][0] = "Arroz";
		produto[0][1] = "1";
		produto[0][2] = "50.00";

		produto[1][0] = "Feijão";
		produto[1][1] = "1";
		produto[1][2] = "25.00";

		produto[2][0] = "Farinha";
		produto[2][1] = "1";
		produto[2][2] = "3.50";

		produto[3][0] = "Açúcar";
		produto[3][1] = "1";
		produto[3][2] = "5.00";

		produto[4][0] = "Macarrão";
		produto[4][1] = "1";
		produto[4][2] = "6.20";

		try (Scanner ler = new Scanner(System.in)) {
			float valorTotal = 0;
			int entrada;
			entrada = 0;
			while (entrada != 9) {
				System.out.println("Lista de comandos:\n\t1 - Digite '1' para ver a lista de produtos\n\t"
						+ "2 - Digite '2' para adicionar produtos ao carrinho\n\t"
						+ "9 - Digite '9' para sair do programa");

				System.out.println("Escolha sua opção");
				entrada = ler.nextInt();
				switch (entrada) {
				case 1:
					for (int linha = 0; linha < 5; linha++) {
						System.out.print(linha + " - ");
						for (int coluna = 0; coluna < 3; coluna++) {
							System.out.print(produto[linha][coluna] + "\t");
						}
						System.out.println();

					}
					break;
				case 2:
					char continua;
					int qnt_estoque;
					do {
						System.out.println("Escolha um produto");
						for (int linha = 0; linha < 5; linha++) {
							System.out.print(linha + " - ");
							for (int coluna = 0; coluna < 3; coluna++) {
								System.out.print(produto[linha][coluna] + "\t");
							}
							System.out.println();

						}
						int opcao = ler.nextInt();
						while (opcao < 0 || opcao > 4) {
							System.out.println("Escolha uma opção válida: ");
							opcao = ler.nextInt();
						}
						qnt_estoque= Integer.parseInt(produto[opcao][1]) - 1;
						if(qnt_estoque<0) {
							System.out.println("Produto em falta no estoque!");
						}else {
							System.out.println("Produto escolhido: " + produto[opcao][0]);
							valorTotal += Float.parseFloat(produto[opcao][2]);
							carrinho[opcao]++;
							produto[opcao][1]= String.valueOf(qnt_estoque);
						}
						
						System.out.println("Deseja adicionar mais produtos? < S/N >");
						continua = ler.next().charAt(0);
					}
					while(continua=='S' || continua=='s');
				
					break;

				case 9:
					System.out.println("Valor total de sua compra: " + valorTotal);
					for (int i = 0; i < 5; i++) {
						if (carrinho[i] != 0) {
							System.out.println("Voce comprou " + carrinho[i] + " unidades de " + produto[i][0]);
						}
					}
					System.out.println("Programa encerrado!");
					break;
				default:
					System.out.println("Voce digitou um número invalido!");
					break;

				}

			}

		}catch(Exception e) {
			System.out.println("Erro: "+ e + " programa encerrado!");
		}

	}
}