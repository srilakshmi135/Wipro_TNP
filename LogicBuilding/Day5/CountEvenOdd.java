package LogicBuilding.Day5;

public class CountEvenOdd {

    public static int countEvenOdd(int[] arr, boolean even) {

        int count = 0;

        for (int num : arr) {

            if (even) {
                if (num % 2 == 0)
                    count++;
            } else {
                if (num % 2 != 0)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 5, 8, 7, 10};

        System.out.println("Even Count : " +
                countEvenOdd(numbers, true));

        System.out.println("Odd Count : " +
                countEvenOdd(numbers, false));
    }
}