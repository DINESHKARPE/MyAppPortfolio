package com.udacity.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
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

    public void sendMessage(View view) {
        switch (view.getId()) {
            case R.id.button:
                Toast.makeText(getApplicationContext(),"This button will launch Spotify Streamer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"This button will launch Scores App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(),"This button will launch Library App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(),"This button will launch XYZ Reader",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(),"This button will launch Capstone: my own app",Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
