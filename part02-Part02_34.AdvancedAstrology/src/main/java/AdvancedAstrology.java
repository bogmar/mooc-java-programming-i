
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spacesCount = size - 1;
        int starsCount = size - spacesCount;
        
        for (int line = 0; line < size; line++) {
            printSpaces(spacesCount);
            spacesCount--;
            printStars(starsCount);
            starsCount++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
          1
        1 + 2
        3 + 2
        5 + 2 vuv for
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
