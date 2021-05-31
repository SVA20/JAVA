package laba2;


public class Point3d extends Point2d {

    private double zCoord;
//заимствование значений из род. класса
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    public Point3d(){
        this(0.0, 0.0, 0.0);
    }
//получение значения
    public double getZ() {
        return zCoord;
    }
//установка значения
    public void setZ(double val) {
        zCoord = val;
    }
// вычисление расстояния между двумя точками
    public double distanceTo(Point3d point) {

               double distance = Math.sqrt(Math.pow(this.getX() - point.getX(), 2) +
                        Math.pow(this.getY() - point.getY(), 2) +
                        Math.pow(this.getZ() - point.getZ(), 2));
        return distance;
    }
//сравнение точек
    public boolean comparePoints(Point3d point) {
        if (this.getX() == point.getX() & this.getY() == point.getY() & this.getZ() == point.getZ()) {
            return true;
        } else return false;
    }
}
