import java.util.*;

public class shapeContainer {
    private ArrayList <shape> shapesContainer;


    public shapeContainer(){
        shapesContainer = new ArrayList <shape>();
    }

    public void add(shape s){
        shapesContainer.add(s);
    }

    public double getArea(){
        double Area=0;
        for(int a = 0; a < shapesContainer.size(); a++){
            Area += shapesContainer.get(a).getArea();
        }
        return Area;
    }

    public shape firstShape(int x, int y){
        for(int a = 0 ; a< shapesContainer.size(); a++){
            
            if( shapesContainer.get(a).contains(x,y) ){
            shapesContainer.get(a).setSelected(true);
            return shapesContainer.get(a);
            }
        }
        return null;

    }

    public void remove(){
        for(int a = 0 ; a< shapesContainer.size(); a++){
            if(shapesContainer.get(a).getSelected() == true){
                shapesContainer.remove(a);
            }
        }
    }
    
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
