package br.com.ufpb.DecoratorQuestion;

public class Starbuzz {

	public static void main(String[] args){
		
		Bebida bebida = new CafeTradicional();
		bebida = new ChocolateDecorator(bebida);
		bebida = new EspumaDecorator(bebida);
		bebida = new LeiteDecorator(bebida);
		System.out.println("Pedido feito: " + bebida.getDescricao());
		System.out.printf("Total a pagar: R$%.2f" , bebida.getCusto());
	}
}
