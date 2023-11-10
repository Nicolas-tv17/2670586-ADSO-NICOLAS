import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factura extends JFrame {

    public Factura(){
        initComponents();
    }

    public void initComponents(){
        setTitle("FACTURA");
        setSize(575, 810);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(240,240,240));
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("DATOS CLIENTE:");
        etq_titulo.setFont(new Font("Arial",Font.BOLD,20));
        etq_titulo.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 5;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo, restricciones);

        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA: ");
        etq_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;//hacia abaj0
        restricciones.gridy = 1;//hacia el lado
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula, restricciones);

        JTextField campo_cedula =  new JTextField();
        campo_cedula.setColumns(1);
        campo_cedula.setBorder(null);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0,10, 5);
        contenedor.add(campo_cedula,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btnUno_buscar = new JButton();
        btnUno_buscar.setText("BUSCAR");
        btnUno_buscar.setBackground(Color.WHITE);
        btnUno_buscar.setForeground(Color.BLACK); 
        btnUno_buscar.setHorizontalAlignment(JLabel.CENTER);
        btnUno_buscar.setPreferredSize(new Dimension(112, 38)); // Ajusta el ancho y alto según tus necesidades
        restricciones.gridx = 4;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btnUno_buscar,restricciones);

        JLabel etq_nombres = new JLabel();
        etq_nombres.setText("NOMBRES: ");
        etq_nombres.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;//hacia abaj0
        restricciones.gridy = 2;//hacia el lado
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombres, restricciones);

        JTextField campo_nombres =  new JTextField();
        campo_nombres.setColumns(1);
        campo_nombres.setBorder(null);
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 90;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_nombres,restricciones);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("DIRECCION: ");
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;//hacia abaj0
        restricciones.gridy = 3;//hacia el lado
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_direccion, restricciones);

        JTextField campo_direccion =  new JTextField();
        campo_direccion.setColumns(1);
        campo_direccion.setBorder(null);
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 90;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 10, 0);
        contenedor.add(campo_direccion,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_datos_vendedor = new JLabel();
        etq_datos_vendedor.setText("DATOS VENDEDOR:");
        etq_datos_vendedor.setFont(new Font("Arial",Font.BOLD,20));
        etq_datos_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 5;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(6, 0, 5, 0);
        contenedor.add(etq_datos_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);


        JLabel etq_cedula_dos = new JLabel();
        etq_cedula_dos.setText("CEDULA: ");
        etq_cedula_dos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;//hacia abaj0
        restricciones.gridy = 5;//hacia el lado
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_dos, restricciones);

        JTextField campo_cedula_dos =  new JTextField();
        campo_cedula_dos.setColumns(1);
        campo_cedula_dos.setBorder(null);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 1;
        restricciones.weightx = 80;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 10, 5);
        contenedor.add(campo_cedula_dos,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btndos_buscar = new JButton();
        btndos_buscar.setText("BUSCAR");
        btndos_buscar.setBackground(new Color(255,255,255));
        btndos_buscar.setForeground(new Color(0,0,0)); 
        btndos_buscar.setPreferredSize(new Dimension(112, 38)); // Ajusta el ancho y alto según tus necesidades
        restricciones.gridx = 4;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btndos_buscar,restricciones);

        JLabel etq_nombres_dos = new JLabel();
        etq_nombres_dos.setText("NOMBRES: ");
        etq_nombres_dos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;//hacia abaj0
        restricciones.gridy = 6;//hacia el lado
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombres_dos, restricciones);

        JTextField campo_nombres_dos =  new JTextField();
        campo_nombres_dos.setColumns(1);
        campo_nombres_dos.setBorder(null);
        restricciones.gridx = 1;
        restricciones.gridy = 6;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 90;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_nombres_dos,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_lista_productos_facturados = new JLabel();
        etq_lista_productos_facturados.setText("LISTA PRODUCTOS FACTURADOS:");
        etq_lista_productos_facturados.setFont(new Font("Arial",Font.BOLD,20));
        etq_lista_productos_facturados.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 5;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 5, 0);
        contenedor.add(etq_lista_productos_facturados, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_id = new JLabel();
        etq_id.setText("ID");
        etq_id.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_id, restricciones);

        JLabel etq_Nombre_tres = new JLabel();
        etq_Nombre_tres.setText("NOMBRE: ");
        etq_Nombre_tres.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;//hacia la derecha
        restricciones.gridy = 8;//hacia abajo
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 50;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_Nombre_tres, restricciones);

        JLabel etq_cantidad = new JLabel();
        etq_cantidad.setText("CANT.");
        etq_cantidad.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 3;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 2;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cantidad, restricciones);

        
        JTextField campo_ID =  new JTextField();
        campo_ID.setColumns(1);
        campo_ID.setBorder(null);
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 5, 5, 5);
        contenedor.add(campo_ID,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);
        
        JTextField campo_nombre =  new JTextField();
        campo_nombre.setColumns(1);
        campo_nombre.setBorder(null);
        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 60;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 5, 5, 5);
        contenedor.add(campo_nombre,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);
        
        JTextField campo_cant =  new JTextField();
        campo_cant.setColumns(1);
        campo_cant.setBorder(null);
        restricciones.gridx = 3;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 5, 5, 5);
        contenedor.add(campo_cant,restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);
        
        JButton btn_ADD = new JButton();
        btn_ADD.setText("ADD");
        btn_ADD.setBackground(new Color(255,255,255));
        btn_ADD.setForeground(new Color(0,0,0)); 
        btn_ADD.setPreferredSize(new Dimension(112, 38)); // Ajusta el ancho y alto según tus necesidades
        restricciones.gridx = 4;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 30;
        restricciones.weighty = 4;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btn_ADD,restricciones);
        
        JLabel etq_plan_pagos = new JLabel();
        etq_plan_pagos.setText("");
        etq_plan_pagos.setFont(new Font("Arial",Font.BOLD,20));
        etq_plan_pagos.setHorizontalAlignment(JLabel.CENTER);
        etq_plan_pagos.setBorder(null);
        JScrollPane scroll = new JScrollPane(etq_plan_pagos);
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 5;
        restricciones.gridheight = 1;
        restricciones.weightx = 100; 
        restricciones.weighty = 80; 
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(scroll, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_total = new JLabel();
        etq_total.setText("Total: $ 0");
        etq_total.setBackground(Color.WHITE);
        etq_total.setHorizontalAlignment(JLabel.RIGHT);
        etq_total.setFont(new Font("Arial",Font.BOLD,20));
        restricciones.gridx = 0;
        restricciones.gridy = 11;
        restricciones.gridwidth = 5;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 5;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_total, restricciones);

        add(contenedor);
        setVisible(true);
        revalidate();

    }
}
