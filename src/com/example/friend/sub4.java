package com.example.friend;

import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//ssimport android.view.View;


public class sub4 extends Activity {
	Button b1;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s4);
        b1=(Button) findViewById(R.id.but1);
        
b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent i=new Intent(sub4.this,sub1.class);
			startActivity(i);
			}
		});


	}
}