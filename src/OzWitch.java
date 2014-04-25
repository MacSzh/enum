import util.Log;

/**
 * Created by shenzaih on 2014/4/25.
 * 除了不能继承之外 可以认为他是一个常规的类
 * java 要求必须先定义enum实例 (也就是会所他必须是在任何的属性和方法之前) 否则编译就会出错
 * 只允许编译器内部来使用构造器创建enum实例
 */
public enum OzWitch {
    WEST("Miss Culch, aka the world"),NORTH("where are you from"),EAST("i am from English") ,SOURTH("Good morning")  ;
    private String description ;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public static void main(String[] args) {
            for (OzWitch ozWitch : OzWitch.values()) {
                Log.d(ozWitch +  "  : " + ozWitch.getDescription());
            }
    }

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
}
