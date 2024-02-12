package principal;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

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
        
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_warning.png")));
        
        Image img_warning = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_warning.png"));
        img_warning = img_warning.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(img_warning));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorAlerta = new javax.swing.JPanel();
        etq_Alerta = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        etq_texto1 = new javax.swing.JLabel();
        etq_texto2 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();

        contenedorAlerta.setBackground(new java.awt.Color(255, 255, 255));

        etq_Alerta.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        etq_Alerta.setForeground(new java.awt.Color(255, 0, 0));
        etq_Alerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_Alerta.setText("ALERTA");

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_texto1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        etq_texto1.setForeground(new java.awt.Color(0, 0, 0));
        etq_texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto1.setText("TODOS LOS CAMPOS");

        etq_texto2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        etq_texto2.setForeground(new java.awt.Color(0, 0, 0));
        etq_texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_texto2.setText("SE NECESITAN LLENAR");

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
            .addComponent(etq_Alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorAlertaLayout.createSequentialGroup()
                .addGroup(contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorAlertaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etq_texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorAlertaLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btn)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorAlertaLayout.setVerticalGroup(
            contenedorAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAlertaLayout.createSequentialGroup()
                .addComponent(etq_Alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn)
                .addContainerGap())
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
    private javax.swing.JButton btn;
    private javax.swing.JPanel contenedorAlerta;
    private javax.swing.JLabel etq_Alerta;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_texto1;
    private javax.swing.JLabel etq_texto2;
    // End of variables declaration//GEN-END:variables
}
