package illia.nebrat.homework.parallelepiped;

public class Parallelepiped {
    public static void main(String[] args) {
        double A = 5.0;
        double B = 6.0;
        double C = 7.0;

        double volume = A * B * C;
        System.out.println("Parallelepiped volume = " + volume);

        double length = 4 * (A + B + C);
        System.out.println("Parallelepiped length = " + length);
    }
}
