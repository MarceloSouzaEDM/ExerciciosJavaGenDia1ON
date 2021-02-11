package Turma15;

import java.util.Scanner;

public class LaçosWhile1 {
	public static void main (String args[]) 
	{
		try(Scanner ler = new Scanner (System.in)){
			int idade, maisvelhos=0, maisnovos=0;
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			while(idade != -99)
			{
				if(idade <= 21)
				{
					maisnovos++;
				}
				else if(idade >= 50)
				{
					maisvelhos++;
				}
				System.out.println("Digite sua idade: ");
				idade = ler.nextInt();
			}
			System.out.println("Quantidade de pessoas com idade acima de 50 anos: " + maisvelhos);
			System.out.println("Quantidade de pessoas com idade abaixo de 21 anos: " + maisnovos);
		}
	}

}
