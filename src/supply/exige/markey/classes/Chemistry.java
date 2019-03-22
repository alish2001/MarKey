package supply.exige.markey.classes;

import supply.exige.markey.entries.Category;
import supply.exige.markey.entries.Class;
import supply.exige.markey.entries.MarkEntry;

public class Chemistry extends Class {

    public Chemistry() {
        super("Chemistry");
        MarkEntry[] marks = {
                new MarkEntry("Safety & Measure Quiz", "40/43", 3.0, Category.KNOWLEDGE),
                new MarkEntry("Bohr GIZMO", "30/30", 8.1, Category.INQUIRY),
                new MarkEntry("Atomic Theory Quiz", "26/30", 8.9, Category.KNOWLEDGE),
                new MarkEntry("Wanted Poster", "87/100", 4.3, Category.COMMUNICATION),
                new MarkEntry("Bonding Quiz", "23/32", 8.9, Category.KNOWLEDGE),
                new MarkEntry("Unit 2 Test - Knowledge", "43/48", 14.9, Category.KNOWLEDGE),
                new MarkEntry("Unit 2 Test - Communication", "9.5/16", 12.9, Category.COMMUNICATION),
                new MarkEntry("Unit 2 Test - Making Connections", "8/11", 18.6, Category.MAKING_CONNCECTIONS),
                new MarkEntry("Aggregates Lab", "60/64", 16.2, Category.INQUIRY),
                new MarkEntry("Aggregates Lab Follow-up", "25/25", 4.3, Category.COMMUNICATION),
        };
        setMarks(marks);
    }
}
