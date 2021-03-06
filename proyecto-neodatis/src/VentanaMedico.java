/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

/**
 *
 * @author Exode-P
 */
public class VentanaMedico extends javax.swing.JFrame implements Serializable {
    
    MedicoTableModel tableModel;
    
    /**
     * Creates new form Medico
     */
    public VentanaMedico(){
        initComponents();
        cargarMedico();
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
        tablaMedico = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){return false;}
        };
        lblCodMedico = new javax.swing.JLabel();
        etCodMedico = new javax.swing.JTextField();
        lblNomMedico = new javax.swing.JLabel();
        etNomMedico = new javax.swing.JTextField();
        lblCodHospital = new javax.swing.JLabel();
        etCodHospital = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        lblValidaCodMedico = new javax.swing.JLabel();
        lblValidaNomMedico = new javax.swing.JLabel();
        lblValidaCodHospital = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aseguradora La Vida - Médicos");

        tablaMedico.setModel(new javax.swing.table.DefaultTableModel(
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
    tablaMedico.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaMedicoMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tablaMedico);

    lblCodMedico.setText("Código de Médico:");

    etCodMedico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etCodMedico.setToolTipText("Inserta un código de médico");
    etCodMedico.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etCodMedicoFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etCodMedicoFocusLost(evt);
        }
    });
    etCodMedico.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            etCodMedicoKeyTyped(evt);
        }
    });

    lblNomMedico.setText("Nombre de Médico:");

    etNomMedico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etNomMedico.setToolTipText("Inserta un nombre de médico");
    etNomMedico.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etNomMedicoFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etNomMedicoFocusLost(evt);
        }
    });

    lblCodHospital.setText("Código de Hospital:");

    etCodHospital.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etCodHospital.setToolTipText("Inserta un código de hospital");
    etCodHospital.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etCodHospitalFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etCodHospitalFocusLost(evt);
        }
    });
    etCodHospital.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            etCodHospitalKeyTyped(evt);
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
    btnBuscar.setEnabled(false);
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

    lblValidaCodMedico.setForeground(new java.awt.Color(255, 0, 0));

    lblValidaNomMedico.setForeground(new java.awt.Color(255, 0, 0));

    lblValidaCodHospital.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCodHospital)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodMedico)
                            .addComponent(lblNomMedico)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etNomMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(etCodHospital)
                        .addComponent(etCodMedico))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValidaNomMedico)
                                .addComponent(lblValidaCodHospital))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnRefrescar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValidaCodMedico)
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
                        .addComponent(etCodMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodMedico))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etNomMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaNomMedico)
                        .addComponent(lblNomMedico))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etCodHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodHospital)
                        .addComponent(lblValidaCodHospital)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaCodMedico))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnRefrescar)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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

    private void tablaMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicoMouseClicked
        int row = tablaMedico.getSelectedRow();
        etCodMedico.setText(tablaMedico.getModel().getValueAt(row, 0).toString());
        etNomMedico.setText(tablaMedico.getModel().getValueAt(row, 1).toString());
        etCodHospital.setText(tablaMedico.getModel().getValueAt(row, 2).toString());
        
        etCodMedico.setHorizontalAlignment(JTextField.CENTER);
        etNomMedico.setHorizontalAlignment(JTextField.CENTER);
        etCodHospital.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_tablaMedicoMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validarCampos()){
            actualizarMedico();
            resetCampos();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JLabel label = new JLabel("¿Deseas eliminar este médico?");
        JTextField tid = new JTextField(etCodHospital.getText().toString());
        JTextField tnombre = new JTextField(etCodMedico.getText().toString());
        JTextField thospital = new JTextField(etNomMedico.getText().toString());
        tid.setEditable(false);
        tnombre.setEditable(false);
        thospital.setEditable(false);
        Object[] componentsArray = {label,tid,tnombre,thospital};
        confirmarEliminar = JOptionPane.showConfirmDialog(
                                null
                        , componentsArray
                        , "Eliminar Médico"
                        , JOptionPane.OK_CANCEL_OPTION
                        , JOptionPane.INFORMATION_MESSAGE
            );
            
            if (confirmarEliminar == JOptionPane.OK_OPTION){
                eliminarMedico();
                resetCampos();
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//        JLabel lnombre = new JLabel("Introduzca el nombre del médico: \n");
//        JTextField tnombre = new JTextField(null);
//        Object[] componentsArray = {lnombre,tnombre};
//        busqueda = JOptionPane.showConfirmDialog(
//                                null
//                        , componentsArray
//                        , "BÚSQUEDA MEDICOS:"
//                        , JOptionPane.OK_CANCEL_OPTION
//                        , JOptionPane.INFORMATION_MESSAGE
//            );
//            
//            if (busqueda == JOptionPane.OK_OPTION){
//                String nombreBusqueda = tnombre.getText().toString();
//                if (!nombreBusqueda.equals("")){
//                    buscarMedico(nombreBusqueda);
//                }
//            }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        cargarMedico();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if(validarCampos()){
            insertarMedico();
            resetCampos();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void etCodMedicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodMedicoFocusGained
        etCodMedico.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etCodMedicoFocusGained

    private void etNomMedicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNomMedicoFocusGained
        etNomMedico.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etNomMedicoFocusGained

    private void etCodHospitalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodHospitalFocusGained
        etCodHospital.setHorizontalAlignment(JTextField.LEADING);
    }//GEN-LAST:event_etCodHospitalFocusGained

    private void etCodMedicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodMedicoFocusLost
        etCodMedico.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_etCodMedicoFocusLost

    private void etNomMedicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etNomMedicoFocusLost
        etNomMedico.setHorizontalAlignment(JTextField.CENTER);
        if (etNomMedico.getWidth() < 100){
            etNomMedico.setSize(100, etNomMedico.getHeight());
        }
    }//GEN-LAST:event_etNomMedicoFocusLost

    private void etCodHospitalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etCodHospitalFocusLost
        etCodHospital.setHorizontalAlignment(JTextField.CENTER);
    }//GEN-LAST:event_etCodHospitalFocusLost

    private void etCodMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etCodMedicoKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isDigit(car)) && (car != evt.VK_BACK_SPACE) && (car != evt.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite introducir números.");
        }
    }//GEN-LAST:event_etCodMedicoKeyTyped

    private void etCodHospitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etCodHospitalKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isDigit(car)) && (car != evt.VK_BACK_SPACE) && (car != evt.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite introducir números.");
        }
    }//GEN-LAST:event_etCodHospitalKeyTyped

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
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMedico().setVisible(true);
            }
        });
    }

    public void cargarMedico() {
            try {
                tableModel = new MedicoTableModel();
                tablaMedico.setModel(tableModel);
                
                ODB database = ODBFactory.open("db.neodatis");
                
                Objects<Medico> medicos = database.getObjects(Medico.class);
                
                while (medicos.hasNext()) {
                Medico medico = medicos.next();
                tableModel.addRow(Arrays.asList(medico.getCodMedico(),
                        medico.getNombreMedico(),
                        medico.getHospital().getCodHospital()));
            }

            tablaMedico.setModel(tableModel);
            database.close();
                
            } catch (Exception e) {
                e.printStackTrace();
//                if (e.getErrorCode() == TABLA_NO_ENCONTRADA){
//                    JOptionPane.showMessageDialog(rootPane, "Tabla no encontrada. Pongase en contacto con el administrador.");
//                }
            }
    }

//    private void buscarMedico(String nombre) {

//    }
    
    private void insertarMedico(){
            try {
                String codMedico = etCodHospital.getText();
                String nombreMedico = etNomMedico.getText();
                String codHospital = etCodHospital.getText();
                Hospital hospital = new Hospital(codHospital);
                
                Medico medico = new Medico(codMedico, nombreMedico, hospital);
                
                ODB database= ODBFactory.open("db.neodatis");

                database.store(medico);

                database.close();
                
                JOptionPane.showMessageDialog(this,"Médico insertado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
                
                cargarMedico();
            } catch (Exception e) {
                e.printStackTrace();
//                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
//                    JOptionPane.showMessageDialog(rootPane, "Existe un médico con ese identificador (ID)");
//                }
//                if (e.getErrorCode() == CLAVE_AJENA_NO_ENCONTRADA){
//                    JOptionPane.showMessageDialog(rootPane, "No existe un hospital con ese identificador (ID)");
//                }
//                if (e.getErrorCode() == VALOR_DEMASIADO_LARGO){
//                    JOptionPane.showMessageDialog(rootPane, "Has introducido un valor demasiado largo");
//                }
            }
    }
    
    private void actualizarMedico() {
        try {
                String codMedico =(String) tableModel.getValueAt(tablaMedico.getSelectedRow(), 0);
                
                ODB database = ODBFactory.open("db.neodatis");
                
                IQuery query = new CriteriaQuery(Medico.class, Where.equal("codMedico", codMedico));
                
                Medico medico = (Medico) database.getObjects(query).getFirst();
                Hospital hospital = new Hospital(etCodHospital.getText());
                medico.setCodMedico(etCodMedico.getText());
                medico.setNombreMedico(etNomMedico.getText());
                medico.setHospital(hospital);
                
                database.store(medico);
                database.close();
                
                JOptionPane.showMessageDialog(this, "El médico ha sido modificado", null, JOptionPane.INFORMATION_MESSAGE);
                
                cargarMedico();
            } catch (Exception e) {
                e.printStackTrace();
//                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
//                    JOptionPane.showMessageDialog(rootPane, "Existe un médico con ese identificador (ID)");
//                }
//                if (e.getErrorCode() == CLAVE_AJENA_NO_ENCONTRADA){
//                    JOptionPane.showMessageDialog(rootPane, "No existe un hospital con ese identificador (ID)");
//                }
//                if (e.getErrorCode() == VALOR_DEMASIADO_LARGO){
//                    JOptionPane.showMessageDialog(rootPane, "Has introducido un valor demasiado largo");
//                };
//                if (e.getErrorCode() == ERROR_EDITAR_CLAVE_AJENA){
//                    JOptionPane.showMessageDialog(rootPane, "No puedes editar el id de este médico");
//                };
            }
    }
    
    private void eliminarMedico() {
        try {
                String codMedico =(String) tableModel.getValueAt(tablaMedico.getSelectedRow(), 0);
            
                ODB database = ODBFactory.open("db.neodatis");

                IQuery query = new CriteriaQuery(Medico.class, Where.equal("codMedico", codMedico));

                Medico medico = (Medico) database.getObjects(query).getFirst();

                database.delete(medico);

                database.close();

                JOptionPane.showMessageDialog(this, "El médico se ha borrado correctamente", null, JOptionPane.INFORMATION_MESSAGE);

                cargarMedico();
            } catch (Exception e) {
                e.printStackTrace();
//                if (e.getErrorCode() == ERROR_EDITAR_CLAVE_AJENA){
//                    JOptionPane.showMessageDialog(rootPane, "No puedes borrar este medico, restricción clave primeria/ajena");
//                }
            }
    }
    
    private boolean validarCampos() {
        boolean CodHospitalVacio = etCodHospital.getText().equals("");
        boolean NomMedicoVacio = etNomMedico.getText().equals("");
        boolean CodMedicoVacio = etCodMedico.getText().equals("");
        if(CodMedicoVacio){
            lblValidaCodMedico.setText("Rellena el campo código");
        } else {
            lblValidaCodMedico.setText("");
        }
        if (NomMedicoVacio){
            lblValidaNomMedico.setText("Rellena el campo nombre");
        } else {
            lblValidaNomMedico.setText("");
        }
        if (CodHospitalVacio){
            lblValidaCodHospital.setText("Rellena el campo hospital");
        } else {
            lblValidaCodHospital.setText("");
        }
        if(CodHospitalVacio || NomMedicoVacio || CodMedicoVacio) {
            return false;
        } else {
            return true;
        }
    }
    
    private void resetCampos(){
        etCodMedico.setText("");
        etNomMedico.setText("");
        etCodHospital.setText("");
        tablaMedico.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JTextField etCodHospital;
    private javax.swing.JTextField etCodMedico;
    private javax.swing.JTextField etNomMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodHospital;
    private javax.swing.JLabel lblCodMedico;
    private javax.swing.JLabel lblNomMedico;
    private javax.swing.JLabel lblValidaCodHospital;
    private javax.swing.JLabel lblValidaCodMedico;
    private javax.swing.JLabel lblValidaNomMedico;
    private javax.swing.JTable tablaMedico;
    // End of variables declaration//GEN-END:variables
    
    private int busqueda;
    private int confirmarEliminar;
    
    private final int CLAVE_PRIMARIA_DUPLICADA = 1;
    private final int CLAVE_AJENA_NO_ENCONTRADA = 2291;
    private final int VALOR_DEMASIADO_LARGO = 1438;
    private final int TABLA_NO_ENCONTRADA = 942;
    private final int ERROR_EDITAR_CLAVE_AJENA = 2292;

}
