package ejbm.mac.com.services;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;

import android.os.IBinder;
import android.util.Log;


public class Serv extends /*Intent*/ Service {

    private final static String TAG = "EJBM-Service[Prueba]::";

    public final static String SERV_TAG = "EJBM_SERV_1-" ;


/*    public Serv(String name) {
        //super( "" );
    }*/


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //TODO do something useful
        Log.d( TAG, "Service starting...") ;

        publishExtras ( intent ) ;


        return Service.START_NOT_STICKY;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);

        Log.d(TAG, "Service starting...") ;
    }

    @Override
    public IBinder onBind(Intent intent) {
        //TODO for communication return IBinder implementation

        Log.d(TAG, "Binding to Service...") ;

        publishExtras ( intent ) ;

        return null;
    }

//    @Override
//    protected void onHandleIntent(Intent intent) {
//        Log.d(TAG, "Intent being handle " + intent + " ...") ;
//
//        publishExtras ( intent ) ;
//    }


    private void publishExtras ( Intent i ) {

        for ( String key  : i.getExtras().keySet() ) {
            Log.d( TAG, "\t> " + key + " >> " + i.getExtras().get( key ) ) ;
        }

    }

}
