package com.example.app;

//package com.gnetspace.customlistview;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

import android.widget.ListView;

public class MainActivity<E> extends Activity {

    ListView lv;
    Context context;

    ArrayList<E> prgmName;
    public static int [] prgmImages={R.drawable.cc,R.drawable.oop,R.drawable.jav,R.drawable.jsp,R.drawable.mi,R.drawable.net};
    public static String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        context=this;

        lv=(ListView) findViewById(R.id.list1);
        CustomAdapter<E> adapter = new CustomAdapter<E>(this, prgmNameList,prgmImages);
		lv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

} 