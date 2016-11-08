package br.com.ufpb.DecoratorQuestion;

public class LeiteDecorator extends BebidaDecorator{

	public LeiteDecorator(Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "leite";
	}
	
	public String getDescricao(){
		return bebida.getDescricao() + " com " + decoratorDescricao;
	}
	
	public double getCusto(){
		return bebida.getCusto() + 2.00; 
	}
}
