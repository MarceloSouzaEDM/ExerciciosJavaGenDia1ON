package Turma15;

import java.util.Scanner;

public class La�osWhileExe2 {
	public static void main (String args[])
	{
		try(Scanner ler = new Scanner (System.in))
		{
			int i=0, sex=0, id=1, op=0, fem=0, out=0, calm=0, nerv=0, agres=0, pes=0;
			while(id < 9 && id > 0){
				System.out.println("Digite a sua idade: ");
				i = ler.nextInt();
				System.out.println("\nDigite a op��o equivalente ao seu sexo?");
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
					System.out.println("Op��o digitada � inv�lida!!!");
				}

				System.out.println("\nDigite a op��o na qual voc� se enquadra:");
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
					System.out.println("Op��o inv�lida!");
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
			
			System.out.println("O n�mero de pessoas calmas �: "+ calm + "\n");
			System.out.println("O n�mero de mulheres nervosas �: " + fem+ "\n");
			System.out.println("O n�mero de homens agressivos �: "+ agres + "\n");
			System.out.println("O n�mero de Outros calmos: "+ out+ "\n");
			System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: "+ nerv+ "\n");
			System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: "+ pes+ "\n");
		}
	}




}