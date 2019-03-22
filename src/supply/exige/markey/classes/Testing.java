package supply.exige.markey.classes;

import supply.exige.markey.entries.Category;
import supply.exige.markey.entries.Class;
import supply.exige.markey.entries.MarkEntry;

public class Testing extends Class {

    public Testing() {
        super("Testing");
        MarkEntry[] marks = {
                new MarkEntry("Entry 1", "40/43", 65.0, Category.KNOWLEDGE),
                new MarkEntry("Entry 2", "28/30", 35.0, Category.INQUIRY),
        };
        setMarks(marks);
    }
}
