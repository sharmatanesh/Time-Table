package com.example.td;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        if((backtime+2000)>System.currentTimeMillis()){super.onBackPressed(); return;}
        else{Toast t=Toast.makeText(this,"Press again to exit",Toast.LENGTH_SHORT); t.show();}
        backtime=System.currentTimeMillis();
    }

    public void mon(View view) {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }

    public void tue(View view) {
        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);
    }

    public void wed(View view) {
        Intent i=new Intent(this,Main4Activity.class);
        startActivity(i);
    }

    public void thu(View view) {
        Intent i=new Intent(this,Main5Activity.class);
        startActivity(i);
    }

    public void fri(View view) {
        Intent i=new Intent(this,Main6Activity.class);
        startActivity(i);
    }

    public void sat(View view) {
        Intent i=new Intent(this,Main7Activity.class);
        startActivity(i);
    }
}
