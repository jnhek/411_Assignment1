package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.GridLayout;
import android.view.Gravity;
import android.widget.HorizontalScrollView;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView hs = new HorizontalScrollView(this);
        HorizontalScrollView.LayoutParams cParams = new HorizontalScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        hs.setLayoutParams(cParams);

        GridLayout myGrid = new GridLayout(this);
        myGrid.setRowCount(12);
        myGrid.setColumnCount(5);

        TextView TV;
        GridLayout.LayoutParams tParam;

        TV = new TextView(this);
        TV.setText("Rules void hello1(int hour)");
        TV.setTextColor(WHITE);
        TV.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TV.setBackgroundColor(Color.BLACK);
        tParam = new GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(1,4));
        //GridLayout.Spec row1_spec = GridLayout.spec(0, 1);
       //GridLayout.Spec col1_spec = GridLayout.spec(1, 7);
        //GridLayout.LayoutParams tParam = new GridLayout.LayoutParams(row1_spec, col1_spec);
        //TV.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tParam.setGravity(Gravity.CENTER);
        TV.setLayoutParams(tParam);
        myGrid.addView(TV);

        TV = new TextView(this);
        TV.setText("properties");
        TV.setPadding((int) (getResources().getDisplayMetrics().density * 16 + 0.5f),0,(int)(getResources().getDisplayMetrics().density * 16 + 0.5f),0);
        tParam = new GridLayout.LayoutParams(GridLayout.spec(1,2),GridLayout.spec(1));
        tParam.setGravity(Gravity.CENTER);
        myGrid.addView(TV);

        TV = new TextView(this);
        TV.setText("name");
        tParam = new GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(2,2));
        tParam.setGravity(Gravity.CENTER);
        TV.setLayoutParams(tParam);
        myGrid.addView(TV);

        TV = new TextView(this);
        TV.setText("category");
        tParam = new GridLayout.LayoutParams(GridLayout.spec(2), GridLayout.spec(2,2));
        tParam.setGravity(Gravity.CENTER);
        TV.setLayoutParams(tParam);
        myGrid.addView(TV);

        TV = new TextView(this);
        TV.setText("Day Hour Classification");
        tParam = new GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(4));
        tParam.setGravity(Gravity.LEFT);
        TV.setLayoutParams(tParam);
        myGrid.addView(TV);

        TV = new TextView(this);
        TV.setText("Day and Time");
        tParam = new GridLayout.LayoutParams(GridLayout.spec(2), GridLayout.spec(4));
        tParam.setGravity(Gravity.LEFT);
        TV.setLayoutParams(tParam);
        myGrid.addView(TV);

        int myBlue = Color.parseColor("#7fc5f0");

        TV = new TextView(this);
        TV.setText("Rule");
        TV.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TV.setTypeface(Typeface.DEFAULT_BOLD);
        tParam = new GridLayout.LayoutParams(GridLayout.spec(3), GridLayout.spec(1));
        tParam.setGravity(Gravity.FILL);
        TV.setBackgroundColor(myBlue);
        myGrid.addView(TV);



        hs.addView(myGrid);
        setContentView(hs);
    }
}
