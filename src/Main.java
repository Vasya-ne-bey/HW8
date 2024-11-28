public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};
        double[] fractions = {1.57, 7.654, 9.986};
        int[] cucumbers = {12, 15, 22};
        System.out.println("Задание 2");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = 0; i < fractions.length; i++) {
            if (i == fractions.length - 1) {
                System.out.println(fractions[i]);
                break;
            }
            System.out.print(fractions[i] + ", ");
        }
        for (int i = 0; i < cucumbers.length; i++) {
            if (i == cucumbers.length - 1) {
                System.out.println(cucumbers[i]);
                break;
            }
            System.out.print(cucumbers[i] + ", ");
        }
        System.out.println("Задание 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = fractions.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(fractions[i]);
                break;
            }
            System.out.print(fractions[i] + ", ");
        }
        for (int i = cucumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(cucumbers[i]);
                break;
            }
            System.out.print(cucumbers[i] + ", ");
        }
        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                numbers[i] = numbers[i] + 1;
            }
            System.out.print(numbers[i] + ", ");
        }
    }
}

    }
            }