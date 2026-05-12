import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {

            // Open CSV file
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("patients.csv"));

            // Skip first line
            br.readLine();

            String line;

            int totalAge = 0;
            int totalBP = 0;
            int count = 0;

            ArrayList<Integer> heartRate =
                    new ArrayList<>();

            ArrayList<Integer> bloodPressure =
                    new ArrayList<>();


            // Read file line by line
            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");

                int age =
                        Integer.parseInt(data[0]);

                int hr =
                        Integer.parseInt(data[1]);

                int bp =
                        Integer.parseInt(data[2]);

                totalAge = totalAge + age;

                totalBP = totalBP + bp;

                heartRate.add(hr);

                bloodPressure.add(bp);

                count++;
            }

            // Average Age
            double averageAge =
                    (double) totalAge / count;


            // Median Heart Rate
            Collections.sort(heartRate);

            int median =
                    heartRate.get(count / 2);


            // Standard Deviation
            double mean =
                    (double) totalBP / count;

            double sd = 0;

            for (int x : bloodPressure) {

                sd = sd + Math.pow(x - mean, 2);
            }

            sd = Math.sqrt(sd / count);


            // Output
            System.out.println(
                    "Average Age = " + averageAge);

            System.out.println(
                    "Median Heart Rate = " + median);

            System.out.println(
                    "Standard Deviation = " + sd);

        }

        catch (Exception e) {

            System.out.println(e);
        }
    }
}