package br.com.ufpb.questao3;

public abstract class CoberturaDecorator extends BoloDecorator  {

	public CoberturaDecorator(Bolo bolo) throws Exception{
		if(jaContemCobertura(bolo)){
			throw new Exception("J� possui uma cobertura, n�o pode adicionar outra!");
			
		}
		super.bolo = bolo;
	}
	
	public boolean jaContemCobertura(Bolo bolo){
		if(bolo instanceof BoloDecorator){
			BoloDecorator bo = (BoloDecorator) bolo;
			if(bolo instanceof CoberturaDecorator){
				return true;
			}else{
				return jaContemCobertura(bo.bolo);
			}
			}else{
				return false;
			}
			
		

	}
	
}
