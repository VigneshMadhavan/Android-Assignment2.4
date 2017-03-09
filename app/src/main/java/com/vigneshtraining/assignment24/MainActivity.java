package com.vigneshtraining.assignment24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private ImageView imgView;
    private Boolean isVisible=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.toogleBtn);
        imgView=(ImageView) findViewById(R.id.imageView);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("OnClicked","SSS");
        switch (v.getId()){
            case R.id.toogleBtn:
                if(isVisible){
                    imgView.setVisibility(View.INVISIBLE);
                    btn.setText(R.string.show);
                }else{
                    imgView.setVisibility(View.VISIBLE);
                    btn.setText(R.string.hide);
                }
                isVisible=!isVisible;
                break;
            default:
                 Toast.makeText(MainActivity.this, "Deffault", Toast.LENGTH_LONG);
        }
    }
}
