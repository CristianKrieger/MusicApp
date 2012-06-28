package com.ludittetechnology.compoundtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class Login extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
    }
    
    /**
     * Listeners para botones de interfaz de Login
     */
    public void login(View v){
    	Toast.makeText(getApplicationContext(), "Normal", Toast.LENGTH_SHORT).show();
    }
    
    public void loginWithFacebook(View v){
    	Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_SHORT).show();
    }
    
    public void signUp(View v){
    	Toast.makeText(getApplicationContext(), "Sign Up", Toast.LENGTH_SHORT).show();
    }
    
    public void forgotPassword(View v){
    	Toast.makeText(getApplicationContext(), "Forgot", Toast.LENGTH_SHORT).show();
    }
}