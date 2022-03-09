
package clinicavillaframes.frames;
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexionPostgres {

    String user="postgres";
    String pass="1234"; //contraseña de postgresql
    String driver="org.postgres.Driver";
    String url="jdbc:postgresql://localhost:5432/clinica";// nombre de la base de datos 
    Connection Connection;
    Statement st;
        ResultSet rs;

    public  conexionPostgres(){
                  

                      try {
                            Class.forName("org.postgresql.Driver");
                            Connection=DriverManager.getConnection(url,user,pass);
                            //JOptionPane.showMessageDialog(null,"base de datos conectada");
                            System.out.println("Base de datos conectada");

                        } catch (Exception error) {
                            System.out.println(error.getMessage());
                            JOptionPane.showMessageDialog(null,"error al conectar con errror de: "+error);
                            System.out.println("del error de conexion   ");
                        }
            }
             
public Connection conexion() {
        try {
            if (Connection == null) {
                Class.forName("org.postgresql.Driver");
                Connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica",
                    "postgres", "1234");
                System.out.println("de if conecttion conexion");
            } 
            System.out.println("de conecction conexion");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return Connection;
    }
            
            
            
public void insertarUsuariosAlmacen(String cod_medi,String nombre_medi,String tipo,String mes_cad,Integer year_cad,String cod_lote,Integer num_piezas){
            String sql="INSERT INTO almacen( cod_medi, nombre_medi,tipo, mes_cad, year_cad, cod_lote, num_piezas) VALUES('"+cod_medi+"', '"+nombre_medi+"', '"+tipo+"', '"+mes_cad+"',"+year_cad+", '"+cod_lote+"',"+num_piezas+");";
            try {
                st=Connection.createStatement();
                int x=st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"INGRESO CORRECTO PRESIONA OK PARA CONTINUAR");
            //JOptionPane.showMessageDialog(null,"ingreso correcto");

            } catch (Exception err) {
                    System.out.println("el error  de insertar usu ==="+err);
                    JOptionPane.showMessageDialog(null,"error al ingresar  = " + err.getMessage());
                    System.out.println("el error de ingreso es  =" + err);
            
        }
            
    }      

public void insertarUsuarios(String cod_medi,String nombre_medi,String tipo,String mes_cad,String year_cad,String cod_lote,String num_piezas){
    String sql="INSERT INTO almacenJavaDosNotnull( cod_medi, nombre_medi,tipo, mes_cad, year_cad, cod_lote, num_piezas) VALUES('"+cod_medi+"', '"+nombre_medi+"', '"+tipo+"', '"+mes_cad+"','"+year_cad+"', '"+cod_lote+"','"+num_piezas+"');";
        try {
                st=Connection.createStatement();
                int x=st.executeUpdate(sql);
                //JOptionPane.showMessageDialog(null,"ingreso correcto");
                JOptionPane.showMessageDialog(null,"POR FIN INGRESO ALV de java not null");

        } catch (Exception error) {
                System.out.println("el error  de insertar usario ===" +error.getMessage());
                JOptionPane.showMessageDialog(null,"error al usuario  = " + error);
                System.out.println("el error de de insertarusario  =" + error);


}
            
    } 
            
 
    public Object[][] consultar(String busqueda){
     Object [][] profesores = new Object [numeroFilas(busqueda)][3];

        int i=0;
        
        try {
            st = conexion().createStatement();
            rs = st.executeQuery("SELECT Cod_medi, Nombre_Medi,Tipo,mes_cad,year_cad, Cod_lote, num_Piezas from ALMACEN where verificador=1;");
            while (rs.next()) {
            profesores[i][0] = rs.getShort(1);
                profesores[i][1] = rs.getString(2);
                profesores[i][2] = rs.getString(3);
                i++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        
        return profesores;    
            
    }
            
    
    
public int numeroFilas(String busqueda) {
        int nFilas = 0;
        
        try {
            st = conexion().createStatement();
            rs = st.executeQuery("SELECT COUNT(*) FROM almacen WHERE cod_medi LIKE '"+busqueda+"%';");
            while (rs.next()) {
                nFilas = rs.getInt(1);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        } 
        return 
    nFilas;
    
  }







}


