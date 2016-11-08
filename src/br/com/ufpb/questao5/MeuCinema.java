package br.com.ufpb.questao5;
public class MeuCinema {

	public static void main(String[] args) {

		
		
		DVDPlayer dvd = new DVDPlayer("Dvd samsung");
		LuzAmbiente iluminacao = new LuzAmbiente("Iluminacao do cinema");
		Projetor projetor = new Projetor("Projetor sony", dvd);
		Amplificador ampl = new Amplificador("Amplificador de audio", dvd);
		Tela tela = new Tela("tela para projeção de filmes");
		Pipoqueira pipoca = new Pipoqueira("Quero pipoca!");
		
		HomeTheaterFachada fachada = new HomeTheaterFachada(ampl, dvd, iluminacao, pipoca, projetor, tela);
		fachada.assistirFilme("A fuga das galinhas.");
		fachada.pararFilme();
	}

}
