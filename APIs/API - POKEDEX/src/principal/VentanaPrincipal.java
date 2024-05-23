package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ConsumoAPI;

public class VentanaPrincipal extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public VentanaPrincipal() {
        initComponents();
        initAltherComponents();
        imprimirDatos();
    }
    
    public void initAltherComponents(){
        setTitle("POKEDEX");
        setVisible(true);
        setLocationRelativeTo(null);
        
        modelo = (DefaultTableModel) datos_tabla.getModel();
        
        //Tamaño de columnas
        datos_tabla.getColumnModel().getColumn(0).setPreferredWidth(5);
        datos_tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        datos_tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
        
        // Ajuste del Orden y Ancho de Columnas
        datos_tabla.getTableHeader().setReorderingAllowed(false);
        datos_tabla.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        datos_tabla.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        datos_tabla.getColumnModel().getColumn(1).setCellRenderer(centerRender);
              
        // Alto de las filas
        datos_tabla.setRowHeight(30); 
        
        btn_atras.setBackground(Color.WHITE);
        Image icono_atras = getToolkit().createImage(ClassLoader.getSystemResource("Imagenes/icono_atras.png"));
        icono_atras = icono_atras.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        btn_atras.setIcon(new ImageIcon(icono_atras));
        
        btn_siguiente.setBackground(Color.WHITE);
        Image icono_siguiente = getToolkit().createImage(ClassLoader.getSystemResource("Imagenes/icono_siguiente.png"));
        icono_siguiente = icono_siguiente.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        btn_siguiente.setIcon(new ImageIcon(icono_siguiente));
        
    }
    
    public void imprimirDatos(){
        ConsumoAPI consumo = new ConsumoAPI();
        String respuesta = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon");
        
        try {
            JsonObject registros = JsonParser.parseString(respuesta).getAsJsonObject();
            JsonArray resultados = registros.get("results").getAsJsonArray();
            
            modelo.setRowCount(0);
            for (int i = 0; i < resultados.size(); i++) {
                JsonObject temp = resultados.get(i).getAsJsonObject();

                String nombres = temp.get("name").getAsString();
                String url = temp.get("url").getAsString();

                String obtenerPokemon = consumo.consumoGET(url);
                JsonObject respuestaPokemon = JsonParser.parseString(obtenerPokemon).getAsJsonObject();

                JsonArray habilidades = respuestaPokemon.get("abilities").getAsJsonArray();
                
                for (int j = 0; j < 1; j++) {
                    
                    JsonObject data = habilidades.get(i).getAsJsonObject();
                    JsonObject dataOfi = data.get("ability").getAsJsonObject();
                    String name = dataOfi.get("name").getAsString();
                    String oficialurl =  dataOfi.get("url").getAsString();
                    int contador = i+j;
                    
                    Object dato[] = new Object[]{contador, name, oficialurl};
                    modelo.addRow(dato);
                }
            }
            
            
        } catch (Exception e) {
            
        }
    }
    
    public void verificarConexion() {
        System.out.println("No hay wifi");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        scroll_nombres = new javax.swing.JScrollPane();
        etq_titulo = new javax.swing.JLabel();
        nombre_pokemon = new javax.swing.JLabel();
        btn_siguiente = new javax.swing.JButton();
        etq_imagen = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos_tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("POKEDEX");

        nombre_pokemon.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        nombre_pokemon.setForeground(new java.awt.Color(0, 0, 0));
        nombre_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_pokemon.setText("..");

        btn_siguiente.setBorder(null);
        btn_siguiente.setMaximumSize(new java.awt.Dimension(10, 10));
        btn_siguiente.setMinimumSize(new java.awt.Dimension(10, 10));
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        etq_imagen.setBackground(new java.awt.Color(204, 204, 204));

        btn_atras.setBorder(null);
        btn_atras.setMaximumSize(new java.awt.Dimension(10, 10));
        btn_atras.setMinimumSize(new java.awt.Dimension(10, 10));

        datos_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Habilidad", "url"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(datos_tabla);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(scroll_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))
                                .addGap(36, 36, 36))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(nombre_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))))))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_nombres)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(nombre_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etq_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        
    }//GEN-LAST:event_btn_siguienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JTable datos_tabla;
    private javax.swing.JLabel etq_imagen;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre_pokemon;
    private javax.swing.JScrollPane scroll_nombres;
    // End of variables declaration//GEN-END:variables
}
