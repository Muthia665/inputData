package com.example.user.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn;
    EditText input;
    TextView txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btnHitung);
        input = findViewById(R.id.editText);
        txthasil = findViewById(R.id.txtHasil);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sisi = Float.parseFloat(input.getText().toString());
                float hasil = sisi * sisi;
                txthasil.setText ("Hasil =" + hasil + "");
            }
        });

    }
}
