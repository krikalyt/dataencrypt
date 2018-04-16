import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.io.File;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
//encryption of a text file
public class main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("please input your email id");
        String email = input.nextLine();
        String strtobeencrypt = input.nextLine();
        Random random = new Random();
        int rand = (random.nextInt(1789)) + 1;
        System.out.println("pls retain this number to unlock your file:"+rand);
//        System.out.println(rand);



        try {
            Formatter x = new Formatter("C:\\Users\\KRISHNA\\Documents\\"+email+".txt");
            for(int em: main.asciigenerator(strtobeencrypt,rand))
            {
                   x.format("%s",main.digitcount(em));
            }

            x.format("%s","\n55957\n");

            for(int em: main.asciigenerator(strtobeencrypt,rand))
            {
                    x.format("%s",em);
            }



            x.close();


        }catch (Exception ae){
            System.out.println("got an error");
        }



    }

    public static int[] asciigenerator(String strtobeencrypt,int randomgen)
    {
        int templen = strtobeencrypt.length();
        int ascii [] = new int[templen];
        for (int i = 0; i < templen; i++) {
            ascii[i] = (int) strtobeencrypt.charAt(i);
            ascii[i] = ascii[i] * 2;
            ascii[i] = ascii[i] * randomgen;
        }
        return ascii;
    }

    public static int digitcount(int number){
        int temp;
        int count=0;
        while (number>0)
        {
            number = number/10;
            count++;

        }
        return count;
    }

}
