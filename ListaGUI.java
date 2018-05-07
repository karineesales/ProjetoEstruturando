package br.ufpb.estruturando;

import javax.swing.JFrame;

public class ListaGUI extends JFrame {
	

	public static void main(String[] args) {
		ListaEncadeadaSimples l = new ListaEncadeadaSimples();
		final Fachada fachada = new Fachada(l);
		
		//JFrame FrameTela1 = new FrameTela1(fachada);
		
		

	}

}
