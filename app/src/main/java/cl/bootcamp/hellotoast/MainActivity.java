package cl.bootcamp.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCount;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazar las vistas con los elementos del layout
        textViewCount = findViewById(R.id.textView_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Configurar el evento click del botón Toast
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        // Configurar el evento click del botón Count
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                textViewCount.setText(String.valueOf(contador));
            }
        });
    }
}
