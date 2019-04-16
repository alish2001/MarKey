package supply.exige.markey.classes;

import supply.exige.markey.entries.Category;
import supply.exige.markey.entries.Class;
import supply.exige.markey.entries.MarkEntry;

public class Chemistry extends Class {

    public Chemistry() {
        super("Chemistry");
        MarkEntry[] marks = {
                new MarkEntry("Safety & Measure Quiz", "40/43", 2.4, Category.KNOWLEDGE),
                new MarkEntry("Bohr GIZMO", "30/30", 4.0, Category.INQUIRY),
                new MarkEntry("Atomic Theory Quiz", "26/30", 7.1, Category.KNOWLEDGE),
                new MarkEntry("Wanted Poster", "87/100", 6.1, Category.COMMUNICATION),
                new MarkEntry("Bonding Quiz", "23/32", 7.1, Category.KNOWLEDGE),
                new MarkEntry("Unit 2 Test - Knowledge", "43/48", 11.9, Category.KNOWLEDGE),
                new MarkEntry("Unit 2 Test - Communication", "9.5/16", 9.2, Category.COMMUNICATION),
                new MarkEntry("Unit 2 Test - Making Connections", "8/11", 11.1, Category.MAKING_CONNCECTIONS),
                new MarkEntry("Aggregates Lab", "60/64", 8.1, Category.INQUIRY),
                new MarkEntry("Aggregates Lab Follow-up", "25/25", 3.1, Category.COMMUNICATION),
                new MarkEntry("Calorimetry Lab GIZMO", "54/54", 4.0, Category.INQUIRY),
                new MarkEntry("Reaction Energy GIZMO", "46/46", 4.0, Category.INQUIRY),
                new MarkEntry("Thermodynamics Quiz", "25/40", 7.1, Category.KNOWLEDGE),
                new MarkEntry("Chem Files #1", "24/24", 3.7, Category.MAKING_CONNCECTIONS),
                new MarkEntry("Nuclear Meltdown", "18/18", 3.7, Category.MAKING_CONNCECTIONS),
                new MarkEntry("Rate Lab", "30/30", 4.0, Category.INQUIRY),
                new MarkEntry("Galvanic Oxidation", "12/12", 3.1, Category.COMMUNICATION),
        };
        setMarks(marks);
    }
}
