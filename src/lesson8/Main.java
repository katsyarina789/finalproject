package lesson8;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("input1.text");
        ArrayList ar = new ArrayList();
        String [] arr = new String[11];
        int i = 0;

                try{
                    Scanner scan = new Scanner(new FileReader(file));

                    while (scan.hasNextLine()){
                        String ss = scan.nextLine();
                        i = i+1;
                        arr[i] = ss;
                    }

                    System.out.println(ar);

                } catch (IOException e) {
                    e.printStackTrace();
                }

    }
}




