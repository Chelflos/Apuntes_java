package ejercicio1;

public class Lavadora extends Electrodomestico {
	
	protected final static int cargaPorDefecto = 5;
	protected int carga;
	
	
	public int getCarga() {
		return carga;
	}
	
	@Override

	public double precioFinal() {		//si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
		double coste = super.precioFinal();
		if(carga >= 30) coste += 50;
		else return coste;
		return coste;		
	}
	
	
	
	public Lavadora() {
		this.precioBase = precioInicial;
		this.peso = pesoBase;
		this.color = colorBase;
		this.consumoEnergetico = consumoBase;
		//Atributos propios de Lavadora
		this.carga = cargaPorDefecto;
	}

	public Lavadora(double peso, double precioBase) {
		super(peso, precioBase);
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = colorBase;
		this.consumoEnergetico = consumoBase;
		//Atributos propios de Lavadora
		this.carga = cargaPorDefecto;
	}

	public Lavadora(double peso, double precioBase, String color, char consumoEnergetico, int carga) {
		super(peso, precioBase, color, consumoEnergetico);
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.carga=carga;
	}

}
