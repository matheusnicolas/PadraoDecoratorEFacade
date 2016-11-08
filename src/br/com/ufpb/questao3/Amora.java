package br.com.ufpb.questao3;

public class Amora extends BoloDecorator {

	public Amora(Bolo bolo){
		super.bolo = bolo;
		super.decoradorDescricao = "amora" ;
	}
	
	public String getDescricao(){
		return bolo.getDescricao() + " com " + decoradorDescricao;
	}
	
	public double getCusto(){
		return bolo.getCusto() + 1.50;
	}
}
