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

public abstract class shape implements Locatable,Selectable{

    int x = 0 , y = 0;
    boolean selected;

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean contains(int x, int y);

    /**
     * method to get x.
     *  @return int  
     */
    public int getX(){
        return x;
    }


     /**
     * method to get y.
     *  @return int  
     */
    public int getY(){
        return y;
    }

     /**
     * setter method.
     *  @return void  
     */
    public void setLocation(int x, int y) {
        this.x =x;
        this.y=y;       
    }


     /**
     * method to get selected shape.
     *  @return boolean  
     */
    public boolean getSelected(){
        return selected;
    }


    /**
     * method to set selected shape.
     *  @return void  
     */
    public void setSelected(boolean selected){
        this.selected = selected;
    }


}
