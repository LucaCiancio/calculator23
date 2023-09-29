package esercitazioneIngSoftware.calcolatore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       calculator c1= new calculator();
       
       System.out.println("7 + 3 ="+c1.addizione(7,3));
       
       System.out.println("7 - 3 = "+c1.sottrazione(7,3));
       
       System.out.println("7 * 3 = "+c1.prodotto(7,3));
    }
}
