package javaapplicationperros;


public class Perros {
    private String raza;
    private int edad;
    private int tamaño;        //pequeño = 0, mediano = 1, grande = 2 
    private String color;
    
    
    Perros()
    {
        raza = "chucho";
        edad = 0;
        color="cafe";
        tamaño = 0;
    }
    
    Perros (String r,int e, String c, int t)
    {
        raza = r;
        edad = e;
        color = c;
        tamaño = t;
    }
    public int cumpleaños()
    {
        edad++;
        return edad;
    }
    
    public String getraza()
    {
        return raza;
    }
    
    public int getedad()
    {
        return edad;
    }
    
    public String getcolor()
    {
        return color;
    }
    
    public int gettamaño()
    {
        return tamaño;
    }
    
    public int setedad(int e)
    {
        this.edad = edad;
        return edad;
    }
        public int settamaño(int t)
    {
        this.tamaño = tamaño;
        return tamaño;
    }
    
    public String setcolor(String c)
    {
        color = color;
        return color;
    }
    public String setraza(String r)
    {
        raza = raza;
        return raza;
    }
}