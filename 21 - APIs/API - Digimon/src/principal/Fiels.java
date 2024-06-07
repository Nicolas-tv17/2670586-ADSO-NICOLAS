package principal;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Fiels extends javax.swing.JPanel {

    URL url;
    
    public Fiels(URL url) {
        this.url = url;
        initComponents();
        initAltherComponents();
    }
    
    public void initAltherComponents(){
        etq_imagen.setText("");
        Image icono_listar = getToolkit().createImage(url);
        icono_listar = icono_listar.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etq_imagen.setIcon(new ImageIcon(icono_listar));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_imagen = new javax.swing.JLabel();

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_imagen.setText("..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_imagen;
    // End of variables declaration//GEN-END:variables
}
