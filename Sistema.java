import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

class Sistema implements ActionListener{
    Conversion modelo;
    Temperatura vista;
    
    public Sistema(Conversion m, Temperatura v){
        modelo = m;
        vista = v;
        //Asignar el manejador de eventos a la vista
        vista.convertir.addActionListener(this);
        //Mostrar la ventana
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setSize(300,110);
        vista.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
            String val = vista.valor.getText();
            modelo.setConversion(val);
            vista.resultado.setText(modelo.celsius());
        }
}
