package Polimorfismo;

public class Pregui�a extends Animal{
	
	private String tamanho;
	
	public Pregui�a(String nome, int idade, String tamanho) {
		super(nome,idade);
		this.tamanho=tamanho;
	}
	@Override
	public void emitirSom() {
		System.out.println("ZzzzZZzzzZZzZzZzZzZzZzZ");
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public void subir() {
		System.out.println("Sobe em altas e grandes �rvores");
	}
	
}
	