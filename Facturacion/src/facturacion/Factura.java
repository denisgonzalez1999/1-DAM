package facturacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Factura {

    private int numerofacturacion;
    private Date fecha;
    private double totalfacturasiniva;
    private double totalfacturaconiva;
    private ArrayList<LineaDetalle> lineasdetalle;

    public Factura(int numerofacturacion, Date fecha) {
        this.numerofacturacion = numerofacturacion;
        this.fecha = fecha;
    }

    public Factura(int numerofacturacion) {
        this.numerofacturacion = numerofacturacion;
    }
    


    public Factura() {
    }

    public int getNumeroFacturacion() {
        return numerofacturacion;
    }

    public Date getFecha() {
        return fecha;
    }



    public double getTotalFacturaSinIVA() {
        return totalfacturasiniva;
    }

    public double getTotalFacturaConIVA() {
        return totalfacturaconiva;
    }

    public ArrayList<LineaDetalle> getLineaDetalle() {
        return lineasdetalle;
    }

    public void setNumeroFacturacion(int NumeroFacturacion) {
        this.numerofacturacion = NumeroFacturacion;
    }

    public void setFecha(Date Fecha) {
        this.fecha = Fecha;
    }



    public void setTotalFacturaSinIVA(double TotalFacturaSinIVA) {
        this.totalfacturasiniva = TotalFacturaSinIVA;
    }

    public void setTotalFacturaConIVA(double TotalFacturaConIVA) {
        this.totalfacturaconiva = TotalFacturaConIVA;
    }

    public void setLineaDetalle(ArrayList<LineaDetalle> LineaDetalle) {
        this.lineasdetalle = LineaDetalle;
    }
    
    


 /*public static void TotalFactura(){
       
       double total=0;
       double linea;
       int numerolineas;
       
       Scanner sc= new Scanner (System.in);
       numerolineas=sc.nextInt();
       
       for(int i=0;i<numerolineas;i++)
       { 
          linea=sc.nextInt();
          total=total+linea;
       }
       
        System.out.println(total);
       }
*/

        //Dices que en facturas vas a añadir lineas de detalles

 
        public void AddDetalle(LineaDetalle Deta) {

        lineasdetalle.add(Deta); 
        }
        
        
        /*
                public void AddDetalle(LineaDetalle Deta) {

       lineasdetalle.add(Deta);
        }
        */
        
    public double TotalBruto() {
   
       double preciobruto = 0;

       
       for (int i = 0; i < lineasdetalle.size(); i++){
                  
           LineaDetalle Detalle1 = lineasdetalle.get(i);
           preciobruto += Detalle1.getImporteBruto();         
           
           //Detalles Detalle2 = Detalle.get(x);
           //sumbruto += Detalle2.getimporteBrutoDF();
           //brut += sumbruto;
           
       }
       
       return preciobruto;
   
   }
    
    
    
    
        public double TotalNeto() {
   
       double precioneto = 0;
       
       for (int i = 0; i < lineasdetalle.size(); i++){
                  
           LineaDetalle Detalle1 = lineasdetalle.get(i);
           precioneto += Detalle1.getImporteNeto();         
           
           //Detalles Detalle2 = Detalle.get(x);
           //sumbruto += Detalle2.getimporteBrutoDF();
           //brut += sumbruto;
       }
       
       return precioneto;
   
   }


    
        
    
}
