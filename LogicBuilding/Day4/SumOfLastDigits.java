package LogicBuilding.Day4;

public class SumOfLastDigits {

    public static int addLastDigits(int input1, int input2) {

        if (input1 < 0)
            input1 = -input1;

        if (input2 < 0)
            input2 = -input2;

        return (input1 % 10) + (input2 % 10);
    }

    public static void main(String[] args) {

        int input1 = -267;
        int input2 = 154;

        System.out.println(addLastDigits(input1, input2));
    }
}