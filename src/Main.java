public class Main {
    public static void main(String[] args) {
        // homework 05 started
        // task 1
        int clientOs = 1;
        //  if (clientOs == 0) {
        //    System.out.println("Please install iOS application by link.");
        // } else if (clientOs == 1) {
        //    System.out.println("Please install Android application by link.");
        // } else if (clientOs < 0 || clientOs > 1) {
        //   System.out.println("Unknown OS");
        // }
        switch (clientOs) {
            case 0:
                System.out.println("Please install iOS application by link.");
                break;
            case 1:
                System.out.println("Please install Android application by link.");
                break;
            default:
                System.out.println("Unknown OS");
        }

        // task 2
        int clientOs1 = 0;
        int clientDeviceYear = 2015;
        if (clientOs1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Please install iOS application by link.");
        } else if (clientOs1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Please install lite iOS application by link.");
        } else if (clientOs1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Please install Android application by link.");
        } else if (clientOs1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Please install lite Android application by link.");
        } else if (clientOs1 < 0 || clientOs1 > 1) {
            System.out.println("Unknown OS");
        }
        //  if (clientDeviceYear >= 2015) {
        //  switch (clientOs1) {
        //    case 0:
        //      System.out.println("Please install iOS application by link.");
        //    break;
        //  case 1:
        //     System.out.println("Please install Android application by link.");
        //     break;
        //  default:
        //      System.out.println("Unknown OS");
        // } else if (clientDeviceYear < 2015) {
        //   switch (clientOs1) {
        //     case 0:
        //       System.out.println("Please install lite iOS application by link.");
        //     break;
        //   case 1:
        //      System.out.println("Please install lite Android application by link.");
        //    break;
        //  }
        // The problems with year bigger than 2022 and less than the year since smartphones been produced and with unknown OS have not solved.

        // task 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " year is leap.");
        } else if (year % 400 == 0) {
            System.out.println(year + " year is leap.");
        } else {
            System.out.println(year + " year is not leap.");
        }

        // task 4
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.println("It will take " + deliveryTime + " day for delivery.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("It will take " + deliveryTime + " days for delivery.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("It will take " + deliveryTime + " days for delivery.");
        } else {
            System.out.println("We are not able to deliver. Sorry.");
        }

        // task 5
        int monthNumber = 12;
        boolean incorrectMonth = monthNumber == 0 && monthNumber > 12;
        switch (monthNumber) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
        }
    }
}