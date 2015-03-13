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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Exode-P
 */
public class Asegurado extends javax.swing.JFrame implements Serializable {
    /**
     * Creates new form Hospital
     */
    
    private ConnectOracle conection;
    private String fechaDate2;
    
    public Asegurado(ConnectOracle co){
        conection = co;
        initComponents();
        cargarAsegurado();
    }
    
    public Asegurado() {
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
        tablaAsegurado = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){return false;}
        };
        lblCodPoliza = new javax.swing.JLabel();
        etCodPoliza = new javax.swing.JTextField();
        lblNumAsegurado = new javax.swing.JLabel();
        etNumAsegurado = new javax.swing.JTextField();
        lblNomAsegurado = new javax.swing.JLabel();
        etNomAsegurado = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        lblValidaCodAsPoliza = new javax.swing.JLabel();
        lblValidaNumAsegurado = new javax.swing.JLabel();
        lblValidaNomAsegurado = new javax.swing.JLabel();
        lblFechaAsegurado = new javax.swing.JLabel();
        jsFechaAsegurado = new javax.swing.JSpinner();
        lblValidaFechaAsegurado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aseguradora La Vida - Asegurados");

        tablaAsegurado.setModel(new javax.swing.table.DefaultTableModel(
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
    tablaAsegurado.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaAseguradoMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tablaAsegurado);

    lblCodPoliza.setText("Código Poliza:");

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

    lblNumAsegurado.setText("Número Asegurado:");

    etNumAsegurado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etNumAsegurado.setToolTipText("Inserta un nombre de médico");
    etNumAsegurado.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etNumAseguradoFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etNumAseguradoFocusLost(evt);
        }
    });
    etNumAsegurado.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            etNumAseguradoKeyTyped(evt);
        }
    });

    lblNomAsegurado.setText("Nombre Asegurado:");

    etNomAsegurado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etNomAsegurado.setToolTipText("Inserta un código de hospital");
    etNomAsegurado.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etNomAseguradoFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etNomAseguradoFocusLost(evt);
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

    lblValidaCodAsPoliza.setForeground(new java.awt.Color(255, 0, 0));

    lblValidaNumAsegurado.setForeground(new java.awt.Color(255, 0, 0));

    lblValidaNomAsegurado.setForeground(new java.awt.Color(255, 0, 0));

    lblFechaAsegurado.setText("Fecha Asegurado:");

    jsFechaAsegurado.setModel(new javax.swing.SpinnerDateModel());
    jsFechaAsegurado.setEditor(new JSpinner.DateEditor(jsFechaAsegurado, "dd/MM/yy"));

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
                        .addComponent(lblNumAsegurado)
                        .addComponent(lblNomAsegurado)
                        .addComponent(lblFechaAsegurado))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etNumAsegurado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(etNomAsegurado)
                        .addComponent(etCodPoliza)
                        .addComponent(jsFechaAsegurado))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnRefrescar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValidaCodAsPoliza)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValidaNumAsegurado)
                                .addComponent(lblValidaNomAsegurado)
                                .addComponent(lblValidaFechaAsegurado))
                            .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addComponent(etNumAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaNumAsegurado)
                        .addComponent(lblNumAsegurado))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etNomAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNomAsegurado)
                        .addComponent(lblValidaNomAsegurado)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaCodAsPoliza))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnRefrescar)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblFechaAsegurado)
                .addComponent(jsFechaAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblValidaFechaAsegurado))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
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

    private void tablaAseguradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAseguradoMouseClicked
        int row = tablaAsegurado.getSelectedRow();
        
        etCodPoliza.setText(tablaAsegurado.getModel().getValueAt(row, 0).toString());
        etNumAsegurado.setText(tablaAsegurado.getModel().getValueAt(row, 1).toString());
        etNomAsegurado.setText(tablaAsegurado.getModel().getValueAt(row, 2).toString());

        String fechaTabla = tablaAsegurado.getModel().getValueAt(row, 3).toString();
        String soloFecha = fechaTabla.split(" ")[0];//Sacamos solo la parte de la fecha en formato yyyy-MM-dd
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");//Formato inglés
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yy");//Formato español
        Date fechaDate = null;
        try {
            fechaDate = formatter.parse(soloFecha);//Convertimos soloFecha a Date con formato inglés
            fechaDate2 = formatter2.format(fechaDate);//Pasamos ahora date de formato inglés a formato español, vuelve a ser un String
        } catch (ParseException ex) {
            Logger.getLogger(Asegurado.class.getName()).log(Level.SEVERE, null, ex);
        }

        jsFechaAsegurado.setValue(fechaDate);
        
        etCodPoliza.setHorizontalAlignment(JTextField.CENTER);
        etNumAsegurado.setHorizontalAlignment(JTextField.CENTER);
        etNomAsegurado.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_tablaAseguradoMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validarCampos()){
            actualizarAsegurado();
            resetCampos();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JLabel label = new JLabel("¿Deseas eliminar este asegurado?");
        JTextField tidpoliza = new JTextField(etCodPoliza.getText().toString());
        JTextField tnumasegurado = new JTextField(etNumAsegurado.getText().toString());
        JTextField tnombre = new JTextField(etNomAsegurado.getText().toString());
        JTextField tfecha = new JTextField(fechaDate2);
        tidpoliza.setEditable(false);
        tnumasegurado.setEditable(false);
        tnombre.setEditable(false);
        tfecha.setEditable(false);
        Object[] componentsArray = {label,tidpoliza,tnumasegurado,tnombre,tfecha};
        confirmarEliminar = JOptionPane.showConfirmDialog(
                                null
                        , componentsArray
                        , "Eliminar Asegurado"
                        , JOptionPane.OK_CANCEL_OPTION
                        , JOptionPane.INFORMATION_MESSAGE
            );
            
            if (confirmarEliminar == JOptionPane.OK_OPTION){
                eliminarAsegurado();
                resetCampos();
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        JLabel lnombre = new JLabel("Introduzca el nombre del Asegurado: \n");
        JTextField tnombre = new JTextField(null);
        Object[] componentsArray = {lnombre,tnombre};
        busqueda = JOptionPane.showConfirmDialog(
                                null
                        , componentsArray
                        , "BÚSQUEDA ASEGURADOS:"
                        , JOptionPane.OK_CANCEL_OPTION
                        , JOptionPane.INFORMATION_MESSAGE
            );
            
            if (busqueda == JOptionPane.OK_OPTION){
                String nombreBusqueda = tnombre.getText().toString();
                if (!nombreBusqueda.equals("")){
                    buscarAsegurado(nombreBusqueda);
                }
            }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
            cargarAsegurado();
            resetCampos();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if(validarCampos()){
            insertarAsegurado();
            resetCampos();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void etCodPolizaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodPolizaFocusGained
        etCodPoliza.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etCodPolizaFocusGained

    private void etNumAseguradoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNumAseguradoFocusGained
        etNumAsegurado.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etNumAseguradoFocusGained

    private void etNomAseguradoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNomAseguradoFocusGained
        etNomAsegurado.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etNomAseguradoFocusGained

    private void etCodPolizaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodPolizaFocusLost
        etCodPoliza.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_etCodPolizaFocusLost

    private void etNumAseguradoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNumAseguradoFocusLost
        etNumAsegurado.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_etNumAseguradoFocusLost

    private void etNomAseguradoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNomAseguradoFocusLost
        etNomAsegurado.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_etNomAseguradoFocusLost

    private void etCodPolizaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etCodPolizaKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isDigit(car)) && (car != evt.VK_BACK_SPACE) && (car != evt.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite introducir números.");
        }
    }//GEN-LAST:event_etCodPolizaKeyTyped

    private void etNumAseguradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etNumAseguradoKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isDigit(car)) && (car != evt.VK_BACK_SPACE) && (car != evt.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite introducir números.");
        }
    }//GEN-LAST:event_etNumAseguradoKeyTyped

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
            java.util.logging.Logger.getLogger(Asegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asegurado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asegurado().setVisible(true);
            }
        });
    }

    public void cargarAsegurado() {
            try {
                String sql = "select * from asegurado";
                PreparedStatement prst = conection.createStatement(sql);
                ResultSet rsst = prst.executeQuery();
                tablaAsegurado.setModel(DbUtils.resultSetToTableModel(rsst));
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == TABLA_NO_ENCONTRADA){
                    JOptionPane.showMessageDialog(rootPane, "Tabla no encontrada. Pongase en contacto con el administrador.");
                }
            }
    }
    
    private void buscarAsegurado(String nombre) {
            try {
                String sql = "select * from asegurado where upper(NA) LIKE ?";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setString(1, "%"+nombre.toUpperCase()+"%");
                ResultSet rsst = prst.executeQuery();
                tablaAsegurado.setModel(DbUtils.resultSetToTableModel(rsst));
                if (rsst != null && rsst.next()){
                    rsst.beforeFirst();
                    tablaAsegurado.setModel(DbUtils.resultSetToTableModel(rsst));
                }
                else if (!rsst.first()){
                    JOptionPane.showMessageDialog(null,
                        "No hay resultados para su búsqueda",
                        "Información",
                        JOptionPane.ERROR_MESSAGE);
                    cargarAsegurado();
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    
    private void insertarAsegurado(){
            try {
                String sql = "insert into asegurado values (?,?,?,?)";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setInt(1, Integer.parseInt(etCodPoliza.getText()));
                prst.setInt(2, Integer.parseInt(etNumAsegurado.getText()));
                prst.setString(3, etNomAsegurado.getText());
                
                java.sql.Date fecha = null;
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");//Formato inglés
                Date fechaAsegurado = (Date)jsFechaAsegurado.getValue();
                String fechaAseguradoString = formatter.format(fechaAsegurado);
                prst.setDate(4, fecha.valueOf(fechaAseguradoString));
                prst.executeUpdate();
                conection.confirmar();
                cargarAsegurado();
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
                    JOptionPane.showMessageDialog(rootPane, "Existe un asegurado con ese identificador (ID)");
                }
                if (e.getErrorCode() == VALOR_DEMASIADO_LARGO){
                    JOptionPane.showMessageDialog(rootPane, "Has introducido un valor demasiado largo");
                }
                if (e.getErrorCode() == CLAVE_AJENA_NO_ENCONTRADA){
                    JOptionPane.showMessageDialog(rootPane, "No existe ese código de poliza");
                };
            }
    }
    
    private void actualizarAsegurado() {
            int row = tablaAsegurado.getSelectedRow();
            try {
                String sql = "update asegurado set COD_P = ?, NUM = ?, NA = ?, FN = ? WHERE COD_P = ? and NUM = ?";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setInt(1, Integer.parseInt(etCodPoliza.getText()));//viejo
                prst.setInt(2, Integer.parseInt(etNumAsegurado.getText()));//viejo
                prst.setString(3, etNomAsegurado.getText());
                
                java.sql.Date fecha = null;
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");//Formato inglés
                Date fechaAsegurado = (Date)jsFechaAsegurado.getValue();
                String fechaAseguradoString = formatter.format(fechaAsegurado);
                prst.setDate(4, fecha.valueOf(fechaAseguradoString));
                
                int cod_p = (row == -1) ? Integer.parseInt(etCodPoliza.getText().toString()) : Integer.parseInt(tablaAsegurado.getModel().getValueAt(row, 0).toString());
                prst.setInt(5, cod_p);
                int num = (row == -1) ? Integer.parseInt(etNumAsegurado.getText().toString()) : Integer.parseInt(tablaAsegurado.getModel().getValueAt(row, 1).toString());
                prst.setInt(6,num);
                
                prst.executeUpdate();
                conection.confirmar();
                cargarAsegurado();
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
                    JOptionPane.showMessageDialog(rootPane, "Existe un asegurado con ese identificador (ID)");
                }
                if (e.getErrorCode() == CLAVE_AJENA_NO_ENCONTRADA){
                    JOptionPane.showMessageDialog(rootPane, "No existe una poliza con ese identificador (ID)");
                }
                if (e.getErrorCode() == VALOR_DEMASIADO_LARGO){
                    JOptionPane.showMessageDialog(rootPane, "Has introducido un valor demasiado largo");
                };
                if (e.getErrorCode() == ERROR_EDITAR_CLAVE_AJENA){
                    JOptionPane.showMessageDialog(rootPane, "No puedes editar el id de este asegurado");
                };
            }
    }
    
    private void eliminarAsegurado() {
        try {
                String sql = "delete from asegurado where COD_P = ? AND NUM = ?";
                PreparedStatement prst = conection.createStatement(sql);
                prst.setInt(1, Integer.parseInt(etCodPoliza.getText()));
                prst.setInt(2, Integer.parseInt(etNumAsegurado.getText()));
                prst.executeUpdate();
                conection.confirmar();
                cargarAsegurado();
            } catch (SQLException e) {
                e.printStackTrace();
                if (e.getErrorCode() == ERROR_EDITAR_CLAVE_AJENA){
                    JOptionPane.showMessageDialog(rootPane, "No puedes borrar este asegurado, restricción clave primeria/ajena");
                }
            }
    }
    
    private boolean validarCampos() {
        boolean CodPolizaVacio = etCodPoliza.getText().equals("");
        boolean CodNumAseguradoVacio = etNumAsegurado.getText().equals("");
        boolean NomAseguradoVacio = etNomAsegurado.getText().equals("");
        boolean fechaVacio = jsFechaAsegurado.getValue().toString().equals("");
        if(CodPolizaVacio){
            lblValidaCodAsPoliza.setText("Rellena el campo poliza");
        } else {
            lblValidaCodAsPoliza.setText("");
        }
        if (CodNumAseguradoVacio){
            lblValidaNumAsegurado.setText("Rellena el campo número");
        } else {
            lblValidaNumAsegurado.setText("");
        }
        if (NomAseguradoVacio){
            lblValidaNomAsegurado.setText("Rellena el campo nombre");
        } else {
            lblValidaNomAsegurado.setText("");
        }
        if (fechaVacio){
            lblValidaFechaAsegurado.setText("Rellena el campo fecha");
        } else {
            lblValidaFechaAsegurado.setText("");
        }
        if(CodPolizaVacio || CodNumAseguradoVacio || NomAseguradoVacio || fechaVacio) {
            return false;
        } else {
            return true;
        }
    }
    
    private void resetCampos(){
        etCodPoliza.setText("");
        etNumAsegurado.setText("");
        etNomAsegurado.setText("");
        Date fechaActual = new Date();
        jsFechaAsegurado.setValue(fechaActual);
        tablaAsegurado.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JTextField etCodPoliza;
    private javax.swing.JTextField etNomAsegurado;
    private javax.swing.JTextField etNumAsegurado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsFechaAsegurado;
    private javax.swing.JLabel lblCodPoliza;
    private javax.swing.JLabel lblFechaAsegurado;
    private javax.swing.JLabel lblNomAsegurado;
    private javax.swing.JLabel lblNumAsegurado;
    private javax.swing.JLabel lblValidaCodAsPoliza;
    private javax.swing.JLabel lblValidaFechaAsegurado;
    private javax.swing.JLabel lblValidaNomAsegurado;
    private javax.swing.JLabel lblValidaNumAsegurado;
    private javax.swing.JTable tablaAsegurado;
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