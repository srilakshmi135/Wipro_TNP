package LogicBuilding.Day9;

public class HillPatternWeight {

    static int hillWeight(int rows) {

        int weight = 0;

        for (int i = 1; i <= rows; i++) {
            weight += i;
        }

        for (int i = rows - 1; i >= 1; i--) {
            weight += i;
        }

        return weight;
    }

    public static void main(String[] args) {

        int rows = 5;

        System.out.println("Weight = " + hillWeight(rows));
    }
}