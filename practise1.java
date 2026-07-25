import java.util.Scanner;

public class practise1{
    public static void main(String[] args ) {


        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Customer Type (Regular , Premium , VIP :");
            String customer_type = sc.next();
            
            System.out.print("Enter Total Cart Price RS :");
            int cart_price = sc.nextInt();
            
            int cart_total =  0;
            
            
            if (cart_price <= 100) {
                System.out.println("You have no Discount");
            }
            else if (cart_price > 101 && cart_price <= 500) {
                switch (customer_type) {
                    case "Regular" -> {
                        System.out.println("You Get a 5% Discount");
                        cart_total = cart_price - (cart_price * 5 / 100);
                        System.out.println(cart_total);
                    }
                    case "Premium" -> {
                        System.out.println("You Get a 10% Discount");
                        cart_total = cart_price - (cart_price * 10 / 100);
                        System.out.println(cart_total);
                    }
                    
                    case "VIP" -> {
                        System.out.println("You Get a 15% Discount");
                        cart_total = cart_price - (cart_price * 15 / 100);
                        System.out.println(cart_total);
                    }
                }
            }
            else if (cart_price > 501) {
                switch (customer_type) {
                    case "Regular" -> {
                        System.out.println("You Get a 10% Discount");
                        cart_total = cart_price - (cart_price * 10 / 100);
                        System.out.println(cart_total);
                    }
                    case "Premium" -> {
                        System.out.println("You Get a 15% Discount");
                        cart_total = cart_price - (cart_price * 15 / 100);
                        System.out.println(cart_total);
                    }
                    case "VIP" -> {
                        System.out.println("You Get a 20% Discount");
                        cart_total = cart_price - (cart_price * 20 / 100);
                        System.out.println(cart_total);
                    }
                }
            }
            else {
                System.out.println("Invalid Entry :");
            }
        }
    }
}