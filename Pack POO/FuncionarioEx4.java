package POOJava;

public class FuncionarioEx4 {
	private String nome, funcao;
	private int idade;
	private double salario, horaex, horastrab;
	
	public FuncionarioEx4(String nome, String funcao,int idade, double horastrab,double horaex,double salario) {
		this.funcao=funcao;
		this.horaex=horaex;
		this.horastrab=horastrab;
		this.idade=idade;
		this.nome=nome;
		this.salario=salario;
	}
	public void imprimirTrab() {
		System.out.println("Nome do funcionário: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Função: "+funcao);
		System.out.println("Horas trabalhadas este mês: "+horastrab);
		System.out.println("Horas Extras: "+horaex);
		System.out.println("Salário total este mês é de: "+salario);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getHoraex() {
		return horaex;
	}
	public void setHoraex(double horaex) {
		this.horaex = horaex;
	}
	public double getHorastrab() {
		return horastrab;
	}
	public void setHorastrab(double horastrab) {
		this.horastrab = horastrab;
	}
	

}
