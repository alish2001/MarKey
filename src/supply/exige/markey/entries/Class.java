package supply.exige.markey.entries;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Class {

    private String name;
    private MarkEntry[] marks;
    private LinkedHashMap<String, Double> eScores = new LinkedHashMap<>();

    public Class(String name) {
        this.name = name;
    }

    public void getWTA(double vouchers) {
        /*LinkedHashMap candidates = new LinkedHashMap<String, Double>();


        /* TODO:
        - Check the amount of path traversal per EScore
        - Compare Path Traversal Amounts
        - Choose Farthest Traversal

        -> Convert Voucher TO EScore
        -> See Which value is the largests
        -> traverse in 0.5 increments
         */

        /*    public double getEScore() {
        if (max - achieved == 0) return 0;
        return (1 - (achieved / max)) * weightFactor;
    }*/

        eScores.clear();
        double traverseCount = vouchers / 0.5;
        System.out.println(">>> Traverse Count=" + traverseCount);
        double[] travereses = new double[marks.length];
        for (int t = 0; t < traverseCount; t++) { // Traverse by 0.5
            System.out.println("\nTRAVERSAL #" + t + "\n");
            for (int i = 0; i < marks.length; i++) {
                MarkEntry entry = marks[i];
                double traversal = (0.5 / entry.getMax()) * entry.getWeightFactor();
                if (entry.getEScore() == 0) traversal = 0;
                travereses[i] = traversal;
            }

            int highestID = 0;
            for (int id = 0; id < marks.length; id++) {
                System.out.println(marks[id].getName() + " has TRAVERSAL SCORE: " + travereses[id]);
                if (travereses[id] > travereses[highestID]) highestID = id;
            }

            marks[highestID].addVoucher();

            storeEScores();
            sortEScores();
            printEScores();
        }

        System.out.println("\nRESULT\n");
        sortEScores();

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i].getName() + " should have: " + marks[i].getVouchers() + " vouchers");
        }

        solidify();
        System.out.println("\n Estimated (Post-Voucher) Average: %" + getAverage());
    }

    private void traversel() {

    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        double average = 0;
        for (MarkEntry mark : marks) {
            average += mark.getPercentage() * (mark.getWeightFactor() / 100);
        }
        return average;
    }

    public void setMarks(MarkEntry[] marks) {
        this.marks = marks;
        storeEScores();
        sortEScores();
    }

    private void solidify(){
        for (int i = 0; i < marks.length;i++){
            marks[i].setAchieved(marks[i].getAchieved() + marks[i].getVouchers());
            //marks[i].setVouchers(0);
        }
    }

    private void storeEScores() {
        eScores.clear();
        for (int i = 0; i < marks.length; i++) {
            MarkEntry entry = marks[i];
            eScores.put(entry.getName(), entry.getEScore());
        }
    }

    private void sortEScores() {
        // now let's sort the map in decreasing order of value
        LinkedHashMap<String, Double> sorted = eScores
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));
        eScores = sorted;
    }

    public void printEScores() {
        for (Map.Entry<String, Double> e : eScores.entrySet())
            System.out.println("Entry: " + e.getKey() + " | EScore: " + e.getValue());
    }

    public MarkEntry[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " | " + Math.round(getAverage()) + "%";
    }
}