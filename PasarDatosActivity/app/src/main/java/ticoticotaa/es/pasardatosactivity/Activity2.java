package ticoticotaa.es.pasardatosactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvSaludo=(TextView)findViewById(R.id.tvSaludo);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras!=null){
            String Nombre = (String)extras.get("nombre");
            tvSaludo.setText("Hola "+Nombre);
        }
    }
}
