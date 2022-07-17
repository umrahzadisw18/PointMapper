
	 
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
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


	public class login_activity extends AppCompatActivity {

	
	private View _bg__login_ek2;
	private TextView login_ek3;
	private TextView _register;
	private View rectangle_3;
	private TextView login_ek4;
	private View line_1;
	private View line_2;
	private EditText email;
	private TextView Email;
	private TextView password_;
	private EditText password;
	private View _rectangle_4;
	private TextView login_ek5;
	private View rectangle_5;
	private TextView register_ek1;
	private TextView forget_password_;
	private ImageView oip__1__1;
    private DBHelper DB;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);


		
		_bg__login_ek2 = (View) findViewById(R.id._bg__login_ek2);
		login_ek3 = (TextView) findViewById(R.id.login_ek3);
		_register = (TextView) findViewById(R.id._register);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		login_ek4 = (TextView) findViewById(R.id.login_ek4);
		line_1 = (View) findViewById(R.id.line_1);
		line_2 = (View) findViewById(R.id.line_2);
		email = (EditText) findViewById(R.id.email);
		String mytext = email.getText().toString();
		Email = (TextView) findViewById(R.id.Email);
		password_ = (TextView) findViewById(R.id.password_);
		password = (EditText) findViewById(R.id.password);
		String mytext1=password.getText().toString();
		_rectangle_4 = (View) findViewById(R.id._rectangle_4);
		login_ek5 = (TextView) findViewById(R.id.login_ek5);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		register_ek1 = (TextView) findViewById(R.id.register_ek1);
		forget_password_ = (TextView) findViewById(R.id.forget_password_);
		oip__1__1 = (ImageView) findViewById(R.id.oip__1__1);
		DB=new DBHelper(this);
	
		
		_register.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), register_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		rectangle_5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), register_activity.class);
				startActivity(nextScreen);
			}
		});
		
		
		_rectangle_4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				String user=email.getText().toString();
				String pass=password.getText().toString();
//				String passwordval="^"+
//						"(?=.*[a-zA-Z])"+
//						"(?=\\s+$)"+
//						".{6,}"+
//						"$";
				if (user.equals("")) {
					Toast toast = Toast.makeText(getApplicationContext(), "plz Enter Email first", Toast.LENGTH_SHORT);
					toast.show();
				}else if(!Patterns.EMAIL_ADDRESS.matcher(user).matches()) {
                       email.setError("please Enter a valid Email Address");
					}
				else if (pass.equals("")) {
						Toast toast = Toast.makeText(getApplicationContext(), "plz Enter password first", Toast.LENGTH_SHORT);
						toast.show();}
//					else if(!pass.matches(passwordval)) {
//					password.setError("password is too weak");
//				}
				else {

					Boolean checkuser = DB.checkusername(user);
						if (checkuser == true) {
							Toast.makeText(getApplicationContext(), "Sign in successfull", Toast.LENGTH_SHORT).show();
							Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);nextScreen.putExtra("my_key",user);
							startActivity(nextScreen);
						} else {
							Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
						}
					}
					return;

			}
		});
	}
}
	
	