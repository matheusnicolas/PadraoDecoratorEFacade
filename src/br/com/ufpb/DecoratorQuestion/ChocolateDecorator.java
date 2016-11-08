package br.com.ufpb.DecoratorQuestion;

public class ChocolateDecorator extends BebidaDecorator{

	public ChocolateDecorator(Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "calda de chocolate";
		
	}
	
	public String getDescricao(){
		return bebida.getDescricao() + " com " + decoratorDescricao;
	}
	
	public double getCusto(){
		return bebida.getCusto() + 3.00;
	}
}
