package com.example.friend;

import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//ssimport android.view.View;


public class sub3 extends Activity {
	Button b1,b2;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s3);
        b1=(Button) findViewById(R.id.but3);
        b2=(Button) findViewById(R.id.but5);

b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent i=new Intent(sub3.this,sub1.class);
			startActivity(i);
			}
		});
b2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	Intent i=new Intent(sub3.this,sub2.class);
	startActivity(i);
	}
});

	}
}