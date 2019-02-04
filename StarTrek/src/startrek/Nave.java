/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startrek;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Nave
{
    private String nombre;
    private int numtripulantes;
    private ArrayList<Visita> visitas;

    public Nave(String nombre, int numtripulantes, ArrayList<Visita> visitas)
    {
        this.nombre = nombre;
        this.numtripulantes = numtripulantes;
        this.visitas = visitas;
    }

    public Nave()
    {
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getNumtripulantes()
    {
        return numtripulantes;
    }

    public ArrayList<Visita> getVisitas()
    {
        return visitas;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setNumtripulantes(int numtripulantes)
    {
        this.numtripulantes = numtripulantes;
    }

    public void setVisitas(ArrayList<Visita> visitas)
    {
        this.visitas = visitas;
    }
    
    
}
