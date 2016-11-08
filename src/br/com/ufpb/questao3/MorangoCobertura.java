package br.com.ufpb.questao3;

public class MorangoCobertura extends CoberturaDecorator {

	public MorangoCobertura(Bolo bolo) throws Exception{
		super(bolo);
		super.decoradorDescricao = " cobertura de morango";
	}
	
	public String getDescricao(){
		return bolo.getDescricao() + " com " + decoradorDescricao;
	}
	
	public double getCusto(){
		return bolo.getCusto() + 1;
	}
}
