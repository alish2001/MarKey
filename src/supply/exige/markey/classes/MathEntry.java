package supply.exige.markey.classes;

import supply.exige.markey.entries.Category;
import supply.exige.markey.entries.MarkEntry;

public class MathEntry extends MarkEntry {

    public MathEntry(String name, String actualMark) {
        super (name, actualMark, 0.0, Category.KNOWLEDGE);
    }
}
