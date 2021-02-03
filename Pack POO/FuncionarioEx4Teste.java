package POOJava;

import java.util.Scanner;

public class FuncionarioEx4Teste {

	public static void main(String[] args) {
		String nome = null, funcao = null;
		int idade;
		double horastrab=0, salario=0,  horaex=0;
		try (Scanner leia = new Scanner (System.in)){
				
		System.out.println("Quantos funcionários pediram a folha salárial?");
		int N = leia.nextInt();
				
		FuncionarioEx4[] obj  = new  FuncionarioEx4[N];
		
		for (int x=0;x<N;x++) {
			
			System.out.println("Digite seu nome");
			nome = leia.next();
			System.out.println("Digite sua função");
			funcao = leia.next();
			System.out.println("Digite sua idade");
			idade = leia.nextInt();
			System.out.println("Quantas horas você trabalhou este mês?");
			horastrab = leia.nextDouble();
			
		if(horastrab>50) {
			horaex=(horastrab-50)*20;
			salario=(horastrab*50)+horaex;
			
		}else {
			horaex=0;
			salario=horastrab*50;
		}

			
			obj[x] = new FuncionarioEx4 (nome,funcao,idade,horastrab,horaex, salario);				
		}
		
		for (int x=0;x<N;x++) {
			
			obj[x].imprimirTrab();
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		}


	}catch(Exception e) {
		System.out.println("Erro: "+ e + " programa encerrado!");
	}

}
}
