public class Triangle{
  private Point v1,v2,v3;


  public Triangle(Point p1, Point p2, Point p3){
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }
  public Triangle(double x1 , double y1, double x2, double y2, double x3, double y3){
    Point v1 = new Point(x1,y1);
    Point v2 = new Point(x2,y2);
    Point v3 = new Point(x3,y3);
  }
  public double getPerimeter(){
    return Point.distance(v1,v2) + Point.distance(v2,v3) + Point.distance(v3,v1);
  }
  public String toString(){
    return "Triangle : " + "A(" + v1.getX() + "," + v1.getY() + ")" + "B(" + v2.getX() + "," + v2.getY() + ") " + "C(" + v3.getX() + "," + v3.getY() + ")";
  }
  public Point getVertex(int n){
    if (n == 0){
       return v1.copy();
    }
    else if (n == 1){
       return v2.copy();
    }
     return v3.copy();

  }
  public void setVertex(int n, Point p){
    if (n == 0){
      v1 = p.copy();
    }
    if (n == 1){
      v2 = p.copy();
    }
    if (n == 2){
      v3 = p.copy();
    }
  }
}
