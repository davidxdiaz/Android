package android.unitec.listviesadapters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RealMadrid extends AppCompatActivity {
    TextView tvLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);
        tvLista = (TextView) findViewById(R.id.tvLista);
        setLista();
    }

    private void setLista(){
        String txt="REAL MADRID\n" +
                "\n" +
                "1. Keylor Navas\n" +
                "2. Dani Carvajal\n" +
                "3. Pepe\n" +
                "4. Sergio Ramos\n" +
                "5. Raphael Varane\n" +
                "6. Nacho Fernández\n" +
                "7. Cristiano Ronaldo\n" +
                "8. Toni Kroos\n" +
                "9. Karim Benzema\n" +
                "10.James Rodríguez\n" +
                "11.Gareth Bale\n" +
                "12.Marcelo\n" +
                "13.Kiko Casilla\n" +
                "14.Casemiro\n" +
                "15.Fabio Coenträo\n" +
                "16.Mateo Kovacic\n" +
                "17.Lucas Vázquez\n" +
                "18.Mariano\n" +
                "19.Luka Modric\n" +
                "20.Marco Asensio\n" +
                "21.Álvaro Morata\n" +
                "22.Isco\n" +
                "23.Danilo\n" +
                "25.Rubén Yáñez\n" +
                "\n" +
                "DT: Zinedine Zidane";
        tvLista.setText(txt);

    }

}
