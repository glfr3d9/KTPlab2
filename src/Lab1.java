public class Lab1 {

    public static void main(String[] args) {

        Point3d point = new Point3d();

        //Создание трех объектов
        Point3d myPoint = new Point3d(Double.valueOf(args[0]),Double.valueOf(args[1]),Double.valueOf(args[2]));
        Point3d mySecondPoint = new Point3d(Double.valueOf(args[3]),Double.valueOf(args[4]),Double.valueOf(args[5]));
        Point3d myThirdPoint = new Point3d(Double.valueOf(args[6]),Double.valueOf(args[7]),Double.valueOf(args[8]));

        System.out.println("Coord of first point (" + myPoint.getX()+"; " + myPoint.getY()+"; " + myPoint.getZ()+")");
        System.out.println("Coord of second point (" + mySecondPoint.getX()+"; " + mySecondPoint.getY()+"; " + mySecondPoint.getZ()+")");
        System.out.println("Coord of third point (" + myThirdPoint.getX()+"; " + myThirdPoint.getY()+"; " + myThirdPoint.getZ()+")");

        //Проверка одинаковых точек
        if (point.Compare(myPoint, mySecondPoint)|| point.Compare(mySecondPoint, myThirdPoint)||point.Compare(myPoint, myThirdPoint)){
            System.out.println("The coordinates of the points are equal. Enter different values");
        }
        else{
            double S = computerArea(myPoint, mySecondPoint, myThirdPoint);
            System.out.print("Area of a triangle = " + String.format("%.2f %n", S));
        }
    }
    //Площадь треугольника
    public static double computerArea(Point3d object, Point3d object1, Point3d object2){
        Point3d point = new Point3d();
        System.out.println("Intermediate values:");
        double AB = point.distanceTo(object, object1);
        System.out.print(String.format("AB= "+"%.2f %n", AB));
        double BC = point.distanceTo(object1, object2);
        System.out.print(String.format("BC= "+"%.2f %n", BC));
        double CA = point.distanceTo(object2, object1);
        System.out.print(String.format("CA= "+"%.2f %n", CA));
        double p = (AB+BC+CA)/2;
        System.out.print("p =" + String.format("%.2f %n", p));
        double S = Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
        return S;
    }
}