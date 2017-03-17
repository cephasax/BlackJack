package br.ufrn.imd.ppgsw.ed;

public class Baralho {

	private Pilha<Carta> baralho;
	
	public Baralho(){
		this.baralho = new Pilha<Carta>();
	}
	
	public void iniciarbaralho(){
		if(baralho.vazia()){
			criarBaralho();
		}
		
	}

	public void embaralhar(){
		baralho.embaralhar();
	}
	
	public int tamanho(){
		return baralho.size();
	}
	
	public Carta remover(){
		return (Carta) this.baralho.remover();
	}
	
	public void mostrarBaralho(){
		for(int i = 0; i < baralho.size(); i++){
			System.out.println(((Carta) baralho.get(i)).getNome() + " de " + ((Carta) baralho.get(i)).getNaipe());
		}
	}
	

 	private void criarBaralho(){
		
		Carta c1;
		
		//COPAS
		c1 = new Carta("as","Copas",11);
		baralho.inserir(c1);
		c1 = new Carta("dois","Copas",2);
		baralho.inserir(c1);
		c1 = new Carta("tres","Copas",3);
		baralho.inserir(c1);
		c1 = new Carta("quatro","Copas",4);
		baralho.inserir(c1);
		c1 = new Carta("cinco","Copas",5);
		baralho.inserir(c1);
		c1 = new Carta("seis","Copas",6);
		baralho.inserir(c1);
		c1 = new Carta("sete","Copas",7);
		baralho.inserir(c1);
		c1 = new Carta("oito","Copas",8);
		baralho.inserir(c1);
		c1 = new Carta("nove","Copas",9);
		baralho.inserir(c1);
		c1 = new Carta("dez","Copas",10);
		baralho.inserir(c1);
		c1 = new Carta("valete","Copas",10);
		baralho.inserir(c1);
		c1 = new Carta("dama","Copas",10);
		baralho.inserir(c1);
		c1 = new Carta("rei","Copas",10);
		baralho.inserir(c1);
		
		//PAUS
		c1 = new Carta("as","Paus",11);
		baralho.inserir(c1);
		c1 = new Carta("dois","Paus",2);
		baralho.inserir(c1);
		c1 = new Carta("tres","Paus",3);
		baralho.inserir(c1);
		c1 = new Carta("quatro","Paus",4);
		baralho.inserir(c1);
		c1 = new Carta("cinco","Paus",5);
		baralho.inserir(c1);
		c1 = new Carta("seis","Paus",6);
		baralho.inserir(c1);
		c1 = new Carta("sete","Paus",7);
		baralho.inserir(c1);
		c1 = new Carta("oito","Paus",8);
		baralho.inserir(c1);
		c1 = new Carta("nove","Paus",9);
		baralho.inserir(c1);
		c1 = new Carta("dez","Paus",10);
		baralho.inserir(c1);
		c1 = new Carta("valete","Paus",10);
		baralho.inserir(c1);
		c1 = new Carta("dama","Paus",10);
		baralho.inserir(c1);
		c1 = new Carta("rei","Paus",10);
		baralho.inserir(c1);
		
		//OURO
		c1 = new Carta("as","Ouro",11);
		baralho.inserir(c1);
		c1 = new Carta("dois","Ouro",2);
		baralho.inserir(c1);
		c1 = new Carta("tres","Ouro",3);
		baralho.inserir(c1);
		c1 = new Carta("quatro","Ouro",4);
		baralho.inserir(c1);
		c1 = new Carta("cinco","Ouro",5);
		baralho.inserir(c1);
		c1 = new Carta("seis","Ouro",6);
		baralho.inserir(c1);
		c1 = new Carta("sete","Ouro",7);
		baralho.inserir(c1);
		c1 = new Carta("oito","Ouro",8);
		baralho.inserir(c1);
		c1 = new Carta("nove","Ouro",9);
		baralho.inserir(c1);
		c1 = new Carta("dez","Ouro",10);
		baralho.inserir(c1);
		c1 = new Carta("valete","Ouro",10);
		baralho.inserir(c1);
		c1 = new Carta("dama","Ouro",10);
		baralho.inserir(c1);
		c1 = new Carta("rei","Ouro",10);
		baralho.inserir(c1);

		//ESPADAS
		c1 = new Carta("as","Espadas",11);
		baralho.inserir(c1);
		c1 = new Carta("dois","Espadas",2);
		baralho.inserir(c1);
		c1 = new Carta("tres","Espadas",3);
		baralho.inserir(c1);
		c1 = new Carta("quatro","Espadas",4);
		baralho.inserir(c1);
		c1 = new Carta("cinco","Espadas",5);
		baralho.inserir(c1);
		c1 = new Carta("seis","Espadas",6);
		baralho.inserir(c1);
		c1 = new Carta("sete","Espadas",7);
		baralho.inserir(c1);
		c1 = new Carta("oito","Espadas",8);
		baralho.inserir(c1);
		c1 = new Carta("nove","Espadas",9);
		baralho.inserir(c1);
		c1 = new Carta("dez","Espadas",10);
		baralho.inserir(c1);
		c1 = new Carta("valete","Espadas",10);
		baralho.inserir(c1);
		c1 = new Carta("dama","Espadas",10);
		baralho.inserir(c1);
		c1 = new Carta("rei","Espadas",10);
		baralho.inserir(c1);


	}
	
}
