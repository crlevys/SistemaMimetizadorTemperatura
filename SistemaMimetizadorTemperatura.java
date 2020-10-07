import javax.swing.JFrame;

public class SistemaMimetizadorTemperatura{

    public static void main(String[] args){
        Temperatura t = new Temperatura();
        Conversion c = new Conversion();
        
        new Sistema(c, t);
    }
}
