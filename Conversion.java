public class Conversion {
    float valor;
    
    public Conversion(){
        valor = 0;
    }
    
    void setConversion(String val){
        valor = Float.parseFloat(val);
    }
    
    String getConversion(){
        return String.valueOf(valor);
    }
    
    String celsius(){
        return String.valueOf(5.0F/9.0F*(valor - 32.0F));
    }
}
