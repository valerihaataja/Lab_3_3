package com.example.valer.lab_3_3;

import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private char valikko = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((ImageView) findViewById(R.id.image_1)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.image_2)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.image_3)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.image_4)).setOnClickListener(this);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

       if (item.getItemId() == R.id.mammals_menu_item) {
            valikko = 1;
            stopPlaying();
            ((ImageView) findViewById(R.id.image_1)).setImageResource(R.drawable.bear);
            ((ImageView) findViewById(R.id.image_2)).setImageResource(R.drawable.wolf);
            ((ImageView) findViewById(R.id.image_3)).setImageResource(R.drawable.elephant);
            ((ImageView) findViewById(R.id.image_4)).setImageResource(R.drawable.lamb);
    }
       else if (item.getItemId() == R.id.birds_menu_item) {
            valikko = 2;
            stopPlaying();
            ((ImageView) findViewById(R.id.image_1)).setImageResource(R.drawable.huuhkaja);
            ((ImageView) findViewById(R.id.image_2)).setImageResource(R.drawable.peippo);
            ((ImageView) findViewById(R.id.image_3)).setImageResource(R.drawable.peukaloinen);
            ((ImageView) findViewById(R.id.image_4)).setImageResource(R.drawable.punatulkku);




        }
        return true;
    }

    MediaPlayer mediaPlayer;

    @Override
    public void onClick(View v) {
        int ID = v.getId();


        if(valikko == 1){                       //jos ollaan nisäkäsmenussa
            if(ID == R.id.image_1) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.bear);
                mediaPlayer.start();

            }
            if(ID == R.id.image_2) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
                mediaPlayer.start();

            }
            if(ID == R.id.image_3)
            {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
                mediaPlayer.start();

            }
            if(ID == R.id.image_4) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
                mediaPlayer.start();
            }
        }


        if(valikko == 2) {                  //jos ollaan lintumenussa
            if(ID == R.id.image_1) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();

            }
            if(ID == R.id.image_2) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
                mediaPlayer.start();

            }
            if(ID == R.id.image_3)
            {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
                mediaPlayer.start();

            }
            if(ID == R.id.image_4) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
                mediaPlayer.start();

            }
        }


    }
    protected void stopPlaying(){
        // Jos mediaPlayer ei ole null, pysäytetään se
        if(mediaPlayer!=null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


}
