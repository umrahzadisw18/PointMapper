
	 
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

public class ranipur_point_deatail_activity extends Activity {

	
	private View _bg__ranipur_point_deatail_ek2;
	private View rectangle_14;
	private TextView ali_dur;
	private TextView __923023308282;
	private TextView _6_40_am;
	private TextView _8_00_am;
	private TextView ranipur_point_detail;
	private ImageView r_1_ek2;
	private ImageView _download_1;
	private TextView point_registeration_no;
	private TextView point_route;
	private TextView driver_name;
	private TextView drivercontact_no;
	private TextView starting_time;
	private TextView reaching_time;
	private View line_6;
	private View line_7;
	private View line_8;
	private View line_9;
	private View line_10;
	private View line_11;
	private TextView _781t;
	private TextView ranipur_to_campus;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ranipur_point_deatail);

		
		_bg__ranipur_point_deatail_ek2 = (View) findViewById(R.id._bg__ranipur_point_deatail_ek2);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		ali_dur = (TextView) findViewById(R.id.ali_dur);
		__923023308282 = (TextView) findViewById(R.id.__923023308282);
		_6_40_am = (TextView) findViewById(R.id._6_40_am);
		_8_00_am = (TextView) findViewById(R.id._8_00_am);
		ranipur_point_detail = (TextView) findViewById(R.id.ranipur_point_detail);
		r_1_ek2 = (ImageView) findViewById(R.id.r_1_ek2);
		_download_1 = (ImageView) findViewById(R.id._download_1);
		point_registeration_no = (TextView) findViewById(R.id.point_registeration_no);
		point_route = (TextView) findViewById(R.id.point_route);
		driver_name = (TextView) findViewById(R.id.driver_name);
		drivercontact_no = (TextView) findViewById(R.id.drivercontact_no);
		starting_time = (TextView) findViewById(R.id.starting_time);
		reaching_time = (TextView) findViewById(R.id.reaching_time);
		line_6 = (View) findViewById(R.id.line_6);
		line_7 = (View) findViewById(R.id.line_7);
		line_8 = (View) findViewById(R.id.line_8);
		line_9 = (View) findViewById(R.id.line_9);
		line_10 = (View) findViewById(R.id.line_10);
		line_11 = (View) findViewById(R.id.line_11);
		_781t = (TextView) findViewById(R.id._781t);
		ranipur_to_campus = (TextView) findViewById(R.id.ranipur_to_campus);
	
		
		_download_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), detail_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	