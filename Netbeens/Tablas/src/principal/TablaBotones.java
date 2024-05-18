package principal;

import utils.ButtonEditor;
import utils.ButtonRenderer;
import utils.Persona;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TablaBotones extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    Persona listapersonas[];

    public TablaBotones() {
        listapersonas = new Persona[100];
        listapersonas[0] = new Persona("10605888","Sebastian", "Bustamante","3028888792", "busat@gmail.com");
        listapersonas[1] = new Persona("10605999","Juan", "Arias","3009883481", "nosera@gmail.com");
        listapersonas[2] = new Persona("10605111","Luisa", "Agudelo","3217759012", "luagude@gmail.com");
        listapersonas[3] = new Persona("10605222","Daniela", "Linares","3112425677", "danioas@gmail.com");
        listapersonas[4] = new Persona("10605555","Pedrito", "Guzman","3112234411", "noidasa@gmail.com");
        
        
        initComponents();
        initAlternComponents();
        imprimirPersonas(); 
    }
    
    
    public void initAlternComponents(){
        setTitle("Tabla");
        setLocationRelativeTo(null);        
        setVisible(true);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_registro.png")));
        
        modelo = (DefaultTableModel) tabladatos.getModel();
        
        tabladatos.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabladatos.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        
        tabladatos.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tabladatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        //Tamaño de columnas
        tabladatos.getColumnModel().getColumn(0).setPreferredWidth(90);
        tabladatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabladatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabladatos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabladatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabladatos.getColumnModel().getColumn(5).setPreferredWidth(30);
        tabladatos.getColumnModel().getColumn(6).setPreferredWidth(30);
        
        // Ajuste del Orden y Ancho de Columnas
        tabladatos.getTableHeader().setReorderingAllowed(false);
        tabladatos.getTableHeader().setResizingAllowed(false);
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabladatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tabladatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
              
        // Alto de las filas
        tabladatos.setRowHeight(30);  
    }
    
    public void imprimirPersonas(){
        
        modelo.setRowCount(0);
        for (int i=0; i < listapersonas.length && listapersonas[i]!=null; i++) {
            
            String documento = listapersonas[i].getDocumento();
            String nombres = listapersonas[i].getNombre();
            String apellidos = listapersonas[i].getApellidos();
            String telefono = listapersonas[i].getTelefono();
            String correo = listapersonas[i].getCorreo();
            
            JButton btnEditar = new JButton();
            btnEditar.setBackground(Color.white);
            Image icono_editar = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_editar.png"));
            icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEditar.setIcon( new ImageIcon(icono_editar));
            
            JButton btnEliminar = new JButton();
            btnEliminar.setBackground(Color.white);
            Image icono_eliminar = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_eliminar.png"));
            icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEliminar.setIcon( new ImageIcon(icono_eliminar));
            
            Object dato[] = new Object[]{documento,nombres,apellidos,telefono,correo, btnEditar, btnEliminar}; 
            modelo.addRow(dato);
            
            Persona temporal = listapersonas[i];
            TablaBotones ventanaActual = this;
            
            btnEditar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombres: " + nombres);
                    FormularioEdicion ventana = new FormularioEdicion(temporal,ventanaActual);
                }
            });
            
            final int posicion = i;
            
            btnEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EliminarPersona ventanaEliminar = new EliminarPersona(ventanaActual, listapersonas, posicion);
                }
            });

        }   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        contenedorDatos = new javax.swing.JPanel();
        etq_documento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        etq_nombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etq_correo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        contenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorTitulo.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(0, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Tabla con Botones");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        contenedorDatos.setBackground(new java.awt.Color(0, 255, 255));

        etq_documento.setText("Documento:");

        etq_nombres.setText("Nombres:");

        etq_apellidos.setText("Apellidos:");

        etq_telefono.setText("Telefono:");

        etq_correo.setText("Correo Elec..:");

        btn_agregar.setBackground(new java.awt.Color(102, 255, 102));
        btn_agregar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_documento)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(etq_telefono)
                    .addComponent(campoTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_correo)
                    .addGroup(contenedorDatosLayout.createSequentialGroup()
                        .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_nombres)
                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_apellidos)
                            .addComponent(campoApellidos)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                .addGap(70, 70, 70))
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorDatosLayout.createSequentialGroup()
                        .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorDatosLayout.createSequentialGroup()
                                .addComponent(etq_documento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(contenedorDatosLayout.createSequentialGroup()
                                .addComponent(etq_apellidos)
                                .addGap(3, 3, 3)))
                        .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoApellidos)
                            .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorDatosLayout.createSequentialGroup()
                        .addComponent(etq_nombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_correo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorDatosLayout.createSequentialGroup()
                        .addComponent(etq_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTelefono)
                            .addComponent(campoCorreo)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        contenedorTabla.setBackground(new java.awt.Color(255, 255, 255));

        tabladatos.setBackground(new java.awt.Color(192,192,192));
        tabladatos.getTableHeader().setReorderingAllowed(false);
        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Elect", " ", " "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        tabladatos.setFocusable(false);
        tabladatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabladatos);

        javax.swing.GroupLayout contenedorTablaLayout = new javax.swing.GroupLayout(contenedorTabla);
        contenedorTabla.setLayout(contenedorTablaLayout);
        contenedorTablaLayout.setHorizontalGroup(
            contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorTablaLayout.setVerticalGroup(
            contenedorTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
        String documento = campoDocumento.getText();
        String nombre = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();

        if (documento.equals("") || nombre.equals("") || apellidos.equals("") || telefono.equals("") || correo.equals("")) {
            Alerta ventana = new Alerta();
        } else {
            boolean existePersona = false;

            for (Persona persona : listapersonas) {
                if (persona != null) {
                    if (documento.equals(persona.getDocumento())) {
                        AvisoDocumento ventanaDocumento = new AvisoDocumento();
                        existePersona = true;
                        break;
                    } else if (correo.equals(persona.getCorreo())) {
                        AvisoCorreo ventanaCorreo = new AvisoCorreo();
                        existePersona = true;
                        break;
                    }
                }
            }

            if (!existePersona) {
                
                int posicion = -1;
                for (int i = 0; i < listapersonas.length; i++) {
                    if (listapersonas[i] == null) {
                        posicion = i;
                        break;
                    }
                }

                // Agregar la persona en la posición encontrada
                if (posicion != -1) {
                    listapersonas[posicion] = new Persona(documento, nombre, apellidos, telefono, correo);

                    Object data[] = new Object[]{documento, nombre, apellidos, telefono, correo};
                    modelo.addRow(data);

                    campoDocumento.setText("");
                    campoNombres.setText("");
                    campoApellidos.setText("");
                    campoTelefono.setText("");
                    campoCorreo.setText("");
                    campoDocumento.requestFocus();

                }
            }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorTabla;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombres;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
