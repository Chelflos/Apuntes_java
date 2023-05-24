package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrearTabla {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost:3306/baseDatos";
		String crear = "create table EMPLEADOS("
				+ "ID INT NOT NULL auto_increment,"
				+ "NOMBRE VARCHAR(100) NOT NULL,"
				+ "SALARIO DECIMAL(15,2) NOT NULL,"
				+ "FECHA datetime NOT NULL DEFAULT current_timestamp,"
				+ "PRIMARY KEY(ID)"
				+ ");";
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(crear) ;
				){
			
					pr.execute();
					System.out.println("Tabla creada");
					
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
		
		
	}

}
