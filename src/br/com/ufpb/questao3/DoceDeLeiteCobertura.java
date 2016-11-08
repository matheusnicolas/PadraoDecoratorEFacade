package br.com.ufpb.questao3;

public class DoceDeLeiteCobertura extends CoberturaDecorator {

	public DoceDeLeiteCobertura(Bolo bolo) throws Exception{
		super(bolo);
		super.decoradorDescricao = "Doce de leite";
		
	}
	
	public String getDescricao(){
		return bolo.getDescricao() + " com " + decoradorDescricao;
	}
	
	public double getCusto(){
		return bolo.getCusto() + 1.50;
	}
	
}
