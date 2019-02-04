
package javaprofesor;


public class JavaProfesor {
        private String nombre;
        private String escuela;
        private float salario;

    public JavaProfesor() {
    }

    public JavaProfesor(String nombre, String escuela, float salario) {
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


    
}
