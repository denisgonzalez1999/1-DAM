
package javaescuela;


public class JavaEscuela {

        private String nombre;          //Variable comunes
        private String escuela;          //Variable comunes
        private float salario;          //Variable comunes

    public JavaEscuela() {
    }

    public JavaEscuela(String nombre, String escuela, float salario) {
        this.nombre = nombre;
        this.escuela = escuela;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEscuela() {
        return escuela;
    }

    public float getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
        
            public void incrementar_salario(float incremento)       //Incrementa el salario si tu quieres
    {
        
        salario = salario+incremento;
    }
    
}
