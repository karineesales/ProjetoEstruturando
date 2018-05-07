package br.ufpb.estruturando;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameTela15 extends JFrame {
	
	JButton assistir, animacao, voltar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela15 frame = new FrameTela15();
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
	public FrameTela15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Voce deseja...");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(170, 11, 109, 26);
		contentPane.add(lblNewLabel);
		
		JButton assistir = new JButton("Assistir video aula");
		assistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Painel 21
			}
		});
		assistir.setFont(new Font("Existence Light", Font.BOLD, 14));
		assistir.setBounds(152, 73, 164, 26);
		contentPane.add(assistir);
		
		JButton animacao = new JButton("Criar animacao");
		animacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Painel 22
			}
		});
		animacao.setFont(new Font("Existence Light", Font.BOLD, 14));
		animacao.setBounds(152, 133, 164, 26);
		contentPane.add(animacao);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela11 frame11 = new FrameTela11();
				frame11.setVisible(true);
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(318, 207, 89, 23);
		contentPane.add(voltar);
	}

}
