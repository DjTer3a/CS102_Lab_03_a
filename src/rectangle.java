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

public class rectangle extends shape{
    
    //Properties
    private int Height,Width;


    //Constructor
    public rectangle(int Height, int Width ){
        this.Height=Height;
        this.Width=Width;
        setLocation(x, y);
    }


    /**
     * method to get the area of the shape.
     *  @return double  
     */
    public double getArea( ){
        double Area;
        Area = Height*Width;
        return Area;
    }


    /**
     * method to get the perimeter of the shape.
     *  @return double  
     */
    public double getPerimeter(){
        double Perimeter;
        Perimeter = 2*(Width+Height);
        return Perimeter;
    }

    
    /**
     * method to get the height of the shape.
     *  @return int  
     */
    public int getHeight(){
        return Height;
    }


    /**
     * method to get the width of the shape.
     *  @return int  
     */
    public int getWidth(){
        return Width;
    }


    /**
     * method to get the string representation of the shape.
     *  @return String  
     */
    public String toString() {
        String string;


        if(selected){
            System.out.println("Shape selected");
        }
        else{
            System.out.println("Shape not selected");
        }
        string = this.getClass().getSimpleName()+ " has co-ordinates of "+x+" and "+y+  ", Height = " + Height + " and Width = " + Width;
        return string;
    }

    
    /**
     * method to check if co-ordinates contained in the shape.
     *  @return boolean  
     */
    public boolean contains(int x, int y){
        if( getX()<=x && x <= (getX() + Width) && getY() <=y && y <= (getY()+Height)){
            return true;
        }
        else {
            return false;
        }
    }

}
