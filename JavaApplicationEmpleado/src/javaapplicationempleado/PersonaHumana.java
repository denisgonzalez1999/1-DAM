package javaapplicationempleado;


public class PersonaHumana {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private int SS;

    public PersonaHumana() {
    }

    public PersonaHumana(String nombre, String apellido, String DNI, int SS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.SS = SS;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public int getSS() {
        return SS;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSS(int SS) {
        this.SS = SS;
    }



 
       
      
     
 
    
}
