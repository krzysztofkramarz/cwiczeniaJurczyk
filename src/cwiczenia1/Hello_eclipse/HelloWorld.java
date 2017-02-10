package cwiczenia1.Hello_eclipse;

/**
 * Created by Krzysiek on 2016-11-05.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Witam i odliczam:");
        System.out.println("Dł tab = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Literka " + (i + 1) + " to: " + args[i]);
        }
    }
}
