package Polimorfismo;

public class AnimalTeste {
	public static void main(String args[]) {
		
		Cachorro cachorro = new Cachorro("Flash",4, "Vira-Lata");
		Cavalo cavalo = new Cavalo("Pé de Pano",15, "Branco");
		Preguiça preguica = new Preguiça("Mateus", 21, "1,50cm");

	
	System.out.println("Esse é o meu cachorro e o nome dele é: "+cachorro.getNome() 
			+". Ele tem "+cachorro.getIdade()+" de idade e a raça dele é a "+cachorro.getRaca());
	cachorro.correr();
	cachorro.emitirSom();
	
	System.out.println("----------------------------------------------------------------");
	
	System.out.println("Esse é o meu cavalo e o nome dele é: "+cavalo.getNome() 
	+". Ele tem "+cavalo.getIdade()+" de idade e a cor dele é a "+cavalo.getCor());
	cavalo.correr();
	cavalo.emitirSom();
	
	System.out.println("----------------------------------------------------------------");
	
	System.out.println("Essa é o minha preguiça e o nome dela é: "+preguica.getNome() 
	+". Ele tem "+preguica.getIdade()+" de idade e o tamanho dela é  "+preguica.getTamanho());
	preguica.subir();
	preguica.emitirSom();
	
	
	}
	
}
