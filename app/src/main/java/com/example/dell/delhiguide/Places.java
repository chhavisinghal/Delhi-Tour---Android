package com.example.dell.delhiguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageHelper;
import android.view.View;
import android.widget.ImageView;

public class Places extends AppCompatActivity {

    ImageView iv1,iv2,iv3,iv4,iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        iv1=(ImageView)findViewById(R.id.iv20);
        iv2=(ImageView)findViewById(R.id.iv21);
        iv3=(ImageView)findViewById(R.id.iv22);
        iv4=(ImageView)findViewById(R.id.iv23);
        iv5=(ImageView)findViewById(R.id.iv24);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historic=new Intent(Places.this,Historical.class);
                startActivity(historic);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent romantic=new Intent(Places.this,Romantic.class);
                startActivity(romantic);
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent worship=new Intent(Places.this,Worship.class);
                startActivity(worship);
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent haunted=new Intent(Places.this,Haunted.class);
                startActivity(haunted);
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museum=new Intent(Places.this,Museum.class);
                startActivity(museum);
            }
        });



    }
}
