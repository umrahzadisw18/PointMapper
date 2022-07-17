
	 
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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class medical_aaistance_activity extends Activity {

	
	private View _bg__medical_aaistance_ek2;
	private View rectangle_15_ek2;
	private View rectangle_14_ek4;
	private TextView medical_assistance;
	private ImageView _r_7_ek9;
	private View rectangle_20_ek2;
	private TextView enter_your_mobile_number__ek3;
	private TextView enter_vehicle_no__ek4;
	private TextView enter_your_family_mobile_no__ek1;
	private TextView enter_description__ek2;
	private View rectangle_17_ek2;
	private View rectangle_21_ek2;
	private ImageView rectangle_18_ek2;
	private TextView for_quick_rsponse_enter_these_details_ek2;
	private View rectangle_19_ek2;
	private TextView sumbit_to__family___rtc_msts__ek1;
	private EditText enter_description_here_ek3;
	private EditText enter_family_no__ek1;
	private EditText enter_vehicle_no__ek5;
	private EditText enter_mobile_no__ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.medical_aaistance);

		
		_bg__medical_aaistance_ek2 = (View) findViewById(R.id._bg__medical_aaistance_ek2);
		rectangle_15_ek2 = (View) findViewById(R.id.rectangle_15_ek2);
		rectangle_14_ek4 = (View) findViewById(R.id.rectangle_14_ek4);
		medical_assistance = (TextView) findViewById(R.id.medical_assistance);
		_r_7_ek9 = (ImageView) findViewById(R.id._r_7_ek9);
		rectangle_20_ek2 = (View) findViewById(R.id.rectangle_20_ek2);
		enter_your_mobile_number__ek3 = (TextView) findViewById(R.id.enter_your_mobile_number__ek3);
		enter_vehicle_no__ek4 = (TextView) findViewById(R.id.enter_vehicle_no__ek4);
		enter_your_family_mobile_no__ek1 = (TextView) findViewById(R.id.enter_your_family_mobile_no__ek1);
		enter_description__ek2 = (TextView) findViewById(R.id.enter_description__ek2);
		rectangle_17_ek2 = (View) findViewById(R.id.rectangle_17_ek2);
		rectangle_21_ek2 = (View) findViewById(R.id.rectangle_21_ek2);
		rectangle_18_ek2 = (ImageView) findViewById(R.id.rectangle_18_ek2);
		for_quick_rsponse_enter_these_details_ek2 = (TextView) findViewById(R.id.for_quick_rsponse_enter_these_details_ek2);
		rectangle_19_ek2 = (View) findViewById(R.id.rectangle_19_ek2);
		sumbit_to__family___rtc_msts__ek1 = (TextView) findViewById(R.id.sumbit_to__family___rtc_msts__ek1);
		enter_description_here_ek3 = (EditText) findViewById(R.id.enter_description_here_ek3);
		enter_family_no__ek1 = (EditText) findViewById(R.id.enter_family_no__ek1);
		enter_vehicle_no__ek5 = (EditText) findViewById(R.id.enter_vehicle_no__ek5);
		enter_mobile_no__ek3 = (EditText) findViewById(R.id.enter_mobile_no__ek3);
	
		
		_r_7_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), emergency_contact_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	