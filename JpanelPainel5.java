package br.ufpb.estruturando;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JpanelPainel5 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public JpanelPainel5() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(272, 236, 133, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteONmero = new JLabel("Digite o n\u00FAmero:");
		lblDigiteONmero.setFont(new Font("Existence Light", Font.PLAIN, 14));
		lblDigiteONmero.setBounds(272, 211, 133, 20);
		add(lblDigiteONmero);
		
		JLabel lblInserindoElementosNa = new JLabel("Inserindo elementos na lista");
		lblInserindoElementosNa.setFont(new Font("Existence Light", Font.PLAIN, 16));
		lblInserindoElementosNa.setBounds(47, 34, 317, 29);
		add(lblInserindoElementosNa);

	}

}
