import util.Log;
import util.Spiciness;

import static util.Spiciness.*;

/**
 * Created with IntelliJ IDEA.
 * User: shenzaih
 * Date: 13-10-16
 * Time: 下午4:51
 *
 * 静态导入 就无需再用enum类型来修饰enum实例
 * import static util.Spiciness.*;
 */
public class Burrtio {
    Spiciness spiciness ;

    public Burrtio(Spiciness spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Burrtio is "+spiciness;
    }

    public static void main(String s[]){
        Log.d(new Burrtio(NOT));
        Log.d(new Burrtio(MEDIUM));
        Log.d(new Burrtio(HOT));

    }
}
