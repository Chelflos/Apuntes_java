package ejercicio6;
//Carlos Tenajas
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Vendedor> listaVendedores = new ArrayList<>();
		
		CocheEmpresa coche01 = new CocheEmpresa("1245vgv","cactus","Renault");
		CocheEmpresa coche02 = new CocheEmpresa("6353fvf","Clio","Renault");
		CocheEmpresa coche03 = new CocheEmpresa("2573yre","207","Peugeot");
		
		JefeZona jefe01 = new JefeZona(null, null, null, null, 0, 0, null, 0, null, null, null, null, null);
		JefeZona jefe02 = new JefeZona(null, null, null, null, 0, 0, null, 0, null, null, null, null, null);				
		
		Secretario sec1 = new Secretario(null, null, null, null, 0, 0, null, 0, null, null, 0);
		Secretario sec2 = new Secretario(null, null, null, null, 0, 0, null, 0, null, null, 0);
		Secretario sec3 = new Secretario(null, null, null, null, 0, 0, null, 0, null, null, 0);
		
		Vendedor ven1 = new Vendedor(null, null, null, null, 0, 0, null, 0, null, null, 0, null, null); 
		Vendedor ven2 = new Vendedor(null, null, null, null, 0, 0, null, 0, null, null, 0, null, null);
		Vendedor ven3 = new Vendedor(null, null, null, null, 0, 0, null, 0, null, null, 0, null, null);
		Vendedor ven4 = new Vendedor(null, null, null, null, 0, 0, null, 0, null, null, 0, null, null);
		
		Cliente cliente1= new Cliente("Carlos",663654534);  
		Cliente cliente2= new Cliente("Jesus",662651523);  
		Cliente cliente3= new Cliente("Teresa",623122132);
		Cliente cliente4= new Cliente("Marcos",662651523);
		Cliente cliente5= new Cliente("Sergio",663546778);
		Cliente cliente6= new Cliente("Lucas",669875634);
		Cliente cliente7= new Cliente("Maria",645342334);
		Cliente cliente8= new Cliente("Laura",698067545);
		
		Secretario.generarSecretario(sec1,jefe01);
		Secretario.generarSecretario(sec2, jefe01);
		Secretario.generarSecretario(sec3, jefe02);		
		
		JefeZona.generarJefeZona(jefe01, listaVendedores, sec1,coche01);
		JefeZona.generarJefeZona(jefe02, listaVendedores, sec2, coche02);
		
		Vendedor.generarVendedor(ven1, null, coche01, listaClientes);
		Vendedor.generarVendedor(ven2, null, coche01, listaClientes);
		Vendedor.generarVendedor(ven3, null, coche02, listaClientes);
		Vendedor.generarVendedor(ven4, null, coche03, listaClientes);		

		
		
		/*--------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		
		
		
		
		
		
		
		System.out.println("\n");
		
		System.out.println("Se muestra informacion de un jefe de zona: ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(jefe01);
		System.out.println("---------------------------------------------------------------------------------");
		
		jefe01.IncrementarSueldo();
		
		jefe01.cambiarCoche(coche02);
		
		jefe01.altaVendedor(ven1);
		jefe01.altaVendedor(ven2);
		jefe01.altaVendedor(ven3);
		jefe01.altaVendedor(ven4);
		
		jefe01.mostrarLista();
		
		jefe01.bajaVendedor(ven4);
		
		jefe01.mostrarLista();
		
		ven4.cambiarSupervisor(jefe02);
		
		System.out.println("Se muestra informacion de un vendedor: ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(ven1);
		System.out.println("---------------------------------------------------------------------------------");
		
		ven1.IncrementarSueldo();
		
		System.out.println("\n");
		
		ven1.altaCliente(cliente7);
		ven1.altaCliente(cliente8);
		ven1.altaCliente(cliente6);
		ven1.altaCliente(cliente5);
		
		System.out.println("\n");
		
		ven1.mostrarLista();
		
		ven1.bajaCliente(cliente6);
		
		ven1.mostrarLista();
		
		System.out.println("\n");		
		
		System.out.println("Se muestra informacion de un vendedor: ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(ven2);
		System.out.println("---------------------------------------------------------------------------------");
		
		ven2.IncrementarSueldo();
		
		ven2.altaCliente(cliente1);
		ven2.altaCliente(cliente2);
		
		ven2.mostrarLista();
		
		ven2.bajaCliente(cliente2);
		
		ven2.mostrarLista();
		
		System.out.println("\n");
		
		System.out.println("Se muestra informacion de un vendedor: ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(ven3);
		System.out.println("---------------------------------------------------------------------------------");
		
		ven3.IncrementarSueldo();
		
		ven3.altaCliente(cliente2);
		ven3.altaCliente(cliente3);
		ven3.altaCliente(cliente4);
		
		ven3.mostrarLista();		
		
		System.out.println("\n");
		
		System.out.println("Se muestra informacion de un secretario: ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(sec1);
		System.out.println("---------------------------------------------------------------------------------");
		
		sec1.IncrementarSueldo();
		
		sec1.cambiarSupervisor(jefe02);
		
		System.out.println("Se muestra informacion de un secretario: ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(sec2);
		System.out.println("---------------------------------------------------------------------------------");
		
		sec2.IncrementarSueldo();
		
		System.out.println("Se muestra informacion de un secretario: ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(sec3);
		System.out.println("---------------------------------------------------------------------------------");
		
		sec3.IncrementarSueldo();
		
	}

}
