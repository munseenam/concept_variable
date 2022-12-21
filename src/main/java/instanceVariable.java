public class instanceVariable {


   public static String Fname;
   public static int normalCoin;
    public static float magicCoin;
   public static boolean eligible = true;


    static boolean MultipleVariable(String name , int coin1,float coin2,boolean confirm){
        Fname=name;
        normalCoin=coin1;
        magicCoin=coin2;
        eligible=confirm;


        System.out.println("Name: " + Fname);
        System.out.println("Normal Coin: " + normalCoin);
        System.out.println("Magical Coin: " + magicCoin);



        int total= (int) (normalCoin +magicCoin);
        System.out.println("total coin: " + total);
        if(total>300) {

            System.out.println("you are eligible to enter grandspa's fantacy park");
            return eligible;
        }
        else{
            System.out.println("work hard and EARN more coins!!!");
        }


        return eligible;
    }
}

