package supply.exige.markey.entries;

public class MarkEntry {

    private String name;
    private double vouchers;
    private double achieved, max;
    private double weightFactor;
    private Category category;

    public MarkEntry(String name, String actualMark, double weightFactor, Category category) {
        this.name = name;
        String[] tokenizer = actualMark.split("/");
        this.achieved = Double.parseDouble(tokenizer[0]);
        this.max = Double.parseDouble(tokenizer[1]);
        this.weightFactor = weightFactor;
        this.category = category;
    }

    public void addVoucher() {
        this.vouchers += 0.5;
    }

    public void setVouchers(double vouchers) {
        this.vouchers = vouchers;
    }

    public double getVouchers() {
        return vouchers;
    }

    public void setAchieved(double achieved) {
        this.achieved = achieved;
    }

    public String getName() {
        return name;
    }

    public String getActualMark() {
        return achieved + "/" + max;
    }

    public double getAchieved() {
        return achieved;
    }

    public double getMax() {
        return max;
    }

    public double getPercentage() {
        return achieved / max * 100;
    }

    public double getEScore() {
        if (max - achieved == 0) return 0;
        return (1 - ((achieved + vouchers) / max)) * weightFactor;
    }

    public double getWeightFactor() {
        return weightFactor;
    }

    public Category getCategory() {
        return category;
    }
}
