
package javaapplicationvehiculo;


public class Aereos extends JavaApplicationVehiculo {
    int alas;
    int motores;
    String tipoala;
    
    
    public Aereos()
    {
        super();
    }
    public Aereos(int acelmax, int velmax,int alas, int motores, String tipoala)
    {
        super(acelmax, velmax);
        this.alas = alas;
        this.motores = motores;
        this.tipoala = tipoala;
    }

    public int getAlas() {
        return alas;
    }

    public int getMotores() {
        return motores;
    }

    public String getTipoala() {
        return tipoala;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public void setTipoala(String tipoala) {
        this.tipoala = tipoala;
    }                
    
}
