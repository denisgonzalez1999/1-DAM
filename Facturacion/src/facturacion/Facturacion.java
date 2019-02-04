package facturacion;

/// Arreglar la referencia de los clientes y las facturas
public class Facturacion {


    public static void main(String[] args) {
        
//<----------------------------------------------------CLIENTES---------------------------------------------------->        
        //Creamos los dos clientes
        Cliente cliente1 = new Cliente(1,"Denis","Gonzalez",12125);
        Cliente cliente2 = new Cliente(2,"David","Perez",14145);
//<----------------------------------------------------FACTURAS---------------------------------------------------->          
        //Creamos las 4 facturas que liuego añadireos  a clientes
        Factura factura1 = new Factura(1);    
        Factura factura2 = new Factura(2);
        Factura factura3 = new Factura(3);
        Factura factura4 = new Factura(4);
        
//<----------------------------------------------------LINEASDETALLES---------------------------------------------------->          
        //Creamos las lineas de detalles que luego añadiremos a facturas
        LineaDetalle lineadetalle1 = new LineaDetalle(1,"Pizza",21, 2.5);
        LineaDetalle lineadetalle2 = new LineaDetalle(2,"Hamburguesa",21, 3);
        LineaDetalle lineadetalle3 = new LineaDetalle(3,"Pan",4,0.4);
        LineaDetalle lineadetalle4 = new LineaDetalle(4,"Bicicleta",21,724);
        LineaDetalle lineadetalle5 = new LineaDetalle(5,"Ordenador",21,750);
        LineaDetalle lineadetalle6 = new LineaDetalle(6,"Barco",21,25000);
        LineaDetalle lineadetalle7 = new LineaDetalle(7,"Chicle",20,0.04);        
        LineaDetalle lineadetalle8 = new LineaDetalle(8,"Reloj",21,25);     
        LineaDetalle lineadetalle9 = new LineaDetalle(9,"Pantalones",21,15);        


            System.out.println("cd");

        
//<----------------------------------------------------CLIENTES CON FACTURAS---------------------------------------------------->          
        //Metemos en cada cliente sus facturas
        //cliente1.add(factura1);
      //  cliente1.add(factura2);
        
        //cliente2.add(factura3);
        //cliente2.add(factura4);
        
//<----------------------------------------------------FACTURAS CON LINEAS DE DETALLES---------------------------------------------------->          
       // Metemos en las facturas sus lineas de detalle
        factura1.AddDetalle(lineadetalle1);
        factura2.AddDetalle(lineadetalle2);
        factura1.AddDetalle(lineadetalle3);
        
        
        factura2.AddDetalle(lineadetalle4);
        factura2.AddDetalle(lineadetalle5);
        
        factura3.AddDetalle(lineadetalle6);
        factura3.AddDetalle(lineadetalle7);
        factura3.AddDetalle(lineadetalle8); 
        
        factura4.AddDetalle(lineadetalle9);
        
        
        cliente1.add(factura1);
        cliente1.add(factura2);
        
        cliente2.add(factura3);
        cliente2.add(factura4);
    }
    
}
