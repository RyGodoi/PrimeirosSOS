package com.devparadise.primeirossos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class htmlOff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_off);

        Toast.makeText(this, "Voce esta sem INTERNET!! Para reconexão, reiniciar o aplicativo.", Toast.LENGTH_SHORT).show();

        WebView webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/semInternet/index.html");
        webView.getSettings().setDomStorageEnabled(true);
    }
    public void onBackPressed() {
        WebView webView = findViewById(R.id.webview);
        if (webView.canGoBack()){
            webView.goBack();
            Toast.makeText(this, "Voltou uma pagina", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Fechando Primeiros S.O.S", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }
    }



}
