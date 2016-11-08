package br.com.ufpb.questao4;

public class Chaves extends CobrirDecorator{

	public Chaves(Cobrir cobrir){
		super.cobrir = cobrir;
		super.coberturaDecorator = "{";
		super.coberturaDecorator2 = "}";
	}
	
	public String getCobertura(){
		return coberturaDecorator + cobrir.getCobertura() + coberturaDecorator2;
	}
	
}
