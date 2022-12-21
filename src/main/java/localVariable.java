

public class localVariable {

     static boolean MultipleVariable(String name , int coin1,float coin2,boolean confirm){

         String Fname = name;

        int normalCoin=coin1;
        float magicCoin =coin2 ;


          System.out.println("Name: " + Fname);
          System.out.println("Normal Coin: " + normalCoin);
          System.out.println("Magical Coin: " + magicCoin);


          boolean eligible = confirm;
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