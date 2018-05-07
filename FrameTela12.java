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

public class FrameTela12 extends JFrame {
	
	JButton inicio, fim, voltar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela12 frame = new FrameTela12();
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
	public FrameTela12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserir:");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(188, 11, 57, 19);
		contentPane.add(lblNewLabel);
		
		JButton inicio = new JButton("No inicio");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela13 frame13 = new FrameTela13();
				frame13.setVisible(true);
			}
		});
		inicio.setFont(new Font("Existence Light", Font.BOLD, 14));
		inicio.setBounds(170, 65, 105, 25);
		contentPane.add(inicio);
		
		JButton fim = new JButton("No fim");
		fim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela14 frame14 = new FrameTela14();
				frame14.setVisible(true);
			}
		});
		fim.setFont(new Font("Existence Light", Font.BOLD, 14));
		fim.setBounds(170, 125, 105, 25);
		contentPane.add(fim);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela11 frame11 = new FrameTela11();
				frame11.setVisible(true);
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(289, 176, 110, 30);
		contentPane.add(voltar);
	}

}
