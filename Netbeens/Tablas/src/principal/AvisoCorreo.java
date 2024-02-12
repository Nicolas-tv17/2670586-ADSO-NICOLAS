
package principal;

public class AvisoCorreo extends javax.swing.JFrame {

    
    public AvisoCorreo() {
        initComponents();
        initOthersComponents2();
    }
    
    public void initOthersComponents2(){
        setTitle("Aviso");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorAvisoCorreo = new javax.swing.JPanel();
        contenedorAviso = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        etq_texto = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorAvisoCorreo.setBackground(new java.awt.Color(255, 255, 0));
        contenedorAvisoCorreo.setForeground(new java.awt.Color(255, 255, 0));

        contenedorAviso.setBackground(new java.awt.Color(255, 255, 0));

        etq_titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("AVISO");

        etq_texto.setFont(new java.awt.Font("Helvetica Neue", 2, 24)); // NOI18N
        etq_texto.setForeground(new java.awt.Color(0, 0, 0));
        etq_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto.setText("Correo ya registrado");

        btn_aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setForeground(new java.awt.Color(0, 0, 0));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorAvisoLayout = new javax.swing.GroupLayout(contenedorAviso);
        contenedorAviso.setLayout(contenedorAvisoLayout);
        contenedorAvisoLayout.setHorizontalGroup(
            contenedorAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorAvisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(etq_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(contenedorAvisoLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btn_aceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorAvisoLayout.setVerticalGroup(
            contenedorAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorAvisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_aceptar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorAvisoCorreoLayout = new javax.swing.GroupLayout(contenedorAvisoCorreo);
        contenedorAvisoCorreo.setLayout(contenedorAvisoCorreoLayout);
        contenedorAvisoCorreoLayout.setHorizontalGroup(
            contenedorAvisoCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorAvisoCorreoLayout.setVerticalGroup(
            contenedorAvisoCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorAvisoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorAvisoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JPanel contenedorAviso;
    private javax.swing.JPanel contenedorAvisoCorreo;
    private javax.swing.JLabel etq_texto;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
