
package javaapplicationvehiculo;


public class Marinos extends JavaApplicationVehiculo 
{
    int helice;
    int escora;
    int manga;
    
    public Marinos()
    {
        super();
    }
    public Marinos(int acelmax, int velmax, int helice, int escora, int manga)
    {
        super(acelmax, velmax);
        
        this.helice = helice;
        this.escora = escora;
        this.manga = manga;
    }

    public int getHelice() {
        return helice;
    }

    public int getEscora() {
        return escora;
    }

    public int getManga() {
        return manga;
    }

    public void setHelice(int helice) {
        this.helice = helice;
    }

    public void setEscora(int escora) {
        this.escora = escora;
    }

    public void setManga(int manga) {
        this.manga = manga;
    }
    
    
}
