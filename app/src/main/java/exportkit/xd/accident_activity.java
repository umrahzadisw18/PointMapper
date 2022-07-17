
	 
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

public class accident_activity extends Activity {

	
	private View _bg__accident_ek2;
	private View rectangle_15_ek1;
	private View rectangle_14_ek3;
	private TextView report_accident_ek1;
	private ImageView _r_7_ek8;
	private TextView for_quick_rsponse_enter_these_details_ek1;
	private View rectangle_20_ek1;
	private TextView enter_your_mobile_number__ek2;
	private TextView enter_vehicle_no__ek2;
	private TextView enter_your_family_mobile_no_;
	private TextView enter_description__ek1;
	private View rectangle_17_ek1;
	private View rectangle_21_ek1;
	private ImageView rectangle_18_ek1;
	private View rectangle_19_ek1;
	private TextView sumbit_to__family___rtc_msts_;
	private TextView enter_description_here_ek2;
	private TextView enter_vehicle_no__ek3;
	private TextView enter_family_no_;
	private TextView enter_mobile_no__ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.accident);

		
		_bg__accident_ek2 = (View) findViewById(R.id._bg__accident_ek2);
		rectangle_15_ek1 = (View) findViewById(R.id.rectangle_15_ek1);
		rectangle_14_ek3 = (View) findViewById(R.id.rectangle_14_ek3);
		report_accident_ek1 = (TextView) findViewById(R.id.report_accident_ek1);
		_r_7_ek8 = (ImageView) findViewById(R.id._r_7_ek8);
		for_quick_rsponse_enter_these_details_ek1 = (TextView) findViewById(R.id.for_quick_rsponse_enter_these_details_ek1);
		rectangle_20_ek1 = (View) findViewById(R.id.rectangle_20_ek1);
		enter_your_mobile_number__ek2 = (TextView) findViewById(R.id.enter_your_mobile_number__ek2);
		enter_vehicle_no__ek2 = (TextView) findViewById(R.id.enter_vehicle_no__ek2);
		enter_your_family_mobile_no_ = (TextView) findViewById(R.id.enter_your_family_mobile_no_);
		enter_description__ek1 = (TextView) findViewById(R.id.enter_description__ek1);
		rectangle_17_ek1 = (View) findViewById(R.id.rectangle_17_ek1);
		rectangle_21_ek1 = (View) findViewById(R.id.rectangle_21_ek1);
		rectangle_18_ek1 = (ImageView) findViewById(R.id.rectangle_18_ek1);
		rectangle_19_ek1 = (View) findViewById(R.id.rectangle_19_ek1);
		sumbit_to__family___rtc_msts_ = (TextView) findViewById(R.id.sumbit_to__family___rtc_msts_);
		enter_description_here_ek2 = (TextView) findViewById(R.id.enter_description_here_ek2);
		enter_vehicle_no__ek3 = (TextView) findViewById(R.id.enter_vehicle_no__ek3);
		enter_family_no_ = (TextView) findViewById(R.id.enter_family_no_);
		enter_mobile_no__ek2 = (TextView) findViewById(R.id.enter_mobile_no__ek2);
	
		
		_r_7_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), emergency_contact_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	