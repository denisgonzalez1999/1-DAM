/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startrek;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sergio
 */
public class Audiovisual
{
    protected  String titulo;
    protected Date fecharodaje; // fehca fin rodaje
    protected int duracion; // En minutos
    protected ArrayList<Personaje> personajes;

    public Audiovisual(String titulo, Date fecharodaje, int duracion, ArrayList<Personaje> personajes)
    {
        this.titulo = titulo;
        this.fecharodaje = fecharodaje;
        this.duracion = duracion;
        this.personajes = personajes;
    }

    public Audiovisual()
    {
    }

    public String getTitulo()
    {
        return titulo;
    }

    public Date getFecharodaje()
    {
        return fecharodaje;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public ArrayList<Personaje> getPersonajes()
    {
        return personajes;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setFecharodaje(Date fecharodaje)
    {
        this.fecharodaje = fecharodaje;
    }

    public void setDuracion(int duracion)
    {
        this.duracion = duracion;
    }

    public void setPersonajes(ArrayList<Personaje> personajes)
    {
        this.personajes = personajes;
    }
    
    
}
