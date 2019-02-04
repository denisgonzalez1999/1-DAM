/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavehiculo;

/**
 *
 * @author 99den
 */
public class Camion extends Terrestre 
{
    private float tonelajemax;  //Esto se mide en Kilogramo
    private int num_ejes;       //Nada



    public Camion()
    {  
    }
    
    
    public Camion(float tonelajemax, int num_ejes, int ruedas, float largo, float ancho, float alto, float aceleracion, float velmax) 
    {
        super(ruedas, largo, ancho, alto, aceleracion, velmax);
        this.tonelajemax = tonelajemax;
        this.num_ejes = num_ejes;
    }
    
           
}
