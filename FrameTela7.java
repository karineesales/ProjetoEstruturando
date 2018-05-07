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

public class FrameTela7 extends JFrame {
	
	JButton inicio, fim;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela7 frame = new FrameTela7();
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
	public FrameTela7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserir:");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(193, 32, 60, 19);
		contentPane.add(lblNewLabel);
		
		JButton inicio = new JButton("No inicio");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela8 frame7 = new FrameTela8();
				frame7.setVisible(true);
			}
		});
		inicio.setFont(new Font("Existence Light", Font.BOLD, 14));
		inicio.setBounds(175, 77, 109, 23);
		contentPane.add(inicio);
		
		JButton fim = new JButton("No fim");
		fim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela9 frame9 = new FrameTela9();
				frame9.setVisible(true);
			}
		});
		fim.setFont(new Font("Existence Light", Font.BOLD, 14));
		fim.setBounds(175, 132, 109, 23);
		contentPane.add(fim);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela6 frame6 = new FrameTela6();
				frame6.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Existence Light", Font.BOLD, 14));
		btnNewButton.setBounds(297, 183, 89, 23);
		contentPane.add(btnNewButton);
	}

}
