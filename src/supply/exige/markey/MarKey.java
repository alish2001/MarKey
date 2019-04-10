package supply.exige.markey;

import supply.exige.markey.classes.Calculus;
import supply.exige.markey.classes.Chemistry;
import supply.exige.markey.classes.Testing;

public class MarKey {

    public static final double vouchers = 5;
    public static final Chemistry chem = new Chemistry();
    public static final Calculus calc = new Calculus();
    public static final Testing test = new Testing();

    public static void main(String[] args) {
        /*test.printEScores();
        System.out.println(test.toString());*/

        //chem.printEScores();
        //chem.getWTA(vouchers);
        //System.out.println(" Vouchers needed: " + vouchers);
        System.out.println(calc.toString());
        System.out.println("Exact: " + calc.getAverage());
        //calc.getWTA(0.5);
    }
}
