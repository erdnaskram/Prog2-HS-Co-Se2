package kap1.ProgU1_1;

import java.text.DateFormat;
import java.text.ParseException;

public class Birthday {

    private String theDay;

    public Birthday(String s) throws InvalidBirthdayException {
        checkDay(s);
        theDay = s;
    }

    public void checkDay(String s) throws InvalidBirthdayException {
        DateFormat df= DateFormat.getDateInstance();
        df.setLenient(false);
        try {
            df.parse(s);
        } catch (ParseException e) {
            throw new InvalidBirthdayException("\"" + s + "\" is a wrong date format (right: dd.mm.yyyy) \n");
        }
    }

    public String getTheDay() {
        return theDay;
    }
}
