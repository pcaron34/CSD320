// Paul Caron
// 4-21-2022
// Module 8 Assignment
// 

public class App{

    static Integer oilchangeprice = 35;
    static Integer serviceFeePrice = 5;
    static Integer tireRotation = 10;
    static Integer coupon = -5;

    public static void main(String[] args){
        int x = yearlyService(oilchangeprice, serviceFeePrice, tireRotation);
        System.out.println(x);
    }
    
    
    static int yearlyService(){
        System.out.print("The price is ");
        return serviceFeePrice;
    }

    static int yearlyService(int serviceFeePrice, int oilchangeprice){
        System.out.print("The price is ");
        return serviceFeePrice + oilchangeprice;
    };

    static int yearlyService(int serviceFeePrice, int oilchangeprice, int tireRotation){
        System.out.print("The price is ");
        return serviceFeePrice + oilchangeprice + tireRotation;
    };

    static int yearlyService(int serviceFeePrice, int oilchangeprice, int tireRotation, int coupon){
        System.out.print("The price is ");
        return coupon + serviceFeePrice + oilchangeprice + tireRotation;
    };


    
}