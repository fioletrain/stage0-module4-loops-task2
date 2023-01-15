package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 3;
        if (printToInclusive == 0) {
        } else {
            if (printToInclusive >= 7) {
                System.out.println(2);
                System.out.println(3);
                System.out.println(5);
                System.out.println(7);
            } else if (printToInclusive == 5 || printToInclusive == 6) {
                System.out.println(2);
                System.out.println(3);
                System.out.println(5);
            } else if (printToInclusive == 3 || printToInclusive == 4) {
                System.out.println(2);
                System.out.println(3);
            } else {
                System.out.println(2);
            }
            while (counter <= printToInclusive) {
                if ((counter % 2 != 0) && (counter % 3 != 0) && (counter % 5 != 0) && (counter % 7 != 0)) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}
