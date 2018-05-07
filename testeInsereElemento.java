package br.ufpb.estruturando;

public class testeInsereElemento {

	public static void main(String[] args) throws EstouroDeListaException{
		ListaEncadeadaSimples l = new ListaEncadeadaSimples();
		try{
			l.insereElemento(9);
			l.insereElemento(0);
			l.insereElemento(5);
			l.insereElemento(66);
			l.insereElemento(7);
			l.insereElemento(22);
			l.insereElemento(10);
			l.insereElemento(2);
			l.insereElemento(3);
			l.insereElemento(90);
			l.insereElemento(67);
			l.insereElemento(44);
			l.insereElemento(11);
			l.insereElemento(110);
			l.insereElemento(11);
			l.removeElemento(9);
			
			System.out.println(l.buscaElemento(999));
			
			
			
			
			String lRes = "";
			for(int k=0; k<=14;k++){
				if(l.exibeLista()[k]!=null){
					lRes+="["+l.exibeLista()[k]+"]";
				}
			}System.out.println(lRes);
			
			

		}catch(ElementoInexistenteException f){
			System.out.println(f.getMessage());
		}catch(EstouroDeListaException e){
			System.out.println(e.getMessage());
		} catch (ListaVaziaException g) {
		System.out.println(g.getMessage());
		} catch (ElementoJaInseridoException i) {
			System.out.println(i.getMessage());
		} 
		
				
		
		

	}

}


