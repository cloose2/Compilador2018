
public enum Tipo {
	numero(2),palavra(1);
	
	private int valor;
	
	Tipo(int valorTipo){
		this.valor = valorTipo;
	}
	
	public int getValor() {
		return valor;
	}
}
