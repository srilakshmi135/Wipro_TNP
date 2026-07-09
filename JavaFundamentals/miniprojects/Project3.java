package miniprojects;

public class Project3 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter product id");
            return;
        }

        int pid = Integer.parseInt(args[0]);

        int prodId[] = {201, 202, 203, 204, 205};

        String prodName[] = {
            "Laptop", "Mobile", "Tablet", "Watch", "Headphones"
        };

        int price[] = {60000, 25000, 15000, 8000, 35000};

        int index = -1;

        for (int i = 0; i < prodId.length; i++) {
            if (prodId[i] == pid) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Product not found");
            return;
        }

        double discount = 0;

        if (price[index] >= 50000) {
            discount = 0.20;
        } else if (price[index] >= 30000) {
            discount = 0.15;
        } else if (price[index] >= 10000) {
            discount = 0.10;
        }

        double finalPrice = price[index] - (price[index] * discount);

        System.out.println("Product ID: " + prodId[index]);
        System.out.println("Product Name: " + prodName[index]);
        System.out.println("Original Price: " + price[index]);
        System.out.println("Final Price: " + finalPrice);
    }
}