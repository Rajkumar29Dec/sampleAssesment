package altimetrik.raj;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class LotteryMachine extends Main{

    public void printResult() {

        TreeSet<Long> HundredWinnerThousand=new TreeSet<>();
        TreeSet<Long> FiveWinnerTenThousand=new TreeSet<>();
        ArrayList<Long> hundredWinnerList=new ArrayList<>();
        ArrayList<Long> fiveWinnerList=new ArrayList<>();
        System.out.println("List of users  :  "+usermap);

        Long KeyoneMWinner=ThreadLocalRandom.current().nextLong(100000000001L,100000000010L);
        System.out.println("One Lucky Winner : "+usermap.get(KeyoneMWinner)+" - "+KeyoneMWinner+"  ->  Won 1 Million Rupees");

        usermap.remove(KeyoneMWinner);
//-----------------------------------hundred winners----------------------------------
        for (int i=0;i<100;i++){
            Long hundredluckypersons=ThreadLocalRandom.current().nextLong(100000000001L,100010000000L);
            HundredWinnerThousand.add(hundredluckypersons);
        }
        hundredWinnerList.addAll(HundredWinnerThousand);
        System.out.println("=================================================");
        System.out.println("Hundred Lucky Winner :");
        for (Long s: hundredWinnerList) {
            System.out.println(usermap.get(s)+" - "+s+" -> "+" 1000 Rupees");
            usermap.remove(s);
        }
        System.out.println("=============================================");
//---------------------------------5 lucky 10000 winner---------------------



        for (int i=0;i<5;i++){
            Long fiveluckypersons= ThreadLocalRandom.current().nextLong(100000000001L,100000100000L);
            FiveWinnerTenThousand.add(fiveluckypersons);
            if (!usermap.containsKey(fiveluckypersons)) {
                System.out.println(i+" : "+FiveWinnerTenThousand);
            }
        }
        fiveWinnerList.addAll(FiveWinnerTenThousand);
        System.out.println("=========================================");
        System.out.println("Five Lucky Winner :");
        for (Long s: fiveWinnerList) {
            System.out.println(usermap.get(s)+" - "+s+" -> "+" 10000 Rupees");
            usermap.remove(s);
        }
        System.out.println("=========================================");
//--------------------------------------------remaining assign 1 to 10 rupees-----------

        System.out.println(usermap);
        System.out.println("Remaining users : Happy credits");
        for (Long s:
             usermap.keySet()) {
            System.out.print(s+" - "+usermap.get(s)+" -> "+ThreadLocalRandom.current().nextInt(1,10)+" rupees");
        }
//            System.out.println("Happy Point Gainer : "+usermap.values());


    }
}
