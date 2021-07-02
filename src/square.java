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


public class square extends rectangle{
    private int length;


    //Constructor
    public square(int length){
        super(length, length);
        this.length=length;
        setLocation(x, y);
    }


    /**
     * method to get the area of the shape.
     *  @return double  
     */
    public double getArea(){
        return super.getArea();
    }


    /**
     * method to get the perimeter of the shape.
     *  @return double  
     */
    public double getPerimeter(){
        double Perimeter;
        Perimeter = 4 * length;
        return Perimeter;
    }


    /**
     * method to get the length of the shape.
     *  @return int  
     */
    public int getSideLength(){
        return length;  
    }


    /**
     * method to get the string representation of the shape.
     *  @return String  
     */
    public String toString() {
        String string;
        string = this.getClass().getSimpleName() + " has co-ordinates of "+x+" and "+y+ " has  length = " + length;

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
        if( getX()<=x && x <= (getX() + length) && getY() <=y && y <= (getY()+length)){
            return true;
        }
        else {
            return false;
        }
    }

}
