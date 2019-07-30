package com.example.dell.delhiguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainPage extends AppCompatActivity {
    ViewFlipper v_flipper;
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        mainGrid=(GridLayout)findViewById(R.id.mainGrid);

        int images[]={R.drawable.at,R.drawable.cp,R.drawable.dh,R.drawable.food,R.drawable.ig,R.drawable.lt,R.drawable.metro,R.drawable.rf};
        v_flipper=(ViewFlipper)findViewById(R.id.vf);
        for(int i=0;i<images.length;i++)
        {
            flipperImages(images[i]);
        }

        setSingleEvent(mainGrid);

    }
    public void flipperImages(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);
        //set animation
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    private void setSingleEvent(GridLayout mainGrid)
    {
        //loop all child item of main grid
        for(int i=0;i<mainGrid.getChildCount();i++)
        {
            //we can see,all child item is card view,so we just cast object to cardview
            CardView cardView=(CardView)mainGrid.getChildAt(i);
            final int FinalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //here you can write any corresponding event
                    if(FinalI==0)
                    {
                        //explicit intent
                        Intent hotel=new Intent(MainPage.this,CityMap.class);
                        startActivity(hotel);
                        Toast.makeText(getApplicationContext(),"City map", Toast.LENGTH_SHORT).show();
                    }
                    else if(FinalI==1)
                    {
                        Intent hotel=new Intent(MainPage.this,Hotel.class);
                        startActivity(hotel);
                    }
                    else if(FinalI==2)
                    {
                        Intent hotel=new Intent(MainPage.this,Restaurant.class);
                        startActivity(hotel);
                    }
                    else if(FinalI==3)
                    {
                        Intent hotel=new Intent(MainPage.this,Places.class);
                        startActivity(hotel);
                    }
                    else if(FinalI==4)
                    {
                        Intent hotel=new Intent(MainPage.this,Shopping.class);
                        startActivity(hotel);
                    }
                    else if(FinalI==5)
                    {
                        Intent hotel=new Intent(MainPage.this,Facts.class);
                        startActivity(hotel);
                    }
                }
            });
        }
    }
}
