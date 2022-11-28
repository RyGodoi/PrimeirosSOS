package com.devparadise.primeirossos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;



import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        if(!isNetworkAvailable()==true)
        {
            Intent htmlOff = new Intent(getApplicationContext(), htmlOff.class);
            startActivity(htmlOff);
        }
        else if(isNetworkAvailable()==true)
        {
            Toast.makeText(MainActivity.this,
                    "Bem-Vindo ao Primeiros S.O.S", Toast.LENGTH_LONG).show();
        }







        WebView webView = findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView wView, String url)
            {

                if (url.startsWith("mailto:") || url.startsWith("tel:")) {


                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;


                }
                else if (url.startsWith("https://www.instagram.com/ryanngodoi/")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://api.whatsapp.com/send?phone=5511954482508&text=Ol%C3%A1%20Ryan%2C%20Vim%20pelo%20Site%20Primeiro%20S.O.S")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://github.com/RyGodoi?tab=repositories")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://www.linkedin.com/in/ryan-godoi-b49596227/")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://bvsms.saude.gov.br/engasgo/#:~:text=O%20engasgo%20%C3%A9%20uma%20manifesta%C3%A7%C3%A3o,cartilaginoso%2C%20localizada%20atr%C3%A1s%20da%20l%C3%ADngua.")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://cbm.al.gov.br/paginas/view/13/engasgo")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://bvsms.saude.gov.br/ataque-cardiaco-infarto/#:~:text=O%20infarto%20do%20mioc%C3%A1rdio%2C%20ou,de%20forma%20s%C3%BAbita%20e%20intensa.")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://imeb.com.br/infarto-sintomas-tratamentos-e-causas/")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/a/avc#:~:text=O%20Acidente%20Vascular%20Cerebral%20(AVC,interna%C3%A7%C3%B5es%20em%20todo%20o%20mundo.")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://delboniauriemo.com.br/saude/asma#:~:text=Asma%20%C3%A9%20uma%20doen%C3%A7a%20cr%C3%B4nica,tosse%20e%20falta%20de%20ar.")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://bvsms.saude.gov.br/asma/")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/d/diabetes#:~:text=%C3%89%20uma%20doen%C3%A7a%20causada%20pela,garante%20energia%20para%20o%20organismo.")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://bvsms.saude.gov.br/envenenamento/#:~:text=O%20envenenamento%20ou%20intoxica%C3%A7%C3%A3o%20aguda,dentro%20de%20casa%2C%20envolvendo%20crian%C3%A7as.")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }
                else if (url.startsWith("https://star.med.br/fraturas-osseas-classificacao-diagnostico-tratamento/")) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(url));

                    startActivity(intent);

                    return true;

                }


                return false;
            }
        });

        webView.getSettings().setJavaScriptEnabled(true);
        if(!isNetworkAvailable()==true)
        {
            finish();
        }
        webView.loadUrl("primeirossos.netlify.app");

        webView.getSettings().setDomStorageEnabled(true);

    }

    public boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null) {


            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (capabilities != null) {
                    if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {

                        return true;
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {

                        return true;
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {

                        return true;
                    }
                }
            }
        }

        return false;

    }

    @Override
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
