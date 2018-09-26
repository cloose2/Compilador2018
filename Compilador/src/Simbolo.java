
public class Simbolo {
	
	private String nome;      // nome da vari�vel
    private int referencia;   // refer�ncia usada na gera��o do c�digo destino
    private static int marcador = 1; // armazena a �ltima refer�ncia inclu�da na tabela
    private String tipo; // tipo da variavel declarada
    
    public Simbolo(String _nome) {
          this.nome = _nome;
          this.referencia = Simbolo.marcador;
          //Simbolo.marcador += 2;
    }
    
    public Simbolo(String _nome, String tipo) {
        this.nome = _nome;
        this.referencia = Simbolo.marcador;
        this.tipo = tipo;
        
  }
  
  
    
    public String getNome() {
          return this.nome;
    }
    public int getReferencia() {
          return this.referencia;
    }
    public String toString() {
          return "Nome:"+this.getNome() + " / " + "Refer�ncia:"+this.getReferencia() + "\n";
    }
    

}
