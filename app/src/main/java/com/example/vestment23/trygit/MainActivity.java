package com.example.vestment23.trygit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView helloWorld = findViewById(R.id.hello);

        String msg = "welcome now !";
        helloWorld.setText(msg);




    }

    public void onClickHello(View view) {
        int x = 10 ;
        startActivity(new Intent(this, SecondActivity.class));

    }
}
