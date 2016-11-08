package br.com.ufpb.questao5;

public class HomeTheaterFachada {

	private Amplificador amplificador;
	private DVDPlayer dvdPlayer;

	private LuzAmbiente luzAmbiente;
	private Pipoqueira pipoqueira;
	private Projetor projetor;
	private Tela tela;
	
	public HomeTheaterFachada(Amplificador amplificador, DVDPlayer dvdPlayer, LuzAmbiente luzAmbiente, Pipoqueira pipoqueira, Projetor projetor, Tela tela){
		this.amplificador = amplificador;
		this.dvdPlayer = dvdPlayer;
		this.luzAmbiente = luzAmbiente;
		this.pipoqueira = pipoqueira;
		this.projetor = projetor;
		this.tela = tela;
	}

	public void assistirFilme(String filme){
		System.out.println("========================");
		System.out.println("O filme vai começar ......");
		System.out.println("========================");
		dvdPlayer.on();
		dvdPlayer.play(filme);
		amplificador.on();
		amplificador.somStereo();
		amplificador.setVolume(10);
		pipoqueira.on();
		pipoqueira.fazerPipoca();
		projetor.on();
		projetor.modoWideScreen();
		tela.descer();
		luzAmbiente.on();
		luzAmbiente.luminosidadeBaixa();
	}
	
	
	
	public void pararFilme(){
		System.out.println("========================");
		System.out.println(" parando o filme ......");
		System.out.println("========================");
		pipoqueira.off();
		luzAmbiente.luminosidadeAlta();
		tela.subir();
		projetor.off();
		amplificador.off();
		dvdPlayer.eject();
		dvdPlayer.off();
	}
	
	public Amplificador getAmplificador() {
		return this.amplificador;
	}

	public void setAmplificador(Amplificador amplificador) {
		this.amplificador = amplificador;
	}

	public DVDPlayer getDvdPlayer() {
		return this.dvdPlayer;
	}

	public void setDvdPlayer(DVDPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}


	public LuzAmbiente getLuzAmbiente() {
		return this.luzAmbiente;
	}

	public void setLuzAmbiente(LuzAmbiente luzAmbiente) {
		this.luzAmbiente = luzAmbiente;
	}

	public Pipoqueira getPipoqueira() {
		return this.pipoqueira;
	}

	public void setPipoqueira(Pipoqueira pipoqueira) {
		this.pipoqueira = pipoqueira;
	}

	public Projetor getProjetor() {
		return this.projetor;
	}

	public void setProjetor(Projetor projetor) {
		this.projetor = projetor;
	}

	public Tela getTela() {
		return this.tela;
	}

	public void setTela(Tela tela) {
		this.tela = tela;
	}
	


}
