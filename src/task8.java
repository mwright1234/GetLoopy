import java.util.Random;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int tries = 0;
        int sum = 0;
        int roll1, roll2, roll3;
        int cont;
        System.out.println("roll   Die1   Die2   Die3   Sum");
        System.out.println("-------------------------------");
        do {
            do {

                roll1 = generator.nextInt(6) + 1;
                roll2 = generator.nextInt(6) + 1;
                roll3 = generator.nextInt(6) + 1;
                sum = roll1 + roll2 + roll3;
                tries++;
                System.out.println(" " + tries + "      " + roll1 + "      " + roll2 + "      " + roll3 + "     " + sum);

            }
            while (!(roll1 == roll2 && roll2 == roll3));

            System.out.print("do you want to continue? [1 = yes, 2 = no]");
            cont = in.nextInt();

        }
        while(cont != 2);

        System.out.println("program finished");

    }
}

