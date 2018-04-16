import java.io.File;
import java.util.Scanner;

public class maindecrypter {
    public static void main(String[] args) {
        int i =0;
        Scanner input = new Scanner(System.in);
        System.out.println("your email please:");
        String email = input.next();
        System.out.println("key pls");
        int key = input.nextInt();

        String filewala1 = "";
        String filewala2 = "";
        String filewala3 = "";
       try{
            File file = new File("C:\\Users\\KRISHNA\\Documents\\"+email+".txt");

            Scanner sc = new Scanner(file);
            while(sc.hasNext())
            {
                filewala1 = sc.next();
                filewala2 = sc.next();
                filewala3 = sc.next();
            }
            sc.close();
        }catch (Exception ae){
            System.out.println("got an error");
        }

        //manipulation
        char[] sizing = new char[filewala1.length()];
        int [] size = new int[filewala1.length()];

        for (int j = 0; j < filewala1.length(); j++) {
            sizing[j] = filewala1.charAt(i);
        }

        for (int j = 0; j < filewala1.length(); j++) {
            size[j] = Integer.parseInt(sizing[j]+"");
        }

      String krishna =    decrypt.getfinalstring(decrypt.getdecryptcode(decrypt.getNumber(filewala3, size),key));
        System.out.println(krishna);



    }
}

class decrypt {
    public static int[] getNumber(String tobedecrypt, int[] sow)
    {
        int forascii[] = new int[sow.length];
        int temp =0;
        for (int i = 0; i < sow.length; i++) {
            forascii[i] =  Integer.parseInt( tobedecrypt.substring(temp,(sow[i]+temp)));
            temp = temp + sow[i];
        }

        return forascii;
    }

    public static int[] getdecryptcode(int[] forascii,int key)
    {
        int decryptcode[] = new int[forascii.length];
        for (int i = 0; i < forascii.length; i++) {
            decryptcode[i] = (forascii[i])/(key);
            decryptcode[i] = decryptcode[i]/2;
        }

        return decryptcode;
    }

    public static String getfinalstring(int[] decryptcode )
    {
        String finalstring = "";
        char temp[] = new char[decryptcode.length];

        for (int i = 0; i < decryptcode.length; i++) {
            temp[i] = (char) decryptcode[i];
            finalstring = finalstring + temp[i];
        }

        return finalstring;
    }

}

