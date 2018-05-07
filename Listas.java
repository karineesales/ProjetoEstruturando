package br.ufpb.estruturando;


public interface Listas {
	
	public void insereElemento (int num) throws EstouroDeListaException, ElementoJaInseridoException; 
	public void removeElemento (int num) throws ElementoInexistenteException, ListaVaziaException;
	public String buscaElemento (int num) throws ElementoInexistenteException, ListaVaziaException;
	public Integer [] exibeLista();
	public void exibirVideo(String nomeVideo); //método para dar play no video
	
}
