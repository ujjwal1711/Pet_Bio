package com.example.pet.pet_bio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Bioactivity extends AppCompatActivity {
    private ImageView bioimage;
    private TextView namebio;
    private TextView aboutbio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bioactivity);
        bioimage = (ImageView) findViewById(R.id.biopic);
        namebio=(TextView) findViewById(R.id.namebio);
        aboutbio=(TextView) findViewById(R.id.aboutbio);
        extras=getIntent().getExtras();
        if(extras!=null)
        {
            String name =extras.getString("name");
            String bio =extras.getString("about");
            setup(name,bio);
        }
    }
    public void setup(String name,String bio)
    {
     if(name.equals("Charlie"))
     {
       bioimage.setImageDrawable(getResources().getDrawable(R.drawable.cat1));
         namebio.setText(name);
         aboutbio.setText(bio);
     }
     else if(name.equals("Bruno"))
     {
         bioimage.setImageDrawable(getResources().getDrawable(R.drawable.dog_png2403));
         namebio.setText(name);
         aboutbio.setText(bio);
     }
    }
}
