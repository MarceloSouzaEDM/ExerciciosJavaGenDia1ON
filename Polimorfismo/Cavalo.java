package Polimorfismo;

public class Cavalo extends Animal{
	private String cor;
	
	public Cavalo(String nome, int idade, String cor) {
		super(nome, idade);
		this.cor=cor;
	}
	@Override
	public void emitirSom(){
		System.out.println("Hiii ihihihih");
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void correr() {
		System.out.println("Ele trota e galopa");
	}
	
}
	
