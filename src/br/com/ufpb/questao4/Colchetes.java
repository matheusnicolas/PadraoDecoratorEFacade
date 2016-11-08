package br.com.ufpb.questao4;

public class Colchetes extends CobrirDecorator{

	public Colchetes(Cobrir cobrir){
		super.cobrir = cobrir;
		super.coberturaDecorator = "[";
		super.coberturaDecorator2 = "]";
		
	}
	
	public String getCobertura(){
		return coberturaDecorator + cobrir.getCobertura() + coberturaDecorator2;
	}
}
