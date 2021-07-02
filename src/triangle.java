public class triangle extends shape{
    private int ax,bx,cx,ay,by,cy;

    public triangle(int ax,int ay, int bx, int by,int cx, int cy){
        this.ax=ax;
        this.bx=bx;
        this.cx=cx;
        this.ay=ay;
        this.by=by;
        this.cy=cy;
        setLocation(x, y);
    }

    public double getArea(int ax,int ay, int bx, int by,int cx, int cy){
        double Area = ((ax*by)+(bx*cy)+(cx*ay)-(ax*cy)-(bx*ay)-(cx*by))/2;
        return Area;
    }

    public double getPerimeter(){
        double Perimeter;
        double ab,bc,ac;
        ab=Math.sqrt(Math.pow((bx-ax),2) + Math.pow((by-ay),2));
        bc=Math.sqrt(Math.pow((bx-cx),2) + Math.pow((by-cy),2));
        ac=Math.sqrt(Math.pow((ax-cx),2) + Math.pow((ay-cy),2));
        Perimeter = ab+bc+ac;
        return Perimeter;
    }

    public String toString() {
        String string;
        double ab,bc,ac;
        ab=Math.sqrt(Math.pow((bx-ax),2) + Math.pow((by-ay),2));
        bc=Math.sqrt(Math.pow((bx-cx),2) + Math.pow((by-cy),2));
        ac=Math.sqrt(Math.pow((ax-cx),2) + Math.pow((ay-cy),2));
        
        string = this.getClass().getSimpleName() + " has co-ordinates of "+x+" and "+y+  " has sides = " + ab + " , "+bc+" , "+ac;

        
        if(selected){
            System.out.println("Shape selected");
        }
        else{
            System.out.println("Shape not selected");
        }
        return string;
    }



    public boolean contains(int x, int y){
        double A = getArea(ax,ay, bx, by,cx, cy);
        double A1 = getArea(x,y, bx, by,cx, cy);
        double A2 = getArea(ax,ay, x, y,cx, cy);
        double A3 = getArea(ax,ay, bx, by,x, y);
        return (A == A1+A2+A3);
    }

    // public boolean contains(int x, int y){
    //     double w = Math.sqrt(Math.pow(x, 2)*Math.pow(y, 2));
    //     double s = (a+b+c)/2;
    //     double A1 = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    //     double s1 = (w+b+c)/2;
    //     double A2 = Math.sqrt((s1*(s1-w)*(s1-b)*(s1-c)));
    //     double s2 = (a+w+c)/2;;
    //     double A3 = Math.sqrt((s2*(s2-a)*(s2-w)*(s2-c)));
    //     double s3 = (a+b+w)/2;;
    //     double A4 = Math.sqrt((s3*(s3-a)*(s3-w)*(s3-c)));
    //     if( A1 == (A2+A3+A4) ){
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }

}
