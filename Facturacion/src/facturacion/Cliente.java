/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;

/**
 *
 * @author Usuario 1 DAM
 */
public class Cliente {
    
    private int numerocliente;
    private String nombrecliente;
    private String apellidos;
    private int cif_nif;
    private ArrayList<Factura> facturas;

    public Cliente() {
    }

    public Cliente(int NumeroCliente, String NombreCliente, String Apellidos, int CIF_NIF, ArrayList<Factura> Factura) {
        this.numerocliente = NumeroCliente;
        this.nombrecliente = NombreCliente;
        this.apellidos = Apellidos;
        this.cif_nif = CIF_NIF;
        this.facturas = Factura;
    }

    public Cliente(int NumeroCliente, String NombreCliente, String Apellidos, int CIF_NIF) {
        this.numerocliente = NumeroCliente;
        this.nombrecliente = NombreCliente;
        this.apellidos = Apellidos;
        this.cif_nif = CIF_NIF;
    }

    

    
    


    public int getNumeroCliente() {
        return numerocliente;
    }

    public void setNumeroCliente(int NumeroCliente) {
        this.numerocliente = NumeroCliente;
    }

    public String getNombreCliente() {
        return nombrecliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.nombrecliente = NombreCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    public int getCIF_NIF() {
        return cif_nif;
    }

    public void setCIF_NIF(int CIF_NIF) {
        this.cif_nif = CIF_NIF;
    }

    public ArrayList<Factura> getFactura() {
        return facturas;
    }

    public void setFactura(ArrayList<Factura> Factura) {
        this.facturas = Factura;
    }

    
    //Dices que en clientes vas a meter facturas

    
    /*public void add(Factura e) {
       Factura.add(e);
       
       
   }*/
    public void add(Factura e) {
       facturas.add(e);
   }
}
