package br.com.ufpb.questao4;

public class Parentese extends CobrirDecorator {

	public Parentese(Cobrir cobrir){
		super.cobrir = cobrir;
		super.coberturaDecorator = "(";
		super.coberturaDecorator2 = ")";
		
	}
	
	public String getCobertura(){
		return coberturaDecorator + cobrir.getCobertura() + coberturaDecorator2;
	}
}
