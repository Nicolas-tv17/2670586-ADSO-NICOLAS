package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Menu extends javax.swing.JFrame {

    String respuesta;
    
    public Menu(String respuesta) {
        this.respuesta = respuesta;
        initComponents();
        initAltherComponents();
        imprimirDigimon();
        imprimirPaginador();
    }
    
    public void initAltherComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("DIGIMON");
        setResizable(false);
        
        
        etq_titulo.removeAll();
        Image icono_listar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/Digimon_Logo.png"));
        icono_listar = icono_listar.getScaledInstance(120, 60, Image.SCALE_SMOOTH);
        etq_titulo.setIcon(new ImageIcon(icono_listar));
        
    }
    
    public void imprimirDigimon(){
        JsonObject digimon = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray registros = digimon.get("content").getAsJsonArray();
        System.out.println(registros);
        panelDigimones.setLayout(new GridLayout(2,3));
        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String nombres = temp.get("name").getAsString();
            String imagen = temp.get("image").getAsString();
            Digimones panel = new Digimones(temp);
            panelDigimones.add(panel);
        }
        repaint();
        revalidate();        
    }
    
    public void imprimirPaginador(){
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());
        
        JButton boton_inicio = new JButton("<<");
        boton_inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nuevo");
            }
        });
        
        panelPaginador.add(boton_inicio);
        
        JButton boton_atras = new JButton("<");
        boton_atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panelPaginador.add(boton_atras);
        
        
        
        
        
        
        
        //BOTON SIGUIENTE
        JButton boton_siguiente = new JButton(">");
        boton_siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton boton_fin = new JButton(">>");
        boton_fin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

 
            }
        });
        panelPaginador.add(boton_siguiente);
        panelPaginador.add(boton_fin);
     
        
        panelPaginador.add(Box.createHorizontalGlue());
        panelPaginador.repaint();
        panelPaginador.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        panelDigimones = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etq_titulo.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 24)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 204, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDigimonesLayout = new javax.swing.GroupLayout(panelDigimones);
        panelDigimones.setLayout(panelDigimonesLayout);
        panelDigimonesLayout.setHorizontalGroup(
            panelDigimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        panelDigimonesLayout.setVerticalGroup(
            panelDigimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        panelPaginador.setBackground(new java.awt.Color(204, 204, 204));
        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDigimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDigimones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel panelDigimones;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
