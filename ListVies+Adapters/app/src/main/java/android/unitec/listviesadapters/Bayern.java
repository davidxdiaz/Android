package android.unitec.listviesadapters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Bayern extends AppCompatActivity {
    TextView tvLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);
        tvLista = (TextView) findViewById(R.id.tvLista);
        setLista();
    }

    private void setLista(){
        String txt="BAYERN MÜNICH\n" +
                "1.Manuel Neuer\n" +
                "5.Mats Hummels\n" +
                "6.Thiago Alcántara\n" +
                "7.Frank Ribéry.\n" +
                "8.Javi Martínez\n" +
                "9.Robert Lewandowski\n" +
                "10.Arjen Robben\n" +
                "11.Douglas Costa\n" +
                "13.Rafinha\n" +
                "14.Xabi Alonso\n" +
                "17.Jerome Boateng\n" +
                "18.Juan Bernat\n" +
                "20.Félix Götze\n" +
                "21.Philipp Lahm\n" +
                "23.Arturo Vidal\n" +
                "25.Thomas Müller\n" +
                "26.Sven Ulreich\n" +
                "27.David Alaba\n" +
                "28.Holger Badstuber\n" +
                "29.Kingsley Coman\n" +
                "32.Joshua Kimmich\n" +
                "35.Renato Sanches\n" +
                "37.Julian Green\n" +
                "38.Erdal Ozturk\n" +
                "\n" +
                "DT: Carlo Ancelotti";
        tvLista.setText(txt);

    }

}
