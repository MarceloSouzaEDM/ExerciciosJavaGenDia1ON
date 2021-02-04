package Polimorfismo;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	public abstract void emitirSom();
	
	public String getNome() {
		return nome;
	}
	public void setNome(final String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(final int idade) {
		this.idade = idade;
	}
	

}
