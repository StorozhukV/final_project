package settings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
    // Шлях до файлу
    private String path;

    // Конструктор
    public MyFileReader(String path) {
        this.path = path;
    }

    public String read() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path); // FileInputStream "stream", який приймає параметр шлях до файлу (path)
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z");    // "useDelimiter("\\Z")" дає можливість зчитати файл до кінця
        String data = scanner.next();   // Разом з "scanner.useDelimiter("\\Z");" зчитує файл до кінця
        scanner.close();
        return data;
    }

    // Метод для зчитування з файлу
    public static String readFromFile(String path) throws FileNotFoundException {
        MyFileReader reader = new MyFileReader(path);
        String text = reader.read();
        return text;
    }
}
