package google.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<People> peoples = new ArrayList<>();
        peoples.add(new People("John", 42));
        peoples.add(new People("Marie", 22));
        peoples.add(new People("Momo", 44));
        peoples.add(new People("Gerard", 28));
        peoples.add(new People("Babar", 89));
        peoples.add(new People("Batman", 23));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        PeopleAdapter adapter = new PeopleAdapter(peoples);
        recyclerView.setAdapter(adapter);


    }
}
