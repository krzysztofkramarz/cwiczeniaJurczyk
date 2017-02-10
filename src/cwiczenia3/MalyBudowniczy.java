package cwiczenia3;

/**
 * Created by Krzysiek on 2016-11-28.
 */
public class MalyBudowniczy extends Budowniczy {


    public MalyBudowniczy() {
        addDomek(new Drewniany());
        addDomek(new Dom() {
            @Override
            public void budujSciane(Gwozdzie gwozdzie) {
                System.out.println("A ja z klasy anonimowej używam " + gwozdzie.getGwozdzMetalowy());
            }
        });

    }


}
