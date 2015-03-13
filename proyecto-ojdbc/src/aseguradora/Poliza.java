/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aseguradora;

import java.awt.FontMetrics;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Exode-P
 */
public class Poliza extends javax.swing.JFrame implements Serializable {
    /**
     * Creates new form Hospital
     */
    
    private ConnectOracle conection;
    
    public Poliza(ConnectOracle co){
        conection = co;
        initComponents();
        cargarPoliza();
    }
    
    public Poliza() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPoliza = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){return false;}
        };
        lblCodPoliza = new javax.swing.JLabel();
        etCodPoliza = new javax.swing.JTextField();
        lblNomPoliza = new javax.swing.JLabel();
        etNomPoliza = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        lblValidaCodPoliza = new javax.swing.JLabel();
        lblValidaNomPoliza = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aseguradora La Vida - Polizas");

        tablaPoliza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
    );
    tablaPoliza.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaPolizaMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tablaPoliza);

    lblCodPoliza.setText("Código de Poliza");

    etCodPoliza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etCodPoliza.setToolTipText("Inserta un código de médico");
    etCodPoliza.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etCodPolizaFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etCodPolizaFocusLost(evt);
        }
    });
    etCodPoliza.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            etCodPolizaKeyTyped(evt);
        }
    });

    lblNomPoliza.setText("Nombre de Poliza");

    etNomPoliza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etNomPoliza.setToolTipText("Inserta un nombre de médico");
    etNomPoliza.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etNomPolizaFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etNomPolizaFocusLost(evt);
        }
    });

    btnActualizar.setText("Actualizar");
    btnActualizar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnActualizarActionPerformed(evt);
        }
    });

    btnEliminar.setText("Eliminar");
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEliminarActionPerformed(evt);
        }
    });

    btnBuscar.setText("Buscar");
    btnBuscar.setMaximumSize(new java.awt.Dimension(79, 23));
    btnBuscar.setMinimumSize(new java.awt.Dimension(79, 23));
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBuscarActionPerformed(evt);
        }
    });

    btnCerrar.setText("Cerrar");
    btnCerrar.setMaximumSize(new java.awt.Dimension(79, 23));
    btnCerrar.setMinimumSize(new java.awt.Dimension(79, 23));
    btnCerrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCerrarActionPerformed(evt);
        }
    });

    btnRefrescar.setText("Refrescar");
    btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRefrescarActionPerformed(evt);
        }
    });

    btnInsertar.setText("Insertar");
    btnInsertar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInsertarActionPerformed(evt);
        }
    });

    lblValidaCodPoliza.setForeground(new java.awt.Color(255, 0, 0));

    lblValidaNomPoliza.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCodPoliza)
                        .addComponent(lblNomPoliza))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etNomPoliza, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(etCodPoliza))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValidaNomPoliza)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnRefrescar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValidaCodPoliza)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnActualizar)
                    .addGap(18, 18, 18)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(7, 7, 7)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etCodPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodPoliza))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etNomPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaNomPoliza)
                        .addComponent(lblNomPoliza)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaCodPoliza))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnRefrescar)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnInsertar)
                .addComponent(btnActualizar)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnEliminar))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPolizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPolizaMouseClicked
        int row = tablaPoliza.getSelectedRow();
        
        etCodPoliza.setText(tablaPoliza.getModel().getValueAt(row, 0).toString());
        etNomPoliza.setText(tablaPoliza.getModel().getValueAt(row, 1).toString());
        
        etCodPoliza.setHorizontalAlignment(JTextField.CENTER);
        etNomPoliza.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_tablaPolizaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validarCampos()){
            actualizarPoliza();
            resetCampos();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JLabel label = new JLabel("¿Deseas eliminar esta Poliza?");
        JTextField tidpoliza = new JTextField(etCodPoliza.getText().toString());
        JTextField tnombre = new JTextField(etNomPoliza.getText().toString());
        tidpoliza.setEditable(false);
        tnombre.setEditable(false);
        Object[] componentsArray = {label,tidpoliza,tnombre};
        confirmarEliminar = JOptionPane.showConfirmDialog(
                                null
                        , componentsArray
                        , "Eliminar Poliza"
                        , JOptionPane.OK_CANCEL_OPTION
                        , JOptionPane.INFORMATION_MESSAGE
            );
            
            if (confirmarEliminar == JOptionPane.OK_OPTION){
                eliminarPoliza();
                resetCampos();
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        JLabel lnombre = new JLabel("Introduzca el nombre de la Poliza: \n");
        JTextField tnombre = new JTextField(null);
        Object[] componentsArray = {lnombre,tnombre};
        busqueda = JOptionPane.showConfirmDialog(
                                null
                        , componentsArray
                        , "BÚSQUEDA POLIZAS:"
                        , JOptionPane.OK_CANCEL_OPTION
                        , JOptionPane.INFORMATION_MESSAGE
            );
            
            if (busqueda == JOptionPane.OK_OPTION){
                String nombreBusqueda = tnombre.getText().toString();
                if (!nombreBusqueda.equals("")){
                    buscarPoliza(nombreBusqueda);
                }
            }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        cargarPoliza();
        resetCampos();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if(validarCampos()){
            insertarPoliza();
            resetCampos();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void etCodPolizaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodPolizaFocusGained
        etCodPoliza.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etCodPolizaFocusGained

    private void etNomPolizaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNomPolizaFocusGained
        etNomPoliza.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etNomPolizaFocusGained

    private void etCodPolizaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodPolizaFocusLost
        etCodPoliza.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_etCodPolizaFocusLost

    private void etNomPolizaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNomPolizaFocusLost
        etNomPoliza.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_etNomPolizaFocusLost

    private void etCodPolizaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etCodPolizaKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isDigit(car)) && (car != evt.VK_BACK_SPACE) && (car != evt.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite introducir números.");
        }
    }//GEN-LAST:event_etCodPolizaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Poliza().setVisible(true);
            }
        });
    }
    
    public void cargarPoliza() {
            try {
                String sql = "select * from poliza";
                PreparedStatement prst = conection.createStatement(sql);
                ResultSet rsst = prst.executeQuery();
                tablaPoliza.setModel(DbUtils.resultSetToTableModel(rsst));
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == TABLA_NO_ENCONTRADA){
                    JOptionPane.showMessageDialog(rootPane, "Tabla no encontrada. Pongase en contacto con el administrador.");
                }
            }
    }

    private void buscarPoliza(String nombre) {
            try {
                String sql = "select * from poliza where upper(DATOS_P) LIKE ?";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setString(1, "%"+nombre.toUpperCase()+"%");
                ResultSet rsst = prst.executeQuery();
                tablaPoliza.setModel(DbUtils.resultSetToTableModel(rsst));
                if (rsst != null && rsst.next()){
                    rsst.beforeFirst();
                    tablaPoliza.setModel(DbUtils.resultSetToTableModel(rsst));
                }
                else if (!rsst.first()){
                    JOptionPane.showMessageDialog(null,
                        "No hay resultados para su búsqueda",
                        "Información",
                        JOptionPane.ERROR_MESSAGE);
                    cargarPoliza();
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    
    private void insertarPoliza(){
            try {
                String sql = "insert into poliza values (?,?)";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setInt(1, Integer.parseInt(etCodPoliza.getText()));
                prst.setString(2, etNomPoliza.getText());
                prst.executeUpdate();
                conection.confirmar();
                cargarPoliza();
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
                    JOptionPane.showMessageDialog(rootPane, "Existe una poliza con ese identificador (ID)");
                }
                if (e.getErrorCode() == VALOR_DEMASIADO_LARGO){
                    JOptionPane.showMessageDialog(rootPane, "Has introducido un valor demasiado largo");
                }
            }
    }
    
    private void actualizarPoliza() {
            int row = tablaPoliza.getSelectedRow();
            try {
                String sql = "update poliza set COD_P = ?, DATOS_P = ? WHERE COD_P = ?";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setInt(1, Integer.parseInt(etCodPoliza.getText()));
                prst.setString(2, etNomPoliza.getText());
                int cod_p = (row == -1) ? Integer.parseInt(etCodPoliza.getText().toString()) : Integer.parseInt(tablaPoliza.getModel().getValueAt(row, 0).toString());
                prst.setInt(3, cod_p);
                prst.executeUpdate();
                conection.confirmar();
                cargarPoliza();
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
                    JOptionPane.showMessageDialog(rootPane, "Existe una poliza con ese identificador (ID)");
                }
                if (e.getErrorCode() == VALOR_DEMASIADO_LARGO){
                    JOptionPane.showMessageDialog(rootPane, "Has introducido un valor demasiado largo");
                };
                if (e.getErrorCode() == ERROR_EDITAR_CLAVE_AJENA){
                    JOptionPane.showMessageDialog(rootPane, "No puedes editar el id de esta poliza");
                };
            }
    }
    
    private void eliminarPoliza() {
        try {
                String sql = "delete from poliza where COD_P = ?";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setInt(1, Integer.parseInt(etCodPoliza.getText()));
                prst.executeUpdate();
                conection.confirmar();
                cargarPoliza();
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == ERROR_EDITAR_CLAVE_AJENA){
                    JOptionPane.showMessageDialog(rootPane, "No puedes borrar esta poliza, restricción clave primeria/ajena");
                }
            }
    }
    
    private boolean validarCampos() {
        boolean CodPolizaVacio = etCodPoliza.getText().equals("");
        boolean NomPolizaVacio = etNomPoliza.getText().equals("");
        if(CodPolizaVacio){
            lblValidaCodPoliza.setText("Rellena el campo código");
        } else {
            lblValidaCodPoliza.setText("");
        }
        if (NomPolizaVacio){
            lblValidaNomPoliza.setText("Rellena el campo nombre");
        } else {
            lblValidaNomPoliza.setText("");
        }
        if(CodPolizaVacio || NomPolizaVacio) {
            return false;
        } else {
            return true;
        }
    }
    
    private void resetCampos(){
        etCodPoliza.setText("");
        etNomPoliza.setText("");
        tablaPoliza.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JTextField etCodPoliza;
    private javax.swing.JTextField etNomPoliza;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodPoliza;
    private javax.swing.JLabel lblNomPoliza;
    private javax.swing.JLabel lblValidaCodPoliza;
    private javax.swing.JLabel lblValidaNomPoliza;
    private javax.swing.JTable tablaPoliza;
    // End of variables declaration//GEN-END:variables
    
    private int busqueda;
    private int confirmarEliminar;
    
    private final int CLAVE_PRIMARIA_DUPLICADA = 1;
    private final int CLAVE_AJENA_NO_ENCONTRADA = 2291;
    private final int VALOR_DEMASIADO_LARGO = 1438;
    private final int TABLA_NO_ENCONTRADA = 942;
    private final int ERROR_EDITAR_CLAVE_AJENA = 2292;
//    private final int CAMPO_NO_NULO = 
}
