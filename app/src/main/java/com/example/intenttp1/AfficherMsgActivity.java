package com.example.intenttp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AfficherMsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_msg);
        TextView lbl=(TextView)findViewById(R.id.lblMsg);
        String m=lbl.getText().toString()+" "+ getIntent().getStringExtra("msg");
        lbl.setText(m);

    }
}
