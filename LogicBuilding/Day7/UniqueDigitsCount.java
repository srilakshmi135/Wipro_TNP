package LogicBuilding.Day7;

public class UniqueDigitsCount {

    static int uniqueDigits(int n) {

        n = Math.abs(n);

        boolean[] visited = new boolean[10];

        int count = 0;

        if (n == 0)
            return 1;

        while (n > 0) {

            int digit = n % 10;

            if (!visited[digit]) {

                visited[digit] = true;
                count++;
            }

            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(uniqueDigits(122334455));
    }
}