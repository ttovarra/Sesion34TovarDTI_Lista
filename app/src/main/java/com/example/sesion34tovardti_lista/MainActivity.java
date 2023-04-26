package com.example.sesion34tovardti_lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {//inicia clase

   public TextView tvSalidaPrecio;

   public ListView lvProductos;

   private String [] productos = {"TV","CELL","TABLET","Radio","Ipad"};
    private String [] precios = {"$5000","$10000","$1000","$500","$12000"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //integracion de XML a java
        tvSalidaPrecio=findViewById(R.id.tvSalidaPrecio);
        lvProductos=(ListView)findViewById(R.id.lvProductos);

      //adaptacion de arreglo de precios y arreglo de productos mediante un ADAPTER
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productos);
               lvProductos.setAdapter(adapter);//Integra los datos de productos en la lista
        //Programacion de evento click se determina el precio de un producto
        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                             tvSalidaPrecio.setText("Precio venta: "+precios[position]);
            }
        });




    }//termina metodo onCreate




}//termina clase