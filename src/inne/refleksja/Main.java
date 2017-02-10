package inne.refleksja;

/**
 * Created by kkramarz on 14.12.16.
 */
public class Main {
    public static void main(String[] args) {

        try {
            Test  test = (Test) Refleksja.getSetters("inne.refleksja.Test");
            System.out.println(test.getImie());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
