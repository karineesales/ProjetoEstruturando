package br.ufpb.estruturando;

public class ListaEncadeadaSimples implements Listas {
	private Integer[] listaSimples;

	public ListaEncadeadaSimples() {
		listaSimples = new Integer[15];
	}

	public void insereElemento(int num) throws EstouroDeListaException,
			ElementoJaInseridoException {
		if (listaSimples[14] != null) {
			throw new EstouroDeListaException(
					" Lista j� est� toda preenchida! �ltimo n�mero inserido foi "
							+ listaSimples[14]);
		} else {
			for (int i = 0; i <= listaSimples.length; i++) {
				if (listaSimples[i] == null) {
					listaSimples[i] = num;
					break;
				}
			}
		}

	}

	public void removeElemento(int num) throws ElementoInexistenteException,
			ListaVaziaException {
		if (listaSimples == null) {
			throw new ListaVaziaException(
					"N�o h� elemento para remover, lista est� vazia!");
		} else {
			boolean encontrouElemento = false;
			Integer[] listaRemoveAux = new Integer[listaSimples.length];
			for (int j = 0; j < listaSimples.length; j++) {
				if (this.listaSimples[j] != null) {
					if (this.listaSimples[j] != num) {
						listaRemoveAux[j] = listaSimples[j];
					} else {
						if (listaSimples[j + 1] == null) {
							listaRemoveAux[j] = null;
						} else {
							listaRemoveAux[j] = listaSimples[j + 1];
							j++;
						}
						encontrouElemento = true;
					}
				}
			}
			if (encontrouElemento = false) {
				throw new ElementoInexistenteException(
						"Esse elemento n�o est� na lista" + num);
			} else {
				setListaSimples(listaRemoveAux);
			}
		}
	}

	public void setListaSimples(Integer[] listaSimples) {
		this.listaSimples = listaSimples;
	}

	@Override
	public String buscaElemento(int num) throws ElementoInexistenteException,
			ListaVaziaException {
		int guardaPosicao = 0;
		boolean encontrouNum = false;
		if (listaSimples == null) {
			throw new ListaVaziaException(
					"N�o h� elemento para remover, lista est� vazia!");
		} else {
			for (int k = 0; k < listaSimples.length; k++) {
				System.out.println(listaSimples[k]);
				if (listaSimples[k] == num) {
					
					encontrouNum = true;
					guardaPosicao = k;
					break;
				}
			}
			if (encontrouNum == true) {
				return "N�mero foi encontrado: " + num
						+ " na seguinte posi��o: " + guardaPosicao;
			} else {
				throw new ElementoInexistenteException(
						"N�mero n�o foi encontrado na lista: " + num);
			}
		}

	}

	@Override
	public Integer[] exibeLista() {
		return this.listaSimples;
	}

	@Override
	public void exibirVideo(String nomeVideo) {
		// TODO Auto-generated method stub

	}

}
