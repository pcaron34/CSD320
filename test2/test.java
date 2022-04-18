// Paul Caron
// 4-14-2022
// Module 6 Assignment
//
// I never figured out how to get the numbers in the triangle to increase and due to the holiday
// and life I ran out of time to get it all the way figured out. If you could, when you grade this
// could you let me know where I went wrong on getting the math right, please and thank you. 

public class test {
    public static void main(String[] args){
    
    int b = 7;
    
    while(true){
    for (int i=1;i<=b;i++){
        
        int w=1;
        
        
        // empty spaces
        for(int g=i;g<=b;g++){
            System.out.print("  "); // farthest left triangle
        }
        for(int g=1;g<i;g++){
            System.out.print(w++ +" "); // second from the left triangle
        }
        for(int g=1;g<=i;g++){
            System.out.print(w-- +" "); // second from the right triangle
        }
        for(int g=i;g<b;g++){
            System.out.print("  "); // farthest right triangle
        }
        System.out.print("@"); // vertical line of @
        System.out.println();
    }
    
    
    }    
}}