public class prob5 {
    public static void main(String[] args) {
        printTables(10);

    }

    public static void printTables(int square) {
        int size = square;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(" " + j * i + " ");
            }
            System.out.println();
        }
    };

    public static void printTables() {
        int size = 10;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(" " + j * i + " ");
            }
            System.out.println();
        }
    };

}