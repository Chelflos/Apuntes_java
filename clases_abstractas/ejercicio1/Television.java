package ejercicio1;

public class Television extends Electrodomestico {
	protected final static double resolucionBase=20;
	
	//Atributos
	protected double resolucion;
	protected boolean sintonizadorTdt   = true;
	
	//Metodos get
		public double getresolucion() {
			return resolucion;
		}
		public boolean getsintonizadorTdt() {
			return sintonizadorTdt;
		}
		
		//Modifico el comportamiento de precioFinal()
		@Override
		//Metodo para  obtener el precio final
		public double precioFinal() {
			double coste = super.precioFinal();
			if(resolucion > 40) {
				coste += precioBase * 0.3;
			}
			if(sintonizadorTdt = true) {
				coste += 50;
			}
			return coste;
		}
		
	public Television() {
		this.precioBase = precioInicial;
		this.peso = pesoBase;
		this.color = colorBase;
		this.consumoEnergetico = consumoBase;
		//Atributos propios de televisor
		this.resolucion = resolucionBase;
		this.sintonizadorTdt = false;
	}

	public Television(double peso, double precioBase) {
		super(peso, precioBase);
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = colorBase;
		this.consumoEnergetico = consumoBase;
		//Atributos propios de televisor
		this.resolucion = resolucionBase;
		this.sintonizadorTdt = false;
		

	}

	public Television(double peso, double precioBase, String color, char consumoEnergetico, double resolucion, boolean sintonizadorTdt) {
		super(peso, precioBase, color, consumoEnergetico);
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
	 
	}

}
