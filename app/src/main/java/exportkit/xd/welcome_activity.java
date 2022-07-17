
	 
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

public class welcome_activity extends Activity {

	
	private View _bg__welcome_ek2;
	private View rectangle_8;
	private TextView umrahzadi_abbasi;
	private TextView muet_szab_transport_system;
	private ImageView oip__1__2;
	private TextView welcome_ek3;
	private View rectangle_10;
	private TextView live_location_of_point;
	private ImageView undraw_best_place_re_lne9_1;
	private View rectangle_11;
	private TextView details_of_point;
	private ImageView undraw_details_8k13_1;
	private View rectangle_11_ek1;
	private TextView about_msts;
	private View rectangle_11_ek2;
	private TextView students_feedback;
	private View rectangle_11_ek3;
	private TextView announcements_ek1;
	private ImageView undraw_start_building_re_xani_1;
	private View rectangle_11_ek4;
	private TextView emergency_contact_ek1;
	private ImageView undraw_visionary_technology_re_jfp7_1;
	private View rectangle_11_ek5;
	private TextView application_ek1;
	private ImageView undraw_my_app_re_gxtj_1;
	private View rectangle_11_ek6;
	private TextView routes_of_point;
	private ImageView undraw_by_the_road_re_vvs7_1;
	private ImageView _img_8_1;
	private ImageView undraw_reviews_lp8w_1;
	private ImageView undraw_about_us_page_re_2jfm_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		
		_bg__welcome_ek2 = (View) findViewById(R.id._bg__welcome_ek2);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		umrahzadi_abbasi = (TextView) findViewById(R.id.umrahzadi_abbasi);
		muet_szab_transport_system = (TextView) findViewById(R.id.muet_szab_transport_system);
		oip__1__2 = (ImageView) findViewById(R.id.oip__1__2);
		welcome_ek3 = (TextView) findViewById(R.id.welcome_ek3);
		rectangle_10 = (View) findViewById(R.id.rectangle_10);
		live_location_of_point = (TextView) findViewById(R.id.live_location_of_point);
		undraw_best_place_re_lne9_1 = (ImageView) findViewById(R.id.undraw_best_place_re_lne9_1);
		rectangle_11 = (View) findViewById(R.id.rectangle_11);
		details_of_point = (TextView) findViewById(R.id.details_of_point);
		undraw_details_8k13_1 = (ImageView) findViewById(R.id.undraw_details_8k13_1);
		rectangle_11_ek1 = (View) findViewById(R.id.rectangle_11_ek1);
		about_msts = (TextView) findViewById(R.id.about_msts);
		rectangle_11_ek2 = (View) findViewById(R.id.rectangle_11_ek2);
		students_feedback = (TextView) findViewById(R.id.students_feedback);
		rectangle_11_ek3 = (View) findViewById(R.id.rectangle_11_ek3);
		announcements_ek1 = (TextView) findViewById(R.id.announcements_ek1);
		undraw_start_building_re_xani_1 = (ImageView) findViewById(R.id.undraw_start_building_re_xani_1);
		rectangle_11_ek4 = (View) findViewById(R.id.rectangle_11_ek4);
		emergency_contact_ek1 = (TextView) findViewById(R.id.emergency_contact_ek1);
		undraw_visionary_technology_re_jfp7_1 = (ImageView) findViewById(R.id.undraw_visionary_technology_re_jfp7_1);
		rectangle_11_ek5 = (View) findViewById(R.id.rectangle_11_ek5);
		application_ek1 = (TextView) findViewById(R.id.application_ek1);
		undraw_my_app_re_gxtj_1 = (ImageView) findViewById(R.id.undraw_my_app_re_gxtj_1);
		rectangle_11_ek6 = (View) findViewById(R.id.rectangle_11_ek6);
		routes_of_point = (TextView) findViewById(R.id.routes_of_point);
		undraw_by_the_road_re_vvs7_1 = (ImageView) findViewById(R.id.undraw_by_the_road_re_vvs7_1);
		_img_8_1 = (ImageView) findViewById(R.id._img_8_1);
		undraw_reviews_lp8w_1 = (ImageView) findViewById(R.id.undraw_reviews_lp8w_1);
		undraw_about_us_page_re_2jfm_1 = (ImageView) findViewById(R.id.undraw_about_us_page_re_2jfm_1);



		String nextScreen=getIntent().getExtras().getString("my_key");
		umrahzadi_abbasi.setText(nextScreen);




		_img_8_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), main_page_activity.class);
				startActivity(nextScreen);
			}
		});
		undraw_best_place_re_lne9_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), live_location_activity.class);
				startActivity(nextScreen);
			}
		});
		undraw_details_8k13_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), detail_page_activity.class);
				startActivity(nextScreen);
			}
		});
		undraw_by_the_road_re_vvs7_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), routes_activity.class);
				startActivity(nextScreen);
			}
		});
		undraw_about_us_page_re_2jfm_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), about__activity.class);
				startActivity(nextScreen);
			}
		});
		undraw_start_building_re_xani_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), anouncement_activity.class);
				startActivity(nextScreen);
			}
		});
	undraw_reviews_lp8w_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), feedback_activity.class);
				startActivity(nextScreen);
			}
		});
		undraw_my_app_re_gxtj_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), application_activity.class);
				startActivity(nextScreen);
			}
		});
		undraw_visionary_technology_re_jfp7_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), emergency_contact_activity.class);
				startActivity(nextScreen);
			}
		});
		
		//custom code goes here
	
	}
}
	
	