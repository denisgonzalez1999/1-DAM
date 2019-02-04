package javaescuela;


public class Main {


    public static void main(String[] args)
    {
         JavaEscuela profesor = new JavaEscuela("Sergio", "CESJuanPabloSegundo",5000);      //Creamos un usuario del padre y le ponemos datos
         ProfesorMatematicas profemates = new ProfesorMatematicas("CESJuanPabloSegundo",10,"Issac","CESJuanPabloSegundo",4000); //Creamos un usuario hijo y le ponemos datos
                profesor.incrementar_salario(500);          //Imcrementa el salario de profesor en +500
                profemates.incrementar_salario(400);        //Incrementa el salario de profemates en +400
              
            System.out.println("Nombre: "+profesor.getNombre());        //Imprime nombre de profesor
            System.out.println("Colegio: "+profesor.getEscuela());        //Imprime Colegio de profesor
            System.out.println("Salario: "+profesor.getSalario());        //Imprime salario de profesor
            System.out.println("Nombre: "+profemates.getNombre());        //Imprime nombre de profemates
            System.out.println("Colegio: "+profemates.getEscuela());        //Imprime colegio de profemates
            System.out.println("Salario: "+profemates.getSalario());        //Imprime salario de profemates
         
    }
    
    
}
