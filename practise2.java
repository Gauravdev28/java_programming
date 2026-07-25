import java.util.Scanner;

public class practise2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Vehicle Type (Bike , Taxi , Car ):");
            String vehicle_type = sc.next();

            System.out.print("Enter Distance :");
            int total_distance = sc.nextInt();

            System.out.print("Enter Time Of Booking :");
            int booking_time = sc.nextInt();

            double total_price = 0;

            if (booking_time >=9 && booking_time <=11 || booking_time >=17 && booking_time<=19){
                switch (vehicle_type){
                    case ("Bike") -> {
                        total_price = (total_distance*1.5) ;
                        System.out.println(total_price);
                        break;
                    }
                    case ("Taxi") -> {
                        total_price = (total_distance*4.5) ;
                        System.out.println(total_price);
                        break;
                    }
                    case ("Car") -> {
                        total_price = (total_distance*7.5) ;
                        System.out.println(total_price);
                        break;
                    }
                }
            }
            else {
                switch(vehicle_type){
                    case ("Bike") -> {
                        total_price = (total_distance*1) ;
                        System.out.println(total_price);
                        break;
                    }
                    case ("Taxi") -> {
                        total_price = (total_distance*3) ;
                        System.out.println(total_price);
                        break;
                    }
                    case ("Car") -> {
                        total_price = (total_distance*5) ;
                        System.out.println(total_price);
                        break;
                    }
                }
            }
            sc.close();
        }
    }  
}
