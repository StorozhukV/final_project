package settings;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

public class Settings {
    private boolean saveCash;
    private String pathToCash;
    private boolean time;
    private final String pathSettings = "./fileWithSettings.json";

    // Сериалізація - з об'єкта в JSON
    static String serializeObject(Settings set) {
        String json = JSON.toJSONString(set);
//        System.out.println(json);
        return json;
    }

    // Десериалізація - з JSON в об'єкт
    static Settings parseFromJson(String json) {
        return JSON.parseObject(json, Settings.class);
    }

    public Settings(boolean saveCash, String pathToCash, boolean time) {
        this.saveCash = saveCash;
        this.pathToCash = pathToCash;
        this.time = time;
    }

    public boolean isSaveCash() {
        return saveCash;
    }

    public void setSaveCash(boolean saveCash) {
        this.saveCash = saveCash;
    }

    public String getPathToCash() {
        return pathToCash;
    }

    public void setPathToCash(String pathToCash) {
        this.pathToCash = pathToCash;
    }

    public boolean isTime() {
        return time;
    }

    public void setTime(boolean time) {
        this.time = time;
    }
    // Method for write settings to file

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
        String diff =  String.valueOf(finishCalcTime - startCalcTime);
        return diff ;         // підрахунок різниці між закінченням та початком
        //System.out.println("Час витрачений на виконання запиту складає " + diff + " мілісекунд.");
    } // тимчасово для тестів

    @Override
    public String toString() {
        return "Settings{" +
                "saveCash = " + saveCash +
                ", pathToCash = '" + pathToCash + '\'' +
                ", time = " + time +
                '}';
    }
}
