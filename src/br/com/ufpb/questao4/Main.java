package br.com.ufpb.questao4;

public class Main {

	public static void main(String[] args){
	
		Cobrir um = new Um();
		Cobrir um2 = new Um();
		Cobrir um3 = new Um();
		um = new Parentese(um);
		um = new Colchetes(um);
		um = new Chaves(um);
		
		
		um2 = new Chaves(um2);
		um2 = new Parentese(um2);
		um2 = new Colchetes(um2);
		
		um3 = new Colchetes(um3);
		um3 = new Chaves(um3);
		um3 = new Parentese(um3);
		
		System.out.println(um.getCobertura());
		System.out.println(um2.getCobertura());
		System.out.println(um3.getCobertura());
	}
}
