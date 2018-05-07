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

public class FrameTela10 extends JFrame {
	
	JButton assistir, animacao, voltar;
	private JPanel contentPane;
	private final JButton btnNewButton_2 = new JButton("Voltar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela10 frame = new FrameTela10();
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
	public FrameTela10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Voc\u00EA deseja...");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(166, 11, 107, 28);
		contentPane.add(lblNewLabel);
		
		JButton assistir = new JButton("Assistir video aula");
		assistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PAINEL 12
			}
		});
		assistir.setFont(new Font("Existence Light", Font.BOLD, 14));
		assistir.setBounds(144, 65, 167, 28);
		contentPane.add(assistir);
		
		JButton animacao = new JButton("Criar animacao");
		animacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PAINEL 13
			}
		});
		animacao.setFont(new Font("Existence Light", Font.BOLD, 14));
		animacao.setBounds(144, 133, 167, 28);
		contentPane.add(animacao);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela6 frame5 = new FrameTela6();
				frame5.setVisible(true);
				
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(304, 201, 89, 23);
		contentPane.add(voltar);
		
		
	}

}
