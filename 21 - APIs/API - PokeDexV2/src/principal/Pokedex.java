package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import utils.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    int [] listaNumeros = new int[]{1,2,3,4,5,6,7};
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.pagina = 1;
        
        initComponents();
        initAlternComponents();
        cargarPokemones();
        cargarPaginador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEMON");

        panelBotones.setLayout(new javax.swing.BoxLayout(panelBotones, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelBotones);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")) );
        setLocationRelativeTo(null);
        setVisible(true);  
        
    }
    
    public void cargarPokemones(){
        int offset = (this.pagina*20)-20;
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";
        String data = this.consumo.consumoGET(endpoint);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("results");
        panelBotones.removeAll();
        for (int i=0; i<results.size(); i++) {
            JsonObject temp = results.get(i).getAsJsonObject();
            
            JButton btn = new JButton( temp.get("name").getAsString() );
            panelBotones.add(btn);
            
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombre: "+ temp.get("name").getAsString());
                    System.out.println("Url: "+temp.get("url").getAsString());
                    
                    panelDetalle.removeAll();
                    DetallePokemon detalle = new DetallePokemon( temp );
                    detalle.setSize( panelDetalle.getSize() );
                    detalle.setPreferredSize( panelDetalle.getPreferredSize() );
                    panelDetalle.add(detalle);
                    revalidate();
                    repaint();
                }
            });
        }
        
        panelDetalle.removeAll();
        DetallePokemon detalle = new DetallePokemon( results.get(0).getAsJsonObject() );
        detalle.setSize( panelDetalle.getSize() );
        detalle.setPreferredSize( panelDetalle.getPreferredSize() );
        panelDetalle.add(detalle);
        
        revalidate();
        repaint();
    }
    
    public void cargarPaginador(){
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());
        
        //INICIO
        JButton boton_inicio = new JButton("<<");
        boton_inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 1;
                cargarPokemones();
                cargarPaginador();
            }
        });
        panelPaginador.add(boton_inicio);
        
        //ATRAS
        JButton boton_atras = new JButton("<");
        boton_atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina > 1) {
                    pagina--;
                    cargarPokemones();
                    cargarPaginador();
                } else {
                    System.out.println("No disponible");
                }
            }
        });
        panelPaginador.add(boton_atras);
        
        
        JButton[] botones = new JButton[listaNumeros.length];
        for (int i = 0; i < listaNumeros.length; i++) {
            JButton btn = new JButton(String.valueOf(listaNumeros[i]));
            botones[i] = btn;
            panelPaginador.add(btn);
            
            int actual = i;
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int position = Integer.parseInt(btn.getText());
                    int nuevo = listaNumeros[position]++;
                    botones[actual] = btn;
                    System.out.println("---"+nuevo);
                    pagina = position;
                    cargarPokemones();
                }
            });
        }
        
        
        //BOTON SIGUIENTE
        JButton boton_siguiente = new JButton(">");
        boton_siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina++;
                cargarPokemones();
            }
        });

        //BOTON FIN
        JButton boton_fin = new JButton(">>");
        boton_fin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pokemon = "https://pokeapi.co/api/v2/pokemon";
                String respuesta = consumo.consumoGET(pokemon);
                
                JsonObject datos = JsonParser.parseString(respuesta).getAsJsonObject();
                String totalpoke = datos.get("count").getAsString();
                
                int total = Integer.valueOf(totalpoke);
                int totalfinal = (total/20)+1;
                
                pagina = totalfinal;
                cargarPokemones();
 
            }
        });
        panelPaginador.add(boton_siguiente);
        panelPaginador.add(boton_fin);
        
        panelPaginador.add(Box.createHorizontalGlue());
        repaint();
        revalidate();
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
