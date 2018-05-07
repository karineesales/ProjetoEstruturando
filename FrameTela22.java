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

public class FrameTela22 extends JFrame {
	
	JButton assistir, voltar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela22 frame = new FrameTela22();
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
	public FrameTela22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Voce deseja...");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(172, 11, 118, 19);
		contentPane.add(lblNewLabel);
		
		JButton assistir = new JButton("Assistir video aula");
		assistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Painel 26
			}
		});
		assistir.setFont(new Font("Existence Light", Font.BOLD, 14));
		assistir.setBounds(148, 73, 171, 25);
		contentPane.add(assistir);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela21 frame21 = new FrameTela21();
				frame21.setVisible(true);
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(323, 198, 89, 23);
		contentPane.add(voltar);
	}

}
