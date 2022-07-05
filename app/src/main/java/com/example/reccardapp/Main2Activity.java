package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Main2Activity extends AppCompatActivity
{
   ImageView img;
   TextView tv1,tv2,tv3,tv4;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img=(ImageView)findViewById(R.id.desc_img);
        tv1=(TextView)findViewById(R.id.desc_header);
        tv2=(TextView)findViewById(R.id.desc_desc);
        tv3=(TextView)findViewById(R.id.desc_email);
        tv4=(TextView)findViewById(R.id.desc_contact);

        if (getIntent().getStringExtra("desc").equals("College")){
            img.setImageResource(getIntent().getIntExtra("imagename",0));
        }
        else if (getIntent().getStringExtra("desc").equals("University")){
            img.setImageResource(getIntent().getIntExtra("imagename",0));
        }

        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
        tv3.setText(getIntent().getStringExtra("email"));
        tv4.setText(getIntent().getStringExtra("contact"));

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(getIntent().getStringExtra("contact") != null){
                    String phone = getIntent().getStringExtra("contact");
                    Intent i = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                }
                else{
                    displayMessage();
                }

            }
        });

    }
    public void displayMessage(){
        Toast.makeText(this, "Contact Not Saved!",Toast.LENGTH_LONG).show();
    }

}
