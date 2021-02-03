package POOJava;


	import java.text.NumberFormat;

	public class Ex2Aviao {
		
		private String modelo;
		private int numassentos;
		private String destino;
		private double precopassagem;
		
		
		public Ex2Aviao(String modelo, int numassentos, String destino, double precopassagem)
		{
			this.modelo = modelo;
			this.numassentos = numassentos;
			this.destino = destino;
			this.precopassagem = precopassagem;
			
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getNumassentos() {
			return numassentos;
		}

		public void setNumassentos(int numassentos) {
			this.numassentos = numassentos;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public double getPrecopassagem() {
			return precopassagem;
		}

		public void setPrecopassagem(double precopassagem) {
			this.precopassagem = precopassagem;
		}
		
		public void diminuirprecopassagem(double percentual)
		{
			precopassagem *= 1 - (percentual / 100);
		}
		
		public String formatarMoeda()
		{
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(precopassagem);
			return formatoMoeda;
		}
		
		public void imprimirinfo() {
			System.out.println("O avião " +modelo+ " está com um número de " +numassentos+ " assentos "
					+ "e tem como destino " +destino+ ", \ncom a passagem custando  " +this.formatarMoeda());

		}

}
