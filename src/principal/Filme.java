package principal;

import java.util.*;

/**
 * Cria��o da classe Filme, seus dados pr� cadastrados e seus respectivos m�todos
 * @author Caio C�sar e Lucas Henrique
 * @version 1.0 (Out 2020)
 */

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
	private String horario;
	private String dataExib;
	private Ingresso ingresso[];
	
	/**
	 * Cria��o da super
	 */
	
	public Filme(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	/**
	 * Cria��o do contrutor da classe Filme com os seus pr�prios atributos
	 * @param nomeDoFilme uma string que contem o nome do filme
	 * @param duracaoDoFilme um inteiro que contem a dura��o do filme em minutos
	 * @param classificacao um inteiro que contem a idade da classifica��o indicativa do filme
	 * @param idiomaDoFilme uma string que contem o idioma do filme
	 * @param sinopseFilme uma string que contem a sinpse do filme
	 * @param generoFilme uma string que contem o g�nero do filme
	 * @param data_lancamento uma string que contem a data de lan�amento do filme
	 * @param sala_transmissao um inteiro que contem a sala de transmiss�o do filme
	 * @param hora um inteiro que contem o hor�rio de exibi��o do filme
	 * @param dt uma string que contem a data de exibi��o do filme
	 */
	
	public Filme(String nomeDoFilme, int duracaoDoFilme, int classificacao, 
			String idiomaDoFilme, String sinopseFilme, String generoFilme, 
			String data_lancamento, int sala_transmissao, String hora, String dt) {
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
		
	/**
	 * Cria��o de dados pr� cadastrados usando o construtor do Filme e adi��o destes no ArrayList do tipo Filme
	 */
		
	// Pr�-cadastro de dados do cliente:
	public void dadosPreCadastradosFilmes(){
		Filme shang_chi = new Filme("Shang-Chi",135,12,"Portugu�s","Shang-Chi "
				+ "deve enfrentar o passado quando \n� atra�do para a teia da organiza��o Dez An�is.", 
				"A��o","02/03/2021",2, "14:30","15/03/2021");
		Filme viuva_negra = new Filme("Vi�va Negra",133,12,"Portugu�s","Em Vi�va Negra, acompanhamos a "
				+ "vida de Natasha Romanoff (Scarlett Johansson)\n ap�s os eventos de Guerra Civil. "
				+ "Se escondendo do governo norte-americano \ndevido a sua alian�a com o time do Capit�o Am�rica, "
				+ "Natasha ainda precisa confrontar \npartes de sua hist�ria quando surge uma conspira��o "
				+ "perigosa ligada ao seu passado. \nPerseguida por uma for�a que n�o ir� parar at� derrot�-la, "
				+ "ela ter� que lidar com sua \nantiga vida de espi�, e tamb�m reencontrar membros de sua fam�lia "
				+ "que deixou para tr�s antes\n de se tornar parte dos Vingadores.",
				"A��o","02/09/2021",10, "15:00","23/08/2020");
		Filme pulp_fiction = new Filme("Pulp Fiction", 152,18,"Portugu�s","Os assassinos "
				+ "Vincent e Jules passam por imprevistos \nao recuperar uma mala para um mafioso. "
				+ "O boxeador Butch � pago pelo mesmo mafioso\n para perder uma luta, e a esposa do criminoso "
				+ "fica sob responsabilidade de Vincent por\n uma noite.Essas hist�rias se relacionam numa teia "
				+ "repleta de viol�ncia.","A��o","18/02/1995",13,"12:45","19/10/2021");
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
				+ "imaginava ser poss�vel: o naufr�gio do navio.", "Drama","16/01/1998",8,"22:00","04/12/2021");
		Filme gente_grande = new Filme("Gente Grande", 99,12,"Portugu�s","Cinco amigos de inf�ncia se reencontram ap�s a morte de seu treinador.\n"
				+ " Juntos novamente, Lenny (Adam Sandler), Eric (Kevin James), Kurt (Chris Rock), \nMarcus (David Spade) e Rob (Rob Schneider) "
				+ "decidem curtir o feriado de\n 4 de julho com suas fam�lias em uma casa no lago.\n Eles relembram os bons momentos e fazem novas "
				+ "descobertas,\n al�m de se meterem em muitas confus�es.","Com�dia","24/09/2010",5, "18:00","16/12/2021");
	
		dadosFilmes.add(shang_chi);
		dadosFilmes.add(viuva_negra);
		dadosFilmes.add(pulp_fiction);
		dadosFilmes.add(titanic);
		dadosFilmes.add(gente_grande);
	
	}
		
	// ------------------ METODOS ------------------ //

	/**
	 * Cadastro do parametro filme no ArrayList do tipo Filme, sendo inserido ao final deste Array
	 * @param filme um Filme que contem todos os dados do construtor, passa os dados do novo filme a ser adicionado ao ArrayList do tipo Filme
	 */
	
	// Funcao para cadastrar os dados de Filme:
	public void cadastrar(Filme filme) {
		dadosFilmes.add(filme);
	}
		
	/**
	 * Cadastro de um filme vazio, usado normalmente para ocupar posi��es sem utilidade para adicionar funcionalidade na lista quando � pesquisado o nome do filme
	 */
	
	// Funcao para cadastrar um filme vazio:
	public void cadastrarvazio() {
		Filme filme = new Filme("",0,0,"","", "","",0, "","");
		dadosFilmes.add(filme);
	}
	
	/**
	 * Cadastro de um filme apenas com o nome do filme, para retornar a seguinte frase na lista da interface "N�o foram encontrados resultados..."
	 */
	
	// Funcao para retornar que n�o foram encontrados resultados:
	public void produtoNaoEncontrado() {
		Filme filme = new Filme("N�o foram encontrados resultados...",0,0,"","", "","",0, "","");
		dadosFilmes.add(filme);
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo Filme o filme que tenha o nome igual ao que foi recebido no par�metro
	 * @param nome uma string que contenha o nome do filme
	 * @return um filme tirado de dentro do ArrayList do tipo Filme com o nome igual ao par�metro ou null, indica se o filme com o seu nome igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar um filme por nome e retornar aquele filme:
	public Filme buscar(String nome) {
		for(int i = 0; i < dadosFilmes.size(); i ++) 
			if(nome.equals(dadosFilmes.get(i).getNome().toUpperCase())) {
				return dadosFilmes.get(i);
			}
		return null;
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo Filme o filme que tenha o nome igual ao que foi recebido no par�metro
	 * @param nome uma string que contenha o nome do filme
	 * @return a posi��o do filme tirado de dentro do ArrayList do tipo Filme com o nome igual ao par�metro ou -1, indica se o filme com o nome igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar um Filme Especifico por nome e retornar sua posi��o:
	public int retornaPos(String nome) {
		for(int i = 0; i < dadosFilmes.size(); i ++) 
			if(nome.equals(dadosFilmes.get(i).getNome().toUpperCase())) {
				return i;
			}
		return -1;
	}
	
	/**
	 * Editar um filme dentro do ArrayList do tipo Filme usando o m�todo de deletar o filme com dados antigos e adicionar um novo filme com os dados atualizados no Array
	 * @param filme um Filme que contenha todos os dados do construtor
	 * @param pos um inteiro que contenha a posi��o do filme no ArrayList do tipo Filme
	 */
	
	// Funcao para editar os dados do filme:
	public void editar(Filme filme, int pos) {
		deletar(pos);
		cadastrar(filme);
	}
	
	/**
	 * Deletar um filme dentro do ArrayList do tipo Filme usando a sua posi��o
	 * @param pos um inteiro que contenha a posi��o do filme no ArrayList do tipo Filme
	 */
	
	// Funcao para deletar um filme especifico a partir de sua posicao:
	public void deletar(int pos) {
		dadosFilmes.remove(dadosFilmes.get(pos));
	}
	
	/**
	 * Chama os atributos de filme de forma organizada 
	 * @return os atributos de filme de forma organizada
	 */
	
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
	
	/**
	 * Reune todos os nomes dos filmes em um vetor de string de forma ordenada
	 * @return o vetor de string com todos os nomes dos filmes de forma ordenada
	 */
	
	// Funcao para visualizar o nome dos filmes e retornar um vetor de string com eles na mesma ordem do arraylist:
	public String[] visualizarNome() {
		String[] var = new String [1000];
		for(int i = 0; i < dadosFilmes.size(); i ++) {
			var[i] = dadosFilmes.get(i).getNome();
		}
		return var;
	}
	
	/**
	 * Retornar o nome de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return a string do nome do filme espec�fico
	 */
	
	// Funcoes a seguir s�o para retornar os dados de filmes espec�ficos dentro do arraylist com base nas suas posi��es (Gets):	
	public String retornaNomeFilme(int pos) {
		return dadosFilmes.get(pos).getNome();
	}
	
	/**
	 * Retornar a dura��o de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return o inteiro da dura��o do filme espec�fico
	 */
	
	public int retornaDuracao(int pos) {
		return dadosFilmes.get(pos).getDuracao();
	}
	
	/**
	 * Retornar a classifica��o indicativa de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return o inteiro da classifica��o indicativa do filme espec�fico
	 */
	
	public int retornaClasIndic(int pos) {
		return dadosFilmes.get(pos).getClassificacaoIndicativa();
	}
	
	/**
	 * Retornar o idioma de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return a string do idioma do filme espec�fico
	 */
	
	public String retornaIdioma(int pos) {
		return dadosFilmes.get(pos).getIdioma();
	}
	
	/**
	 * Retornar a sinopse de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return a string da sinopse do filme espec�fico
	 */
	
	public String retornaSinopse(int pos) {
		return dadosFilmes.get(pos).getSinopse();
	}
	
	/**
	 * Retornar o g�nero de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return a string do g�nero do filme espec�fico
	 */
	
	public String retornaGenero(int pos) {
		return dadosFilmes.get(pos).getGenero();
	}
	
	/**
	 * Retornar a data de lan�amento de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return a string da data de lan�amento do filme espec�fico
	 */
	
	public String retornaDataLanc(int pos) {
		return dadosFilmes.get(pos).getDataLancamento();
	}
	
	/**
	 * Retornar a sala de transmiss�o de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return o inteiro da sala de transmiss�o do filme espec�fico
	 */
	
	public int retornaSalaTrans(int pos) {
		return dadosFilmes.get(pos).getSalaTransmissao();
	}
	
	/**
	 * Retornar o hor�rio de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return o inteiro do hor�rio do filme espec�fico
	 */
	
	public String retornaHorario(int pos) {
		return dadosFilmes.get(pos).getHorario();
	}
	
	/**
	 * Retornar a data de exibi��o de um filme espec�fico dentro do ArrayList do tipo Filme com base na sua posi��o
	 * @param pos um inteiro que contem a posi��o do filme no ArrayList do tipo Filme
	 * @return a string da data de exibi��o do filme espec�fico
	 */
	
	public String retornaDataExib(int pos) {
		return dadosFilmes.get(pos).getDataExibicao();
	}
		
	// ------------ GETTERS AND SETTERS ------------ //
	
	/**
	 * get
	 * @return a string do nome do filme espec�fico
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * set
	 * @param nome uma string do nome do filme
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * get
	 * @return a string da dura��o do filme espec�fico
	 */
	
	public int getDuracao() {
		return duracao;
	}
	
	/**
	 * set
	 * @param duracao um inteiro da dura��o do filme
	 */
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	/**
	 * get
	 * @return o inteiro da classifica��o indicativa do filme espec�fico
	 */
	
	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	
	/**
	 * set
	 * @param classificacaoIndicativa um inteiro da classifica��o indicativa do filme
	 */
	
	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	/**
	 * get
	 * @return a string do idioma do filme espec�fico
	 */
	
	public String getIdioma() {
		return idioma;
	}
	
	/**
	 * set
	 * @param idioma uma string do idioma do filme
	 */
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	/**
	 * get
	 * @return a string do idioma do filme espec�fico
	 */
	
	public String getSinopse() {
		return sinopse;
	}
	
	/**
	 * set
	 * @param sinopse uma string da sinpse do filme
	 */
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	/**
	 * get
	 * @return a string do g�nero do filme espec�fico
	 */
	
	public String getGenero() {
		return genero;
	}
	
	/**
	 * set
	 * @param genero uma string do g�nero do filme
	 */
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * get
	 * @return a string da data de lan�amento do filme espec�fico
	 */
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	/**
	 * set
	 * @param dataLancamento uma string da data de lan�amento do filme
	 */
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	/**
	 * get
	 * @return a string da sala de transmiss�o do filme espec�fico
	 */
	
	public int getSalaTransmissao() {
		return salaTransmissao;
	}
	
	/**
	 * set
	 * @param salaTransmissao uma string da sala de transmiss�o do filme
	 */
	
	public void setSalaTransmissao(int salaTransmissao) {
		this.salaTransmissao = salaTransmissao;
	}
	
	/**
	 * get
	 * @return um inteiro do hor�rio de exibi��o do filme espec�fico
	 */
	
	public String getHorario() {
		return horario;
	}
	
	/**
	 * set
	 * @param horario um inteiro do hor�rio de exibi��o do filme
	 */

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	/**
	 * get
	 * @return uma string da data de exibi��o do filme espec�fico
	 */

	public String getDataExibicao() {
		return dataExib;
	}
	
	/**
	 * set
	 * @param dataExibicao uma string da data de exibi��o de exibi��o do filme
	 */

	public void setDataExibicao(String dataExibicao) {
		this.dataExib = dataExibicao;
	}
	
}