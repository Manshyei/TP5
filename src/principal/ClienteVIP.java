package principal;

import java.util.*;

/**
 * Cria��o da classe ClienteVIP, seus dados pr� cadastrados e seus respectivos m�todos
 * @author Caio C�sar e Lucas Henrique
 * @version 1.0 (Out 2020)
 */

public class ClienteVIP extends Pessoa {
	
	// ----------------- ATRIBUTOS ----------------- //
	
	private String generoFavorito;
	private int qntddFilmesVistos;
	private String planoAssinatura;
	
	/**
	 * Cria��o da super
	 */
	
	public ClienteVIP(){
		super();
	}
	
	// ---------------- CONSTRUTOR ---------------- // 
	
	/**
	 * Cria��o do contrutor da classe ClienteVIP com os atributos da classe abstrata Pessoa e seus pr�prios atributos
	 * @param primNome uma string que contenha o primeiro nome do cliente
	 * @param ultNome uma string que contenha o ultimo nome do cliente
	 * @param data uma string que contenha a data de nascimento do cliente
	 * @param c uma string que contenha o CPF do cliente
	 * @param numCel uma string que contenha o numero de celular do cliente
	 * @param email uma string que contenha o email do cliente
	 * @param genFav uma string que contenha o genero favorito do cliente
	 * @param qntddFilmesVistos um inteiro que contenha a quantidade de filmes vistos do cliente
	 * @param planAss uma string que contenha o plano de assinatura do cliente
	 */
	
	// Sobrecarga
	public ClienteVIP(String primNome, String ultNome, String data, String c, String numCel, String email, String genFav, int qntddFilmesVistos, String planAss) {
		primeiroNome = primNome;
		ultimoNome = ultNome;
		dataNascimento = data;
		cpf = c;
		numCelular = numCel;
		this.email = email;
		generoFavorito = genFav;
		this.qntddFilmesVistos = qntddFilmesVistos;
		planoAssinatura = planAss;
	}
	
	/**
	 * Cria��o do contrutor da classe ClienteVIP com sobrecarga
	 * @param primNome uma string que contenha o primeiro nome do cliente
	 * @param ultNome uma string que contenha o ultimo nome do cliente
	 * @param data uma string que contenha a data de nascimento do cliente
	 * @param c uma string que contenha o CPF do cliente
	 * @param numCel uma string que contenha o numero de celular do cliente
	 * @param email uma string que contenha o email do cliente
	 */
	
	public ClienteVIP(String primNome, String ultNome, String data, String c, String numCel, String email) {
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
	ArrayList<ClienteVIP> dadosCliente = new ArrayList<ClienteVIP>();
	
	// Pr�-cadastro de dados do cliente:
	
	/**
	 * Cria��o de dados pr� cadastrados usando o contrutor do ClienteVIP e adi��o destes no ArrayList do tipo ClienteVIP
	 */
	
	public void dadosPreCadastradosClientes() {
		ClienteVIP cliente1 = new ClienteVIP("Caio", "Oliveira", "19/10/2001", "014.123.456-43", "(61)-99321-4506", "caioOliveira@hotmail.com", "A��o", 5, "Mensal");
		ClienteVIP cliente2 = new ClienteVIP("Lucas", "Queiroz", "23/08/2001", "324.576.472-04", "(61)-99431-4792", "lucasQueiroz@hotmail.com", "Com�dia", 3, "Anual");
		ClienteVIP cliente3 = new ClienteVIP("Joana", "Barboza", "01/01/1999", "577.165.890-81", "(62)-98232-9175", "joanaBarboza@gmail.com", "Aventura", 10, "Semestral");
		ClienteVIP cliente4 = new ClienteVIP("Maicon", "Torres", "10/09/2002", "768.019.355-91", "(61)-98651-0194", "maiconTorres@hotmail.com", "Terror", 2, "Mensal");
		ClienteVIP cliente5 = new ClienteVIP("Maria", "Monaliza", "07/12/1998", "943.987.185-01", "(62)-99184-0192", "mariaMonaliza@hotmail.com", "Policial", 20, "Mensal");
		
		dadosCliente.add(cliente1);
		dadosCliente.add(cliente2);
		dadosCliente.add(cliente3);
		dadosCliente.add(cliente4);
		dadosCliente.add(cliente5);

	}
	

	
	// ------------------ METODOS ------------------- //
	
	/**
	 * Cadastro do parametro cliente no ArrayList do tipo ClienteVIP, sendo inserido ao final deste Array
	 * @param cliente um ClienteVIP que contenha todos os dados do construtor
	 */
	
	// Funcao para cadastrar os dados de Cliente:
	public void cadastrar(ClienteVIP cliente) {
		dadosCliente.add(cliente);
	}
	
	/**
	 * Cadastro de um cliente vazio, usado normalmente para ocupar posi��es sem utilidade
	 */
	
	// Funcao para cadastrar um cliente vazio:
	public void cadastrarvazio() {
		ClienteVIP cliente = new ClienteVIP("", "", "", "", "", "", "", 0, "");
		dadosCliente.add(cliente);
	}
	
	/**
	 * Cadastro de um cliente apenas com o primeiro nome, para retornar a seguinte frase na lista da interface "N�o foram encontrados resultados..."
	 */
	
	// Funcao para retornar que n�o foram encontrados resultados:
	public void produtoNaoEncontrado() {
		ClienteVIP cliente = new ClienteVIP("N�o foram encontrados resultados...", "", "", "", "", "", "", 0, "");
		dadosCliente.add(cliente);
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo ClienteVIP o cliente que tenha o CPF igual ao que foi recebido no par�metro
	 * @param cpf uma string que contenha o CPF do cliente
	 * @return um cliente tirado de dentro do ArrayList do tipo ClienteVIP com o CPF igual ao par�metro ou null, indica se o cliente com o CPF igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar um Cliente Especifico por CPF e retorn�-lo:
	public ClienteVIP buscar(String cpf) {
		for(int i = 0; i < dadosCliente.size(); i ++) 
			if(cpf.equals(dadosCliente.get(i).getCpf().replaceAll("[\\D]", ""))) {
				return dadosCliente.get(i);
			}
		return null;
	}
	
	/**
	 * Buscar dentro do ArrayList do tipo ClienteVIP o cliente que tenha o CPF igual ao que foi recebido no par�metro
	 * @param cpf uma string que contenha o CPF do cliente
	 * @return a posi��o do cliente tirado de dentro do ArrayList do tipo ClienteVIP com o CPF igual ao par�metro ou -1, indica se o cliente com o CPF igual foi encontrado ou n�o
	 */
	
	// Funcao para buscar um Cliente Especifico por CPF e retornar sua posi��o:
	public int retornaPos(String cpf) {
		for(int i = 0; i < dadosCliente.size(); i ++) 
			if(cpf.equals(dadosCliente.get(i).getCpf().replaceAll("[\\D]", ""))) {
				return i;
			}
		return -1;
	}
	
	/**
	 * Editar um cliente dentro do ArrayList do tipo ClienteVIP usando o m�todo de deletar o cliente com dados antigos e adicionar um novo cliente com os dados atualizados no Array
	 * @param cliente um ClienteVIP que contenha todos os dados do construtor
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 */
	
	// Funcao para editar um Cliente:
	public void editar(ClienteVIP cliente, int pos) {
		deletar(pos);
		cadastrar(cliente);
		
//		dadosCliente.get(pos).email = cliente.email;
//		dadosCliente.get(pos).generoFavorito = cliente.generoFavorito;
//		dadosCliente.get(pos).numCelular = cliente.numCelular;
//		dadosCliente.get(pos).planoAssinatura = cliente.planoAssinatura;
//		dadosCliente.get(pos).qntddFilmesVistos = cliente.qntddFilmesVistos;
	}
	
	/**
	 * Deletar um cliente dentro do ArrayList do tipo ClienteVIP usando a sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 */
	
	// Funcao para deletar um Cliente:
	public void deletar(int pos) {
		dadosCliente.remove(dadosCliente.get(pos));
	}
	
	/**
	 * Chama os atributos de cliente de forma organizada 
	 * @return os atributos de cliente de forma organizada
	 */
	
	// Chamada de todos os dados de um Cliente:
	public String toString() {	
		return "Nome do cliente VIP: " + primeiroNome + " " + ultimoNome + "\n" 
			   + "Data de Nascimento: " + dataNascimento + "\n" + "CPF: " + cpf + "\n" 
			   + "N�mero de Celular: " + numCelular + "\n" + "E-mail:" + email + "\n" 
			   + "G�nero Favorito: " + generoFavorito + "\n" + "Quantidade de Filmes Vistos: "
			   + qntddFilmesVistos + "\n" + "Plano de Assinatura: " + planoAssinatura + "\n";
	}
	
	/**
	 * Reune todos os primeiros nomes dos clientes em um vetor de string de forma ordenada
	 * @return o vetor de string com todos os primeiros nomes dos clientes de forma ordenada
	 */
	
	// Funcao para visualizar o primeiro nome dos clientes e retornar um vetor de string com eles na mesma ordem do arraylist:
	public String[] visualizarNome() {
		String[] var = new String [1000];
		for(int i = 0; i < dadosCliente.size(); i ++) {
			var[i] = dadosCliente.get(i).getPrimeiroNome();
		}
		return var;
	}
	
	/**
	 * Retornar o primeiro nome de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string do primeiro nome do cliente espec�fico
	 */
	
	// Funcoes a seguir s�o para retornar os dados de clientes espec�ficos dentro do arraylist com base nas suas posi��es (Gets):
	public String retornaPrimNome(int pos) {
			return dadosCliente.get(pos).getPrimeiroNome();
	}
	
	/**
	 * Retornar a data de nascimento de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string da data de nascimento do cliente espec�fico
	 */
	
	public String retornaData(int pos) {
		return dadosCliente.get(pos).getDataNascimento();
	}
	
	/**
	 * Retornar o �ltimo nome de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string do �ltimo nome do cliente espec�fico
	 */
	
	public String retornaUltNome(int pos) {
		return dadosCliente.get(pos).getUltimoNome();
	}
	
	/**
	 * Retornar o CPF de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string do CPF do cliente espec�fico
	 */
	
	public String retornaCPF(int pos) {
		return dadosCliente.get(pos).getCpf();
	}
	
	/**
	 * Retornar o n�mero de celular de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string do n�mero de celular do cliente espec�fico
	 */
	
	public String retornaNumCel(int pos) {
		return dadosCliente.get(pos).getNumCelular();
	}
	
	/**
	 * Retornar o email de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string do email do cliente espec�fico
	 */
	
	public String retornaEmail(int pos) {
		return dadosCliente.get(pos).getEmail();
	}
	
	/**
	 * Retornar o g�nero favorito de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string do g�nero favorito do cliente espec�fico
	 */
	
	public String retornaGenFav(int pos) {
		return dadosCliente.get(pos).getGeneroFavorito();
	}
	
	/**
	 * Retornar a quantidade de filmes vistos de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string da quantidade de filmes vistos do cliente espec�fico
	 */
	
	public int retornaQntddFilmesVistos(int pos) {
		return dadosCliente.get(pos).getQntddFilmesVistos();
	}
	
	/**
	 * Retornar o plano de assinatura de um cliente espec�fico dentro do ArrayList do tipo ClienteVIP com base na sua posi��o
	 * @param pos um inteiro que contenha a posi��o do cliente no ArrayList do tipo ClienteVIP
	 * @return a string do plano de assinatura do cliente espec�fico
	 */
	
	public String retornaPlanoAss(int pos) {
		return dadosCliente.get(pos).getPlanoAssinatura();
	}
	
	// ------------ GETTERS AND SETTERS ------------ //
	
	/**
	 * get
	 * @return a string do primeiro nome do cliente espec�fico
	 */
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	/**
	 * set
	 * @param primeiroNome uma string do primeiro nome do cliente
	 */

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	/**
	 * get
	 * @return a string do �ltimo nome do cliente
	 */

	public String getUltimoNome() {
		return ultimoNome;
	}
	
	/**
	 * set
	 * @param ultimoNome uma string do �ltimo nome do cliente
	 */

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	/**
	 * get
	 * @return a string da data de nascimento do cliente
	 */

	public String getDataNascimento() {
		return dataNascimento;
	}
	
	/**
	 * set
	 * @param dataNascimento uma string da data de nascimento do cliente
	 */

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	/**
	 * get
	 * @return a string do CPF do cliente
	 */

	public String getCpf() {
		return cpf;
	}
	
	/**
	 * set
	 * @param cpf uma string do CPF do cliente
	 */

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * get
	 * @return a string do n�mero de celular do cliente
	 */

	public String getNumCelular() {
		return numCelular;
	}
	
	/**
	 * set
	 * @param numCelular uma string do n�mero de celular do cliente
	 */

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}
	
	/**
	 * get
	 * @return a string do email do cliente
	 */

	public String getEmail() {
		return email;
	}
	
	/**
	 * set
	 * @param email uma string do email do cliente
	 */

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * get
	 * @return a string do g�nero favorito do cliente
	 */
	
	public String getGeneroFavorito() {
		return generoFavorito;
	}
	
	/**
	 * set
	 * @param generoFavorito uma string do g�nero favorito do cliente
	 */
	
	public void setGeneroFavorito(String generoFavorito) {
		this.generoFavorito = generoFavorito;
	}
	
	/**
	 * get
	 * @return a string da quantidade de filmes vistos do cliente
	 */
	
	public int getQntddFilmesVistos() {
		return qntddFilmesVistos;
	}
	
	/**
	 * set
	 * @param qntddFilmesVistos um inteiro da quantidade de filmes vistos do cliente
	 */
	
	public void setQntddFilmesVistos(int qntddFilmesVistos) {
		this.qntddFilmesVistos = qntddFilmesVistos;
	}
	
	/**
	 * get
	 * @return a string do plano de assinaturas do cliente
	 */
	
	public String getPlanoAssinatura() {
		return planoAssinatura;
	}
	
	/**
	 * set
	 * @param planoAssinatura uma string do plano de assinatura do cliente
	 */
	
	public void setPlanoAssinatura(String planoAssinatura) {
		this.planoAssinatura = planoAssinatura;
	}
		
}
