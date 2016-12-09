package android.unitec.listviesadapters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Liverpool extends AppCompatActivity {
    TextView tvLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);
        tvLista = (TextView) findViewById(R.id.tvLista);
        setLista();
    }

    private void setLista(){
        String txt="LIVERPOOL\n" +
                "1.Loris Karius\n" +
                "2.Nathaniel Clyne\n" +
                "5.Georginio Wijnaldum\n" +
                "7.James Milner\n" +
                "10.Philippe Coutinho Correia\n" +
                "11.Roberto Firmino\n" +
                "13.Alex Manninger\n" +
                "14.Jordan Henderson\n" +
                "15.Daniel Sturridge\n" +
                "16.Marko Grujic\n" +
                "17.Ragnar Klavan\n" +
                "18.Alberto Moreno\n" +
                "19.Sadio Mane\n" +
                "20.Adam Lallana\n" +
                "21.Lucas Pezzini-Leiva\n" +
                "22.Simon Mignolet\n" +
                "23.Emre Can\n" +
                "27.Divock Origi\n" +
                "32.Joel Matip\n" +
                "35.Kevin Stewart\n" +
                "53.Oviemuno Ejaira\n" +
                "56.Connor Randall\n" +
                "58.Benjamin Woodburn\n" +
                "66.Trent Arnold\n" +
                "\n" +
                "DT:Jürgen Klopp\n";

        tvLista.setText(txt);

    }

}
