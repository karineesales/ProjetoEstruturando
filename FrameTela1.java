package br.ufpb.estruturando;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameTela1 extends JFrame {
	
	JButton b1, b2, b3, b4, b5;
	JLabel l1;
	private JPanel contentPane;
	FrameTela2 frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTela1 frame = new FrameTela1();
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
	public FrameTela1() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rafaelly Santana\\Documents\\14625241_1044310512334996_2032877412_n.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Estruturando");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaOContedo = new JLabel("Escolha o conte\u00FAdo:");
		lblEscolhaOContedo.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblEscolhaOContedo.setBounds(155, 46, 163, 14);
		contentPane.add(lblEscolhaOContedo);
		
		JButton b1 = new JButton("Lista Encadeada Simples");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela2 frame2 = new FrameTela2();
				frame2.setVisible(true);
			}
		});
		b1.setFont(new Font("Existence Light", Font.BOLD, 14));
		b1.setBounds(64, 77, 327, 23);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Lista Duplamente Encadeada ");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela6 frame6 = new FrameTela6();
				frame6.setVisible(true);
				
			}
		});
		b2.setFont(new Font("Existence Light", Font.BOLD, 14));
		b2.setBounds(64, 111, 327, 23);
		contentPane.add(b2);
		
		JButton b3 = new JButton("Lista Duplamente Encadeada Com Sentinela");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela11 frame11 = new FrameTela11();
				frame11.setVisible(true);
				
			}
		});
		b3.setFont(new Font("Existence Light", Font.BOLD, 14));
		b3.setBounds(64, 145, 327, 23);
		contentPane.add(b3);
		
		JButton b4 = new JButton("Algoritmos de Ordenacao");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela16 frame16 = new FrameTela16();
				frame16.setVisible(true);
			}
		});
		b4.setFont(new Font("Existence Light", Font.BOLD, 14));
		b4.setBounds(64, 179, 327, 23);
		contentPane.add(b4);
		
		JButton b5 = new JButton("Arvore de Busca Binaria");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameTela19 frame19 = new FrameTela19();
				frame19.setVisible(true);
			}
		});
		b5.setFont(new Font("Existence Light", Font.BOLD, 14));
		b5.setBounds(64, 213, 327, 23);
		contentPane.add(b5);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 444, 21);
		contentPane.add(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setFont(new Font("Existence Light", Font.PLAIN, 12));
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSugestesDeSites = new JMenuItem("Sugest\u00F5es de sites");
		mntmSugestesDeSites.setFont(new Font("Existence Light", Font.PLAIN, 12));
		mnArquivo.add(mntmSugestesDeSites);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmSair.setFont(new Font("Existence Light", Font.PLAIN, 12));
		mnArquivo.add(mntmSair);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		mnNewMenu.setFont(new Font("Existence Light", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.setFont(new Font("Existence Light", Font.PLAIN, 12));
		mnNewMenu.add(mntmSobre);
		
		JMenuItem mntmTutorial = new JMenuItem("Tutorial");
		mntmTutorial.setFont(new Font("Existence Light", Font.PLAIN, 12));
		mnNewMenu.add(mntmTutorial);
	}
}
