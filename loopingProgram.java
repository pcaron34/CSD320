/*
Paul Caron
4-9-22
Module 5 Assignment
*/

public class loopingProgram{
    
    public static void main(String[] args){
        // Set i to the number one
        int i = 1;
        // method to add space between lines
        pl();
        // while true iterate j and i to 99
        while(i < 99){
            int j = 1;
            i = i + 2;
            // print j / i and add a plus sign
            System.out.print(j + "/" + i + " + ");
            }
            pl();
            pl();
            System.out.println("1/" + i * i);
        pl();
                
        
        
        // line space    
        pl();
        // line space
        pl();
        // print j over 99 and add + did this because I couldn't figure out how to do it the correct way
        System.out.print(1 + "/" + 99 + " + ");
        // while i is greater than 3 iterate j and i back down to 3
        while(i > 3){
            int j = 1;
            i = i - 2;
            // print j and i and a plus sign also couldn't figure out how to get rid of the last + sign, tried everything I could find to try and work it out but couldn't and ran out of time
            System.out.print(j + "/" + i  + " + ");
            }
            pl();
            pl();
            System.out.println("1/" + i / i); 
        // line space
        pl();
        // line space
        pl();

        
       

        


    }    
        
        
    // method to make println easier to enter without having to type the whole thing over and over and over again
    static void pl(){
        System.out.println();
    }
   
        

}