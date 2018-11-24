package settings;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Settings {
    private static final String pathSettings = "src\\main\\java\\fileWithSettings";

    // Method for set settings from file
    public static void setSettingsFromFile() {
        String jsonFromFile = null;
        MyFileReader reader = new MyFileReader(pathSettings);
        try {
            jsonFromFile = reader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        AllSettings settings = AllSettings.parseFromJson(jsonFromFile);
    }

    public void saveSettingsToFile(String json) {
        // Запис json в файл
        MyFileWriter writer = new MyFileWriter(pathSettings);
        try {
            writer.write(json, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String timeRequest() {
        long startCalcTime = System.currentTimeMillis();    // фіксується час початку
        for (int i = 0; i < 1000000; i++) {
            double a = i + Math.tan(i);
        }
        long finishCalcTime = System.currentTimeMillis();   // фіксується час закінчення
        String diff = String.valueOf(finishCalcTime - startCalcTime);
        return diff;         // підрахунок різниці між закінченням та початком
        //System.out.println("Час витрачений на виконання запиту складає " + diff + " мілісекунд.");
    } // тимчасово для тестів
}
