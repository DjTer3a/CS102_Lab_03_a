public class circle extends shape{

    private int Radius;

    public circle(int Radius){
        this.Radius=Radius;
        setLocation(x, y);
    }

    public double getArea(){
        double Area;
        Area =  Math.PI * Math.pow(Radius, 2);
        return Area;
    }

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
        string = this.getClass().getSimpleName()+ " has co-ordinates of "+x+" and "+y+ " has Radius = " + Radius;


        if(selected){
            System.out.println("Shape selected");
        }
        else{
            System.out.println("Shape not selected");
        }
        return string;
    }

    public boolean contains(int x, int y){
        if( getX()<=x && x <= (getX() + Radius) && getY() <=y && y <= (getY()+Radius) && x >= (getX() - Radius) && y >= (getY()-Radius)){
            return true;
        }
        else {
            return false;
        }
    }


}
