package tasks;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

            Map<String, Integer> map = new HashMap<>();
            String[] line;

            try {
                BufferedReader rdr = new BufferedReader(new FileReader("io2.text"));

                while (rdr.ready()) {
                    line = rdr.readLine().split(" ");

                    map.put(line[0], Integer.parseInt(line[1]));
                }
                rdr.close();
            } catch (IOException e) {
                System.err.println("error read");
            }

            try {
                BufferedWriter wrt = new BufferedWriter(new FileWriter("output.text"));
                map.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                        .forEachOrdered(e -> {
                            try {
                                wrt.write(e.getKey() + " " + e.getValue());
                                wrt.newLine();
                            } catch (IOException ex) {
                                System.err.println(ex);
                            }
                        });

                wrt.flush();
            } catch (IOException e) {
                System.err.println("error write");
            }
        }
}
