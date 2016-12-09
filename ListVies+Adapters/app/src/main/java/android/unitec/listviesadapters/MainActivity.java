package android.unitec.listviesadapters;

    import android.content.Intent;
    import android.os.Bundle;
    import android.app.Activity;
    import android.view.View;
    import android.widget.AdapterView;
    import android.widget.ImageView;
    import android.widget.ListView;
    import android.widget.TextView;
    import android.widget.Toast;

    import java.util.ArrayList;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);

        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();

        datos.add(new Lista_entrada(R.drawable.imgbarcelona, "Barcelona", ""));
        datos.add(new Lista_entrada(R.drawable.imgbayern, "Bayern", ""));
        datos.add(new Lista_entrada(R.drawable.imgliverpool, "Liverpool", ""));
        datos.add(new Lista_entrada(R.drawable.imgmadrid, "Real Madrid", ""));
        datos.add(new Lista_entrada(R.drawable.imgmilan, "Milan", ""));


        ListView lista = (ListView) findViewById(R.id.ListView_listado);
        lista.setAdapter(new Lista_adaptador(this, R.layout.entrada, datos){
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                texto_superior_entrada.setText(((Lista_entrada) entrada).get_textoEncima());

                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                texto_inferior_entrada.setText(((Lista_entrada) entrada).get_textoDebajo());

                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
                imagen_entrada.setImageResource(((Lista_entrada) entrada).get_idImagen());
            }
        });
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                Lista_entrada elegido = (Lista_entrada) pariente.getItemAtPosition(posicion);
                if(posicion==0) {
                    CharSequence texto = "El mejor equipo " + elegido.get_textoDebajo();
                    Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                    toast.show();
                    Intent inte = new Intent(this, Barcelona.class);

                    startActivity(inte);
                }
                else if(posicion==1){
                    CharSequence texto = "Seleccionado: " + elegido.get_textoDebajo();
                    Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                    toast.show();
                    Intent inte = new Intent(this, Bayern.class);
                    startActivity(inte);
                }else if(posicion==2){
                    CharSequence texto = "Seleccionado: " + elegido.get_textoDebajo();
                    Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                    toast.show();
                    Intent inte = new Intent(this, Liverpool.class);
                    startActivity(inte);
                }
                else if(posicion==3){
                    CharSequence texto = "En realidad el Real Madrid es el mejor " + elegido.get_textoDebajo();
                    Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                    toast.show();
                    Intent inte = new Intent(this, RealMadrid.class);
                    startActivity(inte);
                }else if(posicion==4){
                    CharSequence texto = "Seleccionado: " + elegido.get_textoDebajo();
                    Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                    toast.show();
                    Intent inte = new Intent(this, Milan.class);
                    startActivity(inte);
                }
            }
        });
    }

}
