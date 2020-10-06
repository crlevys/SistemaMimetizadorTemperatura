import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperatura extends JFrame {
    JTextField valor;
    JButton convertir;
    JLabel resultado;
    Conversion conversion;
    
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
        
        conversion = new Conversion();
        convertir.addActionListener(new Conversor());
    }
    class Conversor implements ActionListener {
        
        public void actionPerformed(ActionEvent e){
            String val = valor.getText();
            conversion.setConversion(val);
            resultado.setText(conversion.celsius());
        }
    }
}
