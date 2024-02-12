package principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Presentacion extends JFrame{
    
    public Presentacion() {
        initcomponents();
    }
    
    public void initcomponents() {
        setTitle("Presentacion");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        
        JPanel contenedor= new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        
        JLabel titulo = new JLabel("Formulario");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        contenedor.add(titulo);
        
        JTextField campo_nombre = new JTextField();
        contenedor.add(campo_nombre);
        
        JButton btn_iniciar = new JButton();
        btn_iniciar.setText("Iniciar");
        contenedor.add(btn_iniciar);
        
        JLabel etq_respuesta = new JLabel();
        contenedor.add(etq_respuesta);
                
        add(contenedor);
        setVisible(true);
        revalidate();
        
       btn_iniciar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = campo_nombre.getText();
                etq_respuesta.setText(texto);
                campo_nombre.setText("");
            }
       });
           
        
    }
}
