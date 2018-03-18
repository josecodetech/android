package ticoticotaa.es.pasardatosactivity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etNombre;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre=(EditText)findViewById(R.id.etNombre);
        btnEnviar=(Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("nombre",etNombre.getText().toString());
        startActivity(intent);
    }
}
