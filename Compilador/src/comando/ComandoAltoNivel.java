package comando;

import parser.Token;

public abstract class ComandoAltoNivel {
	Token token;
	
	public ComandoAltoNivel(Token _token){
		this.token = _token;
	}
	
	public String getLexema(){
		return this.token.image;
	}
	
	//public abstract ListaComandosPrimitivo geraListaComandosPrimitivos();
	public abstract String toString();
	
	
}
