package Turma15;

import java.util.Scanner;

public class Turma15PackExe4 {
	public static void main(String args[])
	{
		try(Scanner ler = new Scanner (System.in)){
			int a, b, c, d, r, s;
			System.out.println("Entre com um n�mero: ");
			a = ler.nextInt();
			System.out.println("Entre com um n�mero: ");
			b = ler.nextInt();
			System.out.println("Entre com um n�mero: ");
			c = ler.nextInt();
			r = (a + b)*2;
			s = (b + c)*2;
			d = (r + s)/2;
			System.out.println("O resultado da express�o �: " + d);
		}
	}

}
