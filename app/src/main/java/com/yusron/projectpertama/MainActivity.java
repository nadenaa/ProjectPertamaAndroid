package com.yusron.projectpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //tipe data

    String namaFirst = "yusron";
    String namaLast = "zahir";


    //deklarasi widget

    TextView txtWelcome;

    EditText etnama, etsekolah;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Full name : " + namaFirst + namaLast);


        //memanggl id dari text view
        txtWelcome = (TextView) findViewById(R.id.txtwelcome);
        etnama = (EditText)findViewById(R.id.etnama);
        etsekolah = (EditText)findViewById(R.id.etsekolah);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        //menambahkan aksi ketika btnsubmit di klik
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nNama = etnama.getText().toString();
                String nSekolah = etsekolah.getText().toString();

                //menampilkan hasil ke txtview
                txtWelcome.setText("Hallo , " + nNama + nSekolah);

            }
        });


        //menampilkan hasil widget ke text view
//        txtWelcome.setText("Hy, " + namaFirst + namaLast);
    }
}
