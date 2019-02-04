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
public class Pelicula extends Audiovisual
{

    private int añolanzamineto;
    private String director;

    public Pelicula(String titulo, int añolanzamineto, String director,  Date fecharodaje, int duracion, ArrayList<Personaje> personajes)
    {
        super(titulo, fecharodaje, duracion, personajes);
        this.añolanzamineto = añolanzamineto;
        this.director = director;
    }

    public Pelicula()
    {
    }

    public int getAñolanzamineto()
    {
        return añolanzamineto;
    }

    public String getDirector()
    {
        return director;
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

    public void setAñolanzamineto(int añolanzamineto)
    {
        this.añolanzamineto = añolanzamineto;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

}
