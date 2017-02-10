package inne.refleksja;

import java.util.Date;

/**
 * Created by kkramarz on 09.12.16.
 */
public class Test {

    private String miasto;
    private String ulica;
    private String mieszkanie;
    private String imie;
    private String nazwisko;
    private boolean kawaler;
    private Akwarium akwarium;
    private Integer ileWlosow;
    private Date dataUrodzenia;

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMieszkanie() {
        return mieszkanie;
    }

    public void setMieszkanie(String mieszkanie) {
        this.mieszkanie = mieszkanie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public boolean isKawaler() {
        return kawaler;
    }

    public void setKawaler(boolean kawaler) {
        this.kawaler = kawaler;
    }

    public Akwarium getAkwarium() {
        return akwarium;
    }

    public void setAkwarium(Akwarium akwarium) {
        this.akwarium = akwarium;
    }

    public Integer getIleWlosow() {
        return ileWlosow;
    }

    public void setIleWlosow(Integer ileWlosow) {
        this.ileWlosow = ileWlosow;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
