package supply.exige.markey.entries;

public class MarkEntry {

    private String name;
    private String actualMark;
    private double weightFactor;
    private Category category;

    public MarkEntry(String name, String actualMark, double weightFactor, Category category) {
        this.name = name;
        this.actualMark = actualMark;
        this.weightFactor = weightFactor;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getActualMark() {
        return actualMark;
    }

    public double getPercentage() {
        String[] tokenizer = actualMark.split("/");
        double achieved = Double.parseDouble(tokenizer[0]);
        double max = Double.parseDouble(tokenizer[1]);
        return achieved / max * 100;
    }

    public double getEScore() {
        return (100 - getPercentage()) * weightFactor;
    }

    public double getWeightFactor() {
        return weightFactor;
    }

    public Category getCategory() {
        return category;
    }
}
