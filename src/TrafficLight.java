import util.Log;
import util.Signal;

import static util.Signal.*;
/**
 * Created by shenzaih on 2014/4/25.
 *  enum 天生具有整数值的次序，  他可以通过ordinal（）方法取得其次序
 *  当然编译此时编译器帮我们做了类似的事情
 */
public class TrafficLight {
    Signal signal = RED;
    public void change(){
        switch (signal){
            case RED:
                signal = GREEN;
                break;
            case GREEN:
                signal = YELLOW;
                break;
            case YELLOW:
                signal = RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "the traffic light is " + signal;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i= 0 ; i < 7 ; i ++) {
            Log.d(trafficLight);
            trafficLight.change();
        }
    }
}
