import util.Enums;
import util.Log;

/**
 * Created by shenzaih on 2014/4/29.
 */
enum Activity {
    ONCREATE , ONSTART , ONRESUME , ONPAUSE , ONSTOP , ONDESTORY
}

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0 ; i < 20 ; i ++)
            Log.d(Enums.random(Activity.class ) + " ,");
    }
}
