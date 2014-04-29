package util;

import java.util.Random;

/**
 * Created by shenzaih on 2014/4/29.
 * 随机选取
 */
public class Enums {
    private static  Random random = new Random(47);
    public static <T extends Enum<T>> T random(Class<T> tClass) {
        return random(tClass.getEnumConstants());
    }

    public static <T> T random(T[] values){
        return values[random.nextInt(values.length)] ;
    }
}
