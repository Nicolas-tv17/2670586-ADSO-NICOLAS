package principal;

import utils.BaseDatos;
import utils.Persona;


public class PanelEliminar extends javax.swing.JPanel {

    BaseDatos baseDatos;
    
    
    public PanelEliminar(BaseDatos baseDatos) {
        this.baseDatos = new BaseDatos();
        initComponents();
        initAltherComponents();
    }
    
    public void initAltherComponents(){
        btn_eliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqEmail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_eliminar = new javax.swing.JButton();
        etqNombres = new javax.swing.JLabel();
        etqApellidos = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        etqDocumento = new javax.swing.JLabel();
        etqDireccion = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        etq_nombres = new javax.swing.JLabel();
        etq_apellidos = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        etq_direccion = new javax.swing.JLabel();
        etq_email = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        etqTitulo.setFont(new java.awt.Font("Impact", 1, 29)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("ELIMINAR PERSONAS");

        etqEmail.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(0, 0, 0));
        etqEmail.setText("Email:");

        btn_eliminar.setBackground(new java.awt.Color(0, 204, 51));
        btn_eliminar.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(0, 0, 0));
        etqNombres.setText("Nombres:");

        etqApellidos.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(0, 0, 0));
        etqApellidos.setText("Apellidos:");

        etqTelefono.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono.setText("Telefono:");

        etqDocumento.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(0, 0, 0));
        etqDocumento.setText("Cedula:");

        etqDireccion.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqDireccion.setForeground(new java.awt.Color(0, 0, 0));
        etqDireccion.setText("Direccion:");

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));

        btn_buscar.setBackground(new java.awt.Color(51, 51, 255));
        btn_buscar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etq_nombres.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etq_nombres.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombres.setText("--------------------------------");

        etq_apellidos.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellidos.setText("--------------------------------");

        etq_telefono.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(0, 0, 0));
        etq_telefono.setText("--------------------------------");

        etq_direccion.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(0, 0, 0));
        etq_direccion.setText("--------------------------------");

        etq_email.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etq_email.setForeground(new java.awt.Color(0, 0, 0));
        etq_email.setText("--------------------------------");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("-->");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("-->");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("-->");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("-->");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("-->");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqNombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqEmail, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2)))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_direccion)
                            .addComponent(etq_telefono)
                            .addComponent(etq_apellidos)
                            .addComponent(etq_nombres)
                            .addComponent(etq_email))))
                .addGap(276, 300, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(etqDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDocumento)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombres)
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addComponent(etqApellidos)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addComponent(etqTelefono)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addComponent(etqDireccion)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(etqEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_email)
                            .addComponent(jLabel5))))
                .addGap(31, 31, 31)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        deletePerson();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    public void deletePerson(){
        String cedula = campoCedula.getText();
        
        boolean estado = baseDatos.eliminarPersona(cedula);
            
        if(estado){

            campoCedula.setText("");
            etq_nombres.setText("--------------------------------");
            etq_apellidos.setText("--------------------------------");
            etq_telefono.setText("--------------------------------");
            etq_direccion.setText("--------------------------------");
            etq_email.setText("--------------------------------");

        }else{
            Alerta ventana = new Alerta("Error al agregar.");
        }
    }
    
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       
        String cedula = campoCedula.getText();
        
        if (!cedula.isEmpty()) {
            Persona persona = baseDatos.extraerPersona(cedula);

            if (persona != null) {
                
                btn_eliminar.setEnabled(true);
                
                // Mostrar información en los campos correspondientes
                etq_nombres.setText(persona.getNombres());
                etq_apellidos.setText(persona.getApellidos());
                etq_telefono.setText(persona.getTelefono());
                etq_direccion.setText(persona.getDireccion());
                etq_email.setText(persona.getCorreo());
                
            } else {
                // Limpiar campos si la persona no se encuentra
                campoCedula.setText("");
                Alerta ventana = new Alerta("No existe la cedula");
            }
        }
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
