
	 
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

public class ranipur_route_activity extends Activity {

	
	private View _bg__ranipur_route_ek2;
	private View rectangle_14_ek1;
	private TextView ranipur_point_route;
	private ImageView r_1_ek3;
	private ImageView img_20220403_wa0037_1;
	private ImageView _download_1_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ranipur_route);

		
		_bg__ranipur_route_ek2 = (View) findViewById(R.id._bg__ranipur_route_ek2);
		rectangle_14_ek1 = (View) findViewById(R.id.rectangle_14_ek1);
		ranipur_point_route = (TextView) findViewById(R.id.ranipur_point_route);
		r_1_ek3 = (ImageView) findViewById(R.id.r_1_ek3);
		img_20220403_wa0037_1 = (ImageView) findViewById(R.id.img_20220403_wa0037_1);
		_download_1_ek1 = (ImageView) findViewById(R.id._download_1_ek1);
	
		
		_download_1_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), detail_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	