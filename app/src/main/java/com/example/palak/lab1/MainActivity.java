package com.example.palak.lab1;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private FrameLayout die1;
    private FrameLayout die2;
    private Button rollDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        die1 = (FrameLayout)findViewById(R.id.die1);
        die2 = (FrameLayout)findViewById(R.id.die2);

        rollDice = (Button)findViewById(R.id.roll_dice);
        rollDice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    public void rollDice(){
        Random random = new Random();
        int number1 = random.nextInt(6);
        int number2 = random.nextInt(6);
        setDie(number1,die1);
        setDie(number2,die2);
    }

    public void setDie(int num , FrameLayout frameLayout) {

        Drawable picture;
        switch (num){
            case 1:
                picture = getResources().getDrawable(R.drawable.die_face_1);
                frameLayout.setBackground(picture);
                break;
            case 2:
                picture = getResources().getDrawable(R.drawable.die_face_2);
                frameLayout.setBackground(picture);
                break;
            case 3:
                picture = getResources().getDrawable(R.drawable.die_face_3);
                frameLayout.setBackground(picture);
                break;
            case 4:
                picture = getResources().getDrawable(R.drawable.die_face_4);
                frameLayout.setBackground(picture);
                break;
            case 5:
                picture = getResources().getDrawable(R.drawable.die_face_5);
                frameLayout.setBackground(picture);
                break;
            case 6:
                picture = getResources().getDrawable(R.drawable.die_face_6);
                frameLayout.setBackground(picture);
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
