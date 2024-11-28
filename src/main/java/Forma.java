import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
        campoTexto.addActionListener( e -> {
            System.out.println("Se ejecuto action listener");
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);//centramos la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Cambiar a modo dark
        Forma forma = new Forma();
        forma.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
