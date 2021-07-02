public class triangle extends shape{
    private int a,b,c;

    public triangle(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getArea(){
        double s = (a+b+c)/2;
        double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return Area;
    }

    public double getPerimeter(){
        double Perimeter;
        Perimeter = a+b+c;
        return Perimeter;
    }



}
