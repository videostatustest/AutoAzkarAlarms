package com.yokoapps.alarmzeker;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemListBaseAdapter extends BaseAdapter {

    private static ArrayList<AthkarItem> itemDetailsrrayList;


    private LayoutInflater l_Inflater;

    public ItemListBaseAdapter(Context context, ArrayList<AthkarItem> results) {
        itemDetailsrrayList = results;
        l_Inflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return itemDetailsrrayList.size();
    }

    public Object getItem(int position) {
        return itemDetailsrrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        try{

            if (convertView == null) {
                convertView = l_Inflater.inflate(R.layout.item_setails_view, null);
            }

            TextView txt_itemDescription = (TextView) convertView.findViewById(R.id.itemDescription);
            txt_itemDescription.setText(itemDetailsrrayList.get(position).getThikrName());
        }
        catch (Exception ex)
        {}

        return convertView;
    }
}
