package cwiczenia3;

/**
 * Created by Krzysiek on 2016-11-28.
 */
public class Drewniany implements Dom {


    @Override
    public void budujSciane(Gwozdzie gwozdzie) {
        System.out.println("Buduje sciane za pomocą gwoździ " + gwozdzie.getGwozdzPlastikowy());
    }
}
