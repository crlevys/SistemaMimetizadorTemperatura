import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Temperatura extends JFrame {
    public JTextField valor;
    public JButton convertir;
    public JLabel resultado;
        
    Temperatura(){
        super("Sistema Mimetizador de Temperatura");
        setLayout(new FlowLayout());
        valor = new JTextField(30);
        valor.setText("0.0");
        add(valor);
        convertir = new JButton("Convertir");
        add(convertir);
        resultado = new JLabel("0");
        add(resultado);
    }
}
