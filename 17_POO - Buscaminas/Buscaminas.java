import java.awt.*;
import javax.swing.*;

public class Buscaminas extends JFrame{
    

    public Buscaminas(){
        initcomponents();
    }

    public void initcomponents(){

        setTitle("BuscaMinas");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel contenedorPrincipal = new JPanel();
        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBorder(BorderFactory.createEmptyBorder(10,10,12,10));
        contenedorPrincipal.setBackground(new Color(239,239,239));
        GridBagConstraints restricciones = new GridBagConstraints();

        JTextField input_puntaje = new JTextField("020");
        input_puntaje.setBackground(Color.BLACK);
        input_puntaje.setForeground(Color.RED);
        input_puntaje.setFont(new Font("Arial", Font.BOLD, 30));
        input_puntaje.setEditable(false);
        input_puntaje.setHorizontalAlignment(SwingConstants.CENTER);
        restricciones.gridy = 0;
        restricciones.gridx = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 3;
        restricciones.weighty = 2;
        restricciones.weightx = 33;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedorPrincipal.add(input_puntaje,restricciones);

        JButton btn_reiniciar = new JButton(">_<");
        restricciones.gridy = 0;
        restricciones.gridx = 3;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 3;
        restricciones.weighty = 2;
        restricciones.weightx = 33;
        restricciones.fill = GridBagConstraints.NONE;
        contenedorPrincipal.add(btn_reiniciar,restricciones);

        JTextField input_cronometro = new JTextField("000");
        input_cronometro.setBackground(Color.BLACK);
        input_cronometro.setForeground(Color.RED);
        input_cronometro.setFont(new Font("Arial", Font.BOLD, 30));
        input_cronometro.setEditable(false);
        input_cronometro.setHorizontalAlignment(SwingConstants.CENTER);
        restricciones.gridy = 0;
        restricciones.gridx = 6;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 3;
        restricciones.weighty = 2;
        restricciones.weightx = 33;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedorPrincipal.add(input_cronometro,restricciones); 

        Insets buttonMargin = new Insets(5, 5, 5, 5);
        
        for (int row = 1; row <= 9; row++) {
            for (int col = 0; col < 9; col++) {
                JButton button = new JButton();
                button.setMargin(buttonMargin);
                restricciones.gridy = row;
                restricciones.gridx = col;
                restricciones.gridheight = 1;
                restricciones.gridwidth = 1;
                restricciones.weighty = 1;
                restricciones.weightx = 1;
                restricciones.fill = GridBagConstraints.BOTH;
                contenedorPrincipal.add(button, restricciones);
            }
        }

        add(contenedorPrincipal);
        setResizable(false);
        setVisible(true);
        revalidate();
    }
}
