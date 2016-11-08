package br.com.ufpb.questao3;

public class Morango extends BoloDecorator {

	public Morango(Bolo bolo){
		super.bolo = bolo;
		super.decoradorDescricao = "morango";
	}
	
	public String getDescricao(){
		return bolo.getDescricao() + " com " + decoradorDescricao;
	}
	
	public double getCusto(){
		return bolo.getCusto() + 1.50;
	}
}
