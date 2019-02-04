
package javavehiculo;


public class Terrestre extends JavaVehiculo {
    private int ruedas;
    private float largo;    //metros
    private float ancho;    //metros       
    private float alto;     //metros
    
    public Terrestre()
    {   
        
    }



    public Terrestre(int ruedas, float largo, float ancho, float alto, float aceleracion, float velmax) {
        super(aceleracion, velmax);
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getRuedas() {
        return ruedas;
    }

    public float getLargo() {
        return largo;
    }

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    
        public void subirvelmax(float velocidad)
        {
            float velocidadactual = getVelmax();
            velocidadactual += velocidad;
            setVelmax(velocidadactual);     
            
            
            
        }
    
    
       
}
