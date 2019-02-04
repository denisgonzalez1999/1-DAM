/* Vehiculo: velmax, acelmax
    -terrestre:
    -aereos:
    -marino:helices, escora, manga


*/
package javavehiculo;



public class JavaVehiculo {
    private float aceleracion;  //Esta acelereacion es m/s(2)
    protected float velmax;       //Esta felocidad es m/s. Esta variable la tiene publica los hijos

    public JavaVehiculo() {
    }

    public JavaVehiculo(float aceleracion, float velmax) {
        this.aceleracion = aceleracion;
        this.velmax = velmax;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public float getVelmax() {
        return velmax;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void setVelmax(float velmax) {
        this.velmax = velmax;
    }
    
    public void incrementar_aceleracion(float incremento)
    {
        aceleracion += incremento;
    }
    

    
}
