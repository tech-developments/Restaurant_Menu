package com.princehirpara.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Four different objects for four different card views...
    public CardView starterscard, maincoursescard, dessertscard, drinkscard;

    // When the app is open then the code in this section will run...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find particular card view and assign it to those objects...
        starterscard = (CardView) findViewById(R.id.starterscard);
        maincoursescard = (CardView) findViewById(R.id.maincoursescard);
        dessertscard = (CardView) findViewById(R.id.dessertscard);
        drinkscard = (CardView) findViewById(R.id.drinkscard);

        // Assign onClickListner to every object
        starterscard.setOnClickListener(this);
        maincoursescard.setOnClickListener(this);
        dessertscard.setOnClickListener(this);
        drinkscard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) { // Whenever you click on that particular view it will get this Id of the view...

            case R.id.starterscard :
                i = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(i);
                break;

            case R.id.maincoursescard :
                i = new Intent(MainActivity.this, MainCoursesActivity.class);
                startActivity(i);
                break;

            case R.id.dessertscard :
                i = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(i);
                break;

            case R.id.drinkscard :
                i= new Intent(MainActivity.this, DrinksActivity.class);
                startActivity(i);
                break;
        }

    }
}