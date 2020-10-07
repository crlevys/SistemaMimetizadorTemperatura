import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Sistema implements ActionListener{
    private Conversion modelo;
    private Temperatura vista;
    
    public Sistema(Conversion m, Temperatura v){
        modelo = m;
        vista = v;
        //Establecemos el controlador
        vista.convertir.addActionListener(this);
        //iniciamos la vista
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setSize(300,110); // establece el tamaño de la ventana
        vista.setVisible(true); // muestra la ventana
    }

    public void actionPerformed(ActionEvent evento){
        modelo.setConversion(vista.valor.getText());
        vista.resultado.setText(modelo.aCelsius());
    }
}
