package Turma15;

import java.util.Scanner;

public class Turma15PackExe2 {
	public static void main(String args[])
	{
		try (Scanner ler = new Scanner (System.in)){
			int idade, meses, dias, totaldias;
			System.out.println("Digite sua idade expressa em anos: ");
			idade = ler.nextInt();
			System.out.println("Digite sua idade expressa em meses: ");
			meses = ler.nextInt();
			System.out.println("Digite sua idade expressa em dias: ");
			dias = ler.nextInt();
			totaldias = idade*365 + meses*30 + dias;
			System.out.println("Seu total  de dias é : " + totaldias);
			
			
		}
	}

}
