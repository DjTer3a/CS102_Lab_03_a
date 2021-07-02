import java.util.*;


public class shapeTester {
    public static void main( String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int choice, choice2, temp, temp1, temp2;
        shapeContainer container = null;
        rectangle rectangle;
        circle circle;
        triangle triangle;
        square square;
            

    
        do{
            choice = 0;
            System.out.println("Press 1 to create container");
            System.out.println("Press 2 to add a shape");
            System.out.println("Press 3 to print container");
            System.out.println("Press 4 to EXIT");
            choice = scan.nextInt();

            if(choice == 1){
                container = new shapeContainer();
            }

            if(choice == 2){
                do{
                    System.out.println("Press 1 for Rectangle");
                    System.out.println("Press 2 for Square");
                    System.out.println("Press 3 for Circle");
                    System.out.println("Press 4 for Triangle");
                    System.out.println("Press 5 for Menu");
                    choice2 = scan.nextInt();

                    if(choice2 == 1){
                        System.out.println("Enter height of Rectangle");
                        temp = scan.nextInt();
                        System.out.println("Enter width of Rectangle");
                        temp1 = scan.nextInt();
                        rectangle = new rectangle(temp, temp1);
                        container.add(rectangle);
                    }

                    else if(choice2 == 2){
                        System.out.println("Enter side of Square");
                        temp = scan.nextInt();
                        square = new square(temp);
                        container.add(square);
                    }

                    else if(choice2 == 3){
                        System.out.println("Enter radius of Circle");
                        temp = scan.nextInt();
                        circle = new circle(temp);
                        container.add(circle);
                    }
                    else if(choice2 == 4){
                        System.out.println("Enter first side of Triangle");
                        temp = scan.nextInt();
                        System.out.println("Enter second side of Triangle");
                        temp1 = scan.nextInt();
                        System.out.println("Enter third side of Triangle");
                        temp2 = scan.nextInt();
                        triangle = new triangle(temp,temp1,temp2);
                        container.add(triangle);
                    }

                    
                }while(choice2 != 5);
            }
            if(choice == 3){
                if(container.getArea() != 0){
                    System.out.println("The total surface area of the shapes are :" + container.getArea());
                }
                else{
                    System.out.println("Total Surface area = 0");
                }
            }
        }
        while(choice != 4); 



        scan.close();
    }

}
