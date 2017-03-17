package br.ufrn.imd.ppgsw.ed;

import java.util.ArrayList;
import java.util.Collections;

public class Pilha<T> {

	private ArrayList<T> objetos = new ArrayList<T>();
	
	public Pilha(){
		objetos = new ArrayList<T>();
	}
	
	public void inserir(T t){
		this.objetos.add(t);
	}
	
	public Object remover(){
		return this.objetos.remove(this.objetos.size() - 1);
	}
	
	public boolean vazia() {
		return objetos.isEmpty();
	}
	
	public Object get(int i){
		return this.objetos.get(i);
	}
	
	public int size(){
		return objetos.size();
	}
	
	public void embaralhar(){
		Collections.shuffle(objetos);
	}
}
