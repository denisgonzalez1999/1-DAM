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
public class Capitulo extends Audiovisual
{
    private int temporada;
    private int orden;
    private Date fechaemison;
    private ArrayList<Visita> visitas;

    public Capitulo(int temporada, int orden, Date fechaemison, ArrayList<Visita> visitas, String titulo, Date fecharodaje, int duracion, ArrayList<Personaje> personajes)
    {
        super(titulo, fecharodaje, duracion, personajes);
        this.temporada = temporada;
        this.orden = orden;
        this.fechaemison = fechaemison;
        this.visitas = visitas;
    }

    public Capitulo()
    {
    }

    @Override
    public String getTitulo()
    {
        return titulo;
    }

    @Override
    public Date getFecharodaje()
    {
        return fecharodaje;
    }

    @Override
    public int getDuracion()
    {
        return duracion;
    }

    @Override
    public ArrayList<Personaje> getPersonajes()
    {
        return personajes;
    }

    public int getTemporada()
    {
        return temporada;
    }

    public int getOrden()
    {
        return orden;
    }

    public Date getFechaemison()
    {
        return fechaemison;
    }

    public ArrayList<Visita> getVisitas()
    {
        return visitas;
    }

    public void setTemporada(int temporada)
    {
        this.temporada = temporada;
    }

    public void setOrden(int orden)
    {
        this.orden = orden;
    }

    public void setFechaemison(Date fechaemison)
    {
        this.fechaemison = fechaemison;
    }

    public void setVisitas(ArrayList<Visita> visitas)
    {
        this.visitas = visitas;
    }

    @Override
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    @Override
    public void setFecharodaje(Date fecharodaje)
    {
        this.fecharodaje = fecharodaje;
    }

    @Override
    public void setDuracion(int duracion)
    {
        this.duracion = duracion;
    }

    @Override
    public void setPersonajes(ArrayList<Personaje> personajes)
    {
        this.personajes = personajes;
    }
}
