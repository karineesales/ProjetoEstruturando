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

public class FrameTela16 extends JFrame {
	
	JButton merge, quick, voltar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela16 frame = new FrameTela16();
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
	public FrameTela16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Algoritmos de Ordenacao");
		lblNewLabel.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(130, 11, 215, 19);
		contentPane.add(lblNewLabel);
		
		JButton merge = new JButton("Merge Sort");
		merge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela17 frame17 = new FrameTela17();
				frame17.setVisible(true);
			}
		});
		merge.setFont(new Font("Existence Light", Font.BOLD, 14));
		merge.setBounds(130, 66, 197, 29);
		contentPane.add(merge);
		
		JButton quick = new JButton("Quick Sort");
		quick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela18 frame18 = new FrameTela18();
				frame18.setVisible(true);
			}
		});
		quick.setFont(new Font("Existence Light", Font.BOLD, 14));
		quick.setBounds(130, 120, 197, 29);
		contentPane.add(quick);
		
		JButton voltar = new JButton("Voltar");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela1 frame1 = new FrameTela1();
				frame1.setVisible(true);
			}
		});
		voltar.setFont(new Font("Existence Light", Font.BOLD, 14));
		voltar.setBounds(315, 192, 89, 23);
		contentPane.add(voltar);
	}

}
