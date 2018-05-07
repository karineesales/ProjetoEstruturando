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
import javax.swing.SwingConstants;

public class FrameTela2 extends JFrame {
	
	JButton inserir, buscar, remover;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela2 frame = new FrameTela2();
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
	public FrameTela2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista Encadeada Simples");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(107, 28, 218, 28);
		contentPane.add(lblNewLabel);
		
		JButton inserir = new JButton("Inserir");
		inserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela3 frame3 = new FrameTela3();
				frame3.setVisible(true);
			}
		});
		inserir.setFont(new Font("Existence Light", Font.BOLD, 14));
		inserir.setBounds(172, 89, 100, 23);
		contentPane.add(inserir);
		
		JButton bsucar = new JButton("Buscar");
		bsucar.setFont(new Font("Existence Light", Font.BOLD, 14));
		bsucar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela3 frame3 = new FrameTela3();
				frame3.setVisible(true);
			}
		});
		bsucar.setBounds(172, 123, 100, 23);
		contentPane.add(bsucar);
		
		JButton remover = new JButton("Remover");
		remover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela4 frame4 = new FrameTela4();
				frame4.setVisible(true);
			}
		});
		remover.setFont(new Font("Existence Light", Font.BOLD, 14));
		remover.setBounds(172, 157, 100, 23);
		contentPane.add(remover);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela1 frame1 = new FrameTela1();
				frame1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Existence Light", Font.BOLD, 14));
		btnNewButton.setBounds(286, 200, 89, 23);
		contentPane.add(btnNewButton);
	}

}
