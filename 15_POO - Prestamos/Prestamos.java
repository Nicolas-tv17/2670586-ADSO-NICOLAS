import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prestamos extends JFrame {
    
    public Prestamos(){
        initComponents();
    }

    public void initComponents(){
        setTitle("Simulador de Prestamo");//titulo
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));//icono de la aplicacions
        setSize(400,500);//tamaño de la ventana
        setLocationRelativeTo(null);//para que quede centrado
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Para cerrar la ventana al darle la X
        setResizable(false);

        JPanel contenedor = new JPanel();//contenedor
        contenedor.setBackground(Color.WHITE);//color de fondo
        contenedor.setLayout(new  GridBagLayout());//va a tener una distribucion en cuadricula
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();//configurar la ubicacion de cada elemento en el contenedor

        //Titulo
        JLabel etq_titulo = new JLabel(); //Titulo de la pestaña
        etq_titulo.setText("PRESTAMOS");//
        etq_titulo.setFont(new Font("Arial",Font.BOLD,30));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;//Cordenadas donde va ubicado el texto en x
        restricciones.gridy = 0;//Cordenadas donde va ubicado el texto en y
        restricciones.gridwidth = 2;//cuantas celdas a lo ancho va a ocupar
        restricciones.gridheight = 1;//cuantas celdas a lo alto va a ocupar
        restricciones.weightx = 100;//(Pesos)Es una manera de darles tamaño a sus celdas
        restricciones.weighty = 1;//(Pesos)Es una manera de darles tamaño a sus columnas
        restricciones.fill = GridBagConstraints.BOTH; //Se usa para que ocupe todo el ancho de la celda
        contenedor.add(etq_titulo, restricciones);

        JLabel etq_capital = new JLabel();
        etq_capital.setText("Capital:");
        etq_capital.setFont(new Font("Arial",Font.BOLD,20));
        etq_capital.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_capital, restricciones);

        JTextField campo_capital = new JTextField();
        campo_capital.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 3, 0, 0);
        contenedor.add(campo_capital, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);


        JLabel etq_intereses = new JLabel();
        etq_intereses.setText("Interes:");
        etq_intereses.setFont(new Font("Arial",Font.BOLD,20));
        etq_intereses.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_intereses, restricciones);

        JTextField campo_interes = new JTextField();
        campo_interes.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 3, 0, 0);
        contenedor.add(campo_interes, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_cuotas = new JLabel();
        etq_cuotas.setText("Cuotas:");
        etq_cuotas.setFont(new Font("Arial",Font.BOLD,20));
        etq_cuotas.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cuotas, restricciones);

        JTextField campo_cuotas = new JTextField();
        campo_cuotas.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 80; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3, 3, 0, 0);
        contenedor.add(campo_cuotas, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btn_calcular = new JButton();
        btn_calcular.setText("CALCULAR");
        btn_calcular.setBackground(new Color(0, 100, 235));
        btn_calcular.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(btn_calcular, restricciones);

        JLabel etq_titulo_pagos = new JLabel();
        etq_titulo_pagos.setText("Plan de Pagos: ");
        etq_titulo_pagos.setFont(new Font("Arial",Font.BOLD,20));
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(etq_titulo_pagos, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_plan_pagos = new JLabel();
        etq_plan_pagos.setText("---");
        etq_plan_pagos.setFont(new Font("Arial",Font.BOLD,20));
        etq_plan_pagos.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_plan_pagos);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100; 
        restricciones.weighty = 90; 
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll, restricciones);



        
        JButton btn_limpiar = new JButton();
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBackground(new Color(255, 20, 10));
        btn_limpiar.setForeground(Color.WHITE);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 100; 
        restricciones.weighty = 1; 
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(5, 0, 0, 0);
        contenedor.add(btn_limpiar, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        ActionListener evento_calcular = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                System.out.println("Click en CALCULAR");

                double capital = Double.parseDouble( campo_capital.getText());
                double intereses = Double.parseDouble( campo_interes.getText());
                double cuotas = Double.parseDouble( campo_cuotas.getText());
                double valor_cuota = (capital + (capital * intereses/100) / cuotas);
                
                String texto = "<html>";
                for(int i = 1; i <= cuotas; i++){
                    texto += "Cuota #"+i+": "+valor_cuota+"<br>";
                }
                texto += "</html>";
                etq_plan_pagos.setText(texto);

                // System.out.println("Capital: "+capital);
                // System.out.println("Intereses: "+intereses);
                // System.out.println("Cuotas: "+cuotas);
            }
        };
        btn_calcular.addActionListener(evento_calcular);

        ActionListener evento_limpiar = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                System.out.println("Click en LIMPIAR");
            }
        };
        btn_limpiar.addActionListener(evento_limpiar);


        add(contenedor);//se le agrega lo que contiene al contenedor
        setVisible(true);
        revalidate();
    }

}
