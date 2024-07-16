package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String leapCheck = (year % 400 == 0)? "leap":
                          (year % 100 == 0) ? "not leap" :
                             (year % 4 == 0) ? "leap" : "not leap";
        switch (leapCheck){
            case "leap":
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
