package com.example.searhdevice;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


public class SearchDeviceLibrary {

    public  void search(Context c , String saludo, String saludo2){
        Toast.makeText(c, saludo, Toast.LENGTH_SHORT).show();
        Log.i("prueba :: ","Ya estamos dentro de la libreria :: " + saludo);
        Log.i("test","Test");
        Toast.makeText(c, saludo2, Toast.LENGTH_SHORT).show();
        Log.i("Test2", "probando la libreria");
        Log.i("Test3", "probando la libreria");
    }

    public void test(Context c){
        Toast.makeText(c, "No le pasamos el saludos como parametro", Toast.LENGTH_SHORT).show();
    }
}
