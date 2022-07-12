package imparPaar;

public class No {
	private Object valor;
	private No anterior;

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public Object getValor() {
		return valor;
	}
}
