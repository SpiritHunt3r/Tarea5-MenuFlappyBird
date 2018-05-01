package cr.ac.itcr.andreifuentes.flappybirdclase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickIniciar(View view){
        int var=0;
        RadioGroup opts = findViewById(R.id.options);
        int checked = opts.getCheckedRadioButtonId();
        if (checked == R.id.facilOPT){
            var = 0;
        }
        if (checked == R.id.medioOPT){
            var = 1;
        }
        if (checked == R.id.dificilOPT){
            var = 2;
        }
        Intent i = new Intent(this, AndroidLauncher.class);
        i.putExtra("dif", var);
        startActivity(i);
    }
}
