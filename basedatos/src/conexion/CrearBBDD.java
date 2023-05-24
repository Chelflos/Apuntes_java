package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrearBBDD {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost:3306/sys";
		String crear = "create database baseDatos";
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(crear) ;
				){
			
					pr.execute();
					System.out.println("Base de datos creada");
					
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
		
		
	}

}
