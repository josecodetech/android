package ticoticotaa.es.marcadorbaloncesto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView marcadorLocal, marcadorVisitante,titulo;
    public Button btn1Local,btn2Local,btn3Local,btn1Visitante,btn2Visitante,btn3Visitante,btnReset;
    public int puntuacionLocal,puntuacionVisitante,puntos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo=(TextView)findViewById(R.id.tvTitulo);
        titulo.setText("Marcador Basket");
        marcadorLocal=(TextView)findViewById(R.id.tvMarcadorLocal);
        marcadorVisitante=(TextView)findViewById(R.id.tvMarcadorVisitante);
        marcadorLocal.setText("Local: "+0);
        marcadorVisitante.setText("Visitante: "+0);
        btn1Local=(Button)findViewById(R.id.btnLocal1);
        btn2Local=(Button)findViewById(R.id.btnLocal2);
        btn3Local=(Button)findViewById(R.id.btnLocal3);
        btn1Visitante=(Button)findViewById(R.id.btnVisitante1);
        btn2Visitante=(Button)findViewById(R.id.btnVisitante2);
        btn3Visitante=(Button)findViewById(R.id.btnVisitante3);
        btnReset=(Button)findViewById(R.id.btnReset);
        btn1Local.setOnClickListener(this);
        btn2Local.setOnClickListener(this);
        btn3Local.setOnClickListener(this);
        btn1Visitante.setOnClickListener(this);
        btn2Visitante.setOnClickListener(this);
        btn3Visitante.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLocal1:
                incrementa(1,1);
                break;
            case R.id.btnLocal2:
                incrementa(1,2);
                break;
            case R.id.btnLocal3:
                incrementa(1,3);
                break;
            case R.id.btnVisitante1:
                incrementa(2,1);
                break;
            case R.id.btnVisitante2:
                incrementa(2,2);
                break;
            case R.id.btnVisitante3:
                incrementa(2,3);
                break;
            case R.id.btnReset:
                borra();
                break;
        }
    }
    public void incrementa(int equipo, int puntos){
        if (equipo==1){
            puntuacionLocal=puntuacionLocal+puntos;
            marcadorLocal.setText("Local: "+puntuacionLocal);
        }else{
            puntuacionVisitante=puntuacionVisitante+puntos;
            marcadorVisitante.setText("Visitante: "+puntuacionVisitante);
        }
    }
    public void borra(){
        marcadorLocal.setText("Local: "+0);
        marcadorVisitante.setText("Visitante: "+0);
    }
}
