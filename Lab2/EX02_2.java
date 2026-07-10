// FileName: EX02_2.java
// Programmer: Ryan Franson

public class EX02_2
{
    public static final double Planck = 6.62607015e-34;
    private final double Hartree = 4.359744e-18;
    public final double Avogadro = 6.02214076e23;
    private static final double Newtonian = 6.67430e-11;
     

    public static void main(String[] args) {

        EX02_2 obj = new EX02_2();

        System.out.println(Planck);
        System.out.println(obj.Hartree);
        System.out.println(obj.Avogadro);
        System.out.println(Newtonian);

    }
}