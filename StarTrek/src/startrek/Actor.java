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
public class Actor
{
    private String nombre;
    private Date fecha;
    private String necionalidad;
    private Personaje personaje;
    private ArrayList<Capitulo> capitulos;
    private ArrayList<Pelicula> peliculas;

    public Actor(String nombre, Date fecha, String necionalidad, Personaje personaje, ArrayList<Capitulo> capitulos, ArrayList<Pelicula> peliculas)
    {
        this.nombre = nombre;
        this.fecha = fecha;
        this.necionalidad = necionalidad;
        this.personaje = personaje;
        this.capitulos = capitulos;
        this.peliculas = peliculas;
    }

    public Actor()
    {
    }

    public String getNombre()
    {
        return nombre;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public String getNecionalidad()
    {
        return necionalidad;
    }

    public Personaje getPersonaje()
    {
        return personaje;
    }

    public ArrayList<Capitulo> getCapitulos()
    {
        return capitulos;
    }

    public ArrayList<Pelicula> getPeliculas()
    {
        return peliculas;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public void setNecionalidad(String necionalidad)
    {
        this.necionalidad = necionalidad;
    }

    public void setPersonaje(Personaje personaje)
    {
        this.personaje = personaje;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos)
    {
        this.capitulos = capitulos;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas)
    {
        this.peliculas = peliculas;
    }

    

}
