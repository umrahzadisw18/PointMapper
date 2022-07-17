
	 
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
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class breakdwon_activity extends Activity {

	
	private View _bg__breakdwon_ek2;
	private View rectangle_15;
	private TextView for_quick_rsponse_enter_these_details;
	private View rectangle_14_ek2;
	private TextView report_breakdown_ek1;
	private ImageView _r_7_ek7;
	private TextView enter_your_mobile_number__ek1;
	private TextView enter_vehicle_no_;
	private TextView enter_description_;
	private View rectangle_16;
	private View rectangle_17;
	private View rectangle_18;
	private View rectangle_19;
	private TextView sumbit_to__rtc_msts_;
	private TextView enter_mobile_no__ek1;
	private TextView enter_vehicle_no__ek1;
	private TextView enter_description_here_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.breakdwon);

		
		_bg__breakdwon_ek2 = (View) findViewById(R.id._bg__breakdwon_ek2);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		for_quick_rsponse_enter_these_details = (TextView) findViewById(R.id.for_quick_rsponse_enter_these_details);
		rectangle_14_ek2 = (View) findViewById(R.id.rectangle_14_ek2);
		report_breakdown_ek1 = (TextView) findViewById(R.id.report_breakdown_ek1);
		_r_7_ek7 = (ImageView) findViewById(R.id._r_7_ek7);
		enter_your_mobile_number__ek1 = (TextView) findViewById(R.id.enter_your_mobile_number__ek1);
		enter_vehicle_no_ = (TextView) findViewById(R.id.enter_vehicle_no_);
		enter_description_ = (TextView) findViewById(R.id.enter_description_);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		rectangle_17 = (View) findViewById(R.id.rectangle_17);
		rectangle_18 = (View) findViewById(R.id.rectangle_18);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		sumbit_to__rtc_msts_ = (TextView) findViewById(R.id.sumbit_to__rtc_msts_);
		enter_mobile_no__ek1 = (TextView) findViewById(R.id.enter_mobile_no__ek1);
		enter_vehicle_no__ek1 = (TextView) findViewById(R.id.enter_vehicle_no__ek1);
		enter_description_here_ek1 = (TextView) findViewById(R.id.enter_description_here_ek1);
	
		
		_r_7_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), emergency_contact_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	