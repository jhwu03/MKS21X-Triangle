public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point p){
    double ansx = 0.0;
    double ansy = 0.0;
    if( this.x - p.x < 0){
      ansx = (this.x - p.x) * -1;
    }
    else{ansx = this.x - p.x; }
    if( this.y - p.y < 0){
      ansy = (this.y - p.y) * -1;
    }
    else{ansy = this.y - p.y; }
    return Math.sqrt((ansx*ansx)+(ansy*ansy));
  }

  public static double distance(Point p1, Point p2){
    double ansx = 0.0;
    double ansy = 0.0;
    if( p1.x - p2.x < 0){
      ansx = (p1.x - p2.x) * -1;
    }
    else{ansx = p1.x - p2.x; }
    if( p1.y - p2.y < 0){
      ansy = (p1.y - p2.y) * -1;
    }
    else{ansy = p1.y - p2.y; }
    return Math.sqrt((ansx*ansx)+(ansy*ansy));
  }

  public Point copy(){
    return new Point(x,y);
  }
  public String toString(){
    return "xcor:" + x +" ycor:" + y;
  }
}
