
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lab7 {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\vhars\\Downloads\\iris.csv";
        String line = "";
        String cvsSplitBy = ",";
        int countSetosa = 0;
        int countVersicolor = 0;
        int countVirginica = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                



                // get the species of the flower
                String species = data[5];

                // increment the count for the corresponding species
                if (species.equals("Iris-setosa")) {
                    countSetosa++;
                } else if (species.equals("Iris-versicolor")) {
                    countVersicolor++;
                } else if (species.equals("Iris-virginica")) {
                    countVirginica++;
                }
            }

            // calculate the summary statistics for each species of iris flower
            System.out.println("Iris-setosa: " + countSetosa);
            System.out.println("Iris-versicolor: " + countVersicolor);
            System.out.println("Iris-virginica: " + countVirginica);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
