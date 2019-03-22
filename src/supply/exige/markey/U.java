package supply.exige.markey;

import java.util.LinkedHashMap;

public class U {

    public static Object getKeyByIndex(LinkedHashMap map, int index) {
        return map.get((map.keySet().toArray())[index]);
    }

    public static Object getValueByIndex(LinkedHashMap map, int index) {
        return map.keySet().toArray()[index];
    }
}
