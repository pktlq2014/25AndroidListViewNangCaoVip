package com.example.a25androidlistviewnangcaovip;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listView1;
    CustomAdapter customAdapter;
    ArrayList<MonAn> arrayList;
    int currentID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        init();
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                // Toast: arrayList.get(posotion) để hiện vị trí
            }
        });
    }

    private void init()
    {
        arrayList.add(new MonAn(++currentID, "Bánh Tráng Trộn",50000, R.mipmap.banhtrangtron));
        arrayList.add(new MonAn(++currentID, "Bột Chiên",50000, R.mipmap.botchien));
        arrayList.add(new MonAn(++currentID, "Hủ Tiếu",50000, R.mipmap.hutieu));
        arrayList.add(new MonAn(++currentID, "Súp Cua",50000, R.mipmap.supcua));
        arrayList.add(new MonAn(++currentID, "Trà Sữa",50000, R.mipmap.trasu));
        arrayList.add(new MonAn(++currentID, "Vú Heo",50000, R.mipmap.vuheo));
        arrayList.add(new MonAn(++currentID, "Bánh Tráng Trộn",50000, R.mipmap.banhtrangtron));
        arrayList.add(new MonAn(++currentID, "Bột Chiên",50000, R.mipmap.botchien));
        arrayList.add(new MonAn(++currentID, "Hủ Tiếu",50000, R.mipmap.hutieu));
        arrayList.add(new MonAn(++currentID, "Súp Cua",50000, R.mipmap.supcua));
        arrayList.add(new MonAn(++currentID, "Trà Sữa",50000, R.mipmap.trasu));
        arrayList.add(new MonAn(++currentID, "Vú Heo",50000, R.mipmap.vuheo));
        arrayList.add(new MonAn(++currentID, "Bánh Tráng Trộn",50000, R.mipmap.banhtrangtron));
        arrayList.add(new MonAn(++currentID, "Bột Chiên",50000, R.mipmap.botchien));
        arrayList.add(new MonAn(++currentID, "Hủ Tiếu",50000, R.mipmap.hutieu));
        arrayList.add(new MonAn(++currentID, "Súp Cua",50000, R.mipmap.supcua));
        arrayList.add(new MonAn(++currentID, "Trà Sữa",50000, R.mipmap.trasu));
        arrayList.add(new MonAn(++currentID, "Vú Heo",50000, R.mipmap.vuheo));
    }

    private void anhXa()
    {
        listView1 = findViewById(R.id.listView1);
        arrayList = new ArrayList<>();
        customAdapter = new CustomAdapter(MainActivity.this, arrayList);
        listView1.setAdapter(customAdapter);
    }
}
