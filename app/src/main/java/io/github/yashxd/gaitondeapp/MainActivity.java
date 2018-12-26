package io.github.yashxd.gaitondeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String names[] = {"isa", "trivedi", "katekar", "badari", "bunty"};
    String types[] = {"accident", "NA", "raped", "shot", "shot twice"};
    int time[] = {1,2,3,4,5};
    String family[] = {"teesra baap", "trivedi", "katekar", "badari", "bunty"};
    String kill[] = {"I","have","not","watched","Sacred Games"};
    String images[] = {"https://d1u4oo4rb13yy8.cloudfront.net/article/onoebyhtvc-1530524441.jpg","https://images.indianexpress.com/2018/06/sacred-games-759-1.jpg","https://static-koimoi.akamaized.net/wp-content/new-galleries/2018/09/sacred-games-gets-the-green-light-for-second-season-0001.jpg","https://images.financialexpress.com/2018/07/sacred-games-netflix.jpg","https://c.ndtvimg.com/sacred-games-netflix_625x300_1530618911598.jpg"};

    private List<GModel> dummyData() {
        List<GModel> data = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            data.add(new GModel(names[i], types[i], time[i], family[i], kill[i], images[i]));
        }//data is the list of objects to be set in the list item
        return data;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        List<GModel> guys = dummyData();
        GAdapter adapter = new GAdapter(guys);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
