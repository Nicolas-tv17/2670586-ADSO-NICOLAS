package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import utils.ConsumoAPI;

public class InfoDigimon extends javax.swing.JFrame {

    JsonObject temp;
    
    public InfoDigimon(JsonObject temp) {
        this.temp = temp;
        initComponents();
        initAltherComponents();
    }
    
    public void initAltherComponents(){
        setVisible(true);
        setTitle("Informacion");
        
        
        ConsumoAPI consumo = new ConsumoAPI();
        String endpoint = temp.get("href").getAsString();
        String respuesta = consumo.consumoGET(endpoint);
        
        JsonObject nuevo = JsonParser.parseString(respuesta).getAsJsonObject();

        String id = nuevo.get("id").getAsString();
        etq_id.setText(id);
        String nombre = nuevo.get("name").getAsString();
        etq_nombre.setText(nombre);
        
        JsonArray registros = nuevo.get("images").getAsJsonArray();
        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String imagen = temp.get("href").getAsString();
            try {
                URL url = new URL(imagen);
                etq_imagen.setText("");
                Image icono_listar = getToolkit().createImage(url);
                icono_listar = icono_listar.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
                etq_imagen.setIcon(new ImageIcon(icono_listar));
            } catch (MalformedURLException ex) {
                
            }
        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_id = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_imagen = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        attribute = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        Field = new javax.swing.JLabel();
        campo_level = new javax.swing.JLabel();
        campo_attribute = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etq_id.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        etq_id.setForeground(new java.awt.Color(0, 0, 0));
        etq_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nombre.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Level.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Level.setForeground(new java.awt.Color(0, 0, 0));
        Level.setText("Level");

        attribute.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        attribute.setForeground(new java.awt.Color(0, 0, 0));
        attribute.setText("Attribute");

        Type.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Type.setForeground(new java.awt.Color(0, 0, 0));
        Type.setText("Type");

        Field.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Field.setForeground(new java.awt.Color(0, 0, 0));
        Field.setText("Field");

        campo_level.setForeground(new java.awt.Color(0, 0, 0));
        campo_level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo_level.setText("...");

        campo_attribute.setForeground(new java.awt.Color(0, 0, 0));
        campo_attribute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campo_attribute.setText("...");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("...");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_id, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Level)
                .addGap(87, 87, 87)
                .addComponent(attribute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Type)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(Field))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(campo_level, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(campo_attribute, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_id, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Level)
                    .addComponent(attribute)
                    .addComponent(Type))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_level)
                    .addComponent(campo_attribute)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addComponent(Field)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Field;
    private javax.swing.JLabel Level;
    private javax.swing.JLabel Type;
    private javax.swing.JLabel attribute;
    private javax.swing.JLabel campo_attribute;
    private javax.swing.JLabel campo_level;
    private javax.swing.JLabel etq_id;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
