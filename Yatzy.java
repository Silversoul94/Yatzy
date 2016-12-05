package se.Henrik;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Henrik on 2015-11-07.
 */
public class Yatzy {
    int totalScoreOfNumber = 0;
    int totalScoreSum = 0;
    int oneholder = 0;
    int twoholder = 0;
    int threeholder = 0;
    int fourholder = 0;
    int fiveholder = 0;
    int sixholder = 0;
    int dicesum= 0;
    int yatzyscore = 0;
    int fourkindscore = 0;
    int fullhousescore =0;
    int threekindscore = 0;
    int lowscore = 0;
    int highscore = 0;
    int pairscore =0;
    int twoPairs = 0;
    
    boolean twopair = false;
    boolean foundThree = false;
    boolean foundTwo = false;

    public ArrayList<Dice> getDiceList() {
        return diceList;
    }

    ArrayList<Dice> diceList = new ArrayList();

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Dice dice3 = new Dice();
    Dice dice4 = new Dice();
    Dice dice5 = new Dice();

    public Yatzy() {

        diceList.add(dice1);
        diceList.add(dice2);
        diceList.add(dice3);
        diceList.add(dice4);
        diceList.add(dice5);
    }

    /**
     *en for-each loop för varje tärning
     * fick hjälp av Abe Zachariah
     * @return
     */

    public int checknumber(int nr) {
        int sum = 0;
        for (Dice d : diceList) {
            if (d.getValue() == nr ){
                sum++;
            }
        }
        return sum;
    }


    /**
     * metoder för ettor
     */
  public void ponitsForOne(){
      totalScoreOfNumber += checknumber(1) * 1;
      totalScoreSum += checknumber(1) * 1;
      oneholder += checknumber(1) * 1;
  }
    /**
     * metod för tvåor
     */

    public  void ponitsForTwo(){
        totalScoreOfNumber += checknumber(2) * 2;
        totalScoreSum += checknumber(2) * 2;
        twoholder += checknumber(2) * 2;
    }
    /**
     * metod för treor
     */

    public  void ponitsForThree(){
        totalScoreOfNumber += checknumber(3) * 3;
        totalScoreSum += checknumber(3) * 3;
        threeholder += checknumber(3) * 3;
    }

    /**
     * metod för fyror
     */

    public  void ponitsForFour(){
        totalScoreOfNumber += checknumber(4) * 4;
        totalScoreSum += checknumber(4) * 4;
        fourholder += checknumber(4) * 4;
    }

    /**
     * metod för femmor
     */

    public  void ponitsForFive(){
        totalScoreOfNumber += checknumber(5) * 5;
        totalScoreSum += checknumber(5) * 5;
        fiveholder +=  checknumber(5) * 5;
    }

    /**
     * metod för sexor
     */

    public  void ponitsForSix(){
        totalScoreOfNumber += checknumber(6) * 6;
        totalScoreSum += checknumber(6) * 6;
        sixholder += checknumber(6) * 6;
    }


    public int getTotalScoreOfNumber() {
        System.out.println("score number is " + totalScoreOfNumber);
        return totalScoreOfNumber;

    }

    /**
     * Kollar om kvaren för bonus är i fylld.
     * @return
     */
    public  boolean bonuschecker(){
        boolean bonus = false;
        if(totalScoreOfNumber>=63){
            totalScoreSum += 50;
            return  bonus= true;
        }
        return  bonuschecker();
    }

    /**
     * kollar efter Chans.
     */
    public void chans() {
        dicesum = diceList.get(0).getValue() + diceList.get(1).getValue() + diceList.get(2).getValue()
                + diceList.get(3).getValue() +diceList.get(4).getValue();
        totalScoreSum += dicesum;
    }

    /**
     * metod som kollar för en liten stege
     */

    public void lowstraight (){
        int[] low = { 1, 2, 3, 4, 5 };
        int [] diceValues = {diceList.get(0).getValue(),diceList.get(1).getValue(),diceList.get(2).getValue(),diceList.get(3).getValue(),diceList.get(4).getValue()};
        Arrays.sort(diceValues);
        System.out.println(Arrays.toString(diceValues));
        if(Arrays.equals(low, diceValues)){
            totalScoreSum += 15;
            lowscore =15;
            System.out.print("hej");

        }

    }

    /**
     * metod för en stor stege
     */

    public void Highstraight() {
        int[] high = { 2, 3, 4, 5 ,6 };
        int [] diceValues = {diceList.get(0).getValue(),diceList.get(1).getValue(),diceList.get(2).getValue(),diceList.get(3).getValue(),diceList.get(4).getValue()};
        Arrays.sort(diceValues);
        System.out.println(Arrays.toString(diceValues));
        if(Arrays.equals(high, diceValues)){
            totalScoreSum += 20;
            lowscore =20;
            System.out.print("hej");

        }

    }
    /**
     * metod för par
     */

    public void pair () {
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            if (a == 2) {
                totalScoreSum += a * i;
                pairscore = a * i;
            }    
        }
    }
    /**
     * metoden som kollar om det finns 2 par
     * fick hjälp av Marcus Snarkus 7 10
*/

   /* public void checkTwopairs() {
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            if (a == 2) {
                if (twopair == true && i != twoPairs / 2) {
                    twoPairs += i*2;
                } else {
                    System.out.println("hej");
                    twoPairs = i*2;
                    twopair = true;
            }
            }
        }
        twopair = false;
        totalScoreSum = twoPairs;
    }*/

    public void checkTwopairs() {
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            if (a == 2) {

                int onePair = i*2;
                for (int j =1; j<=6; j++){
                    int b = checknumber(j);
                    if (b==2 && j!=i){
                        int secPair = j*2;

                        twoPairs = onePair + secPair;
                        totalScoreSum = twoPairs;
                        twopair = true;
                    }
                }
            }
        }
       if(twopair == true){
           twopair = false;

       }
    }


     /*
    public boolean checkTwopairs() {
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            int b = checknumber(i);
                if (a == 2) {
                    System.out.print("en par");
                } if (b == 2) {
                    System.out.print("en till par");
                    if (a==b){
                        return false;
                    }
                }
            }
            return false;
        }
*/
    /**
     * metod för triss
     */
    public void threeOfKind() {
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            if (a == 3) {
                System.out.println("triss");
                totalScoreSum += 3*i;
                threekindscore += 3*i;
            }
        }
    }
    /**
     * metod för kåk
     * fick hjälp av Daniel kihnberg
     * @return
     */
    public boolean checkFullhouse() {
        //System.out.println(Arrays.toString(diceList));
        int fullhouseSum = 0;
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            if (a == 3) {
                foundThree = true;
            } else if (a == 2) {
                foundTwo = true;
            }
        }
        if (foundThree && foundTwo) {
            for(Dice d : diceList){
                fullhouseSum=d.getValue();
                totalScoreSum +=fullhouseSum;
                fullhousescore +=fullhouseSum;
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * metod för fyrtal
     */
    public void fourOfKind() {
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            if (a == 4) {
                totalScoreSum += a*i;
                fourkindscore = a*i;
            }
        }
    }

    /**
     * kollar om det är Yatzy
     */

    public void yatzyChecker() {
        for (int i = 1; i <= 6; i++) {
            int a = checknumber(i);
            if (a == 5) {
                totalScoreSum += 50;
                yatzyscore = 50;
            }
        }
    }

    public int getTotalScoreSum() {
        System.out.println("the total score is " + totalScoreSum);
        return totalScoreSum;
    }
}