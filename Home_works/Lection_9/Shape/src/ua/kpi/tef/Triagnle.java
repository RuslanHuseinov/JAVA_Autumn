package ua.kpi.tef;

public class Triagnle extends Shape{
    private Point firstAngle;
    private Point secondAngle;
    private Point thirdAngle;
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triagnle(Point firstAngle, Point secondAngle, Point thirdAngle) throws IllegalArgumentException{
        correctTrianglePoints(firstAngle,secondAngle,thirdAngle);
        this.firstAngle = firstAngle;
        this.secondAngle = secondAngle;
        this.thirdAngle = thirdAngle;
        this.firstEdge= distanceBetweenPoints(firstAngle,secondAngle);
        this.secondEdge= distanceBetweenPoints(secondAngle,thirdAngle);
        this.thirdEdge = distanceBetweenPoints(thirdAngle,firstAngle);
    }
    public double distanceBetweenPoints(Point a, Point b){
        double distance = Math.sqrt(
                Math.pow((a.getX() - b.getX()),2) +
                Math.pow((a.getY() - b.getY()),2));
        return distance;
    }
    void correctTrianglePoints(Point firstAngle, Point secondAngle, Point thirdAngle) throws IllegalArgumentException{
        if (firstAngle.equals(secondAngle) || firstAngle.equals(thirdAngle) || secondAngle.equals(thirdAngle)){
            throw new IllegalArgumentException("cannot create triangle with two equals points");
        }
        if (firstEdge + secondEdge == thirdEdge
                || firstEdge + thirdEdge == secondEdge
                || secondEdge + thirdEdge == firstEdge){
            throw new IllegalArgumentException("cannot create triangle with three dots on the same line");
        }
    }

    @Override
    public double square() {
        double P2 = perimeter()/2;
        return Math.sqrt(P2 * (P2 - firstEdge) * (P2 - secondEdge) * (P2 - thirdEdge));
    }

    @Override
    public double perimeter() {
        return firstEdge + secondEdge + thirdEdge;
    }

    @Override
    public void move(double dx, double dy) {
    firstAngle.setX(firstAngle.getX() + dx);
    firstAngle.setY(firstAngle.getY() + dy);
    secondAngle.setX(secondAngle.getX() + dx);
    secondAngle.setY(secondAngle.getY() + dy);
    thirdAngle.setX(thirdAngle.getX() + dx);
    thirdAngle.setY(thirdAngle.getY() + dy);
    }

    @Override
    public String toString() {
        return "Triagnle{" +
                "firstAngle=" + firstAngle +
                ", secondAngle=" + secondAngle +
                ", thirdAngle=" + thirdAngle +
                '}';
    }
}
