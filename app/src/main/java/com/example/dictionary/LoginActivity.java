package com.example.dictionary;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText etusername, etpassword;
    private Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);
        btnregister = findViewById(R.id.btnregister);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });

    }

    public void Login() {

    SharedPreferences sharedPreferences = getSharedPreferences("User", MODE_PRIVATE);
    String Username = sharedPreferences.getString("username", "");
    String password = sharedPreferences.getString("password", "");
    if(Username.equals(etusername.getText().toString()) &&
            password.equals(etpassword.getText().toString())){
        Toast.makeText(this, "Successfully", Toast.LENGTH_SHORT).show();

    }

    else {
        Toast.makeText(this, "Unsuccessfully", Toast.LENGTH_SHORT).show();
    }
}

}
