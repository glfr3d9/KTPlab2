public class Point3d extends p2d{

    //Объявление переменных
    private double zCoord;

    //Конструктор инициализации
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    //Конструктор по умолчанию
    public Point3d () {
        this(0.0 , 0.0, 0.0);
    }

    //Возвращение координаты Z
    public double getZ () {
        return zCoord;
    }

    //Установка значения координаты Z
    public void setZ ( double val) {
        zCoord = val;
    }

    //Сравнение двух объектов
    public boolean Compare(Point3d object, Point3d object1) {
        return (object.getX()==object1.getX() && object.getY()==object1.getY() && object.getZ()==object1.getZ());
    }
    //Вычисление расстояния между точками
    public double distanceTo(Point3d object, Point3d object1){

        /*double x = object.getX();
         double y = object.getY();
         double z = object.getZ();
         double x1 = object1.getX();
         double y1 = object1.getY();
         double z1 = object1.getZ();*/

        double distance = Math.sqrt(Math.pow(object1.getX()-object.getX(), 2)+Math.pow(object1.getY()-object.getY(), 2)+Math.pow(object1.getZ()-object.getZ(), 2));
        return distance;
    }
}
