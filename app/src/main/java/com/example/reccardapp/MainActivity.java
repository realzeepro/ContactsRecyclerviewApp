package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler View");

        rcv = (RecyclerView) findViewById(R.id.recview);
      //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("WFGS");
        ob1.setDesc("College");
        ob1.setEmail("wfgs@gmail.com");
        ob1.setContact("0992383596");
        ob1.setImgname(R.drawable.wfgs);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Comsats University Islamabad, Abbottabad Campus");
        ob2.setDesc("University");
        ob2.setEmail("info@cuiatd.edu.pk");
        ob2.setContact("(0992) 383596");
        ob2.setImgname(R.drawable.comsats);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Atif Hussain");
        ob3.setDesc("Student");
        ob3.setEmail("atif@gmail.com");
        ob3.setContact("(0992) 383596");
        ob3.setImgname(R.drawable.student);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Umar Raza");
        ob4.setDesc("Student");
        ob4.setEmail("umar@gmail.com");
        ob4.setContact("(0992) 383596");
        ob4.setImgname(R.drawable.student);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("Hammad Hameed");
        ob5.setDesc("Student");
        ob5.setEmail("hammad@gmail.com");
        ob5.setImgname(R.drawable.student);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Harris Khan");
        ob6.setDesc("Student");
        ob6.setEmail("harris@gmail.com");
        ob6.setImgname(R.drawable.student);
        holder.add(ob6);

        Model ob12=new Model();
        ob12.setHeader("City Police");
        ob12.setDesc("Police");
        ob12.setEmail("police@gmail.com");
        ob12.setImgname(R.drawable.java);
        holder.add(ob12);


        Model ob7=new Model();
        ob7.setHeader("Magento Framework");
        ob7.setDesc("PHP Based e-Comm Framework");
        ob7.setImgname(R.drawable.magento);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("Shopify Framework");
        ob8.setDesc("PHP based e-Comm Framework");
        ob8.setImgname(R.drawable.shopify);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("Angular Programming");
        ob9.setDesc("Web Programming");
        ob9.setImgname(R.drawable.angular);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("Python Programming");
        ob10.setDesc("Desktop/Web based Progamming");
        ob10.setImgname(R.drawable.python);
        holder.add(ob10);

        Model ob11=new Model();
        ob11.setHeader("Node JS Programming");
        ob11.setDesc("Web based Programming");
        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob11);


        return holder;
    }


}
