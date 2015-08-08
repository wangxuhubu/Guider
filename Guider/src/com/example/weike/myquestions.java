package com.example.weike;

import com.example.weike.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class myquestions extends Activity implements OnClickListener{

	private TextView title;
	private ImageButton back,question;
	public myquestions() {
		// TODO Auto-generated constructor stub
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.myquestions);
    	init();
    	Intent intent = getIntent();
		String currenttitle = intent.getStringExtra("title3");
		
		title.setText(currenttitle);
		back.setOnClickListener(this);
		question.setOnClickListener(this);
    }
    private void init() {
		// TODO Auto-generated method stub
    	title=(TextView) findViewById(R.id.myquestions_title);
		back=(ImageButton) findViewById(R.id.imageButton1);
		question=(ImageButton) findViewById(R.id.imageButton2);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.imageButton1:
			Intent intent = new Intent(myquestions.this,PersonalActivity.class);
			startActivity(intent);
			break;

		case R.id.imageButton2:
			Intent intent1 = new Intent(myquestions.this,questions.class);
			startActivity(intent1);
			break;
	}
}
}
