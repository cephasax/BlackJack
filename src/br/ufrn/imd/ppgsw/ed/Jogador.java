package br.ufrn.imd.ppgsw.ed;

import java.util.ArrayList;

public class Jogador {

	private int id;
	private String nome;
	private ArrayList<Carta> mao;
	private int pontos;
	
	public Jogador(){
		this.pontos = 0;
		this.id = (int) System.currentTimeMillis() % 1000;
		this.mao = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta carta){
		this.pontos += carta.getValor();
		this.mao.add(carta);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	public void setMao(ArrayList<Carta> mao) {
		this.mao = mao;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
}
