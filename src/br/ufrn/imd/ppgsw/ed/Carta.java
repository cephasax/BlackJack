package br.ufrn.imd.ppgsw.ed;

public class Carta {

	private String naipe;
	private String nome;
	private int valor;
	
	public Carta(String nome, String naipe, int valor){
		this.naipe = naipe;
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNaipe() {
		return naipe;
	}
	
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
}
