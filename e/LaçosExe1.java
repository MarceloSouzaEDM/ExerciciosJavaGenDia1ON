package Turma15;

import java.util.Scanner;

public class La�osExe1 {
	public static void main (String args[])
	{
		try(Scanner ler = new Scanner (System.in)){
			int A, B, C;
			System.out.println("Digite um n�mero: ");
			A = ler.nextInt();
			System.out.println("Digite um n�mero: ");
			B = ler.nextInt();
			System.out.println("Digite um n�mero: ");
			C = ler.nextInt();
			if(A > B && A > C) {
				System.out.println("O Maior � o n�mero: " + A);
				
			}else if(B > A && B > C){
				System.out.println("O Maior � o n�mero: " + B);
				
			}else{
				System.out.println("O Maior � o n�mero: " + C);
			}
		}
	}

}
