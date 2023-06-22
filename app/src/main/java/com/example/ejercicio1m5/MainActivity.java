package com.example.ejercicio1m5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.ejercicio1m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
 private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = binding.url.getEditableText().toString();
                Fragmentwebview fragment = (Fragmentwebview) getSupportFragmentManager().findFragmentById(R.id.fragmento);
                WebView webView = fragment.getView().findViewById(R.id.Web1);
                webView.loadUrl(url);
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

    }
}