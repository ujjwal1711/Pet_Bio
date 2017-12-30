package com.example.pet.pet_bio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView cat;
    private ImageView dog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cat =(ImageView) findViewById(R.id.catid);
        dog=(ImageView) findViewById(R.id.dogid);
        cat.setOnClickListener(this);
        dog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.catid :
            Intent catintent =new Intent(MainActivity.this,Bioactivity.class);
                catintent.putExtra("name","Charlie");
                catintent.putExtra("about","   Great cat .Loves to sleep and moews a lot.");
                //Toast.makeText(MainActivity.this,"cat is clicked",Toast.LENGTH_SHORT).show();
                startActivity(catintent);
                break;
            case R.id.dogid:
                Intent dogintent=new Intent(MainActivity.this,Bioactivity.class);
                dogintent.putExtra("name","Bruno");
                dogintent.putExtra("about","  Great dog . Loves to eat and barks a lot.");
                startActivity(dogintent);
                break;
        }
    }
}
