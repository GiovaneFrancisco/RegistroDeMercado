package com.br.gff.apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class telaLoginMerc extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPasswordField psfSenha;
	private JPanel pnlBotoes;
	private JRadioButton rdbtnOperacional;
	private JRadioButton rdbtnGerncia;
	private JPanel pnlSenha;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLoginMerc frame = new telaLoginMerc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaLoginMerc() {
		setTitle("Tela Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 200);
		setSize(new Dimension(440, 150));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.NORTH);
		
		rdbtnOperacional = new JRadioButton("Operacional");
		rdbtnOperacional.setSelected(true);
		rdbtnOperacional.addActionListener(this);
		rdbtnOperacional.setActionCommand("operacional");
		pnlBotoes.add(rdbtnOperacional);
		
		rdbtnGerncia = new JRadioButton("Ger\u00EAncia");
		rdbtnGerncia.addActionListener(this);
		rdbtnGerncia.setActionCommand("gerencia");
		pnlBotoes.add(rdbtnGerncia);
		
		pnlSenha = new JPanel();
		contentPane.add(pnlSenha, BorderLayout.CENTER);
		
		JLabel lblSenha = new JLabel("Senha:");
		pnlSenha.add(lblSenha);
		pnlSenha.setVisible(false);
		
		psfSenha = new JPasswordField();
		psfSenha.setColumns(20);
		pnlSenha.add(psfSenha);
		
		JPanel pnlBotao = new JPanel();
		contentPane.add(pnlBotao, BorderLayout.SOUTH);
		
		btnOk = new JButton("Ok");
		btnOk.setBackground(SystemColor.menu);
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		pnlBotao.add(btnOk);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnGerncia);
		grupo.add(rdbtnOperacional);
		
		
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JFrame tela = null;
		if(rdbtnOperacional.isSelected()) {
			pnlSenha.setVisible(false);
		}else {
			pnlSenha.setVisible(true);
		}
		if(cmd.equals("ok")) {
			if(rdbtnOperacional.isSelected()) {
				tela = new TelaCadastroMerc();
			}else {
				//TODO implementar tela de opções de gerência
				String senha = new String (psfSenha.getPassword());
			}
			tela.setVisible(true);
			this.dispose();
		}
	}

}
