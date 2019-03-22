package supply.exige.markey.entries;

import supply.exige.markey.U;

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
        LinkedHashMap candidates = new LinkedHashMap<String, Double>();
        for (int i = 0; i < Math.ceil(vouchers); i++)
            candidates.put(U.getValueByIndex(eScores, i), U.getKeyByIndex(eScores, i));

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
        for (int i = 0; i < marks.length; i++) {
            MarkEntry entry = marks[i];
            eScores.put(entry.getName(), entry.getEScore());
        }
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