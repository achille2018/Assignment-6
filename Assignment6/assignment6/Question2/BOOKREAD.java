// Author :Achille Tanwouo

// In this place we make the enumeration of Day
enum Day {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}

public class BOOKREAD
// we create the variables after the class Book 
{
    Day day;

    // creation of the constructor
    public BOOKREAD(Day day) {
        this.day = day;
    }

    public void daySuggestion() {
        switch (day) {
            case Monday:
                System.out.println("\nMonday:\nread galaxy\n");
                break;
            case Tuesday:
                System.out.println("Tuesday: \nread champion \n");
                break;
            case Wednesday:
                System.out.println("Wednesday: \nread buck benie\n");
                break;
            case Thursday:
                System.out.println("Thursday: \nread evasion\n");
                break;
            case Friday:
                System.out.println("Friday: \nread black list\n");
                break;
            case Saturday:
                System.out.println("Saturday: \nread maxy box\n");
                break;
            case Sunday:
                System.out.println("Sunday: \nsecond war world\n");
                break;

            default:
                System.out.println("no suggestion, no book to read!!!");
                break;
        }
    }

    public static void main(String args[]) {
        // creation of different objet day
        String day1 = "Monday";
        String day2 = "Tuesday";
        String day3 = "Wednesday";
        String day4 = "Thursday";
        String day5 = "Friday";
        String day6 = "Saturday";
        String day7 = "Sunday";
        BOOKREAD b1 = new BOOKREAD(Day.valueOf(day1));
        BOOKREAD b2 = new BOOKREAD(Day.valueOf(day2));
        BOOKREAD b3 = new BOOKREAD(Day.valueOf(day3));
        BOOKREAD b4 = new BOOKREAD(Day.valueOf(day4));
        BOOKREAD b5 = new BOOKREAD(Day.valueOf(day5));
        BOOKREAD b6 = new BOOKREAD(Day.valueOf(day6));
        BOOKREAD b7 = new BOOKREAD(Day.valueOf(day7));

        b1.daySuggestion();
        b2.daySuggestion();
        b3.daySuggestion();
        b4.daySuggestion();
        b5.daySuggestion();
        b6.daySuggestion();
        b7.daySuggestion();

    }
}