
package javaprofesor;


public class ProfesorMatematicas extends JavaProfesor{
    private String librousado;
    private float complementosalarial;

    public ProfesorMatematicas()
    {
        super();
    }


    public ProfesorMatematicas(String librousado, float complementosalarial, String nombre, String escuela, float salario) {
        super(nombre, escuela, salario);
        this.librousado = librousado;
        this.complementosalarial = complementosalarial;
    }



    public String getLibrousado() {
        return librousado;
    }

    public float getComplementosalarial() {
        return complementosalarial;
    }

    public void setLibrousado(String librousado) {
        this.librousado = librousado;
    }

    public void setComplementosalarial(float complementosalarial) {
        this.complementosalarial = complementosalarial;
    }




 
    
    
}
