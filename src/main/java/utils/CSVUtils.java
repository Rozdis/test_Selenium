package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    public static void writeToCsvFile(String fileName, List<String> listOfData) throws IOException {
        FileWriter csvWriter = new FileWriter(fileName + ".csv");
        for (String data: listOfData) {
            String[] result = data.split(";");
            csvWriter.write(result[0].replace(",", ""));
            csvWriter.write(";");
            csvWriter.write(result[1].replace(",", ""));
            csvWriter.write(";");
            csvWriter.write("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }

    public static List<String> getListOfDataFromCsvFile(String filename) throws IOException {
        List<String> resultList = new ArrayList<>();
        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader(filename + ".csv"));
        while ((row = csvReader.readLine()) != null){
            resultList.add(row);
        }
        return resultList;
    }
}
