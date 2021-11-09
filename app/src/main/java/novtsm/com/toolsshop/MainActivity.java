package novtsm.com.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar(); // Ссылка на actionBar
        // Сокрытие actionBar
        if(actionBar != null){
            actionBar.hide();
        }

        listViewTools = findViewById(R.id.listViewTools);
        // Добавление слушателя кликов. Интерфейс. В нем аргумент - анонимный класс.
        listViewTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // Вывод в тост позиции нажатого элемента
//                Toast.makeText(getApplicationContext(), "Позиция: " + position, Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0 :
                        Intent intent = new Intent(getApplicationContext(), DrillCategoryActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}