/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aseguradora;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Hibernate;
import org.hibernate.JDBCException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.PolizasAsegurados;
import pojo.PolizasAseguradosId;

/**
 *
 * @author Exode-P
 */
public class VistaVentana extends javax.swing.JFrame implements Serializable {
    /**
     * Creates new form Medico
     */
    
    private ConnectOracle conection;
    private SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
    
    public VistaVentana(ConnectOracle co){
        conection = co;
        initComponents();
        cargarVista();
    }
    
    public VistaVentana() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVista = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){return false;}
        };
        lblCodPoliza = new javax.swing.JLabel();
        etCodPoliza = new javax.swing.JTextField();
        lblDatosPoliza = new javax.swing.JLabel();
        etDatosPoliza = new javax.swing.JTextField();
        lblNumAsegurado = new javax.swing.JLabel();
        etNumAsegurado = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        lblValidaCodPoliza = new javax.swing.JLabel();
        lblValidaNumAsegurado = new javax.swing.JLabel();
        lblValidaDatosPoliza = new javax.swing.JLabel();
        lblNomAsegurado = new javax.swing.JLabel();
        etNomAsegurado = new javax.swing.JTextField();
        lblFechaAsegurado = new javax.swing.JLabel();
        jsFechaAsegurado = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aseguradora La Vida - Médicos");

        tablaVista.setModel(new javax.swing.table.DefaultTableModel(
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
    tablaVista.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaVistaMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tablaVista);

    lblCodPoliza.setText("Código de Poliza:");

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

    lblDatosPoliza.setText("Datos de Poliza:");

    etDatosPoliza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etDatosPoliza.setToolTipText("Inserta un nombre de médico");
    etDatosPoliza.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etDatosPolizaFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etDatosPolizaFocusLost(evt);
        }
    });

    lblNumAsegurado.setText("Num de Asegurado:");

    etNumAsegurado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etNumAsegurado.setToolTipText("Inserta un código de hospital");
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

    lblValidaNumAsegurado.setForeground(new java.awt.Color(255, 0, 0));

    lblValidaDatosPoliza.setForeground(new java.awt.Color(255, 0, 0));

    lblNomAsegurado.setText("Nombre Asegurado:");

    etNomAsegurado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    etNomAsegurado.setToolTipText("Inserta un código de hospital");
    etNomAsegurado.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            etNomAseguradoActionPerformed(evt);
        }
    });
    etNomAsegurado.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            etNomAseguradoFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            etNomAseguradoFocusLost(evt);
        }
    });

    lblFechaAsegurado.setText("Fecha Asegurado:");

    jsFechaAsegurado.setModel(new javax.swing.SpinnerDateModel());
    jsFechaAsegurado.setEditor(new JSpinner.DateEditor(jsFechaAsegurado, "dd/MM/yy"));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnActualizar)
                    .addGap(18, 18, 18)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblFechaAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jsFechaAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomAsegurado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etNomAsegurado, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumAsegurado)
                                    .addComponent(lblDatosPoliza, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodPoliza, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etDatosPoliza, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(etNumAsegurado)
                                    .addComponent(etCodPoliza)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValidaNumAsegurado)
                                .addComponent(lblValidaDatosPoliza))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnRefrescar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblValidaCodPoliza)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addComponent(etDatosPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaNumAsegurado)
                        .addComponent(lblDatosPoliza))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etNumAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNumAsegurado)
                        .addComponent(lblValidaDatosPoliza)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidaCodPoliza))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnRefrescar)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblNomAsegurado)
                .addComponent(etNomAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblFechaAsegurado)
                .addComponent(jsFechaAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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
    }// </editor-fold>                        

    private void etNomAseguradoFocusLost(java.awt.event.FocusEvent evt) {                                         
        etNomAsegurado.setHorizontalAlignment(JTextField.CENTER);
    }                                        

    private void etNomAseguradoFocusGained(java.awt.event.FocusEvent evt) {                                           
        etNomAsegurado.setHorizontalAlignment(JTextField.LEADING);
    }                                          

    private void etNomAseguradoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(validarCampos()){
            insertarAsegurado();
            resetCampos();
        }
    }                                           

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cargarVista();
    }                                            

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.dispose();
    }                                         

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JLabel lnombre = new JLabel("Introduzca el nombre del asegurado: \n");
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
    }                                         

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        JLabel label = new JLabel("¿Deseas eliminar este médico?");
        JTextField tid = new JTextField(etNumAsegurado.getText().toString());
        JTextField tnombre = new JTextField(etCodPoliza.getText().toString());
        JTextField thospital = new JTextField(etDatosPoliza.getText().toString());
        tid.setEditable(false);
        tnombre.setEditable(false);
        thospital.setEditable(false);
        Object[] componentsArray = {label,tid,tnombre,thospital};
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
    }                                           

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(validarCampos()){
            actualizarVista();
            resetCampos();
        }
    }                                             

    private void etNumAseguradoKeyTyped(java.awt.event.KeyEvent evt) {                                        
        char car = evt.getKeyChar();
        if (!(Character.isDigit(car)) && (car != evt.VK_BACK_SPACE) && (car != evt.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite introducir números.");
        }
    }                                       

    private void etNumAseguradoFocusLost(java.awt.event.FocusEvent evt) {                                         
        etNumAsegurado.setHorizontalAlignment(JTextField.CENTER);
    }                                        

    private void etNumAseguradoFocusGained(java.awt.event.FocusEvent evt) {                                           
        etNumAsegurado.setHorizontalAlignment(JTextField.LEADING);
    }                                          

    private void etDatosPolizaFocusLost(java.awt.event.FocusEvent evt) {                                        
        etDatosPoliza.setHorizontalAlignment(JTextField.CENTER);
        if (etDatosPoliza.getWidth() < 100){
            etDatosPoliza.setSize(100, etDatosPoliza.getHeight());
        }
    }                                       

    private void etDatosPolizaFocusGained(java.awt.event.FocusEvent evt) {                                          
        etDatosPoliza.setHorizontalAlignment(JTextField.LEADING);
    }                                         

    private void etCodPolizaKeyTyped(java.awt.event.KeyEvent evt) {                                     
        char car = evt.getKeyChar();
        if (!(Character.isDigit(car)) && (car != evt.VK_BACK_SPACE) && (car != evt.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite introducir números.");
        }
    }                                    

    private void etCodPolizaFocusLost(java.awt.event.FocusEvent evt) {                                      
        etCodPoliza.setHorizontalAlignment(JTextField.CENTER);
    }                                     

    private void etCodPolizaFocusGained(java.awt.event.FocusEvent evt) {                                        
        etCodPoliza.setHorizontalAlignment(JTextField.LEADING);
    }                                       

    private void tablaVistaMouseClicked(java.awt.event.MouseEvent evt) {                                         
        int row = tablaVista.getSelectedRow();
        etCodPoliza.setText(tablaVista.getModel().getValueAt(row, 0).toString());
        etDatosPoliza.setText(tablaVista.getModel().getValueAt(row, 1).toString());
        etNumAsegurado.setText(tablaVista.getModel().getValueAt(row, 2).toString());
        etNomAsegurado.setText(tablaVista.getModel().getValueAt(row, 3).toString());
        String fechaTabla = tablaVista.getModel().getValueAt(row, 4).toString();
        String soloFecha = fechaTabla.split(" ")[0];//Sacamos solo la parte de la fecha en formato yyyy-MM-dd
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");//Formato español
        Date fechaDate = null;
        try {
            fechaDate = formatter.parse(soloFecha);//Convertimos soloFecha a Date con formato inglés
        } catch (ParseException ex) {
            Logger.getLogger(VistaVentana.class.getName()).log(Level.SEVERE, null, ex);
        }

        jsFechaAsegurado.setValue(fechaDate);

        etCodPoliza.setHorizontalAlignment(JTextField.CENTER);
        etDatosPoliza.setHorizontalAlignment(JTextField.CENTER);
        etNumAsegurado.setHorizontalAlignment(JTextField.CENTER);
        etNomAsegurado.setHorizontalAlignment(JTextField.CENTER);
    }                                        

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
            java.util.logging.Logger.getLogger(VistaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVentana().setVisible(true);
            }
        });
    }

    public void cargarVista() {
    	try {
        	String[] columnNames = {"Cod. Poliza", "Datos Poliza", "Num", "Nombre Asegurado", "FN"};
        	DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        	
        	Session session = sesion.openSession();
        	
    		PolizasAsegurados pa = new PolizasAsegurados();
    		Query cons = session.createQuery("from pojo.PolizasAsegurados");
    		List<PolizasAsegurados> lista = cons.list();
    		Iterator<PolizasAsegurados> iter = lista.iterator();

    		while (iter.hasNext()) {
    			pa = (PolizasAsegurados) iter.next();
    			Hibernate.initialize(pa.getId());
    			Vector row = new Vector();
    			row.add(pa.getId().getCodP());
    			row.add(pa.getId().getDatosP());
    			row.add(pa.getId().getNum());
    			row.add(pa.getId().getNa());
    			row.add(formatDate(pa.getId().getFn().toString()));
    			model.addRow(row);
    		}

    		tablaVista.setModel(model);
    		session.close();
        	
        } catch (JDBCException e) {
            e.printStackTrace();
            if (e.getErrorCode() == TABLA_NO_ENCONTRADA){
                JOptionPane.showMessageDialog(rootPane, "Tabla no encontrada. Pongase en contacto con el administrador.");
            }
        }
    }

    private String formatDate(String date){
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");//Formato inglés
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yy");//Formato español
		String fechaDate2 = null;
		try {
        	java.util.Date fechaDate = formatter.parse(date);
        	fechaDate2 = formatter2.format(fechaDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fechaDate2;
    }
    
    private void buscarAsegurado(String nombre) {
        Session session = sesion.openSession(); 
    	PolizasAsegurados pa;
		Query cons = session.createQuery( 
                "from pojo.PolizasAsegurados as pa "
                + "where upper(pa.id.na) LIKE ?");
		cons.setString(0, "%"+nombre.toUpperCase()+"%");
		List<PolizasAsegurados> lista = cons.list();
		DefaultTableModel model = (DefaultTableModel)tablaVista.getModel();
		if(!lista.isEmpty()){
	        model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
			Iterator<PolizasAsegurados> iter = lista.iterator();
			while (iter.hasNext()) {
				pa = (PolizasAsegurados) iter.next();
				Hibernate.initialize(pa.getId());
				Vector row = new Vector();
				row.add(pa.getId().getCodP());
				row.add(pa.getId().getDatosP());
				row.add(pa.getId().getNum());
				row.add(pa.getId().getNa());
				row.add(formatDate(pa.getId().getFn().toString()));
				model.addRow(row);
			}
			tablaVista.setModel(model);
	        session.close();
		}else{
	        model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
			JOptionPane.showMessageDialog(null,
                    "No hay resultados para su búsqueda",
                    "Información",
                    JOptionPane.ERROR_MESSAGE);
                cargarVista(); 
		}
        
    }
    
    private void insertarAsegurado(){
            try {
                Date fechaAsegurado = (Date)jsFechaAsegurado.getValue();
                Session session = sesion.openSession();
        		Transaction tx = session.beginTransaction();
            	PolizasAsegurados pa = new PolizasAsegurados(new PolizasAseguradosId(Integer.parseInt(etCodPoliza.getText()),etDatosPoliza.getText(),Integer.parseInt(etNumAsegurado.getText())));
            	System.out.println("CODPOLIZA: "+Integer.parseInt(etCodPoliza.getText()));
            	pa.getId().setCodP(Integer.parseInt(etCodPoliza.getText()));
            	pa.getId().setDatosP(etDatosPoliza.getText());
            	pa.getId().setNum(Integer.parseInt(etNumAsegurado.getText()));
            	pa.getId().setNa(etNomAsegurado.getText());
            	pa.getId().setFn(fechaAsegurado);
            	session.save(pa);
            	tx.commit();
            	session.close();
                
                cargarVista();
            } catch (JDBCException e) {
                e.printStackTrace();
                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
                    JOptionPane.showMessageDialog(rootPane, "Existe un asegurado con ese identificador (ID)");
                }
                if (e.getErrorCode() == CLAVE_AJENA_NO_ENCONTRADA){
                    JOptionPane.showMessageDialog(rootPane, "No existe una póliza con ese identificador (ID)");
                }
                if (e.getErrorCode() == VALOR_DEMASIADO_LARGO){
                    JOptionPane.showMessageDialog(rootPane, "Has introducido un valor demasiado largo");
                }
            }
    }
    
    private void actualizarVista() {
            try {
                Session session = sesion.openSession();
        		Transaction tx = session.beginTransaction();
	            
	            String hql = "update PolizasAsegurados pa set "
	                    + "pa.id.na = :na,pa.id.fn = :fn "
	                    + "where pa.id.codP = :codp "
	                    + "and pa.id.num = :num";
	            Date fechaAsegurado = (Date)jsFechaAsegurado.getValue();
	            int query = session.createQuery(hql) 
	                    .setString("na", etNomAsegurado.getText()) 
	                    .setDate("fn", fechaAsegurado)
	                    .setInteger("codp", Integer.parseInt(etCodPoliza.getText())) 
	                    .setInteger("num", Integer.parseInt(etNumAsegurado.getText())) 
	                    .executeUpdate(); 
	            
            	tx.commit();
            	session.close();
                cargarVista();
            } catch (JDBCException e) {
                e.printStackTrace();
                if (e.getErrorCode() == CLAVE_PRIMARIA_DUPLICADA){
                    JOptionPane.showMessageDialog(rootPane, "Existe una póliza con ese identificador (ID)");
                }
                if (e.getErrorCode() == CLAVE_AJENA_NO_ENCONTRADA){
                    JOptionPane.showMessageDialog(rootPane, "No existe una póliza con ese identificador (ID)");
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
	        	Session session = sesion.openSession();
	    		Transaction tx = session.beginTransaction();
	    		PolizasAsegurados pa;
	        	
	        	Query q = session.createQuery( 
	                    "from PolizasAsegurados as pa "
	                    + "where pa.id.codP = ? "
	                    + "and pa.id.num = ?"); 
	      
	        	q.setInteger(0, Integer.parseInt(etCodPoliza.getText())); 
	            q.setInteger(1, Integer.parseInt(etNumAsegurado.getText())); 
	      
	            pa = (PolizasAsegurados) q.uniqueResult(); 
	        	
	        	session.delete(pa);
	        	tx.commit();
	        	session.close();
                cargarVista();
            } catch (JDBCException e) {
                e.printStackTrace();
                if (e.getErrorCode() == ERROR_EDITAR_CLAVE_AJENA){
                    JOptionPane.showMessageDialog(rootPane, "No puedes borrar este asegurado, restricción clave primeria/ajena");
                }
            }
    }
    
    private boolean validarCampos() {
        boolean NumAseguradoVacio = etNumAsegurado.getText().equals("");
        boolean DatosPolicaVacio = etDatosPoliza.getText().equals("");
        boolean CodPolizaVacio = etCodPoliza.getText().equals("");
        if(CodPolizaVacio){
            lblValidaCodPoliza.setText("Rellena el campo codigo p");
        } else {
            lblValidaCodPoliza.setText("");
        }
        if (DatosPolicaVacio){
            lblValidaNumAsegurado.setText("Rellena el campo datos p");
        } else {
            lblValidaNumAsegurado.setText("");
        }
        if (NumAseguradoVacio){
            lblValidaDatosPoliza.setText("Rellena el campo num a");
        } else {
            lblValidaDatosPoliza.setText("");
        }
        if(NumAseguradoVacio || DatosPolicaVacio || CodPolizaVacio) {
            return false;
        } else {
            return true;
        }
    }
    
    private void resetCampos(){
        etCodPoliza.setText("");
        etDatosPoliza.setText("");
        etNumAsegurado.setText("");
        etNomAsegurado.setText("");
        Date fechaActual = new Date();
        jsFechaAsegurado.setValue(fechaActual);
        tablaVista.clearSelection();
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JTextField etCodPoliza;
    private javax.swing.JTextField etDatosPoliza;
    private javax.swing.JTextField etNomAsegurado;
    private javax.swing.JTextField etNumAsegurado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsFechaAsegurado;
    private javax.swing.JLabel lblCodPoliza;
    private javax.swing.JLabel lblDatosPoliza;
    private javax.swing.JLabel lblFechaAsegurado;
    private javax.swing.JLabel lblNomAsegurado;
    private javax.swing.JLabel lblNumAsegurado;
    private javax.swing.JLabel lblValidaDatosPoliza;
    private javax.swing.JLabel lblValidaCodPoliza;
    private javax.swing.JLabel lblValidaNumAsegurado;
    private javax.swing.JTable tablaVista;
    // End of variables declaration                   
    
    private int busqueda;
    private int confirmarEliminar;
    
    private final int CLAVE_PRIMARIA_DUPLICADA = 1;
    private final int CLAVE_AJENA_NO_ENCONTRADA = 2291;
    private final int VALOR_DEMASIADO_LARGO = 1438;
    private final int TABLA_NO_ENCONTRADA = 942;
    private final int ERROR_EDITAR_CLAVE_AJENA = 2292;
//    private final int CAMPO_NO_NULO = 
}
