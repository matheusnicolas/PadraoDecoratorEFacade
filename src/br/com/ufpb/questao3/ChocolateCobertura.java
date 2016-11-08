package br.com.ufpb.questao3;

public class ChocolateCobertura extends CoberturaDecorator{

	public ChocolateCobertura(Bolo bolo) throws Exception{
		super(bolo);
		super.decoradorDescricao = "cobertura de chocolate";
	}
	
	public String getDescricao(){
		return bolo.getDescricao() + " com " + decoradorDescricao;
	}
	
	public double getCusto(){
		return bolo.getCusto() + 1;
	}

}
