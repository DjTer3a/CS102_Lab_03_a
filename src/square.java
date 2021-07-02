public class square extends rectangle{
    private int length;

    public square(int length){
        super(length, length);
        this.length=length;
        setLocation(x, y);
    }

    public double getArea(){
        return super.getArea();
    }

    public double getPerimeter(){
        double Perimeter;
        Perimeter = 4 * length;
        return Perimeter;
    }

    public int getSideLength(){
        return length;  
    }


    public String toString() {
        String string;
        string = this.getClass().getSimpleName()+ " has  length = " + length;

        if(selected){
            System.out.println("Shape selected");
        }
        else{
            System.out.println("Shape not selected");
        }
        return string;
    }

    public boolean contains(int x, int y){
        if( getX()<=x && x <= (getX() + length) && getY() <=y && y <= (getY()+length)){
            return true;
        }
        else {
            return false;
        }
    }

}
