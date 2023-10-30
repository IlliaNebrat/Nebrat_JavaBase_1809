package illia.nebrat.homework.point;

public class PointRun {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(3, 4);

        System.out.println("firstPoint: " + firstPoint);
        System.out.println("secondPoint: " + secondPoint);

        System.out.println("Distance from firstPoint to secondPoint: " + firstPoint.distanceTo(secondPoint));
        System.out.println("Distance between firstPoint and secondPoint: " + Point.distanceBetween(firstPoint, secondPoint));

        System.out.println("firstPoint equals secondPoint? " + firstPoint.equals(secondPoint));

        Point copyOfFirstPoint = firstPoint.clone();
        System.out.println("copyOfFirstPoint: " + copyOfFirstPoint);
    }
}
