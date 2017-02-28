
/**
 * Write a description of class calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculadora
{
    public void sumar(int sumando1, int sumando2)
    {
        int z;
        z=sumando1+sumando2;
        System.out.println(z);
    }
    public void multiplicar(int n1, int n2)
    {
        int z;
        z=n1*n2;
        System.out.println(z);
    }
    public static void main(String args[])
    {
        
        int x;
        int y;
        calculadora miCalculadora=new calculadora();
        x=4;
        y=6;
        miCalculadora.sumar(x,y);
        miCalculadora.multiplicar(x,y);
    }
}
