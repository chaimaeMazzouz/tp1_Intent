package com.example.intenttp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend=findViewById(R.id.btnAfficher);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Afficher(v);
            }
        });

    }

    public void Afficher(View view) {
        EditText txt=(EditText)findViewById(R.id.txtMsg);
        String txtmsg=txt.getText().toString();
        Intent t=new Intent(this,AfficherMsgActivity.class);
        t.putExtra("msg",txtmsg);
        startActivity(t);
    }

}
