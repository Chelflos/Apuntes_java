package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select3 {

	public static void main(String[] args) {
		//En esta practica probamos a importar una base de datos a workbench y hacerle una consulta
		String conexion = "jdbc:mysql://localhost:3306/db_scott";
		String sentencia = "SELECT A.NAME,ENAME,B.SAL,A.DEPTNO"
		+ "FROM DEPT A,EMP B WHERE A.DEPTNO=B.DEPTNO";
		
		try( Connection conn = DriverManager.getConnection(conexion,"root","root") ;
				PreparedStatement pr = conn.prepareStatement(sentencia) ;
				){
					
			ResultSet resp=pr.executeQuery();
			while(resp.next()) {
				System.out.printf("Departamento=%10.2f Empleado=%5d Salario=%10.2f\n N.Departamento");
					resp.getString("DNAME");
					resp.getString("ENAME");
					resp.getDouble("SAL");
					resp.getInt("DEPTNO");
			}
			
			
		} catch (SQLException e) {			
			System.out.println("Error: " + e.getMessage());		
			
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}	
		
	}
	
}
