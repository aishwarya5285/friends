package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class CustomAdapter<E> extends BaseAdapter{   
    String [] result;
    Context context;
 int [] imageId;
      private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity<E> mainActivity, String[] prgmNameList, int[] prgmImages) {
        // TODO Auto-generated constructor stub
        result=prgmNameList;
        context=mainActivity;
        imageId=prgmImages;
         inflater = ( LayoutInflater )context.
                 getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;       
             rowView = inflater.inflate(R.layout.rel, null);
             holder.tv=(TextView) rowView.findViewById(R.id.text2);
             holder.img=(ImageView) rowView.findViewById(R.id.image2);       
         holder.tv.setText(result[position]);
         holder.img.setImageResource(imageId[position]);         
         rowView.setOnClickListener(new OnClickListener() {            
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });   
         View v;
		CheckBox ch = (CheckBox) v.findViewById(R.id.check1);
         final Object pos;
		try {
             if (getCount() != 0) {
                 Object cartItems;
				boolean b = ((Object) cartItems).get(pos);
                 if (b == false)
                     ch.setChecked(false);
                 else
                     ch.setChecked(true);
             }
         } catch (NullPointerException e) {

         }
         ch.setOnCheckedChangeListener(new OnCheckedChangeListener() {
             public void onCheckedChanged1(CompoundButton arg0, boolean arg1) {
                 Object cartItems;
				((Object) cartItems).put(pos, arg1);
                 int count;
				count++;  

             }

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				
			}
         });
         return v;
     
        return rowView;
    }

} 