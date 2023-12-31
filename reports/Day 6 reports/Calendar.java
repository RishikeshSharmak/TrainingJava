import java.time.LocalDate;
import java.util.Scanner;

class calendar{
    public static String findDay(String  month,String  day,String  year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day=in.next();
        String year = in.next();
        System.out.println(findDay(day,month,year));
    }
}
