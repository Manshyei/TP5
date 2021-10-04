package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import principal.*;

public class TelaMenu implements ActionListener {
	
	/// Declara��o dos componentes da GUI
	
	private static JFrame janela = new JFrame("Cinema");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton clienteVIP = new JButton("Cliente VIP");
	private static JButton filme = new JButton("Filme");
	private static JButton funcionario = new JButton("Funcion�rio");
	private static JButton sala = new JButton("Sala de Cinema");
	private static JButton ingresso = new JButton("Ingresso");
	private static JButton sair = new JButton("Sair");
	
	/// Declara��o dos dados a serem manipulados
	ClienteVIP cliente = new ClienteVIP();
	Funcionario func = new Funcionario();
	SalaCinema sla = new SalaCinema();
	VendaIngresso vi = new VendaIngresso();
	Filme fil = new Filme();
	
	/// Construtor do menu
	public TelaMenu() {
		
		/// Realiza o pr�-cadastro de dados
		cliente.dadosPreCadastradosClientes();
		func.dadosPreCadastradosFuncionario();
		sla.dadosPreCadastradosSala();
		vi.dadosPreCadastradosVendaIngresso();
		fil.dadosPreCadastradosFilmes();
		
		
		/// Realiza a sele��o de fontes para cada um dos componentes
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		clienteVIP.setFont(new Font("Arial", Font.BOLD, 18));
		filme.setFont(new Font("Arial", Font.BOLD, 18));
		funcionario.setFont(new Font("Arial", Font.BOLD, 18));
		sala.setFont(new Font("Arial", Font.BOLD, 18));
		ingresso.setFont(new Font("Arial", Font.BOLD, 18));
		sair.setFont(new Font("Arial", Font.BOLD, 15));
		
		/// Realiza o posicionamento dos componentes
		titulo.setBounds(140, 0, 300, 75);
		clienteVIP.setBounds(60, 75, 150, 50);
		filme.setBounds(60, 135, 150, 50);
		funcionario.setBounds(260, 75, 150, 50);
		sala.setBounds(140, 200, 200, 50);
		ingresso.setBounds(260, 135, 150, 50);
		sair.setBounds(8, 250, 100, 30);
		
		janela.setLayout(null);
		
		/// Coloca os componentes no container
		janela.add(titulo);
		janela.add(clienteVIP);
		janela.add(filme);
		janela.add(funcionario);
		janela.add(sala);
		janela.add(ingresso);
		janela.add(sair);
		
		/// Dados do container
		janela.setSize(500, 325);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
	}
	
	/// Fun��o main
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		/// Detec��o de eventos
		clienteVIP.addActionListener(menu);
		filme.addActionListener(menu);
		funcionario.addActionListener(menu);
		sala.addActionListener(menu);
		ingresso.addActionListener(menu);
		sair.addActionListener(menu);
	}
	
	/// Detec��o de eventos
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == clienteVIP)
			new TelaPessoa().criaTelaPessoa(1, cliente, func);
		
		if(src == funcionario)
			new TelaPessoa().criaTelaPessoa(2, cliente, func);
		
		if(src == sala)
			new TelaSala().criaTelaSala(sla);
		
		if(src == filme)
			new TelaFilme().criaTelaFilme(fil);
		
		if(src == ingresso)
			new TelaIngresso().criaTelaIngresso(vi);
		
		if(src == sair)
			janela.dispose();
	}
}