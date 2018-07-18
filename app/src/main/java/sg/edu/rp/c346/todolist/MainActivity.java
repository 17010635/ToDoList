package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDo> alToDo;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);

        alToDo = new ArrayList<>();
        ToDo item1 = new ToDo("MSA","1/7/2018");
        ToDo item2 = new ToDo("Go for haircut","22/9/2018");
        alToDo.add(item1);
        alToDo.add(item2);

        caToDo = new CustomAdapter(this,R.layout.todo,alToDo);

        lvToDo.setAdapter(caToDo);

    }
}
