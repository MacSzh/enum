import util.Log;

/**
 * Created by shenzaih on 2014/4/25.
 */
public class EnumClass {
    public static void main(String[] args) {

        for (Shrubbery shrubbery: Shrubbery.values()){
            Log.d(shrubbery + " ordinal: " + shrubbery.ordinal());
            Log.d(shrubbery.compareTo(Shrubbery.CRAWLING) + " ");
            Log.d(shrubbery.equals(Shrubbery.CRAWLING) + " ");
            Log.d(shrubbery == Shrubbery.CRAWLING );
            Log.d(shrubbery.getDeclaringClass());
            Log.d(shrubbery.name());
            Log.d("-------------------------");
        }

//        Produce an enum value from a string name
        for (String s:"HANGING CRAWLING GROUP jn".split(" ")){
            Shrubbery  shrubbery = Enum.valueOf(Shrubbery.class,s);
            Log.d(shrubbery);
        }
    }
}
