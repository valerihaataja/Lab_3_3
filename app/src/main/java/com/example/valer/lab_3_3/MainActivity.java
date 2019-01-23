package com.example.valer.lab_3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =  getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
    if(item.getItemId() == R.id.birds_menu_item) {
        ((ImageView) findViewById(R.id.image_1)).setImageResource(R.drawable.huuhkaja);
        ((ImageView) findViewById(R.id.image_2)).setImageResource(R.drawable.peippo);
        ((ImageView) findViewById(R.id.image_3)).setImageResource(R.drawable.peukaloinen);
        ((ImageView) findViewById(R.id.image_4)).setImageResource(R.drawable.punatulkku);
    }
    else if (item.getItemId() == R.id.mammals_menu_item) {
        ((ImageView) findViewById(R.id.image_1)).setImageResource(R.drawable.bear);
        ((ImageView) findViewById(R.id.image_2)).setImageResource(R.drawable.wolf);
        ((ImageView) findViewById(R.id.image_3)).setImageResource(R.drawable.elephant);
        ((ImageView) findViewById(R.id.image_4)).setImageResource(R.drawable.lamb);

    }
        return true;
    }
    


}
