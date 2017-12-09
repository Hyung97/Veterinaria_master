package net.programas.viris.veterinaria_master;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;

public class Clientes extends AppCompatActivity{
    ListView listView;
    ArrayList<Cliente> lista;
    ImageButton btnMas;
    Intent cargar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);
        listView = (ListView) findViewById(R.id.listView);

        lista = new ArrayList<Cliente>();

        btnMas = (ImageButton) findViewById(R.id.principalClientesAdd);

        btnMas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                }
        );
    }

}