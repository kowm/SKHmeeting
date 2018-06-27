package kowm.sangkhahospital.com.skhmeeting;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kowm.sangkhahospital.com.skhmeeting.fragment.Mainflagment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     Add fragment to Activity
        if (savedInstanceState == null){

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentmainflagment,new Mainflagment())
                    .commit();
        }

    } //main Method

}  //main Class
