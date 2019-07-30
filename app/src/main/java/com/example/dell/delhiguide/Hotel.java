package com.example.dell.delhiguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Hotel extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //loop all child item of main grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //we can see,all child item is card view,so we just cast object to cardview
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int FinalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //here you can write any corresponding event
                    if (FinalI == 0) {
                        //implicit intent
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://taj.tajhotels.com/en-in/taj-palace-new-delhi/"));
                        startActivity(intent);
                    } else if (FinalI == 1) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.jpsresidency.com/"));
                        startActivity(intent);
                    } else if (FinalI == 2) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.lemeridiennewdelhi.com/"));
                        startActivity(intent);
                    } else if (FinalI == 3) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://new-haven-greater-kailash.delhitophotel.com/en/"));
                        startActivity(intent);
                    } else if (FinalI == 4) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.hotelajanta.com/"));
                        startActivity(intent);
                    } else if (FinalI == 5) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://havelihauzkhas.com/"));
                        startActivity(intent);
                    } else if (FinalI == 6) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.hoteldelhiaerocity.com/"));
                        startActivity(intent);
                    } else if (FinalI == 7) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.lemontreehotels.com/lemon-tree-premier/delhi/delhi-international-airport.aspx"));
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
