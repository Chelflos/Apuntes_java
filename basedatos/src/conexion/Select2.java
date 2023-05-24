package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select2 {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost:3306/baseDatos";
		String sentencia = "select sum(salario) TOTAL,COUNT(*) NE,AVG(SALARIO) MEDIA from empleados";
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(sentencia) ;
				){
					
			ResultSet resp=pr.executeQuery();
			while(resp.next()) {
				System.out.printf("Total=%10.2f N Empleados=%5d Media=%10.2f\n ");
					resp.getDouble("TOTAL");
					resp.getInt("NE");
					resp.getDouble("MEDIA");
			}
			
			
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}	
		
	}
	
}
