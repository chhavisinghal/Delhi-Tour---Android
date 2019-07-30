package com.example.dell.delhiguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        VideoView delhi=(VideoView)findViewById(R.id.videoView);
        TextView id=(TextView)findViewById(R.id.textView5);
        id.setText("Welcome,"+getIntent().getExtras().getString("email"));
        Toast.makeText(getApplicationContext(),"Welcome To Delhi Tourism ", Toast.LENGTH_LONG).show();
        Button tour=(Button)findViewById(R.id.button4);
        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i46=new Intent(Welcome.this,MainPage.class);
                startActivity(i46);
            }
        });
        //Creating Media Controller
        MediaController mc=new MediaController(this);
        mc.setAnchorView(delhi);
        //specifying location of media file
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.m);
        delhi.setMediaController(mc);
        delhi.setVideoURI(uri);
        delhi.requestFocus();
        delhi.start();
    }
}
