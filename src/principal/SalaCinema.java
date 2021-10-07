package principal;
import java.util.*;

/**
 * Cria��o da classe SalaCinema, seus dados pr� cadastrados e seus respectivos m�todos
 * @author Caio C�sar e Lucas Henrique
 * @version 1.0 (Out 2020)
 */

public class SalaCinema {
	
	// ----------------- ATRIBUTOS ----------------- //
	
	private String numSala;
	private String tipoSala;
	private int qntddCadeiras;
	private String formato;
	private int qnddLinhasCadeiras;
	private int qnddColunasCadeiras;
	private Ingresso ingresso[];
	
	/**
	 * Cria��o da super
	 */
	
	public SalaCinema(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- //
	
	/**
	 * Cria��o do contrutor da classe SalaCinema com os seus pr�prios atributos
	 * @param numero_sala uma string que contem o n�mero da sala
	 * @param tipo_sala uma string que contem o tipo de sala
	 * @param qtd_cadeiras um inteiro que contem a quantidade de cadeiras da sala
	 * @param formato_sala uma string que contem o formato da sala
	 * @param qtd_linhas um inteiro que contem a quantidade de linhas da sala
	 * @param qtd_colunas um inteiro que contem a quantidade de colunas da sala
	 */
	
	public SalaCinema(String numero_sala, String tipo_sala, int qtd_cadeiras, String formato_sala, int qtd_linhas, int qtd_colunas) {
		numSala = numero_sala;
		tipoSala = tipo_sala;
		qntddCadeiras = qtd_cadeiras;
		formato = formato_sala;
		qnddLinhasCadeiras = qtd_linhas;
		qnddColunasCadeiras = qtd_colunas; 
	}
	
	// ------------- DADOS PR�-CADASTRADOS ----------//
	Scanner input = new Scanner(System.in);	
	ArrayList<SalaCinema> dadosSala = new ArrayList<SalaCinema>();
	
	/**
	 * Cria��o de dados pr� cadastrados usando o construtor do SalaCinema e adi��o destes no ArrayList do tipo SalaCinema
	 */
	
	public void dadosPreCadastradosSala(){
		
		SalaCinema sala1 = new SalaCinema("Sala 1","3D",90,"Quadrado",15,6);
		SalaCinema sala2 = new SalaCinema("Sala 2","VIP",50,"Quadrado",25,5);
		SalaCinema sala3 = new SalaCinema("Sala 3","Normal",80,"Piramide",20,4);
		SalaCinema sala4 = new SalaCinema("Sala 4","Normal",100,"Quadrado",25,5);
		SalaCinema sala5 = new SalaCinema("Sala 5","Normal",100,"Quadrado",25,5);
		
		dadosSala.add(sala1);
		dadosSala.add(sala2);
		dadosSala.add(sala3);
		dadosSala.add(sala4);
		dadosSala.add(sala5);
		
	}
	
	// ------------------ METODOS ------------------ //

	/**
	 * Cadastro do parametro sala no ArrayList do tipo SalaCinema, sendo inserido ao final deste Array
	 * @param sala um SalaCinema que contem todos os dados do construtor
	 */
	
	// Funcao para cadastrar os dados da Sala de Cinema:
	public void cadastrar(SalaCinema sala) {
		dadosSala.add(sala);
	}
	
	/**
	 * Cadastro de uma sala vazio, usado normalmente para ocupar posi��es sem utilidade para adicionar funcionalidade na lista quando � pesquisado o CPF
	 */
	
	// Funcao para cadastrar uma sala vazia:
	public void cadastrarvazio() {
		SalaCinema sala = new SalaCinema("","", 0,"",0,0);
		dadosSala.add(sala);
	}
	
	/**
	 * Cadastro de um sala apenas com o n�mero da sala, para retornar a seguinte frase na lista da interface "N�o foram encontrados resultados..."
	 */
	
	// Funcao para retornar que n�o foram encontrados resultados:
	public void produtoNaoEncontrado() {
		SalaCinema sala = new SalaCinema("N�o foram encontrados resultados...","", 0,"",0,0);
		dadosSala.add(sala);
	}

	/**
	 * Editar uma sala dentro do ArrayList do tipo SalaCinema usando o m�todo de deletar a sala com dados antigos e adicionar uma nova sala com os dados atualizados no Array
	 * @param sala uma SalaCinema que contem todos os dados do construtor
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 */
	
	// Funcao para editar os dados da sala de Cinema:
	public void editar(SalaCinema sala, int pos) {
		deletar(pos);
		cadastrar(sala);
		
//				dadosSala.get(pos).numSala = sala.numSala;
//				dadosSala.get(pos).tipoSala = sala.tipoSala;
//				dadosSala.get(pos).qntddCadeiras = sala.qntddCadeiras;
//				dadosSala.get(pos).formato = sala.formato;
//				dadosSala.get(pos).qnddLinhasCadeiras = sala.qnddLinhasCadeiras;
//				dadosSala.get(pos).qnddColunasCadeiras = sala.qnddColunasCadeiras;
//				dadosSala.get(pos).cadeiraVaga = sala.cadeiraVaga;
	}
	
	/**
	 * Deletar uma sala dentro do ArrayList do tipo SalaCinema usando a sua posi��o
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 */
	
	// Funcao para deletar uma Sala:
	public void deletar(int pos) {
		dadosSala.remove(dadosSala.get(pos));
	}

	/**
	 * Chama os atributos de sala de forma organizada 
	 * @return os atributos de sala de forma organizada
	 */
	
	// Chamada de todos os dados de uma sala:
	public String toString() {	
		return "N�mero da sala: " + numSala + "\n" 
			   + "Tipo da sala: " + tipoSala + "\n" 
			   + "Quantidade de cadeiras: " + qntddCadeiras + "\n" 
			   + "Formato: " + formato + "\n"
			   + "Quantidade de linhas: " + qnddLinhasCadeiras + "\n"
			   + "Quantidade de colunas: " + qnddColunasCadeiras + "\n";
			  
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo SalaCinema a sala que tenha o n�mero da sala igual ao que foi recebido no par�metro
	 * @param salaNum uma string que contenha o n�mero da sala
	 * @return uma sala tirada de dentro do ArrayList do tipo SalaCinema com o n�mero da sala igual ao par�metro ou null, indica se a sala com o n�mero da sala igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar uma sala Especifico pelo seu numero e retorn�-la:
	public SalaCinema buscar(String salaNum) {
		for(int i = 0; i < dadosSala.size(); i ++) 
			if(salaNum.equals(dadosSala.get(i).getNumSala().replaceAll("[\\D]", ""))) {
				return dadosSala.get(i);
			}
		return null;
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo SalaCinema a sala que tenha o n�mero da sala igual ao que foi recebido no par�metro
	 * @param salaNum uma string que contenha o n�mero da sala
	 * @return a posi��o da sala tirado de dentro do ArrayList do tipo SalaCinema com o n�mero da sala igual ao par�metro ou -1, indica se a sala com o n�mero da sala igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar uma sala Especifico pelo seu numero e retornar sua posicao:
	public int retornaPos(String salaNum) {
		for(int i = 0; i < dadosSala.size(); i ++) 
			if(salaNum.equals(dadosSala.get(i).getNumSala().replaceAll("[\\D]", ""))) {
				return i;
			}
		return -1;
	}
	
	/**
	 * Reune todos os n�meros das salas em um vetor de string de forma ordenada
	 * @return o vetor de string com todos os n�meros de salas de forma ordenada
	 */
	
	// Funcao para visualizar o numero das salas e retornar um vetor de string com eles na mesma ordem do arraylist:
	public String[] visualizarNum() {
		String[] var = new String [1000];
		for(int i = 0; i < dadosSala.size(); i ++) {
			var[i] = String.valueOf(dadosSala.get(i).getNumSala());
		}
		return var;
	}
		
	/**
	 * Retornar o n�mero de sala de uma sala espec�fica dentro do ArrayList do tipo SalaCinema com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 * @return a string do n�mero de sala de uma sala espec�fica
	 */
	
	// Funcoes a seguir s�o para retornar os dados de salas espec�ficas dentro do arraylist com base nas suas posi��es (Gets):
	public String retornaNumSala(int pos) {
		return dadosSala.get(pos).getNumSala();
	}
	
	/**
	 * Retornar o tipo de sala de uma sala espec�fica dentro do ArrayList do tipo SalaCinema com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 * @return a string do tipo de sala de uma sala espec�fica
	 */
	
	public String retornaTipoSala(int pos) {
		return dadosSala.get(pos).getTipoSala();
	}
	
	/**
	 * Retornar a quantidade de cadeiras de uma sala espec�fica dentro do ArrayList do tipo SalaCinema com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 * @return o inteiro da quantidade de cadeiras de uma sala espec�fica
	 */
	
	public int retornaQntddCadeiras(int pos) {
		return dadosSala.get(pos).getQntddCadeiras();
	}
	
	/**
	 * Retornar o formato de uma sala espec�fica dentro do ArrayList do tipo SalaCinema com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 * @return o inteiro do formato de uma sala espec�fica
	 */
	
	public String retornaFormato(int pos) {
		return dadosSala.get(pos).getFormato();
	}
	
	/**
	 * Retornar a quantidade de linhas de cadeiras de uma sala espec�fica dentro do ArrayList do tipo SalaCinema com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 * @return o inteiro da quantidade de linhas de cadeiras de uma sala espec�fica
	 */
	
	public int retornaQntddLinhasCadeiras(int pos) {
		return dadosSala.get(pos).getQnddLinhasCadeiras();
	}
	
	/**
	 * Retornar a quantidade de colunas de cadeiras de uma sala espec�fica dentro do ArrayList do tipo SalaCinema com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o da sala no ArrayList do tipo SalaCinema
	 * @return o inteiro da quantidade de colunas de cadeiras de uma sala espec�fica
	 */
	
	public int retornaQntddColunasCadeiras(int pos) {
		return dadosSala.get(pos).getQnddColunasCadeiras();
	} 
	

	// ------------ GETTERS AND SETTERS ------------ //
	
	/**
	 * get
	 * @return a string do n�mero da sala
	 */
	
	public String getNumSala() {
		return numSala;
	}

	/**
	 * set
	 * @param numSala uma string do n�mero da sala
	 */
	
	public void setNumSala(String numSala) {
		this.numSala = numSala;
	}
	
	/**
	 * get
	 * @return a string do tipo de sala
	 */

	public String getTipoSala() {
		return tipoSala;
	}
	
	/**
	 * set
	 * @param tipoSala uma string do tipo da sala
	 */

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	/**
	 * get
	 * @return o inteiro da quantidade de cadeiras da sala
	 */
	
	public int getQntddCadeiras() {
		return qntddCadeiras;
	}
	
	/**
	 * set
	 * @param qntddCadeiras um inteiro da quantidade de cadeiras da sala
	 */

	public void setQntddCadeiras(int qntddCadeiras) {
		this.qntddCadeiras = qntddCadeiras;
	}
	
	/**
	 * get
	 * @return a string do formato da sala
	 */

	public String getFormato() {
		return formato;
	}
	
	/**
	 * set
	 * @param formato uma string do formato da sala
	 */

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	/**
	 * get
	 * @return o inteiro da quantidade de linhas de cadeiras da sala
	 */

	public int getQnddLinhasCadeiras() {
		return qnddLinhasCadeiras;
	}
	
	/**
	 * set
	 * @param qnddLinhasCadeiras um inteiro da quantidade de linhas de cadeiras da sala
	 */

	public void setQnddLinhasCadeiras(int qnddLinhasCadeiras) {
		this.qnddLinhasCadeiras = qnddLinhasCadeiras;
	}
	
	/**
	 * get
	 * @return o inteiro da quantidade de colunas de cadeiras da sala
	 */

	public int getQnddColunasCadeiras() {
		return qnddColunasCadeiras;
	}
	
	/**
	 * set
	 * @param qnddColunasCadeiras um inteiro da quantidade de colunas de cadeiras da sala
	 */

	public void setQnddColunasCadeiras(int qnddColunasCadeiras) {
		this.qnddColunasCadeiras = qnddColunasCadeiras;
	}

}