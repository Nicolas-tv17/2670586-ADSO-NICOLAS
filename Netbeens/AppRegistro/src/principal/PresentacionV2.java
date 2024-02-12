package principal;

public class PresentacionV2 extends javax.swing.JFrame {
    
    public PresentacionV2() {
        initComponents();
        initAlternComponent();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contenedorPrincipal = new javax.swing.JPanel();
        etq_texto = new javax.swing.JLabel();
        campo_texto = new javax.swing.JTextField();
        btn_iniciar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        etq_respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PresentacionV2");
        setResizable(false);

        contenedorTitulo.setBackground(new java.awt.Color(0, 204, 204));

        etqTitulo.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Formulario");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        contenedorPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        etq_texto.setBackground(new java.awt.Color(255, 255, 255));
        etq_texto.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        etq_texto.setForeground(new java.awt.Color(255, 255, 255));
        etq_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto.setText("TEXTO:");

        campo_texto.setBackground(new java.awt.Color(255, 255, 255));
        campo_texto.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        campo_texto.setForeground(new java.awt.Color(0, 0, 0));

        btn_iniciar.setBackground(new java.awt.Color(0, 153, 153));
        btn_iniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_iniciar.setForeground(new java.awt.Color(0, 0, 0));
        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        etq_respuesta.setBackground(new java.awt.Color(255, 255, 255));
        etq_respuesta.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        etq_respuesta.setForeground(new java.awt.Color(255, 255, 255));
        etq_respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_respuesta.setText("-----------");

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador)
            .addComponent(etq_respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_iniciar)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(etq_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_iniciar)
                .addGap(30, 30, 30)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        String temporal = campo_texto.getText();
        etq_respuesta.setText(temporal);
        campo_texto.setText("");
        campo_texto.requestFocus();
    }//GEN-LAST:event_btn_iniciarActionPerformed

    public void initAlternComponent(){
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JTextField campo_texto;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etq_respuesta;
    private javax.swing.JLabel etq_texto;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
