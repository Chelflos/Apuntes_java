package ejercicio2;

public class Butaca {

	protected int numero;
	protected char letra;
	protected boolean ocupado=false;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
	
	public Butaca(int numero, char letra, boolean ocupado) {
		this.numero = numero;
		this.letra = letra;
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		return numero +""+letra+".";
	}	
	
}