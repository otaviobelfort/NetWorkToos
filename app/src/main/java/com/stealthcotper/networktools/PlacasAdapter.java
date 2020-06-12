package com.stealthcotper.networktools;
import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.stealthcopter.networktools.SubnetDevices;
import com.stealthcopter.networktools.subnet.Device;

import java.util.ArrayList;



public class PlacasAdapter extends ArrayAdapter<Placas> {
    private  Context context;
    private Activity activity;
    private  ArrayList<Placas> elementos;
    private SubnetDevices onSubnetDeviceFound;

    public PlacasAdapter(Context context,ArrayList<Placas> elementos) {
        super(  context, R.layout.item_list);
        this.context =  context;
        this.elementos = elementos;
    }


/*
    public PlacasAdapter(SubnetDevices.OnSubnetDeviceFound onSubnetDeviceFound, ArrayList<Placas> listaIP) {
        super((Context) onSubnetDeviceFound,R.layout.item_list);
        this.onSubnetDeviceFound= (SubnetDevices) onSubnetDeviceFound;
        this.elementos = listaIP;
    }
*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //LayoutInflater inflater = (LayoutInflater) context//.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

//
        View rowView = inflater.inflate(R.layout.item_list, parent, false);
        TextView nomePlaca = (TextView) rowView.findViewById(R.id.ip);
        TextView mac = (TextView) rowView.findViewById(R.id.MAC);
        TextView status = (TextView) rowView.findViewById(R.id.STATUS);

        nomePlaca.setText(elementos.get(position).getNome());
        mac.setText(elementos.get(position).getMac());
        status.setText(elementos.get(position).getStatus());
        return rowView;
    }




}