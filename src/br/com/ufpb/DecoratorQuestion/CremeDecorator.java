package br.com.ufpb.DecoratorQuestion;

public class CremeDecorator extends BebidaDecorator{

	public CremeDecorator(Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "creme de leite";
	}
	
	public String getDescricao(){
		return bebida.getDescricao() + " com " + decoratorDescricao;
	}
	
	public double getCusto(){
		return bebida.getCusto() + 1.00;
	}
}
