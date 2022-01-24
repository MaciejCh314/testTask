import java.util.HashMap;

public class OneMethod {
    public static HashMap<String, Integer> result (int a, int b) {
        HashMap<String, Integer> tempResults = new HashMap<>();
        tempResults.put("*", a * b);
        if (b==0) {
            tempResults.put("/", null);
            tempResults.put("%", null);
        } else {
            tempResults.put("/", a / b);
            tempResults.put("%", a % b);
        }
        return tempResults;
    }
}
