package com.example.a25androidlistviewnangcaovip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter
{
    Context context;
    ArrayList<MonAn> arrayList;

    public CustomAdapter(Context context, ArrayList<MonAn> arrayList)
    {
        this.context = context;
        this.arrayList = arrayList;
    }
    public void AddListItemAdapter(ArrayList<MonAn> arrayList1)
    {
        arrayList.addAll(arrayList1);
        this.notifyDataSetChanged();
    }
    @Override
    public int getCount()
    {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.dong_list_view, null);

        TextView textView1 = convertView.findViewById(R.id.textViewTenMonAn);
        TextView textView2 = convertView.findViewById(R.id.textViewGiaMonAn);
        ImageView imageView = convertView.findViewById(R.id.imageViewHinhAnh);

        MonAn monAn = arrayList.get(position);
        textView1.setText(monAn.getTenMonAn());

        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        textView2.setText(decimalFormat.format(monAn.getGiaMonAn()) + " Đồng");
        imageView.setImageResource(monAn.getHinhAnh());

        // gán animation
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.scale_list);
        convertView.startAnimation(animation);
        return convertView;
    }
}
