package Turma15;

import java.util.Scanner;

public class La�oForExe2 {
	public static void main (String args[])
	{
		try(Scanner ler = new Scanner(System.in)){
		int x=0, y,somapar=0, somaimpar=0;
		for(x=0;x<=9;x++) {
			System.out.println("Digite um n�mero: ");
			y = ler.nextInt(); 	
			if(y%2==0) {
				somapar++;
			}else {
				somaimpar++;
			}
		}
		System.out.println("Quantidade de n�meros pares: " + somapar);
		System.out.println("Quantidade de n�meros impares: " + somaimpar);
	}

}
}
