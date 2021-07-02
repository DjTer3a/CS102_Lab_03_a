public class rectangle extends shape{
    

    private int Height,Width;


    public rectangle(int Height, int Width ){
        this.Height=Height;
        this.Width=Width;
        setLocation(x, y);
    }

    public double getArea( ){
        double Area;
        Area = Height*Width;
        return Area;
    }

    public double getPerimeter(){
        double Perimeter;
        Perimeter = 2*(Width+Height);
        return Perimeter;
    }

    public int getHeight(){
        return Height;
    }

    public int getWidth(){
        return Width;
    }

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

    public boolean contains(int x, int y){
        if( getX()<=x && x <= (getX() + Width) && getY() <=y && y <= (getY()+Height)){
            return true;
        }
        else {
            return false;
        }
    }

}
