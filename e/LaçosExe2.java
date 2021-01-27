package Turma15;

import java.util.Scanner;

public class LaçosExe2 {
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
			if(A < B && B < C){
				System.out.println("Ordem do menor para o maior: " + A  + "," + B + "," +  C);
			}else if(B < A && A < C){
				System.out.println("Ordem do menor para o maior: " + B + "," + A + "," +  C);
		    }else if(C < A && A < B){
			    System.out.println("Ordem do menor para o maior: " + C  + "," + A + "," +  B);
	        }else if(A < C && C < B){
		        System.out.println("Ordem do menor para o maior: " + A  + "," + C + "," +  B);
            }else if(B < C && C < A){
                System.out.println("Ordem do menor para o maior: " + B + "," + C + "," +  A);
	        }else{
                System.out.println("Ordem do menor para o maior: " + C  + "," + B + "," +  A);

}
}	
}
}