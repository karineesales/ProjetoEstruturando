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

public class FrameTela3 extends JFrame {
	
	JButton assistir, animacao;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela3 frame = new FrameTela3();
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
	public FrameTela3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVocDeseja = new JLabel("Voc\u00EA deseja ...");
		lblVocDeseja.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblVocDeseja.setBounds(137, 23, 149, 36);
		contentPane.add(lblVocDeseja);
		
		JButton assistir = new JButton("Assistir v\u00EDdeo aula");
		assistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PAINEL 1
			}
		});
		assistir.setFont(new Font("Existence Light", Font.BOLD, 14));
		assistir.setBounds(147, 82, 158, 23);
		contentPane.add(assistir);
		
		JButton animacao = new JButton("Criar anima\u00E7\u00E3o");
		animacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PAINEL 2			
			}
		});
		animacao.setFont(new Font("Existence Light", Font.BOLD, 14));
		animacao.setBounds(147, 131, 158, 23);
		contentPane.add(animacao);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela2 frame2 = new FrameTela2();
				frame2.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Existence Light", Font.BOLD, 14));
		btnNewButton.setBounds(310, 202, 89, 23);
		contentPane.add(btnNewButton);
	}

}
