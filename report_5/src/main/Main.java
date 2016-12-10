package main;

/**
 * Created by e165702 on 2016/12/07.
 */
public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (java.lang.NullPointerException er) {
            System.out.println("NullPointerExceptionが発生しました");
            er.printStackTrace();
        }
    }
}