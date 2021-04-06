package com.company;
/**
 * Трёхмерный класс точки.
 **/
public class Point3d {
        private double xCoord;  /** координата X **/
        private double yCoord;  /** координата Y **/
        private double zCoord;  /** координата Z **/
        /** Конструктор инициализации **/
        public Point3d ( double x, double y, double z) {
            xCoord = x;
            yCoord = y;
            zCoord = z;
        }
    /** Конструктор по умолчанию **/
    public Point3d () {
        //Вызовите конструктор с тремя параметрами и определите источник.
        this(0, 0, 0);
    }
    /** Возвращение координаты Х **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты X **/
    public void setX ( double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y **/
    public void setY ( double val) {
        yCoord = val;
    }
    /** Установка значения координаты z **/
    public void setZ ( double val) {
        zCoord = val;
    }
    // Вычисление расстояния между двумя точками
    public double distanceTo(Point3d point) {
        return (double)

                Math.sqrt(Math.pow(this.getX() - point.getX(), 2) +
                        Math.pow(this.getY() - point.getY(), 2) +
                        Math.pow(this.getZ() - point.getZ(), 2));
    }

    // Сравнение двух точек
    public boolean comparePoints(Point3d point) {
        if (this.getX() == point.getX() & this.getY() == point.getY() & this.getZ() == point.getZ()) {
            return true;
        } else return false;
    }
}

