package com.javaclass.anima.android01hellolottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2;
    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tv_show = (TextView) findViewById(R.id.tv_show);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("brad", "OK1");
                tv_show.setText(createLottery());

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("brad", "OK2");
                tv_show.setText(createLottery());
            }
        });

    }

    private String createLottery(){
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        return set.toString();
    }

}
