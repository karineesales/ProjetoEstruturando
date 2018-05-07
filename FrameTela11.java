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

public class FrameTela11 extends JFrame {
	
	JButton inserir, buscar, percorrer, remover, voltar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela11 frame = new FrameTela11();
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
	public FrameTela11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista Duplamente Encadeada com Sentinela");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(66, 22, 342, 36);
		contentPane.add(lblNewLabel);
		
		JButton inserir = new JButton("Inserir");
		inserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela12 frame12 = new FrameTela12();
				frame12.setVisible(true);
			}
		});
		inserir.setFont(new Font("Existence Light", Font.BOLD, 14));
		inserir.setBounds(163, 80, 109, 23);
		contentPane.add(inserir);
		
		JButton buscar = new JButton("Buscar");
		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Painel 19
			}
		});
		buscar.setFont(new Font("Existence Light", Font.BOLD, 14));
		buscar.setBounds(163, 114, 109, 23);
		contentPane.add(buscar);
		
		JButton percorrer = new JButton("Percorrer");
		percorrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Painel 20
			}
		});
		percorrer.setFont(new Font("Existence Light", Font.BOLD, 14));
		percorrer.setBounds(163, 148, 109, 23);
		contentPane.add(percorrer);
		
		JButton remover = new JButton("Remover");
		remover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela15 frame15 = new FrameTela15();
				frame15.setVisible(true);
			}
		});
		remover.setFont(new Font("Existence Light", Font.BOLD, 14));
		remover.setBounds(163, 182, 109, 23);
		contentPane.add(remover);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela1 frame1 = new FrameTela1();
				frame1.setVisible(true);
				
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(319, 216, 89, 23);
		contentPane.add(voltar);
	}

}
