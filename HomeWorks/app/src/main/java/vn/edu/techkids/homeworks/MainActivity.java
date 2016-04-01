package vn.edu.techkids.homeworks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpen_1 = (Button)findViewById(R.id.btn_R_1);
        btnOpen_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRedActivity();
            }
        });

        Button btnOpen_2 = (Button)findViewById(R.id.btn_R_2);
        btnOpen_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRedActivity();
            }
        });
        Button btnOpen_3 = (Button)findViewById(R.id.btn_R_3);
        btnOpen_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRedActivity();
            }
        });
        Button btnOpen_4 = (Button)findViewById(R.id.btn_R_4);
        btnOpen_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRedActivity();
            }
        });
        Button btnOpen_5 = (Button)findViewById(R.id.btn_R_5);
        btnOpen_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRedActivity();
            }
        });
        Button btnOpen_6 = (Button)findViewById(R.id.btn_R6);
        btnOpen_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRedActivity();
            }
        });
        Button btnOpen_7 = (Button)findViewById(R.id.btn_R7);
        btnOpen_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenRedActivity();
            }
        });

        Button btnOpenBlue_1 = (Button)findViewById(R.id.btn_B1);
        btnOpenBlue_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenBlueActivity();
            }
        });
        Button btnOpenBlue_2 = (Button)findViewById(R.id.btn_B2);
        btnOpenBlue_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenBlueActivity();
            }
        });
        Button btnOpenBlue_3 = (Button)findViewById(R.id.btn_B3);
        btnOpenBlue_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenBlueActivity();
            }
        });
        Button btnOpenBlue_4 = (Button)findViewById(R.id.btn_B4);
        btnOpenBlue_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenBlueActivity();
            }
        });
        Button btnOpenBlue_5 = (Button)findViewById(R.id.btn_B5);
        btnOpenBlue_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenBlueActivity();
            }
        });

    }

    public void doOpenRedActivity(){
        Intent intentRed = new Intent(this, RedActivity.class);
        startActivity(intentRed);

    }

    public void doOpenBlueActivity(){
        Intent intenBlue = new Intent(this, BlueActivity.class);
        startActivity(intenBlue);
    }
}
