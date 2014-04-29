import util.Generator;

import java.util.Random;

/**
 * Created by shenzaih on 2014/4/29.
 */
public enum  CartoonCharactor implements Generator<CartoonCharactor> {
    SLAPPY,SPANKY,PUBCHY,SILLY,BOUNCY,NUTTY,BOB ;
    private Random random = new Random(47);
    @Override
    public CartoonCharactor next() {
        return values()[random.nextInt(values().length)];
    }
}
