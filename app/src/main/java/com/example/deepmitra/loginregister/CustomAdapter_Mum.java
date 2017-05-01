package com.example.deepmitra.loginregister;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by Deep mitra on 4/22/2017.
 */

public class CustomAdapter_Mum extends ArrayAdapter<String> {
    public CustomAdapter_Mum(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // default -  return super.getView(position, convertView, parent);
        // add the layout
        LayoutInflater myCustomInflater = LayoutInflater.from(getContext());
        View customView = myCustomInflater.inflate(R.layout.custom_row, parent, false);
        // get references.
        String singleFoodItem = getItem(position);
        TextView itemText = (TextView) customView.findViewById(R.id.item_text);
        ImageView buckysImage = (ImageView) customView.findViewById(R.id.my_profile_image);
        itemText.setText(singleFoodItem);
        //buckysImage.setImageResource(R.drawable.amusement_logo);
        switch (position) {
            case 0:
                buckysImage.setImageResource(R.drawable.emergency_logo);
                break;
            case 1:
                buckysImage.setImageResource(R.drawable.transport_logo);
                break;
            case 2:
                buckysImage.setImageResource(R.drawable.food_logo);
                break;
            case 3:
                buckysImage.setImageResource(R.drawable.heritage_logo);
            case 4:
                buckysImage.setImageResource(R.drawable.amusement_logo);
                break;
            case 5:
                buckysImage.setImageResource(R.drawable.fest_logo);
                break;
        }

        return customView;
    }
}
