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
    
    public String toString() {
        String string = "";
        int idx = 0;

        for (int a = 0; a <shapesContainer.size(); a++){
            string += "Shape at the index : "+idx+" is a "+shapesContainer.get(a).toString();
        }
        return string;
    }
}
