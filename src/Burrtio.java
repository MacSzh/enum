import util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: shenzaih
 * Date: 13-10-16
 * Time: 下午4:51
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
        Log.d(new Burrtio(Spiciness.NOT));
        Log.d(new Burrtio(Spiciness.MEDIUM));
        Log.d(new Burrtio(Spiciness.HOT));

    }
}
