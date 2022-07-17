
	 
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

public class anouncement_activity extends Activity {

	
	private View _bg__anouncement_ek2;
	private ImageView rectangle_12_ek2;
	private TextView anouncements;
	private TextView no_announcement_for_yet__;
	private ImageView _r_7_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.anouncement);

		
		_bg__anouncement_ek2 = (View) findViewById(R.id._bg__anouncement_ek2);
		rectangle_12_ek2 = (ImageView) findViewById(R.id.rectangle_12_ek2);
		anouncements = (TextView) findViewById(R.id.anouncements);
		no_announcement_for_yet__ = (TextView) findViewById(R.id.no_announcement_for_yet__);
		_r_7_ek3 = (ImageView) findViewById(R.id._r_7_ek3);
	
		
		_r_7_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	