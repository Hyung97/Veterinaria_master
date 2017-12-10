package net.programas.viris.veterinaria_master;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnInicio;
    Intent ir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializar();
        accionesBoton();
    }
    private void initializar(){
        btnInicio = (Button) findViewById(R.id.activity_main_btnInicio);
    }

    private void accionesBoton() {
        btnInicio.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PaginaInicio();
                    }
                }
        );
    }

    public void PaginaInicio() {
        ir = new Intent(this, login.class);
        this.startActivity(ir);
    }
}
