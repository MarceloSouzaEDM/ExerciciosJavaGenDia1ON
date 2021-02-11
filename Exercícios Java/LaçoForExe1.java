package Turma15;


public class LaçoForExe1 {
	public static void main (String args[])
	{
		int x;
		for(x=1000;x<=1999;x++) {
			if(x%11==5) {
				System.out.println("Os que restam 5 quando divididos por 11: " + x);
			}
		}
	}

}
