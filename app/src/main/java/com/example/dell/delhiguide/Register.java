package com.example.dell.delhiguide;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //declaration of sqlite helper
        SQLiteOpenHelper sqLiteOpenHelper;
        db=new DBHelper(this);
        final EditText email=(EditText)findViewById(R.id.editText4);
        final EditText pass=(EditText)findViewById(R.id.editText5);
        final EditText cpass=(EditText)findViewById(R.id.editText);
        final EditText phone=(EditText)findViewById(R.id.editText6);
        final String pattern_email="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        final String pattern_phone="[0-9]+";
        Button reg=(Button)findViewById(R.id.button3);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em=email.getText().toString();
                String pa=pass.getText().toString();
                String cpa=cpass.getText().toString();
                String ph=phone.getText().toString();
                if(email.length()==0)
                {
                    email.requestFocus();
                    email.setError("Email-Id cannot be empty");
                }
                else if(!em.matches(pattern_email))
                {
                    email.requestFocus();
                    email.setError("Enter a valid email-id");
                }
                else if(phone.length()==0 || phone.length()>11)
                {
                    phone.requestFocus();
                    phone.setError("Enter phone number");
                }
                else if(!ph.matches(pattern_phone))
                {
                    phone.requestFocus();
                    phone.setError("Enter valid phone number");
                }
                else{
                    if (pa.equals(cpa)) {
                        Boolean getData = db.getData(em);
                        if (getData == true) {
                            Boolean insert = db.insert(em, pa, ph);
                            if (insert == true) {
                                Toast.makeText(getApplicationContext(), "Registered Sucessfully", Toast.LENGTH_LONG).show();
                                Intent i35=new Intent(Register.this,Login.class);
                                startActivity(i35);
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Email Already Exists", Toast.LENGTH_SHORT).show();
                        }

                    }
                    Toast.makeText(getApplicationContext(),"Password Do not Match",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
