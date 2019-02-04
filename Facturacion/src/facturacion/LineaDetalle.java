package facturacion;


public class LineaDetalle {
    
    
    private int numerolinea;
    private String concepto;
    private int ivaaplicado;
    private double importebruto;
    private double importeneto;

  
    
    public LineaDetalle(int NumeroLinea, String Concepto, int IVAAplicado, double ImporteBruto) {
        this.numerolinea = NumeroLinea;
        this.concepto = Concepto;
        this.ivaaplicado = IVAAplicado;
        this.importebruto = ImporteBruto;
        this.importeneto = ImporteBruto + ImporteBruto * (IVAAplicado/100);     //Aqui cambio el importe neto añadiendolo el burto

    }

    public LineaDetalle() {
    }

    public int getNumeroLinea() {
        return numerolinea;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getIVAAplicado() {
        return ivaaplicado;
    }

    public double getImporteBruto() {
        return importebruto;
    }

    public double getImporteNeto() {
        return importeneto;
    }



    public void setNumeroLinea(int NumeroLinea) {
        this.numerolinea = NumeroLinea;
    }

    public void setConcepto(String Concepto) {
        this.concepto = Concepto;
    }

    public void setIVAAplicado(int IVAAplicado) {
        this.ivaaplicado = IVAAplicado;
    }

    public void setImporteBruto(double ImporteBruto) {
        this.importebruto = ImporteBruto;
    }

    public void setImporteNeto(double ImporteNeto) {
        this.importeneto = ImporteNeto;
    }




    
    
}
