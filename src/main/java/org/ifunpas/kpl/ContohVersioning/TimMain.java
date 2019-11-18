package org.ifunpas.kpl.ContohVersioning;

/**
 * Hello world!
 *
 */
public class TimMain 
{
    public static void main( String[] args )
    {
        Tim tim = new Tim("Persib");

        tim.tambahPemainInti(new Pemain("I Made", 1));
        tim.tambahPemainInti(new Pemain("Atep", 7));
        tim.tambahPemainInti(new Pemain("Essien", 5));
        tim.tambahPemainInti(new Pemain("Febry", 22));
        
        tim.tampilPemainInti();
    }
}
