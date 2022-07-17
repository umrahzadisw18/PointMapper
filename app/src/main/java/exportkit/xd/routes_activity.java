
	 
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

public class routes_activity extends Activity {

	
	private View _bg__routes_ek2;
	private ImageView rectangle_12_ek3;
	private TextView routes_of_points;
	private ImageView r_1_ek1;
	private View rectangle_13_ek6;
	private TextView sukkur_point_route;
	private ImageView r_2_ek1;
	private View rectangle_13_ek7;
	private TextView rainpur_point_route;
	private ImageView r_3_ek1;
	private View rectangle_13_ek8;
	private TextView panoaqil_point_route;
	private ImageView r_5_ek1;
	private ImageView r_4_ek1;
	private View rectangle_13_ek9;
	private TextView hostel_point_1_route;
	private View rectangle_13_ek10;
	private TextView hostel_point_2_route;
	private ImageView r_6_ek1;
	private View rectangle_13_ek11;
	private TextView city_point_route;
	private ImageView _r_7_ek4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.routes);

		
		_bg__routes_ek2 = (View) findViewById(R.id._bg__routes_ek2);
		rectangle_12_ek3 = (ImageView) findViewById(R.id.rectangle_12_ek3);
		routes_of_points = (TextView) findViewById(R.id.routes_of_points);
		r_1_ek1 = (ImageView) findViewById(R.id.r_1_ek1);
		rectangle_13_ek6 = (View) findViewById(R.id.rectangle_13_ek6);
		sukkur_point_route = (TextView) findViewById(R.id.sukkur_point_route);
		r_2_ek1 = (ImageView) findViewById(R.id.r_2_ek1);
		rectangle_13_ek7 = (View) findViewById(R.id.rectangle_13_ek7);
		rainpur_point_route = (TextView) findViewById(R.id.rainpur_point_route);
		r_3_ek1 = (ImageView) findViewById(R.id.r_3_ek1);
		rectangle_13_ek8 = (View) findViewById(R.id.rectangle_13_ek8);
		panoaqil_point_route = (TextView) findViewById(R.id.panoaqil_point_route);
		r_5_ek1 = (ImageView) findViewById(R.id.r_5_ek1);
		r_4_ek1 = (ImageView) findViewById(R.id.r_4_ek1);
		rectangle_13_ek9 = (View) findViewById(R.id.rectangle_13_ek9);
		hostel_point_1_route = (TextView) findViewById(R.id.hostel_point_1_route);
		rectangle_13_ek10 = (View) findViewById(R.id.rectangle_13_ek10);
		hostel_point_2_route = (TextView) findViewById(R.id.hostel_point_2_route);
		r_6_ek1 = (ImageView) findViewById(R.id.r_6_ek1);
		rectangle_13_ek11 = (View) findViewById(R.id.rectangle_13_ek11);
		city_point_route = (TextView) findViewById(R.id.city_point_route);
		_r_7_ek4 = (ImageView) findViewById(R.id._r_7_ek4);
	
		
		_r_7_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	