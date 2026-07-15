package LogicBuilding.Day9;

public class CreatePIN {

    static int createPin(int a, int b, int c) {

        int pin = 0;
        int place = 1;

        while (a > 0 || b > 0 || c > 0) {

            int d1 = a % 10;
            int d2 = b % 10;
            int d3 = c % 10;

            int max = Math.max(d1, Math.max(d2, d3));

            pin += max * place;

            place *= 10;

            a /= 10;
            b /= 10;
            c /= 10;
        }

        return pin;
    }

    public static void main(String[] args) {

        System.out.println(createPin(1234, 5678, 2456));
    }
}