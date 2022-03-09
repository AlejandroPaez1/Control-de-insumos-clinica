package clinicavillaframes.frames;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ale_2
 */
public class framePrin extends javax.swing.JFrame implements ActionListener{

pantallainicial inicial = new pantallainicial();
PanelMostrar mostrar = new PanelMostrar();
PanelAumentar  aumentar = new PanelAumentar();
PanelBuscar buscar = new PanelBuscar();

    //panelAumentar coAumentar = new panelAumentar();
  // static result resultado = null;


    public framePrin() {
        
        
//para poner el icono al programa        
        Toolkit laPantalla = Toolkit.getDefaultToolkit();
        Dimension medidas=laPantalla.getScreenSize();    
                                            //ubicacion del archivo
        Image iconito =  laPantalla.getImage("src/images/icono.png");
//agregamos el icono
        setIconImage(iconito);
      
        initComponents();
        this.setLocationRelativeTo(null);
        
//agregamos al panel contenedor el panel inicial
    iniciales();
       // contenedor.add(inicial);          
//agregamos los actionlistener        
        btAumentar.addActionListener(this);
        bt_Inicio.addActionListener(this); 
        btBulotes.addActionListener(this);
        bt_mostrar.addActionListener(this);
        
    }
public void iniciales(){
//agregamos al panel contenedor el panel inicial
        
        contenedor.add(inicial);         

}
    
// para deshabilitar los botones cuando este en el panel correcto    
private void deshabilitarbtn(){       
    if(inicial.isVisible()){
        bt_Inicio.setEnabled(false);
        bt_mostrar.setEnabled(true);
        btAumentar.setEnabled(true);
        btBulotes.setEnabled(true);
        
        }else if( mostrar.isVisible() ){
                bt_Inicio.setEnabled(true);
                bt_mostrar.setEnabled(false);
                btAumentar.setEnabled(true);
                btBulotes.setEnabled(true);
            
            }else if(aumentar.isVisible()){
                    bt_Inicio.setEnabled(true);
                    bt_mostrar.setEnabled(true);
                    btAumentar.setEnabled(false);
                    btBulotes.setEnabled(true);
                    
                }else {
                        bt_Inicio.setEnabled(true);
                        bt_mostrar.setEnabled(true);
                        btAumentar.setEnabled(true);
                        btBulotes.setEnabled(false);      
    
            }

}


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_Inicio = new javax.swing.JButton();
        btAumentar = new javax.swing.JButton();
        btBulotes = new javax.swing.JButton();
        bt_mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL DE INSUMOS VILLA LAS FLORES");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 500));

        contenedor.setBackground(new java.awt.Color(255, 255, 204));
        contenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        bt_Inicio.setText("inicio");
        bt_Inicio.setToolTipText("");
        bt_Inicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_InicioActionPerformed(evt);
            }
        });

        btAumentar.setText("Guardar Medicamento");
        btAumentar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAumentar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAumentarActionPerformed(evt);
            }
        });

        btBulotes.setText("Buscar lotes");
        btBulotes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBulotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bt_mostrar.setText("Mostrar Almacen");
        bt_mostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(bt_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAumentar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBulotes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAumentar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btBulotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAumentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAumentarActionPerformed

    private void bt_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_InicioActionPerformed
//
//            /**
//             * @param args the command line arguments
//             */
//           public static void main(String args[]) {
//                java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                new framePrin().setVisible(true);
//
//
//
//                   }
//               });         
//           }

   
   public  void ConexionApost() {
     //conexion a postgres        
        String BD = "jdbc:postgresql://localhost:5432/clinica";
        String usuario = "postgres";
        String contra = "1234";
    
            try {
                Connection conectar = DriverManager.getConnection(BD,usuario,contra);
                JOptionPane.showMessageDialog(null,"base de datos conectada de frame prin  ");
                                System.out.println("del panel mostrar conectado");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"error al conectar  "+e);
                System.out.println("del panel mostrar");
            }
 }
  

   
    @Override
public void actionPerformed(ActionEvent e) {
//para las acciones de los botones 
            Object evt = e.getSource();

            if (evt.equals(btAumentar)) {
                //ponemos los demas paneles ocultos y mostramos el que queremos
                    aumentar.setVisible(true);                    
                    inicial.setVisible(false);
                    buscar.setVisible(false);
                    mostrar.setVisible(false);
                    //añadimos al contenedor el panel de aumentar 
                    
                    contenedor.add(aumentar);
                    //actualizamos el contenedor los datos 
                    contenedor.validate();
                    //llamamos la funcion de deshabilitar botones
                    deshabilitarbtn();

                }else if(evt.equals(bt_Inicio)){
                        inicial.setVisible(true);
                        buscar.setVisible(false);
                        aumentar.setVisible(false);
                        mostrar.setVisible(false);
                        contenedor.add(inicial);    
                        deshabilitarbtn();
                        contenedor.validate();
                        
                    }else if(evt.equals(btBulotes)){
                            buscar.setVisible(true);
                            aumentar.setVisible(false);
                            inicial.setVisible(false);
                            mostrar.setVisible(false);
                            contenedor.add(buscar);
                            contenedor.validate();
                            deshabilitarbtn();
                            
                        }else{
                                mostrar.setVisible(true);
                                buscar.setVisible(false);
                                aumentar.setVisible(false);
                                inicial.setVisible(false);
                                contenedor.add(mostrar);
                                contenedor.validate();
                                deshabilitarbtn();
                    
        }
    }
   









   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAumentar;
    private javax.swing.JButton btBulotes;
    private javax.swing.JButton bt_Inicio;
    private javax.swing.JButton bt_mostrar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}

