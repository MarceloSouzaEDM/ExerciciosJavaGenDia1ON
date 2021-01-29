package Turma15;

import java.util.Scanner;

public class ArrayExe1 {
	public static void main (String args[])
	{
		try(Scanner ler = new Scanner(System.in)){
			double vet[] = new double[5];
			for(int i=0; i<5; i++) {
				System.out.println("Digite sua pontuação: ");
				vet[i] = ler.nextDouble();
			}
			double maior = vet[0], menor = vet[0];
			for(int i=0; i<5; i++) {
				if(vet[i] < menor) {
					menor = vet[i];
				}
				if(vet[i] > maior) {
					maior = vet[i];
				}
			}
			for(int i=0; i<5; i++) {
				if(vet[i]==menor) {
					menor=vet[i];
					System.out.printf("%.2f Menor\n", menor);
				}
				else if(vet[i] == maior) {
					maior=vet[i];
					System.out.printf("%.2f Maior\n", maior);
				}else {
					System.out.println(vet[i]);
				}
			}
		}
	}

}
