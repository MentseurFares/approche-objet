package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,04,19,23,59,30);
        Date date = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(date));

        SimpleDateFormat franceDateFormat = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
        SimpleDateFormat russianDateFormat = new SimpleDateFormat("EEEEE dd MMMMM yyyy", new Locale("ru","RU"));
        SimpleDateFormat chineseDateFormat = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINESE);
        SimpleDateFormat germanDateFormat = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.GERMAN);

        System.out.println(franceDateFormat.format(date));
        System.out.println(russianDateFormat.format(date));
        System.out.println(chineseDateFormat.format(date));
        System.out.println(germanDateFormat.format(date));
    }
}
