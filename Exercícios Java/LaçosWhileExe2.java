package Turma15;

import java.util.Scanner;

public class LaçosWhileExe2 {
	public static void main (String args[])
	{
		try(Scanner ler = new Scanner (System.in))
		{
			int i=0, sex=0, id=1, op=0, fem=0, out=0, calm=0, nerv=0, agres=0, pes=0;
			while(id < 9 && id > 0){
				System.out.println("Digite a sua idade: ");
				i = ler.nextInt();
				System.out.println("\nDigite a opção equivalente ao seu sexo?");
				System.out.println("1- Feminino    2- Masculino    3- Outros");
				sex = ler.nextInt();

				switch(sex){
				case 1: 
					System.out.println("Feminino");
					break;
				case 2: 
					System.out.println("Masculino");
					break;
				case 3: 
					System.out.println("Outros");
					break;
				default:
					System.out.println("Opção digitada é inválida!!!");
				}

				System.out.println("\nDigite a opção na qual você se enquadra:");
				System.out.println("\n1- calma   2- nervosa   3- agressiva\n");
				op= ler.nextInt();

				switch(op){
				case 1: 
					System.out.println("calma");
					break;
				case 2: 
					System.out.println("nervosa");
					break;
				case 3: 
					System.out.println("agressiva");
					break;
					default:
					System.out.println("Opção inválida!");
				}
				if(op==1){
					calm++;
					if(sex == 3 && id<18){
						out++;
						pes++;
					}
					else if(id <18){
						pes++;
					}
					else if(sex == 3){
						out++;
					}
				}
				else if(op == 2){
					if(sex == 1 && id>40){
						fem++;
						nerv++;
					}
					else if(id>40){
						nerv++;
					}
					else if(sex == 1){
						fem++;
					}
				}
				else if(op ==  3 && sex == 2){
					agres++;
				}
				id++;
			}
			
			System.out.println("O número de pessoas calmas é: "+ calm + "\n");
			System.out.println("O número de mulheres nervosas é: " + fem+ "\n");
			System.out.println("O número de homens agressivos é: "+ agres + "\n");
			System.out.println("O número de Outros calmos: "+ out+ "\n");
			System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+ nerv+ "\n");
			System.out.println("O número de pessoas calmas com menos de 18 anos é: "+ pes+ "\n");
		}
	}




}