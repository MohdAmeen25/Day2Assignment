package com.bridgelabz;

public class SpringSeason {
    public static void main(String[] args) {
//        int x = Integer.parseInt(args[0]);
//        int y = Integer.parseInt(args[1]);
//        int sum = x + y;
//        System.out.println("The sum of x and y is: " +sum);
//    }
//}

        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);
        int day1   = Integer.parseInt(args[2]);
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                   || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}
