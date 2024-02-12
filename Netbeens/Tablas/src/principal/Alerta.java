package principal;

public class Alerta extends javax.swing.JFrame {

   
    public Alerta() {
        initComponents();
        initOtherComponents();
    }
    
    public void initOtherComponents(){
        setTitle("ALERTA!!");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorAlerta = new javax.swing.JPanel();
        imgAlerta = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        etq_Alerta = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        btn = new javax.swing.JButton();

        contenedorAlerta.setBackground(new java.awt.Color(255, 255, 255));

        imgAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/84045.png"))); // NOI18N

        texto2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        texto2.setForeground(new java.awt.Color(0, 0, 0));
        texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto2.setText("SE NECESITAN LLENAR");

        Texto1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        Texto1.setForeground(new java.awt.Color(0, 0, 0));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto1.setText("TODOS LOS CAMPOS");

        separador1.setBackground(new java.awt.Color(0, 0, 0));

        etq_Alerta.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        etq_Alerta.setForeground(new java.awt.Color(255, 0, 0));
        etq_Alerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_Alerta.setText("!ALERTA¡");

        separador2.setBackground(new java.awt.Color(0, 0, 0));

        btn.setText("OKEY");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorAlertaLayout = new javax.swing.GroupLayout(contenedorAlerta);
        contenedorAlerta.setLayout(contenedorAlertaLayout);
        contenedorAlertaLayout.setHorizontalGroup(
            contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAlertaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgAlerta)
                .addGap(141, 141, 141))
            .addComponent(etq_Alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorAlertaLayout.createSequentialGroup()
                .addGroup(contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorAlertaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorAlertaLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btn)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(contenedorAlertaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separador2))
                .addContainerGap())
        );
        contenedorAlertaLayout.setVerticalGroup(
            contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAlertaLayout.createSequentialGroup()
                .addComponent(etq_Alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(imgAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        dispose();
    }//GEN-LAST:event_btnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto1;
    private javax.swing.JButton btn;
    private javax.swing.JPanel contenedorAlerta;
    private javax.swing.JLabel etq_Alerta;
    private javax.swing.JLabel imgAlerta;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
