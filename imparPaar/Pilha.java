package imparPaar;

public class Pilha {
	No topo = null;

	public boolean vazio() {
		if (topo == null) {
			return true;
		}
		return false;
	}

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
}