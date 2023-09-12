public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i < 1000) {
            boolean multipleOfThree = i % 3 == 0;
            boolean multipleOfFive = i % 5 == 0;

            if (multipleOfThree || multipleOfFive) {
                count++;
            }
            i++;
        }
    System.out.println(count);
    }
}

