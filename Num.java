import java.util.Scanner;

/**
 * Created by ColeDoty on November 1, 2016.
 */
public class Num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Up to what number would you like to find prime numbers?");
        int i = s.nextInt();
        System.out.println();
        System.out.println("PRIME NUMBERS UP TO " + i + " ARE:");
        Num n = new Num();
        n.calc(i);
    }

    // This method uses primeNums() to loop through iterations of itself up to the user specified input
    public void calc(int num) {
        int num2;
        for (num2 = 0; num2 < num; num2++) {
            if (primeNums(num2) > 2) {
                System.out.println(primeNums(num2));
            }
        }
    }

    // This method generates whether a certain number is prime.
    public int primeNums(int oNum) {
        for (int num = 1; num < oNum; num++) {
            int num2 = oNum % num;
            if (num != 0 && num != 1) {
                if (num2 == 0) {
                    return -1;
                }
            }
        }
        return oNum;
    }
}



