package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Cria��o da classe Funcionario, seus dados pr� cadastrados e seus respectivos m�todos
 * @author Caio C�sar e Lucas Henrique
 * @version 1.0 (Out 2020)
 */

public class Funcionario extends Pessoa {

	// ----------------- ATRIBUTOS ----------------- //
	
	private String funcao;
	private String endereco;
	private double salario;
	
	/**
	 * Cria��o da super
	 */
	
	public Funcionario(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	/**
	 * Cria��o do contrutor da classe Funcionario com os atributos da classe abstrata Pessoa e seus pr�prios atributos
	 * @param primNome uma string que contem o primeiro nome do funcion�rio
	 * @param ultNome uma string que contem o ultimo nome do funcion�rio
	 * @param data uma string que contem a data de nascimento do funcion�rio
	 * @param c uma string que contem o CPF do funcion�rio
	 * @param numCel uma string que contem o numero de celular do funcion�rio
	 * @param email uma string que contem o email do funcion�rio
	 * @param func uma string que contem a fun��o do funcion�rio
	 * @param end uma string que contenha o endere�o do funcion�rio
	 * @param sal um n�mero do tipo double que contem o sal�rio do funcion�rio
	 */
	
	// Sobrecarga
	public Funcionario(String primNome, String ultNome, String data, String c, String numCel, String email, String func, String end, double sal) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
		funcao = func;
		endereco = end;
		salario = sal;
	}
	
	/**
	 * Cria��o do contrutor da classe Funcionario com sobrecarga
	 * @param primNome uma string que contem o primeiro nome do funcion�rio
	 * @param ultNome uma string que contem o ultimo nome do funcion�rio
	 * @param data uma string que contem a data de nascimento do funcion�rio
	 * @param c uma string que contem o CPF do funcion�rio
	 * @param numCel uma string que contem o numero de celular do funcion�rio
	 * @param email uma string que contem o email do funcion�rio
	 */
	
	public Funcionario(String primNome, String ultNome, String data, String c, String numCel, String email) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
	}
	
	// Funcionalidades:
	
	Scanner input = new Scanner(System.in);	
	Scanner ler = new Scanner(System.in);
	Scanner lerd = new Scanner(System.in);	
	ArrayList<Funcionario> dadosFuncionario = new ArrayList<Funcionario>();
	
	// Pr�-cadastro de dados do funcion�rio:
	
	/**
	 * Cria��o de dados pr� cadastrados usando o construtor do Funcionario e adi��o destes no ArrayList do tipo Funcionario
	 */
	
	public void dadosPreCadastradosFuncionario() {
		Funcionario funcionario1 = new Funcionario("Junior", "Filho", "17/11/1991", "543.767.236-63", "(61)-99145-4832", "juniorFilho@hotmail.com", "Atendente", "Residencial Vivace", 3000.0);
		Funcionario funcionario2 = new Funcionario("Nicole", "Soares", "18/12/1988", "934.931.192-04", "(61)-99716-8092", "nicoleSoares@hotmail.com", "Atendente", "Samambaia", 3500.0);
		Funcionario funcionario3 = new Funcionario("Sofia", "Oliveira", "09/05/1981", "943.019.861-09", "(62)-98874-9901", "sofiaOliveira@gmail.com", "Atendente", "Taguatinga", 3500.0);
		Funcionario funcionario4 = new Funcionario("Paulo", "Molares", "11/08/1992", "923.958.105-75", "(61)-98884-9104", "pauloMolares@hotmail.com", "Atendente", "Sudoeste", 3000.0);
		Funcionario funcionario5 = new Funcionario("Rodolfo", "Mimosa", "08/06/1972", "765.087.432-01", "(61)-98780-9809", "rodolfoMimosa@hotmail.com", "Gerente", "Ceil�ndia", 4000.5);
		
		dadosFuncionario.add(funcionario1);
		dadosFuncionario.add(funcionario2);
		dadosFuncionario.add(funcionario3);
		dadosFuncionario.add(funcionario4);
		dadosFuncionario.add(funcionario5);
	}
	
	// ------------------ METODOS ------------------ //
	
	/**
	 * Cadastro do parametro funcionario no ArrayList do tipo Funcionario, sendo inserido ao final deste Array
	 * @param funcionario um Funcionario que contem todos os dados do construtor
	 */
	
	// Funcao para cadastrar os dados de Funcionario:
	public void cadastrar(Funcionario funcionario) {
		dadosFuncionario.add(funcionario);
	}
	
	/**
	 * Cadastro de um funcion�rio vazio, usado normalmente para ocupar posi��es sem utilidade para adicionar funcionalidade na lista quando � pesquisado o CPF
	 */
	
	// Funcao para cadastrar um funcionario vazio:
	public void cadastrarvazio() {
		Funcionario func = new Funcionario("", "", "", "", "", "", "", "", 0);
		dadosFuncionario.add(func);
	}
	
	/**
	 * Cadastro de um funcion�rio apenas com o primeiro nome, para retornar a seguinte frase na lista da interface "N�o foram encontrados resultados..."
	 */
	
	// Funcao para retornar que n�o foram encontrados resultados:
	public void pessoaNaoEncontrada() {
		Funcionario func = new Funcionario("N�o foram encontrados resultados...", "", "", "", "", "", "", "", 0);
		dadosFuncionario.add(func);
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo Funcionario o funcion�rio que tenha o CPF igual ao que foi recebido no par�metro
	 * @param cpf uma string que contenha o CPF do funcion�rio
	 * @return um funcion�rio tirado de dentro do ArrayList do tipo Funcionario com o CPF igual ao par�metro ou null, indica se o funcion�rio com o CPF igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar um Funcionario Especifico por CPF e retorn�-lo:
	public Funcionario buscar(String cpf) {
		for(int i = 0; i < dadosFuncionario.size(); i ++) 
			if(cpf.equals(dadosFuncionario.get(i).getCpf().replaceAll("[\\D]", ""))) {
				return dadosFuncionario.get(i);
			}
		return null;
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo Funcionario o funcion�rio que tenha o CPF igual ao que foi recebido no par�metro
	 * @param cpf uma string que contenha o CPF do funcion�rio
	 * @return a posi��o do funcion�rio tirado de dentro do ArrayList do tipo Funcionario com o CPF igual ao par�metro ou -1, indica se o funcion�rio com o CPF igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar um funcionario Especifico por CPF e retornar sua posi��o:
	public int retornaPos(String cpf) {
		for(int i = 0; i < dadosFuncionario.size(); i ++) 
			if(cpf.equals(dadosFuncionario.get(i).getCpf().replaceAll("[\\D]", ""))) {
				return i;
			}
		return -1;
	}
	
	/**
	 * Editar um funcion�rio dentro do ArrayList do tipo Funcionario usando o m�todo de deletar o funcion�rio com dados antigos e adicionar um novo funcion�rio com os dados atualizados no Array
	 * @param funcionario um Funcionario que contenha todos os dados do construtor
	 * @param pos um inteiro que contenha a posi��o do funcionario no ArrayList do tipo Funcionario
	 */
	
	// Funcao para editar os dados de funcionario:
	public void editar(Funcionario funcionario, int pos) {
		deletar(pos);
		cadastrar(funcionario);
		
//			dadosFuncionario.get(pos).email = funcionario.email;
//			dadosFuncionario.get(pos).funcao = funcionario.funcao;
//			dadosFuncionario.get(pos).numCelular = funcionario.numCelular;
//			dadosFuncionario.get(pos).salario = funcionario.salario;
//			dadosFuncionario.get(pos).endereco = funcionario.endereco;
	}
	
	/**
	 * Deletar um funcionario dentro do ArrayList do tipo Funcionario usando a sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcionario no ArrayList do tipo Funcionario
	 */
	
	// Funcao para deletar um funcionario:
	public void deletar(int pos) {
		
		dadosFuncionario.remove(dadosFuncionario.get(pos));
		
	}
	
	/**
	 * Chama os atributos de funcion�rio de forma organizada 
	 * @return os atributos de funcion�rio de forma organizada
	 */
	
	
	// Chamada de todos os dados de um funcionario:
	public String toString() {	
		return "Nome do Funcion�rio: " + primeiroNome + " " + ultimoNome + "\n" 
			   + "Data de Nascimento: " + dataNascimento + "\n" + "CPF: " + cpf + "\n" 
			   + "N�mero de Celular: " + numCelular + "\n" + "E-mail:" + email + "\n" 
			   + "fun��o: " + funcao + "\n" + "Sal�rio: "
			   + salario + "\n" + "Endere�o" + endereco + "\n";
	}
	
	/**
	 * Reune todos os primeiros nomes dos funcion�rios em um vetor de string de forma ordenada
	 * @return o vetor de string com todos os primeiros nomes dos funcion�rios de forma ordenada
	 */
	
	// Funcao para visualizar o primeiro nome dos funcionarios e retornar um vetor de string com eles na mesma ordem do arraylist:
	public String[] visualizarNome() {
		String[] var = new String [1000];
		for(int i = 0; i < dadosFuncionario.size(); i ++) {
			var[i] = dadosFuncionario.get(i).getPrimeiroNome();
		}
		return var;
	}
	
	/**
	 * Retornar o primeiro nome de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string do primeiro nome do funcion�rio espec�fico
	 */
	
	// Funcoes a seguir s�o para retornar os dados de funcionarios espec�ficos dentro do arraylist com base nas suas posi��es (Gets):
	public String retornaPrimNome(int pos) {
		return dadosFuncionario.get(pos).getPrimeiroNome();
	}
	
	/**
	 * Retornar a data de nascimento de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string da data de nascimento do funcion�rio espec�fico
	 */
	
	public String retornaData(int pos) {
		return dadosFuncionario.get(pos).getDataNascimento();
	}
	
	/**
	 * Retornar o �ltimo nome de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string do �ltimo nome do funcion�rio espec�fico
	 */
	
	public String retornaUltNome(int pos) {
		return dadosFuncionario.get(pos).getUltimoNome();
	}
	
	/**
	 * Retornar o CPF de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string do CPF do funcion�rio espec�fico
	 */
	
	public String retornaCPF(int pos) {
		return dadosFuncionario.get(pos).getCpf();
	}
	
	/**
	 * Retornar o n�mero de celular de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string do n�mero de celular do funcion�rio espec�fico
	 */
	
	public String retornaNumCel(int pos) {
		return dadosFuncionario.get(pos).getNumCelular();
	}
	
	/**
	 * Retornar o email de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string do email do funcion�rio espec�fico
	 */
	
	public String retornaEmail(int pos) {
		return dadosFuncionario.get(pos).getEmail();
	}
	
	/**
	 * Retornar a fun��o de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string da fun��o do funcion�rio espec�fico
	 */
	
	public String retornaFuncao(int pos) {
		return dadosFuncionario.get(pos).getFuncao();
	}
	
	/**
	 * Retornar o endere�o de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return a string do endere�o do funcion�rio espec�fico
	 */
	
	public String retornaEndereco(int pos) {
		return dadosFuncionario.get(pos).getEndereco();
	}
	
	/**
	 * Retornar o sal�rio de um funcion�rio espec�fico dentro do ArrayList do tipo Funcionario com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do funcion�rio no ArrayList do tipo Funcionario
	 * @return o n�mero double do sal�rio do funcion�rio espec�fico
	 */
	
	public double retornaSalario(int pos) {
		return dadosFuncionario.get(pos).getSalario();
	}

	// ------------ GETTERS AND SETTERS ------------ //
	

	/**
	 * get
	 * @return a string do primeiro nome do funcion�rio espec�fico
	 */
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	/**
	 * set
	 * @param primeiroNome uma string do primeiro nome do funcion�rio
	 */

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	/**
	 * get
	 * @return a string do �ltimo nome do funcion�rio
	 */

	public String getUltimoNome() {
		return ultimoNome;
	}
	
	/**
	 * set
	 * @param ultimoNome uma string do �ltimo nome do funcion�rio
	 */

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	/**
	 * get
	 * @return a string da data de nascimento do funcion�rio
	 */

	public String getDataNascimento() {
		return dataNascimento;
	}
	
	/**
	 * set
	 * @param dataNascimento uma string da data de nascimento do funcion�rio
	 */

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	/**
	 * get
	 * @return a string do CPF do funcion�rio
	 */

	public String getCpf() {
		return cpf;
	}
	
	/**
	 * set
	 * @param cpf uma string do CPF do funcion�rio
	 */

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * get
	 * @return a string do n�mero de celular do funcion�rio
	 */

	public String getNumCelular() {
		return numCelular;
	}
	
	/**
	 * set
	 * @param numCelular uma string do n�mero de celular do funcion�rio
	 */

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}
	
	/**
	 * get
	 * @return a string do email do funcion�rio
	 */

	public String getEmail() {
		return email;
	}
	
	/**
	 * set
	 * @param email uma string do email do funcion�rio
	 */

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * get
	 * @return a string da fun��o do funcion�rio
	 */
	
	public String getFuncao() {
		return funcao;
	}

	/**
	 * set
	 * @param funcao uma string da fun��o do funcion�rio
	 */
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	/**
	 * get
	 * @return a string do endere�o do funcion�rio
	 */
	
	public String getEndereco() {
		return endereco;
	}

	/**
	 * set
	 * @param endereco uma string do endere�o do funcion�rio
	 */
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * get
	 * @return o double do sal�rio do funcionario
	 */
	
	public double getSalario() {
		return salario;
	}

	/**
	 * set
	 * @param salario um double do sal�rio do funcion�rio 
	 */
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}