
	 
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

public class emergency_contact_activity extends Activity {

	
	private View _bg__emergency_contact_ek4;
	private ImageView rectangle_12_ek4;
	private TextView emergency_contact_ek5;
	private View rectangle_11_ek7;
	private TextView report_breakdown;
	private View rectangle_11_ek8;
	private TextView medical_assistant;
	private View rectangle_11_ek9;
	private TextView report_accident;
	private ImageView undraw_working_from_anywhere_re_9obt_1;
	private ImageView undraw_medical_care_movn_1;
	private ImageView undraw_vehicle_sale_a645_1;
	private ImageView _r_7_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.emergency_contact);

		
		_bg__emergency_contact_ek4 = (View) findViewById(R.id._bg__emergency_contact_ek4);
		rectangle_12_ek4 = (ImageView) findViewById(R.id.rectangle_12_ek4);
		emergency_contact_ek5 = (TextView) findViewById(R.id.emergency_contact_ek5);
		rectangle_11_ek7 = (View) findViewById(R.id.rectangle_11_ek7);
		report_breakdown = (TextView) findViewById(R.id.report_breakdown);
		rectangle_11_ek8 = (View) findViewById(R.id.rectangle_11_ek8);
		medical_assistant = (TextView) findViewById(R.id.medical_assistant);
		rectangle_11_ek9 = (View) findViewById(R.id.rectangle_11_ek9);
		report_accident = (TextView) findViewById(R.id.report_accident);
		undraw_working_from_anywhere_re_9obt_1 = (ImageView) findViewById(R.id.undraw_working_from_anywhere_re_9obt_1);
		undraw_medical_care_movn_1 = (ImageView) findViewById(R.id.undraw_medical_care_movn_1);
		undraw_vehicle_sale_a645_1 = (ImageView) findViewById(R.id.undraw_vehicle_sale_a645_1);
		_r_7_ek5 = (ImageView) findViewById(R.id._r_7_ek5);
	
		
		_r_7_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			}
		});
		rectangle_11_ek8.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), medical_aaistance_activity.class);
				startActivity(nextScreen);


			}
		});

		
		
		//custom code goes here
	
	}
}
	
	