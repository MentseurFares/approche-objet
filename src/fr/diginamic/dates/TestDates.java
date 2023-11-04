package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {
        Date dateDuJour = new Date();
        System.out.println(dateDuJour);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(dateFormat.format(dateDuJour));
        Date newDate = new Date(116,04,19,23,59,30);
        System.out.println(newDate);
        SimpleDateFormat newDateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println(newDateFormat.format(newDate));

        Date dateSysteme = new Date(System.currentTimeMillis());
        System.out.println(newDateFormat.format(dateSysteme));
    }
}
