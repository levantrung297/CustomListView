package com.htnsoft.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listviewTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter = new TraiCayAdapter(this,R.layout.dong_trai_cay, arrayTraiCay);
        listviewTraiCay.setAdapter(adapter);
    }
    private void AnhXa(){
        listviewTraiCay = (ListView) findViewById(R.id.ListviewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new TraiCay("Dâu Tây1","Dâu Tây Đà Lạt1",R.drawable.ic_launcher_background));
        arrayTraiCay.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",R.drawable.ic_launcher_background));
        arrayTraiCay.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",R.drawable.ic_launcher_background));
        arrayTraiCay.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",R.drawable.ic_launcher_background));
        arrayTraiCay.add(new TraiCay("Trái cây 1","Trái cây 1",R.drawable.ic_launcher_background));
        arrayTraiCay.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",R.drawable.ic_launcher_background));

    }
}
