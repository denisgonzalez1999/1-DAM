package problema.kaprekar;

import java.util.Scanner;


public class ProblemaKaprekar {


    public static void main(String[] args) 
    {
     int a[] = new int[4];
     int n;
     int d =1000;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        for(int i=0; i<4; i++)
        {
            a[i] = n/d;
            n=n%d;
            d = d/10;
        }
            
        for(int i =0; i<4;i++)
        {
            System.out.println(a[i]);
        }
        
        
    }
    
}
