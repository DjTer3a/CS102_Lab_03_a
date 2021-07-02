public class triangle extends shape{
    private int a,b,c;

    public triangle(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        setLocation(x, y);
    }

    public double getArea(){
        double s = (a+b+c)/2;
        double squaring = (s*(s-a)*(s-b)*(s-c));
        double Area = Math.sqrt(squaring);
        return Area;
    }

    public double getPerimeter(){
        double Perimeter;
        Perimeter = a+b+c;
        return Perimeter;
    }

    public String toString() {
        String string;
        string = this.getClass().getSimpleName()+ " has sides = " + a + " , "+b+" , "+c;

        
        if(selected){
            System.out.println("Shape selected");
        }
        else{
            System.out.println("Shape not selected");
        }
        return string;
    }

    public boolean contains(int x, int y){
        double w = Math.sqrt(Math.pow(x, 2)*Math.pow(y, 2));
        double s = (a+b+c)/2;
        double A1 = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        double s1 = (w+b+c)/2;
        double A2 = Math.sqrt((s1*(s1-w)*(s1-b)*(s1-c)));
        double s2 = (a+w+c)/2;;
        double A3 = Math.sqrt((s2*(s2-a)*(s2-w)*(s2-c)));
        double s3 = (a+b+w)/2;;
        double A4 = Math.sqrt((s3*(s3-a)*(s3-w)*(s3-c)));
        if( A1 == (A2+A3+A4) ){
            return true;
        }
        else {
            return false;
        }
    }

}
