package br.com.ufpb.questao3;

public class Pessego extends BoloDecorator{

	public Pessego(Bolo bolo){
		super.bolo = bolo;
		super.decoradorDescricao = "pêssego";
	}
	
	public String getDescricao(){
		return bolo.getDescricao() + " com " + decoradorDescricao;
	}
	
	public double getCusto(){
		return bolo.getCusto() + 1;
	}
}
