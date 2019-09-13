package lesson8;

import java.io.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("../../lesson8/input1.txt");
        String[] s;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while (br.ready()) {
                s = br.readLine().split(" ");
                System.out.println(" ");

            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
