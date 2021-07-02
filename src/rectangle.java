public class rectangle extends shape{
    

    private int Height,Width;


    public rectangle(int Height, int Width ){
        this.Height=Height;
        this.Width=Width;

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
        string = this.getClass().getSimpleName()+ ", Height = " + Height + " and Width = " + Width;
        return string;
    }

}
