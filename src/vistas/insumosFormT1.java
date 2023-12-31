/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import dao.ProductoDAO;

public class insumosFormT1 extends javax.swing.JFrame {

    /**
     * Creates new form insumos
     */
     FondoPanel4 fondo4 = new FondoPanel4();
     int idProd;
     UIManager UI;
     ProductoDAO dao = new ProductoDAO();
     Producto prod = new Producto();
     DefaultTableModel modelo = new DefaultTableModel(); 
     
    public insumosFormT1() {        
        this.setContentPane(fondo4);                
        initComponents();
        listar();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }
    void listar(){
        List<Producto> lista = dao.listar();
        modelo=(DefaultTableModel)tabla.getModel();
        Object[] ob= new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0]=lista.get(i).getIdProd();
            ob[1]=lista.get(i).getNomProd();
            ob[2]=lista.get(i).getPrecioProd();
            ob[3]=lista.get(i).getStock();
            ob[4]=lista.get(i).getIdCateProd();
            //Mostramos el nombre de la tabla de CategoriaProductos
            ob[5]=lista.get(i).getNombreTipoprod();
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel4();
        jLabel2 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcantidadProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtConsultaProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JButton();
        cboIdCategoría = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre del Producto");

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Stock");

        txtcantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadProductoActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/actualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/limpiar.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/buscar.png"))); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtConsultaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaProductoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel7.setText("PRODUCTOS");

        jLabel8.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        jLabel8.setText("DULCE TENTACIÓN");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/regresar.png"))); // NOI18N
        jButton4.setText("REGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/eliminar2.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock", "ID Categoria", "Nombre Insumo"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/insertar.png"))); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("ID Categoria");

        btnCategorias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/mostrar.png"))); // NOI18N
        btnCategorias.setText("CATEGORIAS");
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        cboIdCategoría.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "400", "401", "402", "403" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(txtConsultaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtNombreProducto))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(35, 35, 35)
                                        .addComponent(cboIdCategoría, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtcantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCategorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnConsultar)
                                .addComponent(txtConsultaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cboIdCategoría, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        menu2Form men = new menu2Form();
        this.setVisible(false);
        men.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Bton Actulz
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Bton Eliminar
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Bton Mostrar Contenido
        nuevo();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // Bton Insertar
        insertar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int fila=tabla.getSelectedRow();
        if (fila == -1) {//Si es igual a -1
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
            idProd = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            String nomProd = tabla.getValueAt(fila, 1).toString();
            String precioProd = tabla.getValueAt(fila, 2).toString();
            String stock =  tabla.getValueAt(fila, 3).toString();    
            String idCateProd = tabla.getValueAt(fila, 4).toString();
            txtNombreProducto.setText(nomProd);
            txtPrecioProducto.setText(precioProd);
            txtcantidadProducto.setText(stock);
            cboIdCategoría.setSelectedItem(idCateProd);            
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
            // Obtener el texto ingresado por el usuario en el campo de búsqueda
        String NomProd = txtConsultaProducto.getText().trim();

        // Verificar si se ha ingresado un nombre para buscar
        if (!NomProd.isEmpty()) {
            // Limpiar la tabla antes de agregar los resultados de la búsqueda
            limpiarTabla();            

            // Llamar al método buscarPorNombre y obtener la lista de resultados
            List<Producto> resultados = dao.buscarPorNombre(NomProd);

            // Verificar si se encontraron resultados
            if (!resultados.isEmpty()) {
                // Llenar la tabla con los resultados de la búsqueda
                modelo = (DefaultTableModel) tabla.getModel();
                Object[] ob = new Object[5];

                for (Producto ins : resultados) {
                    ob[0] = ins.getIdProd();
                    ob[1] = ins.getNomProd();
                    ob[2] = ins.getPrecioProd();
                    ob[3] = ins.getStock();
                    ob[4] = ins.getIdCateProd();                    
                    modelo.addRow(ob);
                }

                tabla.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre para buscar.");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtcantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadProductoActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "*CATEGORIA DE PRODUCTOS*\n"+"IdCategoria-Nombre\n"+
        //        "400-Bebidas Calientes\n"+"401-Bebidas Frias\n"+"402-Pan\n"+"403-Bollería");
        //Sin fondo
        JOptionPane.showMessageDialog(null, "*IdCategoria-Nombre*\n"+
                "400-Bebidas Calientes\n"+"401-Bebidas Frias\n"+"402-Pan\n"+"403-Bollería", "Categoria de Productos", JOptionPane.PLAIN_MESSAGE, icono("/img/panadero.png", 40, 40));
        //Con fondo
        //UI = null;
        //UI.put("OptionPane.background", new Color(150,139,223));
        //UI.put("Panel.background", new Color(32,139,223));        
        //Object [] options = {"Okey"};
        //JOptionPane.showOptionDialog(null, "*IdCategoria-Nombre*\n"+
        //        "400-Bebidas Calientes\n"+"401-Bebidas Frias\n"+"402-Pan\n"+"403-Bollería", "Categoria de Productos",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icono("/img/panadero.png", 40, 40), options, options [0]);
        
    }//GEN-LAST:event_btnCategoriasActionPerformed
    
    private void txtConsultaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaProductoActionPerformed
    
    //Metodos de Notficaciones
    public Icon icono(String path, int width, int heigth){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    //Metodos para los botones
    //Insertar
    void insertar(){        
        String nomProd = txtNombreProducto.getText();        
        String precioProd = txtPrecioProducto.getText();
        String stock = txtcantidadProducto.getText();
        String idCateProd =cboIdCategoría.getSelectedItem().toString();
        
        //Arreglo de tipo Object
        Object[] ob = new Object[4];        
        ob[0] = nomProd;
        ob[1] = precioProd;
        ob[2] = stock;
        ob[3] = idCateProd;
        dao.insertar(ob);
    }
    
    //Eliminar
    void eliminar(){
        int fila =tabla.getSelectedRow();
        int ids=Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        if (fila==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
            dao.eliminar(ids);
        }
    }
    
    //Nuevo
    void nuevo(){
        txtNombreProducto.setText("");
        txtcantidadProducto.setText("");
        txtPrecioProducto.setText("");
        cboIdCategoría.setSelectedItem("");
        txtNombreProducto.requestFocus();
        
    }
    
    //Actualizar
    void actualizar(){
        int Fila=tabla.getSelectedRow();
        if(Fila==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
            String nomProd = txtNombreProducto.getText();        
            String precioProd = txtPrecioProducto.getText();
            String stock = txtcantidadProducto.getText();
            String idCateProd =cboIdCategoría.getSelectedItem().toString();
            Object[] obj = new Object[5];       
            obj[0]=nomProd;
            obj[1]=precioProd;        
            obj[2]=stock;
            obj[3]=idCateProd;
            obj[4]=idProd;
            dao.actualizar(obj);            
        }        
    }
    
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
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
            java.util.logging.Logger.getLogger(insumosFormT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insumosFormT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insumosFormT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insumosFormT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insumosFormT1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboIdCategoría;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtConsultaProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtcantidadProducto;
    // End of variables declaration//GEN-END:variables
    class FondoPanel4 extends JPanel
        {
            private Image imagen;

            @Override
            public void paint(Graphics g)
            {
                imagen = new ImageIcon(getClass().getResource("/img/VentanaInsumos.jpg")).getImage();

                g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);

                setOpaque(false);

                super.paint(g);
            }
        }
}
