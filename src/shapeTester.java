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

public class shapeTester {
    public static void main( String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int choice, choice2, temp, temp1, temp2,temp3,temp4,temp5,x,y,x1,y1,x2,y2,x3,y3,x4,y4;
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
            System.out.println("Press 4 to print the container details");
            System.out.println("Press 5 to get details of the first shape from coordinates");
            System.out.println("Press 6 to delete a shape");
            System.out.println("Press 7 to EXIT");
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
                        System.out.println("Enter the x- axis co-ordinate of the Rectangle");
                        x1 = scan.nextInt();
                        System.out.println("Enter the y- axis co-ordinate of the Rectangle");
                        y1 = scan.nextInt();
                        rectangle = new rectangle(temp, temp1);
                        rectangle.setLocation(x1, y1);
                        container.add(rectangle);
                    }

                    if(choice2 == 2){
                        System.out.println("Enter side of Square");
                        temp = scan.nextInt();
                        System.out.println("Enter the x- axis co-ordinate of Square");
                        x2 = scan.nextInt();
                        System.out.println("Enter the y- axis co-ordinate of the Square");
                        y2 = scan.nextInt();
                        square = new square(temp);
                        square.setLocation(x2, y2);
                        container.add(square);
                    }

                    if(choice2 == 3){
                        System.out.println("Enter radius of Circle");
                        temp = scan.nextInt();
                        System.out.println("Enter the x- axis co-ordinate of Triangle");
                        x3 = scan.nextInt();
                        System.out.println("Enter the y- axis co-ordinate of the Triangle");
                        y3 = scan.nextInt();

                        circle = new circle(temp);
                        circle.setLocation(x3, y3);
                        container.add(circle);
                    }
                    if(choice2 == 4){
                        System.out.println("Enter x of  first side of Triangle");
                        temp = scan.nextInt();
                        System.out.println("Enter y of first side of Triangle");
                        temp1 = scan.nextInt();
                        System.out.println("Enter x of second side of Triangle");
                        temp2 = scan.nextInt();
                        System.out.println("Enter y of second side of Triangle");
                        temp3 = scan.nextInt();
                        System.out.println("Enter x of third side of Triangle");
                        temp4 = scan.nextInt();
                        System.out.println("Enter y of third side of Triangle");
                        temp5 = scan.nextInt();
                        
                        System.out.println("Enter the x- axis co-ordinate of Triangle");
                        x4 = scan.nextInt();
                        System.out.println("Enter the y- axis co-ordinate of the Triangle");
                        y4 = scan.nextInt();



                        triangle = new triangle(temp,temp1,temp2,temp3,temp4,temp5);
                        triangle.setLocation(x4, y4);
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

            if (choice == 4){
                System.out.println(container.toString());
            }

            if (choice == 5){
                System.out.println("Enter x -  axis co-ordinate value");
                x =scan.nextInt();
                System.out.println("Enter y -  axis co-ordinate value");
                y =scan.nextInt();
                if (container.firstShape(x, y) == null){
                    System.out.println("Choose other co-ordinates");
                }
                else{
                    System.out.println(container.firstShape(x, y).toString()); 
                }
            }

            if (choice == 6){
                container.remove();
                System.out.println("You deleted the shape");
            
            
            }
        }
        while(choice != 7); 



        scan.close();
    }

}
