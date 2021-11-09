package novtsm.com.toolsshop;

import androidx.annotation.NonNull;

public class Drill {
    private String title;
    private String info;
    private int imageResourceId;

    // Конструктор
    public Drill(String title, String info, int imageResourceId) {
        this.title = title;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }
    // Геттер
    public String getTitle() {
        return title;
    }
    // Геттер
    public String getInfo() {
        return info;
    }
    // Геттер
    public int getImageResourceId() {
        return imageResourceId;
    }

    // Ctrl + o - переопределение метода вывода в адаптере
    @NonNull
    @Override
    public String toString() {
        return title; // Вывод названия, когда drill преобразуется в строку
    }
}
