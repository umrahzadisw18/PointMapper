
	 
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
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

	public class main_page_activity extends AppCompatActivity {

	
	private View _bg__main_page_ek2;
	private ImageView rectangle_2;
	private View rectangle_6;
	private ImageView transit_on_demand_1;
	private TextView point_mapper;
	private Button button;
	private TextView explore_your_way;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_page);

		
		_bg__main_page_ek2 = (View) findViewById(R.id._bg__main_page_ek2);
		rectangle_2 = (ImageView) findViewById(R.id.rectangle_2);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		transit_on_demand_1 = (ImageView) findViewById(R.id.transit_on_demand_1);
		point_mapper = (TextView) findViewById(R.id.point_mapper);
		button = (Button) findViewById(R.id.button);
		//explore_your_way = (TextView) findViewById(R.id.explore_your_way);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view)
			{
				// Creating explicit intent
				Intent intent = new Intent(getApplicationContext(),login_activity.class);
				startActivity(intent);
			}
		});
		//custom code goes here
	
	}
}
	
	