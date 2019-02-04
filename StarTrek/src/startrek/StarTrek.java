/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startrek;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class StarTrek
{

    public static void main(String[] args)

    {
        ArrayList<Pelicula> peliculas = new ArrayList<> ();

        try
        {
            FileReader fr = new FileReader("ST_films.csv");
            BufferedReader br = new BufferedReader(fr);
           String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null)
            {
                String resp[] = null;
                
                resp = sCurrentLine.split(";");
                
                
                System.out.println(sCurrentLine);
                
                Pelicula pelicula = new Pelicula();
                pelicula.setTitulo(resp[0]);
                pelicula.setAñolanzamineto(Integer.parseInt(resp[1]));
                pelicula.setDuracion(Integer.parseInt(resp[2]));
                pelicula.setDirector(resp[3]);
                pelicula.setPersonajes(null);
               
                peliculas.add(pelicula);
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("El fichero no existe");
        } catch (IOException ex)
        {
            System.out.println("Error de lectura del fichero");
        }

    }

}
