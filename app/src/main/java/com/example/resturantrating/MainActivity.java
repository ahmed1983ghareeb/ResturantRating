package com.example.resturantrating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText editTextUser;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUser = findViewById(R.id.editTextUserType);
        editTextUser.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        try {
            switch (editTextUser.getText().toString()) {
                case "client":
                    intent = new Intent(this, Client.class);
                    startActivityForResult(intent,1);
                    break;
                case "admin":
                    intent = new Intent(this, Admin.class);
                    startActivity(intent);
                    break;
            }

        }
        catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }
}
