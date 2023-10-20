package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
            System.out.print("");
        } else {
            int sum = 0;
            int sred = 0;
            int kolvo = 0;
            for (int i = 1; i <= sideLength; i++) {
                sum += i;
                kolvo += 1;
            }
            sred = sum / kolvo;
            for (int row = 0; row < sideLength; row++) {
                for (int col = 0; col < sideLength; col++) {
                    if (row == sred - 1) {
                        System.out.print("8");
                    } else {
                        if (col == sred - 1) {
                            System.out.print("8");
                        }
                        if (col != sideLength-1) {
                            System.out.print(" ");
                        } else break;
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
