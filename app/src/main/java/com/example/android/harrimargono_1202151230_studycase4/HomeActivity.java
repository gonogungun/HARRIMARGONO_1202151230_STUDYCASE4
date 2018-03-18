package com.example.android.harrimargono_1202151230_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("AsyncTask");
    }

    public void mahasiswa(View view) {
        //intent ke aktivitas mahasiswa
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void gambar(View view) {
        //untuk berpindah ke aktivitas gambar
        Intent intent = new Intent(this, GambarActivity.class);
        startActivity(intent);
    }
}
