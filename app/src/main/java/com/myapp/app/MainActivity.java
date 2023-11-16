package com.myapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // create data
        ArrayList<Player> arrayList =new ArrayList<>();
        arrayList.add(new Player(R.drawable.pic1,"Arad Levita","point guard"));
        arrayList.add(new Player(R.drawable.pic12,"Dror Fur","point/shooting guard"));
        arrayList.add(new Player(R.drawable.pic3,"Matan Fogel","small F"));
        arrayList.add(new Player(R.drawable.pic4,"Afik Ben Abu","Power F"));
        arrayList.add(new Player(R.drawable.pic5,"Ori Ovadia","Center"));


        // we make custom adapter
        PlayerAdapter playerAdapter = new PlayerAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(playerAdapter);





    }
}