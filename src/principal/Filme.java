package principal;

import java.util.*;

public class Filme {

	// ----------------- ATRIBUTOS ----------------- //
	
	private String nome;
	private int duracao;
	private int classificacaoIndicativa;
	private String idioma;
	private String sinopse;
	private String genero;
	private String dataLancamento;
	private int salaTransmissao;
	private int horario;
	private String dataExib;
	private Ingresso ingresso[];
	
	public Filme(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	public Filme(String nomeDoFilme, int duracaoDoFilme, int classificacao, 
			String idiomaDoFilme, String sinopseFilme, String generoFilme, 
			String data_lancamento, int sala_transmissao, int hora, String dt) {
		nome = nomeDoFilme;
		duracao = duracaoDoFilme;
		classificacaoIndicativa = classificacao;
		idioma = idiomaDoFilme;
		sinopse = sinopseFilme;
		genero = generoFilme;
		dataLancamento = data_lancamento;
		salaTransmissao = sala_transmissao;
		horario = hora;
		dataExib = dt;
	}
	
	// Funcionalidades:
		
		Scanner ler = new Scanner(System.in);
		ArrayList<Filme> dadosFilmes = new ArrayList<Filme>();
		Scanner input = new Scanner(System.in);
		
	// Pr�-cadastro de dados do cliente:
	
	public void dadosPreCadastradosFilmes(){
		Filme shang_chi = new Filme("Shang-Chi",135,12,"Portugu�s","Shang-Chi "
				+ "deve enfrentar o passado quando � atra�do para a teia da organiza��o Dez An�is.", 
				"A��o","02/03/2021",2, 14,"15/03/2021");
		Filme viuva_negra = new Filme("Vi�va negra",133,12,"Portugu�s","Em Vi�va Negra, acompanhamos a "
				+ "vida de Natasha Romanoff (Scarlett Johansson) ap�s os eventos de Guerra Civil. "
				+ "Se escondendo do governo norte-americano devido a sua alian�a com o time do Capit�o Am�rica, "
				+ "Natasha ainda precisa confrontar partes de sua hist�ria quando surge uma conspira��o "
				+ "perigosa ligada ao seu passado. Perseguida por uma for�a que n�o ir� parar at� derrot�-la, "
				+ "ela ter� que lidar com sua antiga vida de espi�, e tamb�m reencontrar membros de sua fam�lia "
				+ "que deixou para tr�s antes de se tornar parte dos Vingadores.",
				"A��o","02/09/2021",10, 15,"23/08/2020");
		Filme pulp_fiction = new Filme("Pulp Fiction", 152,18,"Portugu�s","Os assassinos "
				+ "Vincent e Jules passam por imprevistos ao recuperar uma mala para um mafioso. "
				+ "O boxeador Butch � pago pelo mesmo mafioso para perder uma luta, e a esposa do criminoso "
				+ "fica sob responsabilidade de Vincent por uma noite.Essas hist�rias se relacionam numa teia "
				+ "repleta de viol�ncia.","A��o","18/02/1995",13,12,"19/10/2021");
		Filme titanic = new Filme("Titanic", 194, 12, "Portugu�s","Jack Dawson (Leonardo DiCaprio) � um jovem "
				+ "aventureiro que, na mesa de jogo, ganha uma passagem para a primeira viagem do transatl�ntico Titanic."
				+ " Trata-se de um luxuoso e imponente navio, anunciado na �poca como inafund�vel, que parte para os Estados Unidos."
				+ " Nele est� tamb�m Rose DeWitt Bukater (Kate Winslet), a jovem noiva de Caledon Hockley (Billy Zane). "
				+ "Rose est� descontente com sua vida, j� que sente-se sufocada pelos costumes da elite e n�o ama Caledon."
				+ " Entretanto, ela precisa se casar com ele para manter o bom nome da fam�lia, que est� falida. "
				+ "Um dia, desesperada, Rose amea�a se atirar do Titanic, mas Jack consegue demov�-la da ideia. "
				+ "Pelo ato ele � convidado a jantar na primeira classe, onde come�a a se tornar mais pr�ximo de Rose."
				+ " Logo eles se apaixonam, despertando a f�ria de Caledon. "
				+ "A situa��o fica ainda mais complicada quando o Titanic se choca com um iceberg, provocando algo que ningu�m "
				+ "imaginava ser poss�vel: o naufr�gio do navio.", "Drama","16/01/1998",8,22,"04/12/2021");
		Filme gente_grande = new Filme("Gente Grande", 99,12,"Portugu�s","Cinco amigos de inf�ncia se reencontram ap�s a morte de seu treinador."
				+ " Juntos novamente, Lenny (Adam Sandler), Eric (Kevin James), Kurt (Chris Rock), Marcus (David Spade) e Rob (Rob Schneider) "
				+ "decidem curtir o feriado de 4 de julho com suas fam�lias em uma casa no lago. Eles relembram os bons momentos e fazem novas "
				+ "descobertas, al�m de se meterem em muitas confus�es.","Com�dia","24/09/2010",5, 6,"16/12/2021");
	
		dadosFilmes.add(shang_chi);
		dadosFilmes.add(viuva_negra);
		dadosFilmes.add(pulp_fiction);
		dadosFilmes.add(titanic);
		dadosFilmes.add(gente_grande);
	
	}
		
	// ------------------ METODOS ------------------ //

	// Funcao para cadastrar os dados de Filme:
	public void cadastrar(Filme filme) {
		dadosFilmes.add(filme);
	}
		
	// Funcao para buscar um filme por nome e retornar aquele filme:
	public Filme buscar(String nome) {
		for(int i = 0; i < dadosFilmes.size(); i ++) 
			if(nome.equals(dadosFilmes.get(i).getNome().toUpperCase())) {
				return dadosFilmes.get(i);
			}
		return null;
	}
	
	// Funcao para cadastrar um filme vazio:
	public void cadastrarvazio() {
		Filme filme = new Filme("",0,0,"","", "","",0, 0,"");
		dadosFilmes.add(filme);
	}
	
	// Funcao para retornar que n�o foram encontrados resultados:
	public void produtoNaoEncontrado() {
		Filme filme = new Filme("N�o foram encontrados resultados...",0,0,"","", "","",0, 0,"");
		dadosFilmes.add(filme);
	}
	
	// Funcao para buscar um Filme Especifico por nome e retornar sua posi��o:
	public int retornaPos(String nome) {
		for(int i = 0; i < dadosFilmes.size(); i ++) 
			if(nome.equals(dadosFilmes.get(i).getNome().toUpperCase())) {
				return i;
			}
		return -1;
	}
	
	// Funcao para editar os dados do filme:
	public void editar(Filme filme, int pos) {
		deletar(pos);
		cadastrar(filme);
	}
	
	// Funcao para deletar um filme especifico a partir de sua posicao:
	public void deletar(int pos) {
		dadosFilmes.remove(dadosFilmes.get(pos));
	}
	
	// Chamada de todos os dados de um Filme:
	public String toString() {	
		return "Nome do filme: " + nome + "\n" 
			   + "Dura��o: " + duracao + "\n" 
			   + "Classifica��o indicativa: " + classificacaoIndicativa + "\n" 
			   + "Idioma: " + idioma + "\n"
			   + "Sinopse: " + sinopse + "\n" 
			   + "Data de lan�amento: " + dataLancamento + "\n"
			   + "G�nero" + genero + "\n"
			   + "Sala de transmiss�o: " + salaTransmissao + "\n";
	}
	
	// Funcao para visualizar o nome dos filmes e retornar um vetor de string com eles na mesma ordem do arraylist:
	public String[] visualizarNome() {
		String[] var = new String [1000];
		for(int i = 0; i < dadosFilmes.size(); i ++) {
			var[i] = dadosFilmes.get(i).getNome();
		}
		return var;
	}
	
	// Funcoes a seguir s�o para retornar os dados de filmes espec�ficos dentro do arraylist com base nas suas posi��es (Gets):	
	public String retornaNomeFilme(int pos) {
		return dadosFilmes.get(pos).getNome();
	}
	
	public int retornaDuracao(int pos) {
		return dadosFilmes.get(pos).getDuracao();
	}
	
	public int retornaClasIndic(int pos) {
		return dadosFilmes.get(pos).getClassificacaoIndicativa();
	}
	
	public String retornaIdioma(int pos) {
		return dadosFilmes.get(pos).getIdioma();
	}
	
	public String retornaSinopse(int pos) {
		return dadosFilmes.get(pos).getSinopse();
	}
	
	public String retornaGenero(int pos) {
		return dadosFilmes.get(pos).getGenero();
	}
	
	public String retornaDataLanc(int pos) {
		return dadosFilmes.get(pos).getDataLancamento();
	}
	
	public int retornaSalaTrans(int pos) {
		return dadosFilmes.get(pos).getSalaTransmissao();
	}
	
	public int retornaHorario(int pos) {
		return dadosFilmes.get(pos).getHorario();
	}
	
	public String retornaDataExib(int pos) {
		return dadosFilmes.get(pos).getDataExibicao();
	}
		
	// ------------ GETTERS AND SETTERS ------------ //
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	
	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public int getSalaTransmissao() {
		return salaTransmissao;
	}
	
	public void setSalaTransmissao(int salaTransmissao) {
		this.salaTransmissao = salaTransmissao;
	}
	
	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getDataExibicao() {
		return dataExib;
	}

	public void setDataExibicao(String dataExibicao) {
		this.dataExib = dataExibicao;
	}
	
}