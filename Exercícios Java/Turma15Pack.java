package Turma15;

import java.util.Scanner;

public class Turma15Pack {
     public static void main(String args[])
     {
	 try (Scanner ler = new Scanner(System.in)) {
		int meses, dias, anos, totaldias;
		 System.out.println("Entre com o n�mero de dias: ");
		 totaldias = ler.nextInt();
		 anos = totaldias/365;
		 meses = totaldias%365/30;
		 dias = totaldias%365%30;
		 System.out.println("Voc� tem " + anos + " anos " + meses + " meses " + dias + " dias de vida.");
	}
     }
}
