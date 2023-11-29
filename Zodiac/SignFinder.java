package Zodiac;

public class SignFinder {
    public boolean rightday(int date) {
        return date >= 1 && date <= 31;
    }

    public String findsign(int date, String month) {


        // Example implementation:
        if ((month.equals("March") && date >= 21) || (month.equals("April") && date <= 19)) {
            return "Aries";
        } else if ((month.equals("April") && date >= 20) || (month.equals("May") && date <= 20)) {
            return "Taurus";
        } else if ((month.equals("May") && date >= 21) || (month.equals("June") && date <= 20)) {
            return "Gemini";
        } else if ((month.equals("June") && date >= 21) || (month.equals("July") && date <= 22)) {
            return "Cancer";
        } else if ((month.equals("July") && date >= 23) || (month.equals("August") && date <= 22)) {
            return "Leo";
        } else if ((month.equals("August") && date >= 23) || (month.equals("September") && date <= 22)) {
            return "Virgo";
        } else if ((month.equals("September") && date >= 23) || (month.equals("October") && date <= 22)) {
            return "Libra";
        } else if ((month.equals("October") && date >= 23) || (month.equals("November") && date <= 21)) {
            return "Scorpio";
        } else if ((month.equals("November") && date >= 22) || (month.equals("December") && date <= 21)) {
            return "Sagittarius";
        } else if ((month.equals("December") && date >= 22) || (month.equals("January") && date <= 19)) {
            return "Capricorn";
        } else if ((month.equals("January") && date >= 20) || (month.equals("February") && date <= 18)) {
            return "Aquarius";
        } else if ((month.equals("February") && date >= 19) || (month.equals("March") && date <= 20)) {
            return "Pisces";
        } else {
            return "Unknown";
        }
    }
}
