package Exercicio08;

import java.util.ArrayList;

public class Pilha {

	No topo = null;

	public void Push(Object valor) {
		No novo = new No();
		novo.setValor(valor);
		novo.setAnterior(topo);
		topo = novo;
	}

	public Object Pop() {
		if (topo == null) {
			return null;
		} else {
			Object valor = topo.getValor();
			topo = topo.getAnterior();
			return valor;
		}
	}

	public ArrayList<Object> Listar() {
		if (topo == null) {
			return null;
		} else {
			ArrayList<Object> listar = new ArrayList<Object>();
			No aux = topo;
			while (aux != null) {
				listar.add(aux.getValor());
				aux = aux.getAnterior();
			}
			return listar;
		}
	}
}
