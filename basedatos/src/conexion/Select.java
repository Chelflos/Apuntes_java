package conexion;

import java.sql.Timestamp;
import java.util.ArrayList;

import clases.Empleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost:3306/baseDatos";
		String sentencia = "select * from empleados order by nombre";
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(sentencia) ;
				){
					
			ResultSet resp=pr.executeQuery();
			while(resp.next()) {
				int id = resp.getInt("ID");
				String nombre = resp.getString("NOMBRE");
				double salario =resp.getDouble("SALARIO");
				Timestamp fecha = resp.getTimestamp("FECHA");
				
				lista.add(new Empleado(id,nombre,salario,fecha.toLocalDateTime()));
			}
			
			for(Empleado empleado : lista)System.out.println(empleado);
			
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}	
		
	}
	
}
