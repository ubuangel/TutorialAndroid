package com.example.miapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*indicar que componentes utilizar  utilizar*/
    private EditText etext1;
    private EditText etext2;
    private TextView tv;



/*identificar cononbenete por el  id*/
    /*regresar y el valor los bas a guardar en edittext1*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*encuentra la vista por suid con la yuda de la clase R (crear de manera auotatei puente comunicacion parte logica y grafica*/
etext1=(EditText)findViewById(R.id.textoid);
        etext2=(EditText)findViewById(R.id.textoid2);

    tv=(TextView)findViewById(R.id.textoResultado);
    }

    /*este metodo realiza la suma*/

    public void Sumar(View view){
        /*resiviendo texto por ahora*
        cuando se obtine valore  de campos que son los texview no llegan como teexto entonces lo parseamos  a string*/
String valor1=etext1.getText().toString();
        String valor2=etext2.getText().toString();


        int numero1=Integer.parseInt(valor1);
        int numero2=Integer.parseInt(valor2);
        int suma =numero1+numero2;

        String mostrar=String .valueOf(suma);

        tv.setText(mostrar);


    }



}