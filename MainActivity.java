package com.example.registrationpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void togo(View view) {
        EditText UsernameEditText = (EditText) findViewById(R.id.editTextTextPersonName);
        Log.i("username", UsernameEditText.getText().toString());
        EditText AddressEditText = (EditText) findViewById(R.id.editTextTextPostalAddress);
        Log.i("Address", AddressEditText.getText().toString());
        EditText PasswordEditText = (EditText) findViewById(R.id.editTextTextPassword);
        Log.i("password", PasswordEditText.getText().toString());
        final TextView WELCOME = (TextView) findViewById(R.id.textView);
        Log.i("WELCOME", WELCOME.getText().toString());
        EditText phonenoEditText = (EditText) findViewById(R.id.editTextPhone);
        Log.i("phone no.", phonenoEditText.getText().toString());

        Switch Channelpartner = (Switch) findViewById(R.id.switch1);
        Switch Employee = (Switch) findViewById(R.id.switch2);
        Switch Shramik = (Switch) findViewById(R.id.switch3);
        Button togo = (Button) findViewById(R.id.button);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}