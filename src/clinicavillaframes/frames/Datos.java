
package clinicavillaframes.frames;

/**
 *
 * @author ale_2
 */

//import java.util.Logging.Level;

public class Datos {
        //para poder hacer el relleno de datos
                 String cod_medi;
		 String nombre_medi;
	 	 String tipo;
 		 String mes_cad;
		 int year_cad;
		 String cod_lote;
		 int num_piezas;
 
        public Datos(){
           }
    
        public Datos(String cod_medi,String nombre_medi,String tipo,String mes_cad,int year_cad,String cod_lote,int num_piezas){
            this.cod_medi = cod_medi;
            this.nombre_medi = nombre_medi;
            this.tipo = tipo;
            this.mes_cad = mes_cad;
            this.year_cad = year_cad;
            this.cod_lote = cod_lote;
            this.num_piezas = num_piezas;
        
        }
        
        public String getcod_medi(){
            return cod_medi;
        }
        public void setcod_medi(String cod_medi){
             this.cod_medi = cod_medi;
        }
        
        public String getnombre_medi(){
            return nombre_medi;
        }
        public void setnombre_medi(String nombre_medi){
            this.nombre_medi = nombre_medi;
        }
        
        
        public String gettipo(){
            return tipo;
        }
        public void settipo(String tipo){
            this.tipo = tipo;
        }
        
        public String getmes_cad(){
            return mes_cad;
        }
        public void setmes_cad(String mes_cad){
            this.mes_cad = mes_cad;
        }
        
        public int getyear_cad(){
            return year_cad;
        }
        public void setyear_cad(int year_cad){
            this.year_cad = year_cad;
        }
        
        public String getcod_lote(){
            return cod_lote;
        }
        public void setcod_lote(String cod_lote){
            this.cod_lote = cod_lote;
        }
 
        
        public int getnum_piezas(){
            return num_piezas;
        }
        public void setnum_piezas(int num_piezas){
            this.num_piezas = num_piezas;
        }








}
