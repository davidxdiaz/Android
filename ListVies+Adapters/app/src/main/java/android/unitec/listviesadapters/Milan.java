package android.unitec.listviesadapters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Milan extends AppCompatActivity {
    TextView tvLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);
        tvLista = (TextView) findViewById(R.id.tvLista);
        setLista();
    }

    private void setLista(){
        String txt="A.C. MILÁN\n" +
                "1.Gabriel Vasconelos Ferreira\n" +
                "2.Mattia De Sciglio\n" +
                "4.Rodrigo Ely\n" +
                "5.Giacomo Bonaventura\n" +
                "7.Luis Adriano\n" +
                "8.Suso\n" +
                "9.Gianluca Lapadula\n" +
                "10.Keisuke Honda\n" +
                "11.Mbaye Niang\n" +
                "13.Alessio Romagnoli\n" +
                "14.Matías Ariel Fernández Fernández\n" +
                "15.Gustavo Raúl Gómez Portillo\n" +
                "16.Andrea Poli\n" +
                "17.Cristian Eduardo Zapata Valencia\n" +
                "18.Riccardo Montolivo\n" +
                "20.Ignazio Abate\n" +
                "21.Leonel Jesús Vangioni\n" +
                "23.José Ernesto Sosa\n" +
                "29.Gabriel Alejandro Paletta\n" +
                "31.Luca Antonelli\n" +
                "33.Juraj Kucka\n" +
                "35.Alessandro Plizzari\n" +
                "63.Patrick Cutrone\n" +
                "70.Carlos Bacca\n" +
                "73.Manuel Locatelli\n" +
                "75.Alessandro Guarnone\n" +
                "80.Mario Pasalic\n" +
                "91.Andrea Bertolacci\n" +
                "96.Davide Calabria\n" +
                "99.Gianluigi Donnarumma\n" +
                "\n" +
                "DT: Vincenzo Montella";
        tvLista.setText(txt);

    }

}
