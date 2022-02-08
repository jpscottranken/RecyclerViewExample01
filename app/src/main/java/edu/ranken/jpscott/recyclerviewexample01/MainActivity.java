package edu.ranken.jpscott.recyclerviewexample01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Data> data = fill_with_data();

        RecyclerView recyclerView = findViewById(R.id.rvProgramming);
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public List<Data> fill_with_data() {
        List<Data> data = new ArrayList<>();
        data.add(new Data("Android", R.drawable.android));
        data.add(new Data("Bootstrap", R.drawable.bootstrap));
        data.add(new Data("CSharp", R.drawable.csharp));
        data.add(new Data("CSS3", R.drawable.css3));
        data.add(new Data("Git", R.drawable.git));
        data.add(new Data("GitHub", R.drawable.github));
        data.add(new Data("HTML5", R.drawable.html5));
        data.add(new Data("Java", R.drawable.java));
        data.add(new Data("JavaScript", R.drawable.javascript));
        data.add(new Data("jQuery", R.drawable.jquery));
        data.add(new Data("JSON", R.drawable.json));
        data.add(new Data("Kotlin", R.drawable.kotlin));
        data.add(new Data("MongoDB", R.drawable.mongodb));
        data.add(new Data("MySQL", R.drawable.mysql));
        data.add(new Data("NodeJS", R.drawable.nodejs));
        data.add(new Data("React", R.drawable.react));

        return data;
    }
}