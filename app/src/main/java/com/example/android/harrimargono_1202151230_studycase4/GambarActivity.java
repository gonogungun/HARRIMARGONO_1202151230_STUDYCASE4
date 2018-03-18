package com.example.android.harrimargono_1202151230_studycase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GambarActivity extends AppCompatActivity {
    //deklarasi variable
    ImageView gambar;
    EditText sumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar);



        gambar = (ImageView)findViewById(R.id.picture);
        sumber = (EditText)findViewById(R.id.link);
    }

    public void cari(View view) {
        //method untuk menampilkan gambar dari internet ke image view
        Picasso.with(GambarActivity.this).load(sumber.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(gambar);
    }
}