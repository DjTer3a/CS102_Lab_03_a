import java.util.*;

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

 
public class shapeContainer {
    private ArrayList <shape> shapesContainer;


    //constructor  
    public shapeContainer(){
        shapesContainer = new ArrayList <shape>();
    }

    /**
     * method to add the shape.
     *  @return double  
     */
    public void add(shape s){
        shapesContainer.add(s);
    }


    /**
     * method to get the area of the shapes.
     *  @return double  
     */
    public double getArea(){
        double Area=0;
        for(int a = 0; a < shapesContainer.size(); a++){
            Area += shapesContainer.get(a).getArea();
        }
        return Area;
    }

     /**
     * method to get the first shape.
     *  @return shape  
     */
    public shape firstShape(int x, int y){
        for(int a = 0 ; a< shapesContainer.size(); a++){
            
            if( shapesContainer.get(a).contains(x,y) ){
            shapesContainer.get(a).setSelected(true);
            return shapesContainer.get(a);
            }
        }
        return null;

    }


     /**
     * method to remove the selected shape.
     *  @return void  
     */
    public void remove(){
        for(int a = 0 ; a< shapesContainer.size(); a++){
            if(shapesContainer.get(a).getSelected() == true){
                shapesContainer.remove(a);
            }
        }
    }


     /**
     * method to get the string representation of the shape.
     *  @return String  
     */
    public String toString() {
        String string = "";
        int idx = 0;

        for (int a = 0; a <shapesContainer.size(); a++){
            string += "Shape at the index : "+idx+" is a "+shapesContainer.get(a).toString()+ "  ";
            idx++;
        }
        return string;
    }
}
