package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actualizar {

	public static void main(String[] args) {
		
		String conexion = "jdbc:mysql://localhost:3306/baseDatos";
		String ACTUALIZAR = "UPDATE EMPLEADOS SET SALARIO=? WHERE NOMBRE=?";
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(ACTUALIZAR) ;
				){
					
					pr.setDouble( 1,8508 );
					pr.setString(2,"Carlos");
					int filas = pr.executeUpdate();
					
					System.out.println("Filas modificadas " + filas);
					//Devuelve el numero de filas modificadas
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
		
		
	}

}
