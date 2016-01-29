package ejbm.mac.com.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runTheService (View view) {

        Intent intent = new Intent(this, Serv.class);
        // add infos for the service which file to download and where to store
        intent.putExtra( Serv.SERV_TAG + "var1" , "XXXXX");
        intent.putExtra( Serv.SERV_TAG + "var2" , "YYYYY");
        intent.putExtra( Serv.SERV_TAG + "var3" , "55555");

        intent.putExtra( "varx" , "VVVVV");

        startService(intent);

    }
}
