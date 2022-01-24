import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class OneMethodTests {

    @Test
    public void testZeroAsFirstValue() {
        HashMap<String, Integer> correctResult = new HashMap<>();
        correctResult.put("*", 0);
        correctResult.put("/", 0);
        correctResult.put("%", 0);

        Assert.assertTrue(isTheSame(OneMethod.result(0, 1), correctResult));
    }

    @Test
    public void testZeroAsSecondValue() {
        HashMap<String, Integer> correctResult = new HashMap<>();
        correctResult.put("*", 0);
        correctResult.put("/", null);
        correctResult.put("%", null);

        Assert.assertTrue(isTheSame(OneMethod.result(4, 0), correctResult));
    }

    @Test
    public void testZeroAsBothValue() {
        HashMap<String, Integer> correctResult = new HashMap<>();
        correctResult.put("*", 0);
        correctResult.put("/", null);
        correctResult.put("%", null);

        Assert.assertTrue(isTheSame(OneMethod.result(0, 0), correctResult));
    }

    @Test
    public void testRandomValue() {
        HashMap<String, Integer> correctResult = new HashMap<>();
        correctResult.put("*", 23680700);
        correctResult.put("/", 2368);
        correctResult.put("%", 7);

        Assert.assertTrue(isTheSame(OneMethod.result(236807, 100), correctResult));
    }

    @Test
    public void testNegativeValue() {
        HashMap<String, Integer> correctResult = new HashMap<>();
        correctResult.put("*", -381917);
        correctResult.put("/", -3819);
        correctResult.put("%", -17);

        Assert.assertTrue(isTheSame(OneMethod.result(-381917, 100), correctResult));
    }



    private boolean isTheSame(HashMap<String, Integer> first, HashMap<String, Integer> second) {
        if (first.size()!=second.size())
            return false;
        for (String key : first.keySet()) {
            if (first.get(key)!=second.get(key))
                return false;
        }
        return true;
    }
}
