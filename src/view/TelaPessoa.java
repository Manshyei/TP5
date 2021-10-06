package view;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import principal.*;

/**
 * Cria��o da classe TelaPessoa, onde � criado o menu do cliente ou funcion�rio e suas funcionalidades
 * @author Caio C�sar e Lucas Henrique
 * @version 1.0 (Out 2020)
 */

public class TelaPessoa implements ActionListener, ListSelectionListener {		
	
	/// Declara��o dos componentes da GUI
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroFuncionario;
	private JButton refreshFuncionario;
	private JButton voltar;
	private JButton pesquisaCliente;
	private JButton pesquisaFuncionario;
	private JButton interrogacao;
	private JTextField campoBusca;
	private JPanel panel = new JPanel(new BorderLayout());
	private JScrollPane ScrollPane = new JScrollPane();
	
	/// Declara��o de JLists para armazenamento de dados
	private JList<String> listaClientesCadastrados;
	private JList<String> listaFuncionariosCadastrados;
	
	/// Declara��o de dados a serem manipulados
	private String[] listaNomes = new String[1000];
	private String cpf;
	private int p;
	ClienteVIP cliente = new ClienteVIP();
	Funcionario funcionario = new Funcionario();
	
	/** 
	 * Definir as caracter�sticas da interface do Menu de clientes ou funcionarios como bot�es, t�tulos, janelas e adicion� los a janela
	 * @param op inteiro que representa a op��o selecionada no menu principal (TelaMenu)
	 * @param c ClienteVIP que importa os dados do cliente criado no menu principal (TelaMenu)
	 * @param f Funcionario que importa os dados do funcion�rio criado no menu principal (TelaMenu)
	 */
	
	public void criaTelaPessoa(int op, ClienteVIP c, Funcionario f){
		cliente = c;
		funcionario = f;
		
		switch (op) {
		
		/* "op" � uma vari�vel que define se o programa est� trabalhando
			com funcion�rios, se op = 2,  ou com clientes, se op = 1 */
	
		
		case 1:/// Mostrar dados de clientes cadastrados (JList)
			
			listaNomes = cliente.visualizarNome();
			listaClientesCadastrados = new JList<String>(listaNomes);
			
			/// Cria um container e seus componentes
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Atualizar Lista");
			voltar = new JButton("Voltar");
			pesquisaCliente = new JButton("Buscar");
			interrogacao = new JButton("?");
			campoBusca = new JTextField(200);
			
			/// Realiza a sele��o de fontes para cada um dos componentes
			titulo.setFont(new Font("Arial", Font.BOLD, 30));
			cadastroCliente.setFont(new Font("Arial", Font.BOLD, 17));
			refreshCliente.setFont(new Font("Arial", Font.BOLD, 17));
			listaClientesCadastrados.setFont(new Font("Arial", Font.BOLD, 15));
			voltar.setFont(new Font("Arial", Font.BOLD, 17));
			pesquisaCliente.setFont(new Font("Arial", Font.BOLD, 15));
			interrogacao.setFont(new Font("Arial", Font.BOLD, 20));

			/// Realiza o posicionamento dos componentes
			titulo.setBounds(90, 15, 350, 30);
			panel.setBounds(40, 110, 400, 140);
			cadastroCliente.setBounds(166, 280, 150, 50);
			refreshCliente.setBounds(326, 280, 150, 50);
			voltar.setBounds(7, 280, 150, 50);
			pesquisaCliente.setBounds(260, 70, 100, 25);
			interrogacao.setBounds(370, 70, 50, 25);
			campoBusca.setBounds(60, 70, 185, 25);
			ScrollPane.setViewportView(listaClientesCadastrados);
			listaClientesCadastrados.setLayoutOrientation(JList.VERTICAL);
	        panel.add(ScrollPane);

			janela.setLayout(null);

			
			/// Coloca os componentes no container
			janela.add(titulo);
			janela.add(cadastroCliente);
			janela.add(refreshCliente);
			janela.add(panel);
			janela.add(voltar);
			janela.add(pesquisaCliente);
			janela.add(interrogacao);
			janela.add(campoBusca);

			/// Dados do container
			janela.setSize(500, 390);
			janela.setVisible(true);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);

			/// Detec��o de eventos
			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			voltar.addActionListener(this);
			pesquisaCliente.addActionListener(this);
			interrogacao.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);
			

			break;

		case 2:// Mostrar dados de funcion�rios cadastrados (JList)
			
			listaNomes = funcionario.visualizarNome();
			listaFuncionariosCadastrados = new JList<String>(listaNomes);
			
			/// Cria um container e seus componentes
			janela = new JFrame("Funcion�rios");
			titulo = new JLabel("Funcion�rios Cadastrados");
			cadastroFuncionario = new JButton("Cadastrar");
			refreshFuncionario = new JButton("Atualizar Lista");
			voltar = new JButton("Voltar");
			pesquisaFuncionario = new JButton("Buscar");
			interrogacao = new JButton("?");
			campoBusca = new JTextField(200);

			/// Realiza a sele��o de fontes para cada um dos componentes
			titulo.setFont(new Font("Arial", Font.BOLD, 30));
			cadastroFuncionario.setFont(new Font("Arial", Font.BOLD, 17));
			refreshFuncionario.setFont(new Font("Arial", Font.BOLD, 17));
			listaFuncionariosCadastrados.setFont(new Font("Arial", Font.BOLD, 15));
			voltar.setFont(new Font("Arial", Font.BOLD, 17));
			pesquisaFuncionario.setFont(new Font("Arial", Font.BOLD, 15));
			interrogacao.setFont(new Font("Arial", Font.BOLD, 20));

			/// Realiza o posicionamento dos componentes
			titulo.setBounds(65, 15, 400, 30);
			panel.setBounds(40, 110, 400, 140);
			ScrollPane.setViewportView(listaFuncionariosCadastrados);
			listaFuncionariosCadastrados.setLayoutOrientation(JList.VERTICAL);
	        panel.add(ScrollPane);
			cadastroFuncionario.setBounds(166, 280, 150, 50);
			refreshFuncionario.setBounds(326, 280, 150, 50);
			voltar.setBounds(7, 280, 150, 50);
			pesquisaFuncionario.setBounds(260, 70, 100, 25);
			interrogacao.setBounds(370, 70, 50, 25);
			campoBusca.setBounds(60, 70, 185, 25);
			
			janela.setLayout(null);
			
			/// Coloca os componentes no container
			janela.add(titulo);
			janela.add(cadastroFuncionario);
			janela.add(refreshFuncionario);
			janela.add(voltar);
			janela.add(pesquisaFuncionario);
			janela.add(interrogacao);
			janela.add(panel);
			janela.add(campoBusca);

			/// Dados do container
			janela.setSize(500, 390);
			janela.setVisible(true);
			janela.setLocationRelativeTo(null);
			janela.setResizable(false);

			/// Detec��o de eventos
			cadastroFuncionario.addActionListener(this);
			refreshFuncionario.addActionListener(this);
			voltar.addActionListener(this);
			pesquisaFuncionario.addActionListener(this);
			interrogacao.addActionListener(this);
			listaFuncionariosCadastrados.addListSelectionListener(this);
			
			break;

			/// Caso em que, por algum motivo, op n�o recebe nem 1 nem 2
		default:
			JOptionPane.showMessageDialog(null,"Op��o n�o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}
	
	/**
	 * Detecta as a��es e redireciona para as op��es e funcionalidades poss�veis
	 * @param e ActionEvent que detecta alguma a��o com algum bot�o
	 */

	/// Detec��o de eventos relacionados aos bot�es
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		/// Cadastro de cliente
		if(src == cadastroCliente) 
			new TelaDetalhePessoa().criarTelaDetalhePessoa(1, this, cliente, funcionario, 0);

		/// Cadastro de funcion�rio
		if(src == cadastroFuncionario)
			new TelaDetalhePessoa().criarTelaDetalhePessoa(2, this, cliente, funcionario, 0);

		/// Atualiza a lista de clientes
		if(src == refreshCliente) {
			listaClientesCadastrados.setListData(cliente.visualizarNome());			
			listaClientesCadastrados.updateUI();
		}

		/// Atualiza a lista de funcion�rios
		if(src == refreshFuncionario) {
			listaFuncionariosCadastrados.setListData(funcionario.visualizarNome());
			listaFuncionariosCadastrados.updateUI();
		}
		
		/// Volta para a janela anterior e fecha a atual
		if (src == voltar ) janela.dispose();
		
		/// Mecanismo de pesquisa para cliente;
		if (src == pesquisaCliente) {
			ClienteVIP c = new ClienteVIP();
			cpf = campoBusca.getText().replaceAll("[\\D]", "");
			p = cliente.retornaPos(cpf);
			if (p == -1) {
				c.produtoNaoEncontrado();
				listaClientesCadastrados.setListData(c.visualizarNome());
				listaClientesCadastrados.updateUI();
			}
			else {
				for (int i = 0; i < p; i ++) c.cadastrarvazio();
				c.cadastrar(cliente.buscar(cpf));
				listaClientesCadastrados.setListData(c.visualizarNome());
				listaClientesCadastrados.updateUI();
			}
		}
		
		/// Mecanismo de pesquisa para funcionario;
		if (src == pesquisaFuncionario) {
			Funcionario f = new Funcionario();
			cpf = campoBusca.getText().replaceAll("[\\D]", "");
			p = funcionario.retornaPos(cpf);
			if (p == -1) {
				f.produtoNaoEncontrado();
				listaFuncionariosCadastrados.setListData(f.visualizarNome());
				listaFuncionariosCadastrados.updateUI();
			}
			else {
				for (int i = 0; i < p; i ++) f.cadastrarvazio();
				f.cadastrar(funcionario.buscar(cpf));
				listaFuncionariosCadastrados.setListData(f.visualizarNome());
				listaFuncionariosCadastrados.updateUI();
			
			}
		}
		
		if (src == interrogacao) mensagemDuvida();
			
	}
	
	/**
	 * Detecta as a��es e redireciona para as op��es e funcionalidades poss�veis
	 * @param e ListSelectionEvent que detecta alguma a��o com alguma op��o da lista
	 */

	/// Detec��o de eventos relacionados � lista de clientes ou funcion�rios
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		try {
			/// Seleciona algum cliente da lista para editar
			if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
				new TelaDetalhePessoa().criarTelaDetalhePessoa(3, this, cliente, funcionario,
						listaClientesCadastrados.getSelectedIndex());
			}
			
			/// Seleciona algum funcion�rio da lista para editar
			if(e.getValueIsAdjusting() && src == listaFuncionariosCadastrados) {
				new TelaDetalhePessoa().criarTelaDetalhePessoa(4, this, cliente, funcionario,
						listaFuncionariosCadastrados.getSelectedIndex());
			}
		} catch (IndexOutOfBoundsException exc) {
			JOptionPane.showMessageDialog(null,"ERRO!\n" + "Usu�rio n�o econtrado!\n\n", null, 
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Mostra uma mensagem para responder a d�vida sobre como pesquisar no campo de busca
	 */
	
	public void mensagemDuvida() {
		JOptionPane.showMessageDialog(null, "Digite o CPF do usu�rio desejado na barra de busca.", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}

}