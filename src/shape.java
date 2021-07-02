public abstract class shape implements Locatable,Selectable{

    int x = 0 , y = 0;
    boolean selected;

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean contains(int x, int y);

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setLocation(int x, int y) {
        this.x =x;
        this.y=y;       
    }

    public boolean getSelected(){
        return selected;
    }

    public void setSelected(boolean selected){
        this.selected = selected;
    }


}
