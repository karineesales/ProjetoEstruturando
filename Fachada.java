package br.ufpb.estruturando;

public class Fachada {
	protected ListaEncadeadaSimples listas;
	
	public Fachada(ListaEncadeadaSimples l){
		this.listas = l;
	}
	
	public void insereElemento(int num) throws EstouroDeListaException, ElementoJaInseridoException{
		listas.insereElemento(num);
	}
	
	public void removeElemento(int num) throws ElementoInexistenteException,
	ListaVaziaException {
		listas.removeElemento(num);
	}
	
	
	
	
}
