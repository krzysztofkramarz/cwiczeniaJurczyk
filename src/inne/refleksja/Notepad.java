package inne.refleksja;

import java.util.Date;

/**
 * Created by kkramarz on 09.12.16.
 */
public class Notepad {
    private static Date lastCreatedDate;

    static class Note {
        private Date creationDate;

        public Date getCreationDate() {
            return creationDate;
        }

        public Date getLastCreatedDate() {
            // statyczna zmienna prywatna klasy zewnętrznej
            return lastCreatedDate;
        }
    }

    public static Note newNote() {
        Note art = new Note();


        art.creationDate = new Date(); // zmienna prywatna z klasy wewnętrznej
        lastCreatedDate = art.creationDate;

        return art;
    }
}