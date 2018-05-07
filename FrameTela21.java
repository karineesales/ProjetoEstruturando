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

public class FrameTela21 extends JFrame {
	
	JButton inOrder, preOrder, posOrder, voltar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela21 frame = new FrameTela21();
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
	public FrameTela21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Percorrer:");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(173, 11, 86, 19);
		contentPane.add(lblNewLabel);
		
		JButton inOrder = new JButton("In Order");
		inOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela22 frame22 = new FrameTela22();
				frame22.setVisible(true);
			}
		});
		inOrder.setFont(new Font("Existence Light", Font.BOLD, 14));
		inOrder.setBounds(163, 60, 103, 23);
		contentPane.add(inOrder);
		
		JButton preOrder = new JButton("Pre Order");
		preOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela23 frame23 = new FrameTela23();
				frame23.setVisible(true);
			}
		});
		preOrder.setFont(new Font("Existence Light", Font.BOLD, 14));
		preOrder.setBounds(163, 109, 103, 23);
		contentPane.add(preOrder);
		
		JButton posOrder = new JButton("Pos Order");
		posOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela24 frame24 = new FrameTela24();
				frame24.setVisible(true);
			}
		});
		posOrder.setFont(new Font("Existence Light", Font.BOLD, 14));
		posOrder.setBounds(163, 163, 103, 23);
		contentPane.add(posOrder);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela19 frame19 = new FrameTela19();
				frame19.setVisible(true);
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(324, 205, 89, 23);
		contentPane.add(voltar);
	}

}
