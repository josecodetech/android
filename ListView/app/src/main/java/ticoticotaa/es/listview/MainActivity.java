package ticoticotaa.es.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvLista;
    String[] colores = new String[] {"rojo","amarillo","verde","azul","rosa","naranja"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvLista=(ListView)findViewById(R.id.lvLista);
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,colores);
        lvLista.setAdapter(adaptador);
        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Pulsastes el numero "+position,Toast.LENGTH_SHORT).show();
                switch(position){
                    case 0:
                        parent.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.rojo));
                        break;
                    case 1:
                        parent.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.amarillo));
                        break;
                    case 2:
                        parent.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.verde));
                        break;
                    case 3:
                        parent.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.azul));
                        break;
                    case 4:
                        parent.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.rosa));
                        break;
                    case 5:
                        parent.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.naranja));
                        break;
                }
            }
        });
    }
}