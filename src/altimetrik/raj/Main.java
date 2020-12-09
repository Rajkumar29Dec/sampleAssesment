package altimetrik.raj;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static long usernumber=100000000000L;
    public static userInLotterySystem user=null;
    public static TreeMap<Long,String> usermap=new TreeMap<>();
    public static void main(String[] args) {
//        counterOneHr();
            addUser();
            LotteryMachine machine=new LotteryMachine();
            machine.printResult();
    }
    private static void counterOneHr() {
        int count = 0;
        for(count=1;count<10;++count)
        {
            try {
                Thread.sleep(1000);
                System.out.println(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("1 hr over next session start");
//        userlist.clear();
    }

    private static void addUser() {
        String userName;
        for (int i = 0; i <10000000 ; i++) {
            userName=generateName();
            usernumber++;

            user=new userInLotterySystem(userName,usernumber);
            usermap.put(usernumber,userName);
        }
    }

    private static String generateName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedName = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedName;
    }
}

/*.	Imagine a hypothetical lottery system - which has become very popular because there is a good chance to win at least something!
        2.	Millions of people buy this particular lottery. Lottery costs Rs. 10.
         They get a 12 digit number when they buy the lottery.
        3.	Every hour the results are announced. Each number wins randomly from 0 to 9 Rs.
        Few hundred numbers with 1000 Rs.
         Five numbers win 10,000 Rs.
          And one lucky number wins 1 Million Rs.
          Millions of people buy the lottery every hour, and they login to an online system to check how much did they win.
*/
















