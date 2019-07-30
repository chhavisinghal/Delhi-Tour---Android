package com.example.dell.delhiguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Shopping extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        mainGrid=(GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);

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
                        //implicit intent
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.delhitourism.gov.in/delhitourism/shopping/sarojini_nagar.jsp"));
                        startActivity(intent);
                    }
                    else if(FinalI==1)
                    {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.delhitourism.gov.in/delhitourism/shopping/janpath.jsp"));
                        startActivity(intent);
                    }
                    else if(FinalI==2)
                    {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.selectcitywalk.com/about-us"));
                        startActivity(intent);
                    }
                    else if(FinalI==3)
                    {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.delhitourism.gov.in/delhitourism/shopping/palika_bazar.jsp"));
                        startActivity(intent);
                    }
                    else if(FinalI==4)
                    {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.delhitourism.gov.in/delhitourism/shopping/chandni_chowk.jsp"));
                        startActivity(intent);
                    }
                    else if(FinalI==5)
                    {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.dlfemporio.com/"));
                        startActivity(intent);
                    }
                    else if(FinalI==6)
                    {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.carmaonlineshop.com/pages/carma-mehurauli-store/pgid-1190154.aspx"));
                        startActivity(intent);
                    }
                    else if(FinalI==7)
                    {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.delhitourism.gov.in/delhitourism/tourist_place/dilli_haat.jsp"));
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
