package Polimorfismo;

public class AnimalTeste {
	public static void main(String args[]) {
		
		Cachorro cachorro = new Cachorro("Flash",4, "Vira-Lata");
		Cavalo cavalo = new Cavalo("P� de Pano",15, "Branco");
		Pregui�a preguica = new Pregui�a("Mateus", 21, "1,50cm");

	
	System.out.println("Esse � o meu cachorro e o nome dele �: "+cachorro.getNome() 
			+". Ele tem "+cachorro.getIdade()+" de idade e a ra�a dele � a "+cachorro.getRaca());
	cachorro.correr();
	cachorro.emitirSom();
	
	System.out.println("----------------------------------------------------------------");
	
	System.out.println("Esse � o meu cavalo e o nome dele �: "+cavalo.getNome() 
	+". Ele tem "+cavalo.getIdade()+" de idade e a cor dele � a "+cavalo.getCor());
	cavalo.correr();
	cavalo.emitirSom();
	
	System.out.println("----------------------------------------------------------------");
	
	System.out.println("Essa � o minha pregui�a e o nome dela �: "+preguica.getNome() 
	+". Ele tem "+preguica.getIdade()+" de idade e o tamanho dela �  "+preguica.getTamanho());
	preguica.subir();
	preguica.emitirSom();
	
	
	}
	
}
