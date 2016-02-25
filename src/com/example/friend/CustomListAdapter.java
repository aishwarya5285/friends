package com.example.friend;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {
	 
		private final Activity context;
		private final String[] itemname;
		private final Integer[] itemimg;
		
			
				
		public CustomListAdapter(Activity context, String[] itemname, Integer[] itemimg) {
			super(context, R.layout.ss1, itemname);
			// TODO Auto-generated constructor stub
			
			this.context=context;
			this.itemname=itemname;
			this.itemimg=itemimg;
			
		}

		public View getView(int position,View view,ViewGroup parent) {
			LayoutInflater inflater=context.getLayoutInflater();
			View rowView=inflater.inflate(R.layout.activity_main, null,true);
			
			TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);
			ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
			TextView txtTitle1 = (TextView) rowView.findViewById(R.id.textView2);
			ImageView imageView1 = (ImageView) rowView.findViewById(R.id.imageView2);
			TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textView3);
			ImageView imageView2 = (ImageView) rowView.findViewById(R.id.imageView3);
			TextView txtTitle3 = (TextView) rowView.findViewById(R.id.textView4);
			ImageView imageView3 = (ImageView) rowView.findViewById(R.id.imageView4);
						
	
			
			
			txtTitle.setText(itemname[position]);
			imageView.setImageResource(itemimg[position]);
			
			txtTitle1.setText(itemname[position]);
			imageView1.setImageResource(itemimg[position]);
			txtTitle2.setText(itemname[position]);
			imageView2.setImageResource(itemimg[position]);
			txtTitle3.setText(itemname[position]);
			imageView3.setImageResource(itemimg[position]);
	
			
			return rowView;
			
		}


	}


