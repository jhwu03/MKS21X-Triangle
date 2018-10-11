public class TriangleDriver{
  public static void main(String [] args){
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,3);
    Point p3 = new Point(4,7);
    Triangle t1 = new Triangle(p1, p2, p3);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getVertex(0));
    System.out.println(t1.getVertex(1));
    System.out.println(t1.getVertex(2));
    System.out.println(p1.getX());
    System.out.println(p2.getX());
    System.out.println(p3.getX());
    t1.setVertex(0, p3);
    System.out.println(t1.getVertex(0));
    System.out.println(t1);
  }
}
