package at.la.cc.basics;

public class Kalender {
    public static void main(String[] args) {

        String[] months = {"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "Septemeber", "Oktober", "November", "Dezember"};
        String[] weekDays = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};

        int month = 1;
        int startDay = 1;


        System.out.println("|Mo|Di|Mi|Do|Fr|Sa|So|");
        if (month >= 0 && month <= 11 && startDay >= 0 && startDay <= 6) {
            int daysInMonth = 31;

            switch (month) {
                case 0:
                case 2:
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                    daysInMonth = 31;
                    break;
                case 1:
                    daysInMonth = 29;
                    break;
                default:
                    daysInMonth = 30;
            }
            int weeks = (daysInMonth + startDay) > 35 ? 6 : 5;

            for (int week = 1; week <= weeks; week++) {
                for (int tag = 1; tag <= 7; tag++) {
                    int date = tag + (week - 1) * 7 - startDay;
                    if (date > 0 && date <= daysInMonth) {
                        System.out.print("|" + ((date < 10) ? " " : "") + date);
                    } else {
                        System.out.print(" | ");

                    }


                }
                System.out.println("|");
            }
        }
    }
}