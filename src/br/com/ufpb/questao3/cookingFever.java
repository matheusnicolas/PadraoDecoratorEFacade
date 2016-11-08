package br.com.ufpb.questao3;

public class cookingFever {
	public static void main(String[] args){
	
	
		Bolo boloDeChocolate = new BoloDeChocolate();
		Bolo boloDeLaranja = new BoloDeLaranja();
		Bolo boloDeBaunilha = new BoloDeBaunilha();
		try {
			boloDeChocolate = new MorangoCobertura(boloDeChocolate);
			boloDeLaranja = new ChocolateCobertura(boloDeLaranja);
			boloDeLaranja = new Morango(boloDeLaranja);
			boloDeLaranja = new Pessego(boloDeLaranja);
			boloDeChocolate = new DoceDeLeiteCobertura(boloDeChocolate);
			boloDeLaranja = new DoceDeLeiteCobertura(boloDeLaranja);
			boloDeBaunilha = new MorangoCobertura(boloDeBaunilha);
			boloDeBaunilha = new Pessego(boloDeBaunilha);
		} catch(Exception e) {
			e.getMessage();
		}
		System.out.println("Pedido: " + boloDeChocolate.getDescricao());
		System.out.println("Total a pagar: " + boloDeChocolate.getCusto());
		System.out.println("Pedido: " + boloDeLaranja.getDescricao());
		System.out.println("Total a pagar: " + boloDeLaranja.getCusto());
	}
}
