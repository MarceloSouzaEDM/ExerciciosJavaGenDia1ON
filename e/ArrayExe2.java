package Turma15;


import java.util.Scanner;

public class ArrayExe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = new int[3][3],i,j,somamat=0,somadiagonal=0;
		
		try(Scanner ler = new Scanner(System.in)){
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.printf("\nEntre com o valor da Matriz [%d] [%d]: ",(i+1),(j+1));
				mat[i][j] = ler.nextInt();
				
				somamat = somamat + mat[i][j];
				
				if(i==j)
				{
					somadiagonal = somadiagonal + mat[i][j];
				}
			}
			
		}
		System.out.println("\nO valor do somatório total: "+somamat);
		System.out.println("\nO valor do somatório da diagonal: "+somadiagonal);
	}

}
}