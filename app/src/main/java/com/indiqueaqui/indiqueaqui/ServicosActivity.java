package com.indiqueaqui.indiqueaqui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ServicosActivity extends Activity {

    private ListView listaServicos;
    private String[] itens = {
        "Automotivo", "Alimentação", "PET",
            "Reformas", "Domesticos", "Aulas",
            "Moda", "Saúde", "Tecnologia", "Eventos",
            "Assistencia Técnica"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);

                    //Lista de serviços
    listaServicos =  (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
           /*         //click para passar de activity no listview
        listaServicos.setAdapter( adaptador );
        listaServicos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0) {
                    Intent myintent = new Intent(view.getContext(), AutomotivoActivity.class);
                    startActivityForResult(myintent, 0);
            }
                if(position ==1) {
                    Intent myintent = new Intent(view.getContext(), AlimentacaoActivity.class);
                    startActivityForResult(myintent, 1);
                }
                if(position ==2) {
                    Intent myintent = new Intent(view.getContext(), PetActivity.class);
                    startActivityForResult(myintent, 2);
                }
                if(position ==3) {
                    Intent myintent = new Intent(view.getContext(), AutomotivoActivity.class);
                    startActivityForResult(myintent, 3);
                }
                if(position ==4) {
                    Intent myintent = new Intent(view.getContext(), AutomotivoActivity.class);
                    startActivityForResult(myintent, 4);
                }
                if(position ==5) {
                    Intent myintent = new Intent(view.getContext(), AutomotivoActivity.class);
                    startActivityForResult(myintent, 5);
                }
            }
        });*/


    }
}
