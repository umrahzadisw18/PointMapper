
	 
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


import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

	public class register_activity extends AppCompatActivity {

	
	private View _bg__register_ek4;
	private TextView register_ek5;
	private View rectangle_3_ek1;
	private View line_1_ek1;
	private View line_2_ek1;
	private View line_3;
	private View line_4;
	private View line_5;
	private EditText full_name;
	private TextView name_;
	private TextView surname_;
	private TextView department;
	private TextView roll_no_;
	private TextView email_;
	private EditText last_name;
	private EditText name;
	private EditText _18sw45;
	private EditText abc_gmail_com_ek1;
	private View rectangle_4_ek1;
	private TextView submit;
	private ImageView oip__1__1_ek1;
	private ImageView _r_7;
	private DBHelper DB;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);

		
		_bg__register_ek4 = (View) findViewById(R.id._bg__register_ek4);
		register_ek5 = (TextView) findViewById(R.id.register_ek5);
		rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);
		line_1_ek1 = (View) findViewById(R.id.line_1_ek1);
		line_2_ek1 = (View) findViewById(R.id.line_2_ek1);
		line_3 = (View) findViewById(R.id.line_3);
		line_4 = (View) findViewById(R.id.line_4);
		line_5 = (View) findViewById(R.id.line_5);
		full_name = (EditText) findViewById(R.id.full_name);
		name_ = (TextView) findViewById(R.id.name_);
		surname_ = (TextView) findViewById(R.id.surname_);
		department = (TextView) findViewById(R.id.department);
		roll_no_ = (TextView) findViewById(R.id.roll_no_);
		email_ = (TextView) findViewById(R.id.email_);
		last_name = (EditText) findViewById(R.id.last_name);
		name = (EditText) findViewById(R.id.name);
		_18sw45 = (EditText) findViewById(R.id._18sw45);
		abc_gmail_com_ek1 = (EditText) findViewById(R.id.abc_gmail_com_ek1);
		rectangle_4_ek1 = (View) findViewById(R.id.rectangle_4_ek1);
		submit = (TextView) findViewById(R.id.submit);
		oip__1__1_ek1 = (ImageView) findViewById(R.id.oip__1__1_ek1);
		_r_7 = (ImageView) findViewById(R.id._r_7);
		DB=new DBHelper(this);

		_r_7.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			}
		});
		
		rectangle_4_ek1.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					String username=full_name.getText().toString();
					String surname=last_name.getText().toString();
					String department=name.getText().toString();
					String rollno=_18sw45.getText().toString();
					String email=abc_gmail_com_ek1.getText().toString();
					if (username.equals("")) {
						Toast toast = Toast.makeText(getApplicationContext(), "plz Enter Name first", Toast.LENGTH_SHORT);toast.show();
					}else if (surname.equals("")) {
						Toast toast = Toast.makeText(getApplicationContext(), "plz Enter last name first", Toast.LENGTH_SHORT);toast.show();
					}else if (department.equals("")) {
				       Toast toast = Toast.makeText(getApplicationContext(), "plz Enter department first", Toast.LENGTH_SHORT);toast.show();
			       }else if (rollno.equals("")) {
				      Toast toast = Toast.makeText(getApplicationContext(), "plz Enter Roll no first", Toast.LENGTH_SHORT);toast.show();
			       }else if (email.equals("")) {
				     Toast toast = Toast.makeText(getApplicationContext(), "plz Enter Email first", Toast.LENGTH_SHORT);toast.show();
			       }else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
						abc_gmail_com_ek1.setError("please Enter a valid Email Address");
					}
					else{
						Boolean checkuser = DB.checkusername(email);
						if(checkuser==false) {
							Boolean insert = DB.insertData(username, surname, department, rollno, email);
						if (insert == true) {
							Toast.makeText(getApplicationContext(), "Registered successfully", Toast.LENGTH_SHORT).show();
							Intent intent = new Intent(getApplicationContext(), welcome_activity.class);
								startActivity(intent);
							} else
								Toast.makeText(getApplicationContext(), "Registration failed", Toast.LENGTH_SHORT).show();
							 }
						else
							Toast.makeText(getApplicationContext(), "User already exists! please sign in", Toast.LENGTH_SHORT).show();


					}
					return;

				}
		});

	
	}
}
	
	