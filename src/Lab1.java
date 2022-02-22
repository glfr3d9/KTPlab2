public class Lab1 {

    //Вывод
    public static void main(String[] args) {
        Point3d myPoint = new Point3d();

    }
    //Площадь треугольника
    public static double computerArea(Point3d object, Point3d object1, Point3d object2){
        Point3d point = new Point3d();
        double AB = point.distanceTo(object, object1);
        double BC = point.distanceTo(object1, object2);
        double CA = point.distanceTo(object2, object1);
        double p = 1/2*(AB+BC+CA);
        double S = Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
        return S;
    }
}