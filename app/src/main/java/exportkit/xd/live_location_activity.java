
	 
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

public class live_location_activity extends Activity {

	
	private View _bg__live_location_ek3;
	private ImageView screenshot_20220403_120459_1;
	private ImageView rectangle_12_ek1;
	private TextView live_location_of_points;
	private ImageView ellipse_1;
	private TextView muet_szab_campus;
	private View ellipse_2;
	private View ellipse_3;
	private View ellipse_4;
	private View ellipse_5;
	private TextView hostel_point_1;
	private TextView panoaqil_point;
	private TextView sukkur_point;
	private TextView ranipur_point;
	private ImageView _r_7_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.live_location);

		
		_bg__live_location_ek3 = (View) findViewById(R.id._bg__live_location_ek3);
		screenshot_20220403_120459_1 = (ImageView) findViewById(R.id.screenshot_20220403_120459_1);
		rectangle_12_ek1 = (ImageView) findViewById(R.id.rectangle_12_ek1);
		live_location_of_points = (TextView) findViewById(R.id.live_location_of_points);
		ellipse_1 = (ImageView) findViewById(R.id.ellipse_1);
		muet_szab_campus = (TextView) findViewById(R.id.muet_szab_campus);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
		ellipse_5 = (View) findViewById(R.id.ellipse_5);
		hostel_point_1 = (TextView) findViewById(R.id.hostel_point_1);
		panoaqil_point = (TextView) findViewById(R.id.panoaqil_point);
		sukkur_point = (TextView) findViewById(R.id.sukkur_point);
		ranipur_point = (TextView) findViewById(R.id.ranipur_point);
		_r_7_ek2 = (ImageView) findViewById(R.id._r_7_ek2);
	
		
		_r_7_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	