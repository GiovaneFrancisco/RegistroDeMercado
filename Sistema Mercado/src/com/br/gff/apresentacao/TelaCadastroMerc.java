package com.br.gff.apresentacao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaCadastroMerc extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnEntrada;
	private JButton btnSaida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroMerc frame = new TelaCadastroMerc();
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
	public TelaCadastroMerc() {
		setTitle("Cadastro de produto");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEntrada = new JButton("Entrada de produto");
		btnEntrada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEntrada.setForeground(SystemColor.desktop);
		btnEntrada.setBackground(SystemColor.menu);
		btnEntrada.addActionListener(this);
		btnEntrada.setActionCommand("entrada");
		btnEntrada.setBounds(0, 0, 194, 171);
		contentPane.add(btnEntrada);
		
		btnSaida = new JButton("Sa\u00EDda de produto");
		btnSaida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaida.setForeground(SystemColor.desktop);
		btnSaida.setBackground(SystemColor.menu);
		btnSaida.addActionListener(this);
		btnSaida.setActionCommand("saida");
		btnSaida.setBounds(194, 0, 200, 171);
		contentPane.add(btnSaida);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();		
		JFrame tela = null;
		if(cmd.equals("entrada")) {
			//TODO implementar tela entrada de produto
		}else {
			//TODO implementar tela saída de produto
		}
		
		
		
	}
}
