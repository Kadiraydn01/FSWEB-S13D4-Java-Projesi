package com.WorkinTech.Point;

public class Point {
     private int x;

     private int y;

     public Point(int x , int y){
         this.x = x;
         this.y = y;
     };
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt( x * x + y * y);
    }
    public double distance(Point p){
      int px = this.x - p.x;
      int py = this.y - p.y;

      return Math.sqrt(px * px + py * py);
    }
    public double distance(int A , int B){
        int px = this.x - A;
        int py = this.y - B;

        return Math.sqrt(px *px + py * py);
    }
    public void setY(int y) {
        this.y = y;
    }


}
