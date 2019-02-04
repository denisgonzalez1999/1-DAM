package javaapplicationempleado;


public class Profesor extends PersonaHumana {
    
    private int IdEmpleado;
    private String departamento;

        public Profesor() 
    {
        super();
    }

    public Profesor(String nombre, String apellido, String DNI, int SS, int IdEmpleado, String departamento) 
    {
        
        super(nombre, apellido, DNI, SS);
        
        this.IdEmpleado = IdEmpleado;
        this.departamento = departamento;
        
    }



    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }


    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
