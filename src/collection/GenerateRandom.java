package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {


    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Random random = new Random();
        Map<Integer, Integer> randomValuesMap = new HashMap<>();
        Integer count = 0;

        for (int i = 0; i < amount; i++) {
            int randomKey = random.nextInt(interval);
            count = randomValuesMap.get(randomKey);
            if (count == null) {
                count = 0;
            }
            count++;
            randomValuesMap.put(randomKey, count);
        }


        Iterator<Map.Entry<Integer, Integer>> iterator = randomValuesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println(next.getKey() + " : " + next.getValue());
        }
        return randomValuesMap;
    }

}
