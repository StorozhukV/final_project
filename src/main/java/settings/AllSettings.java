package settings;

import com.alibaba.fastjson.JSON;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AllSettings {
    private boolean saveCash;
    private String pathToCash;
    private boolean time;


    // Сериалізація - з об'єкта в JSON
    public static String serializeObject(AllSettings set) {
        String json = JSON.toJSONString(set);
//        System.out.println(json);
        return json;
    }

    // Десериалізація - з JSON в об'єкт
    static AllSettings parseFromJson(String json) {
        return JSON.parseObject(json, AllSettings.class);
    }

    public AllSettings() {
    }

    public AllSettings(boolean saveCash, String pathToCash, boolean time) {
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



    @Override
    public String toString() {
        return "Settings{" +
                "saveCash = " + saveCash +
                ", pathToCash = '" + pathToCash + '\'' +
                ", time = " + time +
                '}';
    }
}
