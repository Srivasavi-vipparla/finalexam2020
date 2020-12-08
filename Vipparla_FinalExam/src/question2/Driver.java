/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author S540791
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating an array of five GeometricObjects
       
        GeometricObject[] go=new GeometricObject[5];
        go[0]=new Square(7,9);
        go[1]=new Square(10,20);
        go[2]=new Square(34.6,12.5);
        go[3]=new Square(15,18);
        go[4]=new Square(15,24.9);
        
        for(int i=0;i<go.length;i++){
            System.out.println("Area of go["+i+"]"+ " Object reference is :"+go[i].getArea());
            System.out.print("Invoking howtoColor():");
            go[i].howToColor();
        }
    }
    
}
