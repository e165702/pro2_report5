package main;

/**
 * Created by e165702 on 2016/12/07.
 */
public class Main {
    public static void main(String[] args) {
        String str = "3．14";
        try {
            System.out.println(str.length());
            Double.parseDouble(str);
        } catch (java.lang.NullPointerException er) {
            System.out.println("NullPointerExceptionが発生しました");
            er.printStackTrace();
        }
    }
}