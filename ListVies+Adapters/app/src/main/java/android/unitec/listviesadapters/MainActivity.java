package android.unitec.listviesadapters;

    import android.os.Bundle;
    import android.app.Activity;
    import android.widget.ListView;
    import java.util.ArrayList;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);

        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();

        datos.add(new Lista_entrada(R.drawable.Barcelona, "Barcelona", ""));
        datos.add(new Lista_entrada(R.drawable.Bayern, "Bayern", ""));
        datos.add(new Lista_entrada(R.drawable.Liverpool, "Liverpool", ""));
        datos.add(new Lista_entrada(R.drawable.Madrid, "Real Madrid", ""));
        datos.add(new Lista_entrada(R.drawable.milan, "Milan", ""));
    }

}
