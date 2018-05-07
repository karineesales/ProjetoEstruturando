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

public class FrameTela19 extends JFrame {
	
	JButton inserir, percorrer, remover, voltar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela19 frame = new FrameTela19();
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
	public FrameTela19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Arvore de Busca Binaria");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(136, 11, 186, 24);
		contentPane.add(lblNewLabel);
		
		JButton inserir = new JButton("Inserir");
		inserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela20 frame20 = new FrameTela20();
				frame20.setVisible(true);
			}
		});
		inserir.setFont(new Font("Existence Light", Font.BOLD, 14));
		inserir.setBounds(156, 77, 122, 25);
		contentPane.add(inserir);
		
		JButton percorrer = new JButton("Percorrer");
		percorrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela21 frame21 = new FrameTela21();
				frame21.setVisible(true);
			}
		});
		percorrer.setFont(new Font("Existence Light", Font.BOLD, 14));
		percorrer.setBounds(156, 125, 122, 24);
		contentPane.add(percorrer);
		
		JButton remover = new JButton("Remover");
		remover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela25 frame25 = new FrameTela25();
				frame25.setVisible(true);
			}
		});
		remover.setFont(new Font("Existence Light", Font.BOLD, 14));
		remover.setBounds(156, 176, 122, 24);
		contentPane.add(remover);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela1 frame1 = new FrameTela1();
				frame1.setVisible(true);
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(322, 214, 89, 23);
		contentPane.add(voltar);
	}

}
