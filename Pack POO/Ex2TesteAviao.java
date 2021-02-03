package POOJava;


	public class Ex2TesteAviao {
		public static void main(String[] args) {
			
			Ex2Aviao aviao1 = new Ex2Aviao("Boing", 120, "a França", 3000);
			
			aviao1.imprimirinfo();
			
			System.out.println("\n**************************************************");
			System.out.println("Devido a pandemia, as passagens sofreram uma queda nos preços!");
			System.out.println("Venha conferir os descontos de até 50%");
			System.out.println("**************************************************\n");
			
			aviao1.diminuirprecopassagem(30);
			aviao1.imprimirinfo();
			System.out.println("Desconto de 30% nesta passagem! Aproveite!");
		}
	

			

	}



