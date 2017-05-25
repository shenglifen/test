package chapter1;

/**
 * Created by Lenovo on 2017/5/25.
 */
public class InvokeAbstractClassMethod {
    public static void main(String[] args){
        System.out.println(Tools.addGoodMorningBefore("Tom"));
    }
}
abstract class Tools {
    public static String addGoodMorningBefore(String name){
        return String.format("Good Moring ,%s",name);
    }
    abstract void process();
}
