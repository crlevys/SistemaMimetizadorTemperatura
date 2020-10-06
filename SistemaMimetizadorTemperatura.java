import javax.swing.JFrame;

public class SistemaMimetizadorTemperatura{

    public static void main(String[] args){
        Temperatura t = new Temperatura();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(300,110);
        t.setVisible(true);
    }
}
