import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class Promedio extends JFrame{

    JLabel listaJLabels [];
    Materia arreglo[];
    int indice;
    JLabel etq_titulo;
    JLabel etq_materia;
    JLabel etq_creditos;
    JLabel etq_notas;
    JLabel etq_resumen;
    JLabel etq_total;
    JLabel etq_temporal;
    JButton btn_registrar;
    JButton btn_limpiar;
    JTextField campo_notas;
    JTextField campo_creditos;
    JTextField campo_materia;
    JPanel contenedorItems;

    public Promedio(){
        arreglo = new Materia[50];
        listaJLabels = new JLabel[50];
        initcomponents();
    }

    public void initcomponents(){
        setTitle("Promedio Poderado");
		setSize( 600, 600);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
		GridBagConstraints restriccion = new GridBagConstraints();

        etq_titulo = new JLabel("CALCULAR PROMEDIO");
        etq_titulo.setFont(new Font("Arial",Font.BOLD, 35));
        etq_titulo.setHorizontalAlignment( JLabel.CENTER );
        etq_titulo.setBorder( BorderFactory.createEmptyBorder(10, 0, 20, 0) );
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_titulo,restriccion);


        etq_materia = new JLabel("Materia:");
        etq_materia.setFont(new Font("Arial",Font.PLAIN, 20));
        etq_materia.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_materia,restriccion);

        campo_materia = new JTextField();
        campo_materia.setFont(new Font("Arial",Font.PLAIN,20));
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 40;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(campo_materia,restriccion);

        etq_creditos = new JLabel("Creditos:");
        etq_creditos.setFont(new Font("Arial",Font.PLAIN, 20));
        etq_creditos.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 1;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_creditos,restriccion);

        campo_creditos = new JTextField();
        campo_creditos.setFont(new Font("Arial",Font.PLAIN,20));
        restriccion.gridy = 1;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 40;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(campo_creditos,restriccion);

        etq_notas = new JLabel("Notas:");
        etq_notas.setFont(new Font("Arial",Font.PLAIN, 20));
        etq_notas.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_notas,restriccion);

        campo_notas = new JTextField();
        campo_notas.setFont(new Font("Arial",Font.PLAIN,20));
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 40;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(campo_notas,restriccion);

        btn_registrar = new JButton("REGISTRAR");
        btn_registrar.setBackground(new Color(255,100,100));
        btn_registrar.setForeground(Color.BLACK);
        btn_registrar.setFont(new Font("Arial",Font.PLAIN,17));
        restriccion.gridy = 2;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 25;
        restriccion.fill = GridBagConstraints.NONE;
        contPrincipal.add(btn_registrar,restriccion);

        etq_resumen = new JLabel("RESUMEN");
        etq_resumen.setHorizontalAlignment(JLabel.CENTER);
        etq_resumen.setFont(new Font("Arial",Font.BOLD, 22));
        etq_resumen.setBorder( BorderFactory.createEmptyBorder(20, 0, 10, 0) );
        restriccion.gridy = 3;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.NONE;
        contPrincipal.add(etq_resumen,restriccion);

        contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(null);
        
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 95;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 0, 0, 10);
        contPrincipal.add( scrollPane, restriccion );
        
        GridBagConstraints constItems = new GridBagConstraints();
        
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        
        for (int i=0; i < this.listaJLabels.length; i++) {
            etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.CENTER );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.BOTH;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

        etq_total = new JLabel("Total:");
        etq_total.setHorizontalAlignment(JLabel.CENTER);
        etq_total.setFont(new Font("Arial", Font.PLAIN, 25));
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_total,restriccion);

        btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setFont(new Font("Arial",Font.PLAIN,15));
        btn_limpiar.setPreferredSize(new Dimension(220, 70));
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.NONE;
        contPrincipal.add(btn_limpiar,restriccion);

        ActionListener evento_click_registrar = new ActionListener() {
            public void actionPerformed(ActionEvent event ){
                registrar_materia();
            }
        };
        btn_registrar.addActionListener(evento_click_registrar);

        ActionListener evento_click_limpiar = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                limpiarTabla();
            }
        };
        btn_limpiar.addActionListener(evento_click_limpiar);


        add(contPrincipal);
        setResizable(false);
        setVisible(true);
        revalidate();
        repaint();
    }

    public void registrar_materia() {
        String texto_materia = campo_materia.getText();
        String texto_creditos = campo_creditos.getText();
        double input_creditos = Double.parseDouble(texto_creditos);
        String texto_notas = campo_notas.getText();
        double input_notas = Double.parseDouble(texto_notas);

        if (indice < arreglo.length) {
            Materia nuevaMateria = new Materia(texto_materia, input_creditos, input_notas);
            arreglo[indice] = nuevaMateria;
            listaJLabels[indice].setText(nuevaMateria.imprimir());

            indice++;

            System.out.println(nuevaMateria.promedioPonderado());
        }

        limpiarInputs();

    }

    public void limpiarInputs(){
        campo_materia.setText("");
        campo_creditos.setText("");
        campo_notas.setText("");
    }

    public void limpiarTabla(){
        limpiarInputs();
    }
}