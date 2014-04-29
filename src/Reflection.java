import util.Log;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by shenzaih on 2014/4/25.
 * values（）是编译器编译的时候加上去的
 */

enum Explore{HERE,THERE}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        Log.d("-----Analyzing " + enumClass + "------");
        Log.d("Interfaces:");
        for (Type type: enumClass.getGenericInterfaces()){
            Log.d(type);
        }
        Log.d("Base: " + enumClass.getGenericInterfaces() );
        Log.d("Methods: ");
        Set<String> methods = new TreeSet<String>();
        for (Method method: enumClass.getMethods())
            methods.add(method.getName());
        Log.d(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class) ;
        Set<String> enumMethods = analyze(Enum.class);
        Log.d("Explore.containsAll(enumMethods) ?" + exploreMethods.containsAll(enumMethods));
        Log.d("exploreMethods.removeAll(enumMethods)");
        exploreMethods.removeAll(enumMethods);
        Log.d(exploreMethods);

    }
}
