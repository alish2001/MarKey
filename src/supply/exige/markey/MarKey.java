package supply.exige.markey;

import supply.exige.markey.classes.Chemistry;
import supply.exige.markey.classes.Testing;

public class MarKey {

    public static final double vouchers = 10;
    public static final Chemistry chem = new Chemistry();
    public static final Testing test = new Testing();

    public static void main(String[] args) {
        /*test.printEScores();
        System.out.println(test.toString());*/

        chem.printEScores();
        chem.getWTA(vouchers);
        System.out.println(" Vouchers needed: " + vouchers);

    }
}
