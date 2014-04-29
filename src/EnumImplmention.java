import util.Generator;
import util.Log;

/**
 * Created by shenzaih on 2014/4/29.
 */
public class EnumImplmention {
    public static <T> void printNext(Generator<T> generator){
        Log.d(generator.next()+ " ,");
    }

    public static void main(String[] args) {
        CartoonCharactor cartoonCharactor = CartoonCharactor.BOB;
        for (int i = 0 ; i < 10 ; i ++)
            printNext(cartoonCharactor);
    }
}
