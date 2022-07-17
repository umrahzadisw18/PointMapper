
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		main_page
	 *	@date 		1656605240658
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class application_activity extends Activity {

	
	private View _bg__application_ek7;
	private ImageView rectangle_12_ek5;
	private TextView application_ek8;
	private ImageView _r_7_ek6;
	private TextView enter_your_mobile_number_;
	private TextView application_description;
	private View rectangle_20;
	private View rectangle_21;
	private TextView enter_mobile_no_;
	private TextView enter_description_here;
	private View rectangle_29;
	private View rectangle_28;
	private TextView upload_application;
	private TextView select_file_;
	private TextView submit_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.application);

		
		_bg__application_ek7 = (View) findViewById(R.id._bg__application_ek7);
		rectangle_12_ek5 = (ImageView) findViewById(R.id.rectangle_12_ek5);
		application_ek8 = (TextView) findViewById(R.id.application_ek8);
		_r_7_ek6 = (ImageView) findViewById(R.id._r_7_ek6);
		enter_your_mobile_number_ = (TextView) findViewById(R.id.enter_your_mobile_number_);
		application_description = (TextView) findViewById(R.id.application_description);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		enter_mobile_no_ = (TextView) findViewById(R.id.enter_mobile_no_);
		enter_description_here = (TextView) findViewById(R.id.enter_description_here);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		upload_application = (TextView) findViewById(R.id.upload_application);
		select_file_ = (TextView) findViewById(R.id.select_file_);
		submit_ek1 = (TextView) findViewById(R.id.submit_ek1);
	
		
		_r_7_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	