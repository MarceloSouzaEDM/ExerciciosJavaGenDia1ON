package Turma15;

import java.util.Scanner;

public class LaçosExe1 {
	public static void main (String args[])
	{
		try(Scanner ler = new Scanner (System.in)){
			int A, B, C;
			System.out.println("Digite um número: ");
			A = ler.nextInt();
			System.out.println("Digite um número: ");
			B = ler.nextInt();
			System.out.println("Digite um número: ");
			C = ler.nextInt();
			if(A > B && A > C) {
				System.out.println("O Maior é o número: " + A);
				
			}else if(B > A && B > C){
				System.out.println("O Maior é o número: " + B);
				
			}else{
				System.out.println("O Maior é o número: " + C);
			}
		}
	}

}
