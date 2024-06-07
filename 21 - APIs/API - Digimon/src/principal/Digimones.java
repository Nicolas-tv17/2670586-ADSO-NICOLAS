package principal;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class Digimones extends javax.swing.JPanel {

    JsonObject temp;
    
    public Digimones(JsonObject temp) {
        this.temp = temp;
        initComponents();
        initAltherConponents();
    }
    
    public void initAltherConponents(){
        
        String nombres = temp.get("name").getAsString();
        String imagen = temp.get("image").getAsString();
        try {
            URL url = new URL(imagen);
            etq_imagen.setText("");
            Image imagenDigimon = getToolkit().createImage(url);
            imagenDigimon = imagenDigimon.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
            etq_imagen.setIcon(new ImageIcon(imagenDigimon));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Digimones.class.getName()).log(Level.SEVERE, null, ex);
        }
        etq_nombre.setText(nombres);
        contenedorinfo.setBorder(BorderFactory.createLineBorder(Color.white,3));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorinfo = new javax.swing.JPanel();
        etq_imagen = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(230, 230));
        setPreferredSize(new java.awt.Dimension(240, 240));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        contenedorinfo.setBorder(new javax.swing.border.MatteBorder(null));
        contenedorinfo.setMaximumSize(new java.awt.Dimension(100, 100));

        etq_imagen.setForeground(new java.awt.Color(0, 0, 0));
        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_imagen.setText("imagen");

        etq_nombre.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("titulo");

        javax.swing.GroupLayout contenedorinfoLayout = new javax.swing.GroupLayout(contenedorinfo);
        contenedorinfo.setLayout(contenedorinfoLayout);
        contenedorinfoLayout.setHorizontalGroup(
            contenedorinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorinfoLayout.setVerticalGroup(
            contenedorinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorinfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        InfoDigimon ventana = new InfoDigimon(temp);
    }//GEN-LAST:event_formMousePressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        contenedorinfo.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        contenedorinfo.setBorder(BorderFactory.createLineBorder(Color.white,3));
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorinfo;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_nombre;
    // End of variables declaration//GEN-END:variables
}
