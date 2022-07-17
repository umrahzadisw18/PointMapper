
	 
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

public class detail_page_activity extends Activity {

	
	private View _bg__detail_page_ek2;
	private ImageView rectangle_12;
	private TextView details_of_points;
	private ImageView r_1;
	private View rectangle_13;
	private TextView sukkur_point_detail;
	private ImageView r_3;
	private ImageView r_2;
	private View _rectangle_13_ek1;
	private TextView rainpur_point_detail;
	private View rectangle_13_ek2;
	private TextView panoaqil_point_detail;
	private ImageView r_5;
	private ImageView r_4;
	private View rectangle_13_ek3;
	private TextView hostel_point_1_detail;
	private View rectangle_13_ek4;
	private TextView hostel_point_2_detail;
	private ImageView r_6;
	private View rectangle_13_ek5;
	private TextView city_point_detail;
	private ImageView _r_7_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail_page);

		
		_bg__detail_page_ek2 = (View) findViewById(R.id._bg__detail_page_ek2);
		rectangle_12 = (ImageView) findViewById(R.id.rectangle_12);
		details_of_points = (TextView) findViewById(R.id.details_of_points);
		r_1 = (ImageView) findViewById(R.id.r_1);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
		sukkur_point_detail = (TextView) findViewById(R.id.sukkur_point_detail);
		r_3 = (ImageView) findViewById(R.id.r_3);
		r_2 = (ImageView) findViewById(R.id.r_2);
		_rectangle_13_ek1 = (View) findViewById(R.id._rectangle_13_ek1);
		rainpur_point_detail = (TextView) findViewById(R.id.rainpur_point_detail);
		rectangle_13_ek2 = (View) findViewById(R.id.rectangle_13_ek2);
		panoaqil_point_detail = (TextView) findViewById(R.id.panoaqil_point_detail);
		r_5 = (ImageView) findViewById(R.id.r_5);
		r_4 = (ImageView) findViewById(R.id.r_4);
		rectangle_13_ek3 = (View) findViewById(R.id.rectangle_13_ek3);
		hostel_point_1_detail = (TextView) findViewById(R.id.hostel_point_1_detail);
		rectangle_13_ek4 = (View) findViewById(R.id.rectangle_13_ek4);
		hostel_point_2_detail = (TextView) findViewById(R.id.hostel_point_2_detail);
		r_6 = (ImageView) findViewById(R.id.r_6);
		rectangle_13_ek5 = (View) findViewById(R.id.rectangle_13_ek5);
		city_point_detail = (TextView) findViewById(R.id.city_point_detail);
		_r_7_ek1 = (ImageView) findViewById(R.id._r_7_ek1);
	
		
		_rectangle_13_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), ranipur_point_deatail_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_r_7_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	