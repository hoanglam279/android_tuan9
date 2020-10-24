package com.example.androibttuan9;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Context context;
    ArrayList<CountriesModel> countriesData;
    CustomAdapter customAdapter;
    CountriesModel countriesModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        //getviews
        listView = findViewById(R.id.listView);
        countriesData = new ArrayList<>();

        //add Countries Data
        populateCountriesData();

        customAdapter = new CustomAdapter(context,countriesData);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,countriesData.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void populateCountriesData() {
        //country 1
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Võ Hoàng Lâm");
        countriesModel.setImage(R.drawable.mu1);
        countriesModel.setArea("796,095 km2");
        countriesModel.setPopulation("203,382,058");
        countriesData.add(countriesModel);

        //country 2
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setName("18T1");
        countriesModel.setImage(R.drawable.mu2);
        countriesModel.setArea("652,090 km2");
        countriesModel.setPopulation("25,500,100");
        countriesData.add(countriesModel);

        //country 3
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("1811505310122");
        countriesModel.setImage(R.drawable.mu3);
        countriesModel.setArea("3,287,260 km2");
        countriesModel.setPopulation("1,241,610,000");
        countriesData.add(countriesModel);

        //country 4
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Korea");
        countriesModel.setImage(R.drawable.mu4);
        countriesModel.setArea("1,648,200 km2");
        countriesModel.setPopulation("77,288,000");
        countriesData.add(countriesModel);

        //country 5
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("England");
        countriesModel.setImage(R.drawable.mu5);
        countriesModel.setArea("9,640,820 km2");
        countriesModel.setPopulation("1,363,350,000");
        countriesData.add(countriesModel);

        //country 6
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Japan");
        countriesModel.setImage(R.drawable.mu6);
        countriesModel.setArea("9,629,090 km2");
        countriesModel.setPopulation("317,706,000");
        countriesData.add(countriesModel);

        //country 7
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Canada");
        countriesModel.setImage(R.drawable.mu7);
        countriesModel.setArea("9,970,610 km2");
        countriesModel.setPopulation("35,295,770");
        countriesData.add(countriesModel);

        //country 8
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("France");
        countriesModel.setImage(R.drawable.mu2);
        countriesModel.setArea("446,550 km2");
        countriesModel.setPopulation("33,202,300");
        countriesData.add(countriesModel);

        //country 9
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("South Africa");
        countriesModel.setImage(R.drawable.mu3);
        countriesModel.setArea("1,221,040 km2");
        countriesModel.setPopulation("52,981,991");
        countriesData.add(countriesModel);

        //country 10
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Germany");
        countriesModel.setImage(R.drawable.mu4);
        countriesModel.setArea("390,757 km2");
        countriesModel.setPopulation("12,973,808");
        countriesData.add(countriesModel);
    }
}