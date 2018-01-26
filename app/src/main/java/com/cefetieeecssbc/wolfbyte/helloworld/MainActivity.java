package com.cefetieeecssbc.wolfbyte.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Widgets
    private Button button;
    private TextView textView;
    private ImageView image_lamp_ON, image_lamp_OFF;

    // Global Variables
    private boolean mySwitch=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        image_lamp_OFF = (ImageView) findViewById(R.id.image_lamp_OFF);
        image_lamp_ON = (ImageView) findViewById(R.id.image_lamp_ON);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mySwitch){
                    textView.setText("ON!");
                    SwitchOnOff(mySwitch);
                    mySwitch = false;
                }else{
                    textView.setText("OFF!");
                    SwitchOnOff(mySwitch);
                    mySwitch = true;
                }
            }
        });
    }

    public void SwitchOnOff(boolean indicador){
        if(indicador){
            image_lamp_OFF.setVisibility(View.GONE);
            image_lamp_ON.setVisibility(View.VISIBLE);
        }else {
            image_lamp_ON.setVisibility(View.GONE);
            image_lamp_OFF.setVisibility(View.VISIBLE);
        }
    }
}