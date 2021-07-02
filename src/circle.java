/**
 * Lab03a Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 02/07/2021
 */
public class circle extends shape{

    //Properties
    private int Radius;

    //Constructor
    public circle(int Radius){
        this.Radius=Radius;
        setLocation(x, y);
    }

    /**
     * method to get the area of the shape.
     *  @return double  
     */
    public double getArea(){
        double Area;
        Area =  Math.PI * Math.pow(Radius, 2);
        return Area;
    }


    /**
     * method to get the perimeter of the shape.
     *  @return double  
     */
    public double getPerimeter(){
        double Perimeter;
        Perimeter = 2 * Math.PI * Radius;
        return Perimeter;
    }

    /**
     * method to get the radius of the shape.
     *  @return int  
     */
    public int getRadius(){
        return Radius;
    }
    

    /**
     * method to get the string representation of the shape.
     *  @return String  
     */
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


    /**
     * method to check if co-ordinates contained in the shape.
     *  @return boolean  
     */
    public boolean contains(int x, int y){
        if( getX()<=x && x <= (getX() + Radius) && getY() <=y && y <= (getY()+Radius) && x >= (getX() - Radius) && y >= (getY()-Radius)){
            return true;
        }
        else {
            return false;
        }
    }


}
