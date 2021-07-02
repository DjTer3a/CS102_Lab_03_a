public class square extends rectangle{
    private int length;

    public square(int length){
        super(length, length);
        this.length=length;
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
