import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(1987, 3, 9);
        LocalDate dateNow = LocalDate.now();
        LocalDate date2 = LocalDate.of(1988, 10,10);
        System.out.println("The album \"The Joshua Tree\" was released on:  " + date1);
        Period p1 = Period.between(date1, dateNow);
        System.out.println("The time since that album was released is: " + p1.getYears() + " Years " + p1.getMonths() + " Months and " + p1.getDays() + " Days");
        System.out.println("The album \"Rattle and Hum\" was released on:  " + date2);
        Period p2 = Period.between(date1, date2);
        System.out.println("The time between the two albums was: " + p2.getYears() + " Years " + p2.getMonths() + " Months and " + p2.getDays() + " Days");
        LocalDate date3 = date2.plusYears(1).plusMonths(7).plusDays(1);
        System.out.println("The time of the third album would have been: " + date3);
        System.out.println("\n");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Name your favorite team\n>");
        String userInput = keyboard.nextLine();
        String firstThree = userInput.toLowerCase().substring(0,3);
        Team[] teams = Team.values();
        for(Team t : teams) {
            String name = t.getTeamName().toLowerCase().substring(0,3);
            String city = t.getCity().toLowerCase().substring(0,3);

            if(firstThree.equals(name) || firstThree.equals(city)){
                System.out.println(totalName(t));
            }
        }

        System.out.println("\n");

        System.out.print("Input a number\n>");
        long userNum = Long.parseLong(keyboard.nextLine());
        if(userNum >= Byte.MIN_VALUE && userNum <= Byte.MAX_VALUE ) {
            System.out.println("Your number is a Byte");
        }
        else if (userNum >= Short.MIN_VALUE && userNum <= Short.MAX_VALUE)
        {
            System.out.println("Your number is a Short");
        }
        else if (userNum >= Integer.MIN_VALUE && userNum <= Integer.MAX_VALUE)
        {
            System.out.println("Your number is a Integer");
        }
        else if (userNum >= Long.MIN_VALUE && userNum <= Long.MAX_VALUE)
        {
            System.out.println("Your number is a Long");
        }


        System.out.println("\n");



        BigInteger wisconsin = new BigInteger("5726398");
        BigInteger california = new BigInteger("38041430");
        BigInteger texas = new BigInteger("26059203");
        System.out.println("The population of Wisconsin is: " + wisconsin);
        System.out.println("If every person in Wisconsin sent everyone a letting in California (with a population of: " + california
                + ") then we would have:");
        BigInteger letters1 = wisconsin.multiply(california);
        System.out.println(letters1 + " letters sent.");
        BigInteger letters2 = letters1.multiply(texas);
        System.out.println("If everyone in texas got a copy of each letter sent, we would have:");
        System.out.println(letters2 + " letters");
        BigDecimal letterCost = new BigDecimal("3.23");
        BigDecimal texas2 = new BigDecimal(letters2);
        BigDecimal totalCost = letterCost.multiply(texas2);
        System.out.println("The total cost if each letter was $3.23 per letter would be:");
        System.out.println(totalCost);


    }
    public static String totalName(Team t){
        return (t.getCity() + " " + t.getTeamName());
    }
}
