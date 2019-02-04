
package javaapplicationvehiculo;


public class Terrestre  extends JavaApplicationVehiculo {
    private int ruedas;
    private String tamaño;
    
    public Terrestre()
    {
    super();
    }
    public Terrestre(int acelmax, int velmax, int ruedas, String tamaño)
    {
        super(acelmax, velmax);
        
        this.ruedas = ruedas;
        this.tamaño = tamaño;
        
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
    
}
