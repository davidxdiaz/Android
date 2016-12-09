package android.unitec.listviesadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Barcelona extends AppCompatActivity {
    TextView tvLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_madrid);
        tvLista = (TextView) findViewById(R.id.tvLista);
    }

    private void setLista(){
        String txt="1. Ter Stegen\n" +
                "3. Gerard Piqué\n" +
                "4. Iván Rakitic\n" +
                "5. Sergio Busquets\n" +
                "6. Denis Suárez\n" +
                "7. Arda Turán\n" +
                "8. Andrés Iniesta\n" +
                "9. Luis Suárez\n" +
                "10.Lionel Messi\n" +
                "11.Neymar Jr\n" +
                "12.Rafinha Alcántara\n" +
                "13.Jasper Cillessen\n" +
                "14.Javier Masherano\n" +
                "17.Paco Alcácer\n" +
                "18.Jordi Alba\n" +
                "19.Lucas Digne\n" +
                "20.Sergi Roberto\n" +
                "21.André Gomes\n" +
                "22.Aleix Vidal\n" +
                "23.Samuel Umtiti\n" +
                "24.Jérémy Mathieu\n" +
                "25.Jordi Masip\n" +
                "\n" +
                "DT: Luis Enrique Martínez";
        tvLista.setText(txt);

    }

}
