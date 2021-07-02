public class circle extends shape{

    private int Radius;

    public circle(int Radius){
        this.Radius=Radius;
    }

    // public double getArea(){
    //     double Area;
    //     Area =  Math.PI * Math.pow(Radius, 2);
    //     return Area;
    // }

    public double getPerimeter(){
        double Perimeter;
        Perimeter = 2 * Math.PI * Radius;
        return Perimeter;
    }

    public int getRadius(){
        return Radius;
    }
    
    public String toString() {
        String string;
        string = this.getClass().getSimpleName()+ " has Radius = " + Radius;
        return string;
    }

}
