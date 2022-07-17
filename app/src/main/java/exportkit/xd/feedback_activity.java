
	 
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

public class feedback_activity extends Activity {

	
	private View _bg__feedback_ek3;
	private ImageView rectangle_12_ek7;
	private TextView students_feedback_ek1;
	private ImageView _r_7_ek11;
	private View rectangle_22;
	private View rectangle_23;
	private View rectangle_24;
	private TextView please_select_category;
	private TextView enter_your_mobile_number__ek4;
	private TextView choose_vehcile_n0_;
	private TextView date_of_journey_;
	private TextView choose_your_feedback_here;
	private View rectangle_16_ek1;
	private View rectangle_25;
	private View rectangle_26;
	private TextView enter_mobile_no__ek4;
	private TextView enter_vehcile_no_;
	private TextView dd_mm_yyyy;
	private View ellipse_6;
	private View ellipse_11;
	private TextView good;
	private TextView average;
	private TextView bad;
	private View ellipse_9;
	private View ellipse_13;
	private View ellipse_14;
	private View ellipse_8;
	private View ellipse_10;
	private View ellipse_12;
	private View rectangle_27;
	private TextView submit_to__msts_;
	private TextView driver_behaviour;
	private TextView bus_condition;
	private TextView driving;
	private ImageView r__2__1;
	private ImageView r__1__1;
	private ImageView r__3__1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);

		
		_bg__feedback_ek3 = (View) findViewById(R.id._bg__feedback_ek3);
		rectangle_12_ek7 = (ImageView) findViewById(R.id.rectangle_12_ek7);
		students_feedback_ek1 = (TextView) findViewById(R.id.students_feedback_ek1);
		_r_7_ek11 = (ImageView) findViewById(R.id._r_7_ek11);
		rectangle_22 = (View) findViewById(R.id.rectangle_22);
		rectangle_23 = (View) findViewById(R.id.rectangle_23);
		rectangle_24 = (View) findViewById(R.id.rectangle_24);
		please_select_category = (TextView) findViewById(R.id.please_select_category);
		enter_your_mobile_number__ek4 = (TextView) findViewById(R.id.enter_your_mobile_number__ek4);
		choose_vehcile_n0_ = (TextView) findViewById(R.id.choose_vehcile_n0_);
		date_of_journey_ = (TextView) findViewById(R.id.date_of_journey_);
		choose_your_feedback_here = (TextView) findViewById(R.id.choose_your_feedback_here);
		rectangle_16_ek1 = (View) findViewById(R.id.rectangle_16_ek1);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		enter_mobile_no__ek4 = (TextView) findViewById(R.id.enter_mobile_no__ek4);
		enter_vehcile_no_ = (TextView) findViewById(R.id.enter_vehcile_no_);
		dd_mm_yyyy = (TextView) findViewById(R.id.dd_mm_yyyy);
		ellipse_6 = (View) findViewById(R.id.ellipse_6);
		ellipse_11 = (View) findViewById(R.id.ellipse_11);
		good = (TextView) findViewById(R.id.good);
		average = (TextView) findViewById(R.id.average);
		bad = (TextView) findViewById(R.id.bad);
		ellipse_9 = (View) findViewById(R.id.ellipse_9);
		ellipse_13 = (View) findViewById(R.id.ellipse_13);
		ellipse_14 = (View) findViewById(R.id.ellipse_14);
		ellipse_8 = (View) findViewById(R.id.ellipse_8);
		ellipse_10 = (View) findViewById(R.id.ellipse_10);
		ellipse_12 = (View) findViewById(R.id.ellipse_12);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		submit_to__msts_ = (TextView) findViewById(R.id.submit_to__msts_);
		driver_behaviour = (TextView) findViewById(R.id.driver_behaviour);
		bus_condition = (TextView) findViewById(R.id.bus_condition);
		driving = (TextView) findViewById(R.id.driving);
		r__2__1 = (ImageView) findViewById(R.id.r__2__1);
		r__1__1 = (ImageView) findViewById(R.id.r__1__1);
		r__3__1 = (ImageView) findViewById(R.id.r__3__1);
	
		
		_r_7_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	