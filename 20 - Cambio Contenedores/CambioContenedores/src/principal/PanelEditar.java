package principal;

import utils.BaseDatos;
import utils.Persona;

public class PanelEditar extends javax.swing.JPanel {

    BaseDatos basebatos;
    public PanelEditar(BaseDatos baseDatos) {
        this.basebatos = baseDatos;
        initComponents();
        initAltherComponents();
    }
    
    public void initAltherComponents(){
        
        btnGuardar.setEnabled(false);
        
        campoNombres.setEnabled(false);
        campoApellidos.setEnabled(false);
        campoDireccion.setEnabled(false);
        campoTelefono.setEnabled(false);
        campoEmail.setEnabled(false);

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqTitulo = new javax.swing.JLabel();
        etqDocumento = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        campoNombres = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        etqTitulo.setFont(new java.awt.Font("Impact", 1, 29)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("EDITAR PERSONAS");

        etqDocumento.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(0, 0, 0));
        etqDocumento.setText("Cedula:");

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        campoNombres.setBackground(new java.awt.Color(204, 204, 204));

        etqNombres.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(0, 0, 0));
        etqNombres.setText("Nombres:");

        campoApellidos.setBackground(new java.awt.Color(204, 204, 204));

        etqApellidos.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(0, 0, 0));
        etqApellidos.setText("Apellidos:");

        campoTelefono.setBackground(new java.awt.Color(204, 204, 204));

        etqTelefono.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono.setText("Telefono:");

        campoDireccion.setBackground(new java.awt.Color(204, 204, 204));

        etqDireccion.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqDireccion.setForeground(new java.awt.Color(0, 0, 0));
        etqDireccion.setText("Direccion:");

        campoEmail.setBackground(new java.awt.Color(204, 204, 204));

        etqEmail.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(0, 0, 0));
        etqEmail.setText("Email:");

        btnGuardar.setBackground(new java.awt.Color(0, 204, 51));
        btnGuardar.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(etqDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqApellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqNombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDocumento)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombres)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDireccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedula = campoCedula.getText();
        
        if (!cedula.isEmpty()) {
            Persona persona = basebatos.extraerPersona(cedula);

            if (persona != null) {
                
                btnGuardar.setEnabled(true);
                campoNombres.setEnabled(true);
                campoApellidos.setEnabled(true);
                campoDireccion.setEnabled(true);
                campoTelefono.setEnabled(true);
                campoEmail.setEnabled(true);
                
                // Mostrar información en los campos correspondientes
                campoNombres.setText(persona.getNombres());
                campoApellidos.setText(persona.getApellidos());
                campoTelefono.setText(persona.getTelefono());
                campoDireccion.setText(persona.getDireccion());
                campoEmail.setText(persona.getCorreo());
            } else {
                // Limpiar campos si la persona no se encuentra
                campoCedula.setText("");
                Alerta ventana = new Alerta("No existe la cedula");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarCambios();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void guardarCambios(){
        String cedula = campoCedula.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String direccion = campoDireccion.getText();
        String email = campoEmail.getText();
        
        boolean estado = basebatos.actualizarPersona(cedula, nombres, apellidos, direccion, telefono, email);
            
        if(estado){

            campoCedula.setText("");
            campoNombres.setText("");
            campoApellidos.setText("");
            campoTelefono.setText("");
            campoDireccion.setText("");
            campoEmail.setText("");

        }else{
            Alerta ventana = new Alerta("Error al agregar.");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
