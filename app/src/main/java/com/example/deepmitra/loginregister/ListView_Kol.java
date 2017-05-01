package com.example.deepmitra.loginregister;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by Deep mitra on 4/1/2017.
 */

public class ListView_Kol extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_kol);
        final TextView tv_details = (TextView) findViewById(R.id.tv_details);

        String[] foods = {"Emergency", "Transport", "Food & Lodging", "Heritage", "Amusement", "Festival"};
        ListAdapter customListAdapter = new CustomAdapter(this,foods);// Pass the food arrary to the constructor.
        ListView customListView = (ListView) findViewById(R.id.custom_ListView);
        customListView.setAdapter(customListAdapter);

        customListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(ListView_Kol.this, food, Toast.LENGTH_LONG).show();
                        switch(position){
                            case 0: tv_details.setText("1  Rajiv Gandhi Government General Hospital\n" +
                                    "No. 3, E.V.R Periyar Salai, Park Town, Chennai, Tamil Nadu 600003\n" +
                                    "044 2530 5000\n" +
                                    "   2  St. Thomas Hospital\n" +
                                    "  No. 5/105, Defence Colony Road, St.Thomas Mount, Chennai");
                                break;
                            case 1: tv_details.setText("airport - Chennai International Airport,     \n" +
                                    "GST Rd, Meenambakkam, Chennai, Tamil Nadu 600027\n" +
                                    "044 2256 0551\n" +
                                    "    2 bus terminus -  Chennai Mofussil Bus Terminus");
                                break;
                            case 2: tv_details.setText("1  ITC GRAND CHOLA\n" +
                                    "#63 Mount Road, Guindy, Chennai, Tamil Nadu 600032\n" +
                                    "044 2220 0000\n" +
                                    "   2   The Park Hotel Chennai\n" +
                                    "601, Anna Salai, Near US Embassy, Chennai, Tamil Nadu 600006\n" +
                                    "044 4267 6000\n" +
                                    "3  Le Royal Méridien Chennai\n" +
                                    "1 GST Road");
                                break;
                            case 3: tv_details.setText("Vivekananda House\n" +
                                    "Kamaraj Memorial House\n" +
                                    "Our Lady Of Health Church, Little Mount\n" +
                                    "Arulmigu Kapaleeswarar Temple\n" +
                                    "Fort St George\n" +
                                    "Government Museum");
                                break;
                            case 4: tv_details.setText("1   VGP SNOW KINGDOM\n" +
                                    "Next to VGP Universal Kingdom,, E Coast Rd, Cholamandal Artists Village, Injambakkam, Chennai, Tamil Nadu 600115\n" +
                                    " 073822 22222\n" +
                                    "2  Queens Land\n" +
                                    "Chennai");
                                break;
                            case 5: tv_details.setText("The most important festival of all is 'Pongal' which is celebrated over five days in January");
                                break;

                        }
                    }
                }
        );
    }

}
