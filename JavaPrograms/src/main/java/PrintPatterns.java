public class PrintPatterns {

    static int rows = 8;

    public static void main(String[] args) {
        //rightTriangleStarPattern();
        //leftTriangleStarPattern();
        //pyramidStarPattern();
        //diamondStarPattern();
        //downwardTriangleStarPattern();
        //mirroredRightTriangleStarPattern();
        //reversePyramidStarPattern();
        //rightDownMirrorStarPattern();
        //rightPascalsTriangle();
        //leftPascalsTriangle();
        sandglassStarPattern();
    }

    static void rightTriangleStarPattern() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void leftTriangleStarPattern() {
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i - 2; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pyramidStarPattern() {
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void diamondStarPattern() {
        for (int i = 0; i <= rows; i++) {
            if (i <= (int) rows / 2) {
                for (int j = rows - i; j > 1; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = rows + i - 1; j > rows; j--) {
                    System.out.print(" ");
                }
                for (int k = rows; k >= i; k--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void downwardTriangleStarPattern() {
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void mirroredRightTriangleStarPattern() {
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void reversePyramidStarPattern() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = rows - i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightDownMirrorStarPattern() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightPascalsTriangle() {
        for (int i = 0; i <= rows; i++) {
            if (i <= (int) rows / 2) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = rows - i; j >= 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void leftPascalsTriangle() {
        for (int i = 0; i <= rows; i++) {
            if (i <= (int) rows / 2) {
                for (int j = rows - i; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k <= i; k++) {
                    System.out.print(" ");
                }
                for (int j = rows - i; j >= 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void sandglassStarPattern() {
        for (int i = 0; i < rows * 2 - 1; i++) {
            if (i < rows) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = rows - i; k > 0; k--) {
                    System.out.print("* ");
                }
            } else {
                for (int j = rows * 2 - i - 2; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i - rows + 1; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
