package POOJava;

public class Cliente {
	private String nome;
	private String endereco;
	private String idade;
	private String item;
	
	public Cliente (String nome, String endereco, String idade, String item)
	{
		this.nome=nome;
		this.endereco=endereco;
		this.idade=idade;
		this.item=item;
	}
	public void imprimirInfo() {
		System.out.println("Nome do cliente é "+ nome+ " mora no endereço " + endereco + " tem "+ idade +" anos de idade e comprou um "+ item + ".");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
}
