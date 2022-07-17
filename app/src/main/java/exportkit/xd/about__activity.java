
	 
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

public class about__activity extends Activity {

	
	private View _bg__about__ek2;
	private ImageView rectangle_12_ek6;
	private TextView about_msts_ek1;
	private ImageView _r_7_ek10;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_);

		
		_bg__about__ek2 = (View) findViewById(R.id._bg__about__ek2);
		rectangle_12_ek6 = (ImageView) findViewById(R.id.rectangle_12_ek6);
		about_msts_ek1 = (TextView) findViewById(R.id.about_msts_ek1);
		_r_7_ek10 = (ImageView) findViewById(R.id._r_7_ek10);
	
		
		_r_7_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	