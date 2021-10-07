package view;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import principal.*;


/**
 * Cria��o da classe TelaPessoa, onde � criado o menu do ingresso e suas funcionalidades
 * @author Caio C�sar e Lucas Henrique
 * @version 1.0 (Out 2020)
 */

public class TelaIngresso implements ActionListener {	
	
	/// Declara��o dos componentes da GUI
	private JFrame janela;
	private JLabel titulo;
	private JButton proximo;
	private JButton voltar;
	private JLabel labelQntddIngressos = new JLabel("Quantidade de Ingressos: ");
	private JTextField valorQntddIngressos;
	
	/// Declara��o dos dados a serem manipulados
	private int qntddIngressos;
	VendaIngresso venda = new VendaIngresso();
	private int i = 0;
	
	/**
	 * Definir as caracter�sticas da interface do Menu de ingresso como bot�es, t�tulos, janelas e adicion�-los a janela
	 * @param v VendaIngresso que importa os dados do ingresso criados no menu principal (TelaMenu)
	 */
	
	public void criaTelaIngresso(VendaIngresso v){
		venda = v;
	
		/// Cria um container e seus componentes
		janela = new JFrame("Venda de Ingresso");
		titulo = new JLabel("Cadastro de Venda");
		proximo = new JButton("Pr�ximo");
		voltar = new JButton("Voltar");
		valorQntddIngressos = new JTextField(200);
		
		/// Realiza a sele��o de fontes para cada um dos componentes
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		proximo.setFont(new Font("Arial", Font.BOLD, 18));
		voltar.setFont(new Font("Arial", Font.BOLD, 18));
		labelQntddIngressos.setFont(new Font("Arial", Font.BOLD, 18));
		
		/// Realiza o posicionamento dos componentes
		titulo.setBounds(90, 15, 350, 30);
		labelQntddIngressos.setBounds(20, 80, 300, 100);
		valorQntddIngressos.setBounds(255, 118, 180, 25);
		proximo.setBounds(250, 210, 150, 50);
		voltar.setBounds(50, 210, 150, 50);
	
		janela.setLayout(null);
	
		/// Coloca os componentes no container
		janela.add(titulo);
		janela.add(proximo);
		janela.add(voltar);
		this.janela.add(labelQntddIngressos);
		this.janela.add(valorQntddIngressos);

		/// Dados do container
		janela.setSize(500, 325);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		
		/// Detec��o de eventos
		proximo.addActionListener(this);
		voltar.addActionListener(this);
		
		
	}

	/**
	 * Detecta as a��es e redireciona para as op��es e funcionalidades poss�veis
	 * @param e ActionEvent que detecta alguma a��o com algum bot�o
	 */
	
	/// Detec��o de eventos relacionados aos bot�es
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
			/// Leva o usu�rio para a pr�xima p�gina
			if(src == proximo) {
				if ("".equals(valorQntddIngressos.getText().replaceAll("[\\D]", ""))) mensagemErro();
				
				else {
					qntddIngressos = Integer.parseInt(valorQntddIngressos.getText().replaceAll("[\\D]", ""));
					while (i < qntddIngressos) {
						new TelaDetalheIngresso().criarTelaDetalheIngresso(this, venda);
						i ++;
					}
					janela.dispose();
				}
			}
			
			/// Volta para a janela anterior e fecha a atual
			if (src == voltar ) janela.dispose();
	
	}
	
	/**
	 * Mostra uma mensagem que sinaliza erro e solicita que o usu�rio digite um n�mero antes de prosseguir.
	 * A mensagem aparece quando o usu�rio digita qualquer coisa que n�o seja um inteiro.
	 */
	
	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "ERRO!\n" + "Digite um n�mero antes de prosseguir.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}