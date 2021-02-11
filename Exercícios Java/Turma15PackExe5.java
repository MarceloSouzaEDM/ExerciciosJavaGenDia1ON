package Turma15;

import java.util.Scanner;

public class Turma15PackExe5 {
	public static void main(String args[])
	{
		try(Scanner ler = new Scanner (System.in)){
			int nota1, nota2, nota3, media;
			System.out.println("Entre com a primeira nota: ");
			nota1 = ler.nextInt();
			System.out.println("Entre com a segunda nota: ");
			nota2 = ler.nextInt();
			System.out.println("Entre com a terceira nota: ");
			nota3 = ler.nextInt();
			media = (nota1*2 + nota2*3 + nota3*5)/10;
			System.out.println("Sua média é: " + media);
		}
	}

}
