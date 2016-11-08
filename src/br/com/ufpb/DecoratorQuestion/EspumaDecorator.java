package br.com.ufpb.DecoratorQuestion;

public class EspumaDecorator extends BebidaDecorator{

	public EspumaDecorator(Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "espuma de leite";
	}
	
	public String getDescricao(){
		return bebida.getDescricao() + " com " + decoratorDescricao;
	}
	
	public double getCusto(){
		return bebida.getCusto() + 1.00;
	}
}
