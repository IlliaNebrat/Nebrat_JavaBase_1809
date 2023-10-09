package illia.nebrat.homework.shuttle;

public class JapaneseShuttle {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; count < 100; i++) {
            int number = i;
            boolean hasFourOrNine = false;
            while (number > 0) {
                if (number % 10 == 4 || number % 10 == 9) {
                    hasFourOrNine = true;
                    break;
                }
                    number = number / 10;
            }
            if (hasFourOrNine) {
                continue;
            }
            System.out.println(i);
            count++;
        }
    }
}
